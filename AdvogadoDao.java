package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Util.Conexao;

public class AdvogadoDao {

	Connection con;
	ResultSet rs;

	public void Salvar(Advogado adv) {
		try {
			con = new Conexao().conectar();
			String sql = "insert into advogado (oab, nome, telefone) values (?, ?, ?)";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, adv.getOab());
			stmt.setString(2, adv.getNome());
			stmt.setString(3, adv.getTelefone());
			stmt.executeUpdate();
			stmt.close();
		} catch (Exception erro) {
			erro.printStackTrace();
		}
	}

	public ArrayList<Advogado> Listar() {
		try {
			con = new Conexao().conectar();
			ArrayList<Advogado> advogados = new ArrayList<>();
			String sql = "select * from advogado where statusadv = 'on'";
			PreparedStatement stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {
				int idadv = rs.getInt("idadv");
				Date data = rs.getDate("dataadv");
				String oab = rs.getString("oab");
				String nome = rs.getString("nome");
				String telefone = rs.getString("telefone");
				String status = rs.getString("statusadv");
				advogados.add(new Advogado(idadv, data, oab, nome, telefone, status));
			}

			return advogados;

		} catch (Exception erro) {
			System.out.println(erro);
			return null;
		}

	}
	
	public void Apagar(String id) {
System.out.println(id);
		try {

			con = new Conexao().conectar();
			String sql = "UPDATE advogado SET statusadv = 'off' WHERE idadv=?;";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, id);
			stmt.executeUpdate();
			stmt.close();
			con.close();

		} catch (Exception erro) {
			erro.printStackTrace();
		}
		
	}
	
	public List<Advogado> Editar(String id) {

		List<Advogado> advogado = new ArrayList<>();

		try {
			con = new Conexao().conectar();
			String sql = "SELECT * FROM advogado WHERE idadv = ? AND statusadv = 'on'";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, id);
			ResultSet rs = stmt.executeQuery();
			rs.next();
			int idadv = rs.getInt("idadv");
			Date data = rs.getDate("dataadv");
			String oab = rs.getString("oab");
			String nome = rs.getString("nome");
			String telefone = rs.getString("telefone");
			advogado.add(new Advogado(idadv, data,oab, nome, telefone));
			return advogado;

		} catch (Exception erro) {
			erro.printStackTrace();
			return null;
		}

	}

	public void Atualizar(Advogado adv) {
		try {
			con = new Conexao().conectar();
			
			String sql = "UPDATE advogado SET oab = ?,nome = ?, telefone = ? WHERE idadv = ? AND statusadv = 'on'";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, adv.getOab());
			stmt.setString(2, adv.getNome());
			stmt.setString(3, adv.getTelefone());
			stmt.setInt(4, adv.getIdadv());
			stmt.executeUpdate();
			stmt.close();
			con.close();
		} catch (Exception erro) {
			erro.printStackTrace();
		}
	}

	
	// Pesquisa na tabela de clientes pelo nome e/ou telefone.
		public ArrayList<Advogado> Pesquisar(String q) {
			try {
				con = new Conexao().conectar();
				ArrayList<Advogado> advogados = new ArrayList<>();
				String sql = "select * from advogado WHERE statusadvogado = 'on' AND (nome LIKE CONCAT('%', ?, '%') OR telefone LIKE CONCAT('%', ?, '%'));";

				PreparedStatement stmt = con.prepareStatement(sql);
				stmt.setString(1, q);
				stmt.setString(2, q);
				rs = stmt.executeQuery();

				while (rs.next()) {
					int idadv = rs.getInt("idadv");
					Date data = rs.getDate("dataadv");
					String oab = rs.getString("oab");
					String nome = rs.getString("nome");
					String telefone = rs.getString("telefone");
					String status = rs.getString("statusadvogado");
					advogados.add(new Advogado(idadv, data,oab, nome, telefone, status));
				}

				return advogados;

			} catch (Exception erro) {
				System.out.println(erro);
				return null;
			}

		}

}
	

