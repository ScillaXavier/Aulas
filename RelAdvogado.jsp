<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="model.Advogado"%>
<%@ page import="java.util.ArrayList"%>
<%
ArrayList<Advogado> lista = (ArrayList<Advogado>) request.getAttribute("advogados");
String success = (String) request.getAttribute("success");

//Pesquisa na tabela de advogados pelo nome,oab e/ou telefone.
String q = (String) request.getAttribute("q");
if(q==null)q="";
%>

%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de Advogados</title>

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">

</head>
<body>

	<h1>Advogados</h1>
	<hr>
	<nav>
		<a href="index.jsp">Início</a>  |  <a href="CadAdvogado.jsp">Cadastro
			de Advogado</a>  |  <a href="CadCliente.jsp">Cadastro de
			Cliente</a>
	</nav>
	<hr>

	<div class="container">
	<!--  Pesquisa na tabela de advogados pelo oab,nome e/ou telefone. -->
			<form name="buscacliente" action="pesquisacliente">
			<input type="search" name="q" value="<%=q%>">
			<button type="submit">🔎</button>
		</form>

		<%
		if (success != null) {
		%>
		<script>alert("<%=success%>")</script>
		<%
		}
		%>

		<table class="table table-dark">
			<thead>
				<tr>
					<th scope="col">Id</th>
					<th scope="col">Data</th>
					<th scope="col">OAB</th>
					<th scope="col">Nome</th>
					<th scope="col">Telefone</th>
					<th scope="col">Opções</th>
				</tr>
			</thead>
			<tbody>
				<%
				for (int i = 0; i < lista.size(); i++) {
				%>

				<tr>
					<td><%=lista.get(i).getIdadv()%></td>
					<td><%=lista.get(i).getData()%></td>
					<td><%=lista.get(i).getOab()%></td>
					<td><%=lista.get(i).getNome()%></td>
					<td><%=lista.get(i).getTelefone()%></td>
					<td>
					<a href="editaradvogado?id=<%=lista.get(i).getIdadv()%>" onclick="return confirm('Tem certeza que deseja editar o registro.')">Editar</a>
					 |  
					<a href="apagaadvogado?id=<%=lista.get(i).getIdadv()%>" onclick="return confirm('Tem certeza que deseja apagar o registro.')">Apagar</a></td>
				</tr>

				<%
				}
				%>

			</tbody>
		</table>

	</div>


	<!-- JavaScript (Opcional) -->
	<!-- jQuery primeiro, depois Popper.js, depois Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</body>
</html> 