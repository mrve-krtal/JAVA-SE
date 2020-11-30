package scannerSýnýf;

import java.util.Scanner;

public class ScannerDetay {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        
        int yas = scanner.nextInt();
        scanner.nextLine(); // Dummy (salakça scanner alma yöntemi) bu yöntem de integerdan sonra string geliyorsa java hata verecektir.
        					//Bu yüzden integer tanýmlamasýndan sonra DUMMY yöntemi kullanýlýr.
        					//String bir ifadeden sonra integer geliyorsa hata vermez!!
        
        String isim = scanner.nextLine();
        
        System.out.println("Yaþ: " + yas);
        System.out.println("Ýsim: " + isim);
        
        
        
        /*
         
        int yas1 = scanner.nextInt();
        int yas2 = scanner.nextInt();
        int yas3 = scanner.nextInt();
        
        System.out.println("yas1 : " + yas1 + " yas2: " + yas2 + " yas3: " + yas3 );
        
        */
        
        
        
    }
    

	}

