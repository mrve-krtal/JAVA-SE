package scannerS�n�f;

import java.util.Scanner;

public class ScannerDetay {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        
        int yas = scanner.nextInt();
        scanner.nextLine(); // Dummy (salak�a scanner alma y�ntemi) bu y�ntem de integerdan sonra string geliyorsa java hata verecektir.
        					//Bu y�zden integer tan�mlamas�ndan sonra DUMMY y�ntemi kullan�l�r.
        					//String bir ifadeden sonra integer geliyorsa hata vermez!!
        
        String isim = scanner.nextLine();
        
        System.out.println("Ya�: " + yas);
        System.out.println("�sim: " + isim);
        
        
        
        /*
         
        int yas1 = scanner.nextInt();
        int yas2 = scanner.nextInt();
        int yas3 = scanner.nextInt();
        
        System.out.println("yas1 : " + yas1 + " yas2: " + yas2 + " yas3: " + yas3 );
        
        */
        
        
        
    }
    

	}

