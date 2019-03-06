package dev.sgp.entite;

import java.time.LocalDate;
import java.time.ZonedDateTime;

public class Collaborateur {
	
	private String matricule;
	private String nom;
	private String prenom;
	private LocalDate dateDeNaissance; 
	private String adresse;
	private String numeroSecuriteSociale;
	private String emailPro;
	private String photo;
	private ZonedDateTime dateHeureCreation;
	private boolean actif;
	private String intitulePoste;
	Departement departement;
	
	public Collaborateur(){
		
	}
	
	public Collaborateur(String matricule, String nom, String prenom, String emailPro, String adresse) {
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.emailPro = emailPro;
		this.adresse = adresse;
		
	}
	public String getMatricule() {
		return matricule;
	}
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public LocalDate getDateDeNaissance() {
		return dateDeNaissance;
	}
	public String getAdresse() {
		return adresse;
	}
	public String getNumeroSecuriteSociale() {
		return numeroSecuriteSociale;
	}
	public String getEmailPro() {
		return emailPro;
	}
	public String getPhoto() {
		return photo;
	}
	public ZonedDateTime getDateHeureCreation() {
		return dateHeureCreation;
	}
	public boolean isActif() {
		return actif;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public void setDateDeNaissance(LocalDate dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public void setNumeroSecuriteSociale(String numeroSecuriteSociale) {
		this.numeroSecuriteSociale = numeroSecuriteSociale;
	}
	public void setEmailPro(String emailPro) {
		this.emailPro = emailPro;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public void setDateHeureCreation(ZonedDateTime dateHeureCreation) {
		this.dateHeureCreation = dateHeureCreation;
	}
	public void setActif(boolean actif) {
		this.actif = actif;
	}
	public String getIntitulePoste() {
		return intitulePoste;
	}
	public Departement getDepartement() {
		return departement;
	}
	public void setIntitulePoste(String intitulePoste) {
		this.intitulePoste = intitulePoste;
	}
	public void setDepartement(Departement departement) {
		this.departement = departement;
	}
	
	
	
}
