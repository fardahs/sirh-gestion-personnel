<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="dev.sgp.entite.Collaborateur"%>
<%@page import="dev.sgp.entite.Departement"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SGP - App</title>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/bootstrap-3.3.7-dist/css/bootstrap.css" />
</head>
<body>
	<h1>Les collaborateurs</h1>




	<label for="recherche">Rechercher un nom ou un prénom qui
		commence par :</label>
	<input type="search" id="recherche" name="recherche">
	<button>Rechercher</button>

	<label for="option">Filtrer par departement : </label>
	<select id="option">
		<option value="">Tous</option>
		<%
			List<Departement> listeDepartement = (List<Departement>) request.getAttribute("listeDept");
			for (Departement dpt : listeDepartement) {
		%>
		<option value="<%=dpt.getId()%>"><%=dpt.getNom()%></option>
		<%
			}
		%>
	</select>

	<p>Voir les collaborateurs désactivés</p>
	<div class="container">

		<% List<Collaborateur> listeCollaborateur = (List<Collaborateur>) request.getAttribute("listeCollaborateur"); %>

		<c:forEach var="collaborateur" items="${ listeCollaborateur}">
			<div class="panel panel-default">
				<div class="panel-heading">
					<c:out value="${collaborateur.getNom()}" />
					<c:out value="${collaborateur.getPrenom()}" />
				</div>
				<div class="panel-body">
				<c:out value="${collaborateur.getMatricule()}" />
				<c:out value="${collaborateur.getDateDeNaissance()}" />
				<c:out value="${collaborateur.getEmailPro()}" />
				<c:out value="${collaborateur.getPhoto()}" />
				<c:out value="${collaborateur.getDateHeureCreation()}" />
			</div>
			</div>
		</c:forEach>

	</div>
	</div>
</body>
</html>