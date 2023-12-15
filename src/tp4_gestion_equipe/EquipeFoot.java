package tp4_gestion_equipe;
import java.util.ArrayList;

import tp2_gestion_Livres.Livre;
import tp3_heritage.*;

public class EquipeFoot {
	
	String nom;
	ArrayList<Personne> listeJoueurs;
	
	public EquipeFoot(String nom, ArrayList<Personne> listeJoueurs) {
		
		this.nom = nom;
		this.listeJoueurs = listeJoueurs;
	}
	
	public EquipeFoot(String nom, Personne ...t) {
		this.nom = nom;
		this.listeJoueurs= new  ArrayList<Personne>();
		for(Personne x : t) {
			this.listeJoueurs.add(x);
		}
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getNom() {
		return this.nom;
	}
	public void setListeJoueurs(ArrayList<Personne> listeJoueurs) {
		this.listeJoueurs = listeJoueurs;
	}
	
	public ArrayList<Personne> getListeJoueurs() {
		return this.listeJoueurs;
	}
	
	public String toString() {
		String ch = "Equipe[ Nom = "+nom+"lisate des joueurs est :\n";
		for(Personne x : this.listeJoueurs) {
			ch = ch+"\t-"+x.toString()+"\n";
		}
		return ch;
	}
	
	public void ajouterJoueur(Personne x) {
		if(!this.listeJoueurs.contains(x)) {
			this.listeJoueurs.add(x);
		}
	}
	
	public void supprimerJoueur(Personne x) {
		if(!this.listeJoueurs.contains(x)) {
			this.listeJoueurs.remove(x);
		}
	}
	
	public void afficherEtudiants() {
		System.out.println("Equipe"+this.nom+"cintien les etudiants suivants : \n");
		for(Personne x : this.listeJoueurs) {
			 if(x instanceof Etudiant) {
				 System.out.println("\t- "+x+"\n");
			 }
		}
	}
	
	public void afficherProfessuers() {
		System.out.println("Equipe"+this.nom+"contient les profs suivants : \n");
		for(Personne x : this.listeJoueurs) {
			 if(x.getClass().getName().equals("Professeur")) {
				 System.out.println("\t- "+x+"\n");
			 }
		}
	}
	
	
}
