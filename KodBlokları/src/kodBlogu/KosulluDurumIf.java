package kodBlogu;

import java.util.Scanner;

public class KosulluDurumIf {

	public static void main(String[] args) {
		
		   /*
        if (kosul) {
            Koþul saðlanýnca(true) bu blok çalýþýr. 
        
        }
        
        else if(kosul){
        
        }
        
        else if(kosul){
        
        }
        
        else {
            Bu bloðun üstündeki herhangi bir koþul saðlanmadýðýnda bu blok çalýþýr.
        
        }
        
        */
        Scanner scanner = new Scanner(System.in);
        
        /*
        
        //18 yaþýndan küçüklerim giremeyeceði kod bloðu
        
        System.out.println("Lütfen yaþýnýzý girin:");
        
        int yas = scanner.nextInt();
        
        if (yas < 18) {
            
            System.out.println("18 yaþýndan küçükler GÝREMEZ.");
            
            
        }
        else {
            System.out.println("Merhaba Hoþgeldiniz :)");
            
            
        }
        
        */

        System.out.println("Lütfen bir sayý girin:");
        
        int sayi = scanner.nextInt();
        
        if (sayi < 0) {
            
            System.out.println("Negatif");
            
        }
        else {
        	
            System.out.println("Pozitif veya 0");
 
        }
        
        
	}

}
