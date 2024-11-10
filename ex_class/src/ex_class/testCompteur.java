package ex_class;

public class testCompteur {
	
	    public static void main(String[] args) {
	        
	        compteur c1 = new compteurOrd(0); 
	        compteur c2 = new compteurCycl(0);

	      
	        for (int i = 0; i <4; i++) {
	           
	            c1.incremeter();
	            c2.incremeter();

	          
	            System.out.println("Iteration " + (i + 1) + ":");
	            System.out.println("CompteurOrd_1: " + c1.getCourant());
	            System.out.println("CompteurCycl_2: " + c2.getCourant());
	            System.out.println();
	        }

	      
	        c1.raz();
	        c2.raz();
	        System.out.println("CompteurOrd_1: "+c1.getCourant());
	        System.out.println("CompteurCycl_2: " +c2.getCourant());
	    }
	}



