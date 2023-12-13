package tp1;

public class Personne {
	public String nom;
	public int age;
	
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
}
