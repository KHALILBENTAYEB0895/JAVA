
package tp1;

public class MaPremiereClasse {
    
    int somme(int a, int b){
        return a+b;
    }
    
    int somme(int a, int b, int c){
        return a+b+c;
    }
    
    int max(int a, int b){
        if(a>b){
            return a;
        }else{
        return b;
        }
    }
    int max(int a, int b, int c){
        return max(max(a,b),c);
    }
    
    int somme(int ...a){
        int s = 0;
        for(int i=0; i<a.length; i++){
            s+=a[i];
        }
        return s;
    }
    
    void testerSurcharge(){
        int x=15,y=200, z=300;
        int c =somme(x,y);
        System.out.println(c);
        int d =max(x,y);
        int f=somme(x,y,z);
        int e =max(x,y,z);
        System.out.println(d);
        System.out.println(f);
        System.out.println(e);
    }
    
    
    public static void main(String[] args){
        
//        System.out.println("Execution du programme");
//        Date d1 = new Date(10,12,2023);
//        Date d2 = new Date();
//        MaPremiereClasse A = new MaPremiereClasse();
//        A.testerSurcharge();
//        System.out.println(d1.getMois());
//        System.out.println(d2.toString());
    	
    	Personne p =new Personne("khalil",26);
    	System.out.println(p.toString());
    }
    
}
