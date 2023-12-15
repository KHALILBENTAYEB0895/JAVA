package tp3_heritage;
import tp1.Date;

public class Etudiant extends Personne {
	String filiere;
	String cne;
	int niveau;
	
	public Etudiant(String nom,Date dn, String filiere, String cne, int niveau ){
		super(nom, dn);
		this.filiere = filiere;
		this.cne = cne;
		this.niveau = niveau;
	}

	public String getFiliere() {
		return filiere;
	}

	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}

	public String getCne() {
		return cne;
	}

	public void setCne(String cne) {
		this.cne = cne;
	}

	public int getNiveau() {
		return niveau;
	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}
	
	@Override
	public String toString() {
		return super.toString()+"Etudiant [filiere=" + filiere + ", cne=" + cne + ", niveau=" + niveau + "]";
	}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
	
}
