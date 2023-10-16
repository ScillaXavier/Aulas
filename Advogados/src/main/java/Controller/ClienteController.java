package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Cliente;
import model.ClienteDao;

/**
 * Servlet implementation class ClienteController
 */
@WebServlet({"/ClienteController","/novocliente","/buscacliente"})

public class ClienteController extends HttpServlet {
	
	Cliente cli=new Cliente();
	ClienteDao daocli = new ClienteDao();
	
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClienteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String acao = request.getServletPath();
		if(acao.equals("/novocliente")) {
			EnviaDados(request,response);
		}else if(acao.equals("/buscacliente")) {
			ListaDados(request,response);
		}
		
	}
	
	protected void EnviaDados(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//cli.setIdcliente(Integer.parseInt(request.getParameter("idcliente")));
		cli.setNome(request.getParameter("nome"));
		cli.setTelefone(request.getParameter("telefone"));	
		daocli.Salvar(cli);
		
		
		
    }
	
	
	protected void ListaDados(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    ArrayList<Cliente>lista = daocli.listar();
	    request.setAttribute("clientes", lista);
	    RequestDispatcher rd = request.getRequestDispatcher("ReoClientes.jsp");
	
	}
	
		/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
