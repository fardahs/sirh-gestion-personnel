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
	<div class="container">
		<h1>Nouveau collaborateur</h1>

		<form method="post"
			action="<%=request.getContextPath()%>/collaborateurs/ajouter"
			class="form-horizontal">

			<div class="form-group">
				<label for="nom" class="control-label col-sm-2">Nom </label>
				<div class="col-sm-10">
					<input type="text" id="nom" name="nom" class="form-control"
						required>
				</div>
			</div>

			<div class="form-group">
				<label for="prenom" class="control-label col-sm-2">Prénom </label>
				<div class="col-sm-10">
					<input type="text" id="prenom" name="prenom" class="form-control"
						required>
				</div>
			</div>

			<div class="form-group">
				<label for="dateNaissance" class="control-label col-sm-2">Date
					de naissance</label>
				<div class="col-sm-10">
					<input type="date" id="dateNaissance" name="dateNaissance"
						class="form-control" required>
				</div>
			</div>

			<div class="form-group">
				<label for="adresse" class="control-label col-sm-2">Adresse</label>
				<div class="col-sm-10">
					<textarea id="adresse" name="adresse" class="form-control" required></textarea>
				</div>
			</div>

			<div class="form-group" class="control-label col-sm-2">
				<label for="numeroSecuriteSociale"> Numéro de sécurité
					sociale </label>
				<div class="col-sm-10">
					<input type="number" id="numeroSecuriteSociale"
						name="numeroSecuriteSociale" class="form-control" maxlength="15"
						required>
				</div>
			</div>
			<div class="col-sm-offset-2 col-sm-10">
				<button type="submit" class="btn btn-default">Créer</button>
			</div>
	</div>
	</form>

</body>
</html>