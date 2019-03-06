package dev.sgp.service;

import java.util.ArrayList;
import java.util.List;

import dev.sgp.entite.Collaborateur;

public class CollaborateurService {

	List<Collaborateur> listeCollaborateurs = new ArrayList<>();
	public CollaborateurService(){
		listeCollaborateurs.add(new Collaborateur("M1", "Jean", "Pierre", "jean.pierre@societe.com","12 rue lafosse"));
	}
	
	public List<Collaborateur> listerCollaborateurs() {
		return listeCollaborateurs;
	}
	
	public void sauvegarderCollaborateur(Collaborateur collab) {
		listeCollaborateurs.add(collab);
	}
}
