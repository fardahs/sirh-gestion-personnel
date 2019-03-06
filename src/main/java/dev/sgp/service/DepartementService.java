package dev.sgp.service;

import java.util.ArrayList;
import java.util.List;

import dev.sgp.entite.Departement;

public class DepartementService {
	List<Departement> listeDepartement = new ArrayList<>();
	
	public DepartementService(){
		listeDepartement.add(new Departement("Comptabilite"));
		listeDepartement.add(new Departement("Ressources Humaines"));
		listeDepartement.add(new Departement("Informatique"));
		listeDepartement.add(new Departement("Administratif"));
		
	}
	
	public List<Departement> listerDepartements() {
		return listeDepartement;
	}
	
	public void sauvegarderDepartement(Departement depart) {
		listeDepartement.add(depart);
	}
}
