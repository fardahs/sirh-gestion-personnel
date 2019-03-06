<%@page import="java.util.List"%>
<%@page import="dev.sgp.entite.Collaborateur"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SGP - App</title>
<link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap-3.3.7-dist/css/bootstrap.css"/>
</head>
<body>
	<h1>Les collaborateurs</h1>
	
	<ul>
		<% 
		List<Collaborateur> listeCollaborateur =(List<Collaborateur>)request.getAttribute("listeCollaborateur");
			for (Collaborateur nom : listeCollaborateur) { 
			%>
			<li><%= nom.getMatricule() %></li>
			<li><%= nom.getNom() %></li>
			<li><%= nom.getPrenom() %></li>
			<li><%= nom.getDateDeNaissance() %></li>
			<li><%= nom.getEmailPro() %></li>
			<li><%= nom.getPhoto() %></li>
			<li><%= nom.getDateHeureCreation() %></li>
		<%}%>
		
	</ul>
	
</body>
</html>