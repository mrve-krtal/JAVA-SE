package kodBlogu;

import java.util.Scanner;

public class KosulluDurumIf {

	public static void main(String[] args) {
		
		   /*
        if (kosul) {
            Ko�ul sa�lan�nca(true) bu blok �al���r. 
        
        }
        
        else if(kosul){
        
        }
        
        else if(kosul){
        
        }
        
        else {
            Bu blo�un �st�ndeki herhangi bir ko�ul sa�lanmad���nda bu blok �al���r.
        
        }
        
        */
        Scanner scanner = new Scanner(System.in);
        
        /*
        
        //18 ya��ndan k���klerim giremeyece�i kod blo�u
        
        System.out.println("L�tfen ya��n�z� girin:");
        
        int yas = scanner.nextInt();
        
        if (yas < 18) {
            
            System.out.println("18 ya��ndan k���kler G�REMEZ.");
            
            
        }
        else {
            System.out.println("Merhaba Ho�geldiniz :)");
            
            
        }
        
        */

        System.out.println("L�tfen bir say� girin:");
        
        int sayi = scanner.nextInt();
        
        if (sayi < 0) {
            
            System.out.println("Negatif");
            
        }
        else {
        	
            System.out.println("Pozitif veya 0");
 
        }
        
        
	}

}
