package tp3_heritage;
import tp1.Date;

public class Personne {
	private String nom;
	private Date dateNaissance;
	
	public Personne() {
		this.nom = new String("");
		this.dateNaissance = new Date();
	}
	public Personne(String nom, Date dateNaissance) {
		super();
		this.nom = nom;
		this.dateNaissance = dateNaissance;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", dateNaissance=" + dateNaissance + "]";
	}
	
	public void test() {
		System.out.println ("nombre de lettre dans le nom de "+this.nom+" est: "+nom.length());
	}
		
	
}
