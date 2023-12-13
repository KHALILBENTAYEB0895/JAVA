package tp2_gestion_Livres;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		
		Auteur A1 = new Auteur("Khalil",28);
		
		Livre l1 = new Livre();
		Livre l2 = new Livre();
		Livre l3 = new Livre();
		
		ArrayList<Livre> L = new ArrayList<Livre>();
		
		L.add(l1);
		L.add(l2);
		L.add(l3);
		
		Auteur A2 = new Auteur("Khalil",35,L);
		Auteur A3 = new Auteur("Khalil",30,l1,l2);
		
		System.out.println(A2.toString());
		
	}

}
