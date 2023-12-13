package tp1;

public class Date {
   public int jour;
   private int mois;
   int annee;
   
   public Date(int a, int b, int c){
       jour = a;
       mois = b;
       annee = c;
   }
   public Date(){
       jour = 1;
       mois = 1;
       annee = 2000;
   }
   
   public String toString() {
	   return "("+jour+"/"+mois+"/"+annee+")";
   }
   
   public int getMois() {
	   return mois;
   }
}
