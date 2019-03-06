<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="dev.sgp.entite.Collaborateur"%>
<%@page import="dev.sgp.entite.Departement"%>
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

		<ul>
			<%
				List<Collaborateur> listeCollaborateur = (List<Collaborateur>) request.getAttribute("listeCollaborateur");
				for (Collaborateur nom : listeCollaborateur) {
			%>
			<div class="panel panel-default">
				<div class="panel-heading"><%=nom.getNom()%>
					<%=nom.getPrenom()%></div>
				<li><%=nom.getMatricule()%></li>
				<li><%=nom.getDateDeNaissance()%></li>
				<li><%=nom.getEmailPro()%></li>
				<li><%=nom.getPhoto()%></li>
				<li><%=nom.getDateHeureCreation()%></li>
				<%
					}
				%>
			
		</ul>
	</div>
	</div>
</body>
</html>