package tp2_gestion_Livres;

public class Livre {

	String nom;
	int nombreDePages;
	int annee;
	
	public Livre(String nom, int nombreDePages, int annee) {
		super();
		this.nom = nom;
		this.nombreDePages = nombreDePages;
		this.annee = annee;
	}
	/*------Getters & Setters---------*/
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getNombreDePages() {
		return nombreDePages;
	}
	public void setNombreDePages(int nombreDePages) {
		this.nombreDePages = nombreDePages;
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	/*-----------------------------*/
	@Override
	public String toString() {
		return "Livre [nom=" + nom + ", nombreDePages=" + nombreDePages + ", annee=" + annee + "]";
	}
	
}