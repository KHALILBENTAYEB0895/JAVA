package tp3_heritage;
import tp1.Date;

public class Professeur extends Personne {
	
	String specialite;
	int salaire;
	String etablissement;

	public Professeur(String nom, Date dn,String specialite, int salaire, String etablissement) {
		super(nom, dn);
		this.specialite = specialite;
		this.salaire = salaire;
		this.etablissement = etablissement;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	public int getSalaire() {
		return salaire;
	}

	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}

	public String getEtablissement() {
		return etablissement;
	}

	public void setEtablissement(String etablissement) {
		this.etablissement = etablissement;
	}

	@Override
	public String toString() {
		return super.toString()+"Professeur [specialite=" + specialite + ", salaire=" + salaire + ", etablissement=" + etablissement
				+ "]";
	}
	
	
	
	
}
