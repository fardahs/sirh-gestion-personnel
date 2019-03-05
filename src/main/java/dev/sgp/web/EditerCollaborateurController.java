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
		
		Map<String, String> valueParam = new HashMap<String, String>();
		valueParam.put("matricule",matriculeParam);
		valueParam.put("titre",titreParam);
		valueParam.put("nom",nomParam);
		valueParam.put("prenom",prenomParam);
		
		resp.setContentType("text/html");
		
		if(matriculeParam == null || titreParam == null || nomParam == null || prenomParam == null){
			String messageError = "Les paramètres suivants sont incorrects : ";
			
			for(Map.Entry<String, String> value:valueParam.entrySet()){
				if(value.getValue() == null){
					messageError += value.getKey() + ", ";
				}
			}
			resp.sendError(400, messageError);
			
		}else{
			// code HTML ecrit dans le corps de la reponse
			resp.getWriter().write ("<h1>Creation d’un collaborateur avec les informations suivantes : </h1> <br>" 
									+ "<p> matricule="+ matriculeParam + ", titre="+ titreParam + 
									", nom="+ nomParam + ", prenom="+ prenomParam + "</p>"
									
					);
		}
		
	}
	
	

}
