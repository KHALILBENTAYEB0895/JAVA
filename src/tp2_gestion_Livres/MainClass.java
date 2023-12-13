package tp2_gestion_Livres;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		
		Auteur A1 = new Auteur("Khalil",28);
		
		Livre l1 = new Livre("java",300,1999);
		Livre l2 = new Livre("c++",150,1998);
		Livre l3 = new Livre("python",250,2013);
		
		ArrayList<Livre> L = new ArrayList<Livre>();
		
		L.add(l1);
		L.add(l2);
		L.add(l3);
		
		Auteur A2 = new Auteur("Khalil",35,L);
		Auteur A3 = new Auteur("Khalil",30,l1,l2);
		
		System.out.println(A3.toString());
		A3.ajouterLivre(l3);
		System.out.println(A3.toString());
		A3.supprimerLivre(l3);
		System.out.println(A3.toString());
	}

}
