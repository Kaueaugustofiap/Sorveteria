<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Página de Cadastro</title>
<%@ include file="header.jsp" %>
</head>
<body>	
	<%@ include file="menu.jsp" %>
	<main>
		<h3>Cadastro de Clientes</h3>
		<span class="erro">${erro}</span>
		<form action="clienteServlet" method="post">
			<input type="hidden" name="acao" value="cadastrar">
			<input type="hidden" name="codigo" value="${cli.codigo}">
			<div>
				<label for="idSorvete">Sorvete</label><br>
				<select id="idSorvete" name="codSorvete">
					<option disabled>Selecione</option>
					<c:forEach items="${sorvetes}" var="s">
						<c:if test="${s.codigo == cli.codSorvete}">
							<option selected value="${s.codigo}">${s.sabor} - ${s.tipo}</option>
						</c:if>
						<c:if test="${s.codigo != cli.codSorvete}">
							<option value="${s.codigo}">${s.sabor} - ${s.tipo}</option>
						</c:if>
					</c:forEach>					
				</select>
			</div>
			
			<div>
				<label for="idNome">Nome</label><br>
				<input type="text" name="nome" value="${cli.nome}" id="idNome">
			</div>
			<div>
				<label for="idCpf">CPF</label><br>
				<input type="text" name="cpf" value="${cli.cpf}" id="idCpf">
			</div>			
			 <div>
			 	<label for="idQtdeVendida">Quantidade Vendida</label><br>
			 	<input type="number" name="qtdeVendida" id="idQtdeVendida" value="${cli.qtdeVendida}">
			 </div>
			 <div class="divBtn">
			 	<input type="submit" value="Salvar">
			 	<c:if test="${not empty cli}">
			 		<a class="btn-voltar" href="clienteServlet?acao=listar">Voltar</a>
			 	</c:if>
			 </div>
		</form>
	</main>
	<%@ include file="rodape.jsp" %>
</body>
</html>