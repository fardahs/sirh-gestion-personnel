package dev.sgp.web;

import java.io.IOException;
import java.lang.reflect.Array;
import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditerCollaborateurController extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {	
		
		// recupere la valeur d'un parametre dont le nom est matricule, titre, nom, prenom
		String matriculeParam = req.getParameter("matricule");
		String titreParam = req.getParameter("titre");
		String nomParam = req.getParameter("nom");
		String prenomParam = req.getParameter("prenom");
		
		
		resp.setContentType("text/html");
		
		if(matriculeParam == null || titreParam == null || nomParam == null || prenomParam == null){
			resp.sendError(400, "Les paramètres suivants sont incorrects");
			
		}else{
			// code HTML ecrit dans le corps de la reponse
			resp.getWriter().write ("<h1>Creation d’un collaborateur avec les informations suivantes : </h1> <br>" 
									+ "<p> matricule="+ matriculeParam + ",</p>"
									+ "<p> titre="+ titreParam + ",</p>"
									+ "<p> nom="+ nomParam + ",</p>"
									+ "<p> prenom="+ prenomParam + "</p>"
									
					);
		}
		
	}
	
	

}
