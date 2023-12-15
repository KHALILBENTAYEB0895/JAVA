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
	
}
