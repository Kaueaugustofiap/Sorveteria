<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Página de Listagem</title>
<%@ include file="header.jsp" %>
</head>
<body>
<%@ include file="menu.jsp" %>
	<main>
		<span class="erro">${msg}</span>
		<h3>Clientes por sabores de sorvete</h3>
		<form action="clienteServlet" method="get">
			<input type="hidden" name="acao" value="buscar">
			<label id="idSorvete">Sorvete</label>
			<select name="sorvete" id="idSorvete">
				<option disabled>Escolha um Sabor de Sorvete</option>
				<c:forEach items="${sorvetes}" var="s">
					<option value="${s.codigo}">${s.sabor} - ${s.tipo}</option>
				</c:forEach>
			</select>
			<input type="submit" value="listar">
		</form>
		
		<h3>Lista de clientes</h3>
		<table border="1">
			<tr>
				<th class="thNome">Nome</th><th>CPF</th><th>Sorvete</th><th>Qtd</th><th>Preço</th>
				<th colspan="2">Comandos</th>
			</tr>
			<c:forEach items="${lista}" var="c">
				<tr>
					<td>${c.nome}</td><td>${c.cpf}</td>
					<td>
					<c:forEach items="${sorvetes}" var="s">
						<c:if test="${s.codigo == c.codSorvete}">${s.sabor} - ${s.tipo}</c:if>
					</c:forEach>
					</td>
					
					<td>${c.qtdeVendida}</td>
					
					<td>
					<c:forEach items="${sorvetes}" var="s">
						<c:if test="${s.codigo == c.codSorvete}">
							<fmt:formatNumber value="${s.preco*c.qtdeVendida}" type="currency"/>
						</c:if>
					</c:forEach>
					</td>
					<td>
						<c:url value="clienteServlet" var="link1">
							<c:param name="acao" value="exibir"/>
							<c:param name="codigo" value="${c.idCliente}"/>
						</c:url>
						<a class="btn-alt" href="${link1}">Alterar</a>
					</td>
					<td>
						<c:url value="clienteServlet" var="link2">
							<c:param name="acao" value="remover"/>
							<c:param name="codigo" value="${c.idCliente}"/>
						</c:url>
						<a class="btn-rem" href="${link2}">Remover</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</main>
	<%@ include file="rodape.jsp" %>

</body>
</html>