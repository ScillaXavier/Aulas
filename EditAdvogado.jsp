<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ page import="model.Advogado"%>
<%@ page import="java.util.List"%>
	<%
List<Advogado> advogados = (List<Advogado>) request.getAttribute("advogado");
String success = (String) request.getAttribute("success");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de Advogados</title>

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

	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12">
				<a href="buscaadvogados"><button class="btn btn-success">Relatório
						de Advogados</button></a>
			</div>
		</div>
	</div>


	<div class="container">

		<form action="salvaadvogado">
		<input type="hidden" name="id" value="<%=advogados.get(0).getIdadv()%>">
		
		
		<div class="form-group">
				<label>Cadastrado em: </label> <span><%=advogados.get(0).getData()%></span>
				
				
			<div class="form-group">
				<label for="oab">OAB</label> <input type="text" class="form-control"
					id="" name="oab"
					value="<%=advogados.get(0).getOab()%>">
			</div>

			<div class="form-group">
				<label for="nome">Nome</label> <input type="text"
					class="form-control" id="" name="nome"
					value="<%=advogados.get(0).getNome()%>">
			</div>

			<div class="form-group">
				<label for="telefone">Telefone</label> <input type="text"
					class="form-control" id="" name="telefone"
					value="<%=advogados.get(0).getTelefone()%>">
			</div>

			<div class="form-group">
				<input type="submit" class="btn btn-primary" value="Enviar">
			</div>
			</div>
		</form>

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