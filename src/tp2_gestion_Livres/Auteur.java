package tp2_gestion_Livres;

import java.util.ArrayList;

public class Auteur {
	private String nom;
	private int age;
	
	ArrayList<Livre> listLivres;

	public Auteur(String nom, int age){
		super();
		this.nom = nom;
		this.age = age;
		this.listLivres = new ArrayList<Livre>();
	}	
	
	public Auteur(String nom, int age, ArrayList<Livre> listLivres) {
		super();
		this.nom = nom;
		this.age = age;
		this.listLivres = listLivres;
	}
	
	public Auteur(String nom, int age, Livre ...t) {
		super();
		this.nom = nom;
		this.age = age;
		this.listLivres= new  ArrayList<Livre>();
		for(Livre x : t) {
			listLivres.add(x);
		}
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public ArrayList<Livre> getListLivres() {
		return listLivres;
	}

	public void setListLivres(ArrayList<Livre> listLivres) {
		this.listLivres = listLivres;
	}

	@Override
	public String toString() {
		String ch = "Auteur [nom=" + nom + ", age=" + age + "]\n liste des livres:\n";
		for(Livre x : this.listLivres){
			ch+="\t-"+x.toString()+"\n";
		}
		return ch;
	}
	
	public void ajouterLivre(Livre l){
		if(!this.listLivres.contains(l)) {
			this.listLivres.add(l);
		}
	}
	
	public void supprimerLivre(Livre l) {
		if(this.listLivres.contains(l)) {
			this.listLivres.remove(l);
		}
	}
	
	
}
