package tp1;

public class Personne {
	private String nom;
	private int age;
	
	public Personne() {
		this.nom="Inconnu";
		this.age=0;
	}
	
	public Personne(String nom, int age){
		this.nom=nom;
		this.age=age;
	}
	
	public String toString() {
		return "La personne"+this.nom+"a"+this.age;
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
	
	
}
