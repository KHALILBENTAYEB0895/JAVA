package tp3;
import tp1.Date;
public class MainClass {

	public static void main(String[] args) {
		Personne p1 = new Personne("khalil", new Date(31,8,1995));
		Personne p2 = new Personne();
		System.out.println(p1);
		System.out.println(p2);
		p2.test();
		
		Etudiant e1 = new Etudiant("bibich",new Date(31,8,1995),"IFSMD","Z564",2);
		System.out.println(e1);
		e1.test();
	}

}
