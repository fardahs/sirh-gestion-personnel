package dev.sgp.web;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Properties;

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
	
	Properties prop = new Properties();
	InputStream input = null;
	String suffixeMail = null;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.getRequestDispatcher("/WEB-INF/views/collab/ajouterCollaborateurs.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.getProperties();
		LocalDateTime localdate = LocalDateTime.now();

		Collaborateur nouveauCollaborateur = new Collaborateur();
		/* Information collaborateur depuis le formulaire */
		nouveauCollaborateur.setNom(req.getParameter("nom"));
		nouveauCollaborateur.setPrenom(req.getParameter("prenom"));
		nouveauCollaborateur.setDateDeNaissance(LocalDate.parse(req.getParameter("dateNaissance")));
		nouveauCollaborateur.setAdresse(req.getParameter("adresse"));
		nouveauCollaborateur.setNumeroSecuriteSociale(req.getParameter("numeroSecuriteSociale"));
		
		if(req.getParameter("numeroSecuriteSociale").length() != 15){
			resp.sendError(400, "Le numéro de sécurité sociale doit contenir 15 chifres");
		}
		
		/* Adresse mail a partir des données du formulaire */
		String email = nouveauCollaborateur.getPrenom()+"."+ nouveauCollaborateur.getNom() + suffixeMail;
		nouveauCollaborateur.setEmailPro(email);
		
		/* Photo par défaut */
		//nouveauCollaborateur.setPhoto(getServletContext().getResourceAsStream("/src/main/webapp/images/default.png"));

		nouveauCollaborateur.setMatricule("M" +  collabService.listerCollaborateurs().size() + 1 );
		nouveauCollaborateur.setDateHeureCreation(localdate.atZone(ZoneId.systemDefault()));
		
		collabService.sauvegarderCollaborateur(nouveauCollaborateur);
		
		req.setAttribute("listeCollaborateur", collabService.listerCollaborateurs());
		req.getRequestDispatcher("/WEB-INF/views/collab/listerCollaborateurs.jsp").forward(req, resp);
	}
	
	
	/* Récupération des données */
	public void getProperties() throws IOException{
		try {
			prop.load(getServletContext().getResourceAsStream("/WEB-INF/application.properties"));
			this.suffixeMail = prop.getProperty("suffixeMail");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {

			if (input != null) {

				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
}

	
}
