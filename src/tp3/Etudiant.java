package tp3;
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

	@Override
	public String toString() {
		return super.toString()+"Etudiant [filiere=" + filiere + ", cne=" + cne + ", niveau=" + niveau + "]";
	}
	
}
