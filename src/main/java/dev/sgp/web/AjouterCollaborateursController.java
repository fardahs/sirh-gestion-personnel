package dev.sgp.web;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;
import dev.sgp.util.Constantes;

public class AjouterCollaborateursController extends HttpServlet {
	// recuperation du service
		private CollaborateurService collabService = Constantes.COLLAB_SERVICE;
		
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// utilisation du service
			List<Collaborateur> collaborateurs = collabService.listerCollaborateurs();
			req.setAttribute("listeNoms", Arrays.asList("Robert", "Jean", "Hugues"));
			req.getRequestDispatcher("/WEB-INF/views/collab/ajouterCollaborateurs.jsp").forward(req, resp);
		}
		
}