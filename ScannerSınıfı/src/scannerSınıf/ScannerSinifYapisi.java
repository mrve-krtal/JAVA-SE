package scannerS�n�f;

import java.util.Scanner;

public class ScannerSinifYapisi {

	public static void main(String[] args) {
		
		Scanner a=new Scanner(System.in);
		
		/*
		System.out.println("L�tfen ya��n�z� giriniz: ");
		int yas=a.nextInt();
		System.out.println("ya��n�z: "+yas);
		*/
		
		/*
		System.out.println("L�tfen say� giriniz: ");
		double sayi=a.nextDouble();
		System.out.println("say�n�z:"+sayi);
		*/
		
		System.out.println("l�tfen bir yaz� giriniz:");
		String yazi=a.nextLine();
		System.out.println("yaz�n�z: "+yazi);
		
		/*
		 
		 * BU KODDA KULLANICI �NTEGER B�R TANIMLAMA YAPMI� FAKAT 
		 * STR�NG T�P�NDE B�R DE�ER G�R�YORSA PROGRAM HAVA VERECEKT�K.
		 * BU Y�ZDEN �F BLOKLARI �NEML�
		 
		 
		  if (a.hasNextInt()){
              int sayi = a.nextInt();
              System.out.println("Say�: " + sayi);
        }
        else {
            System.out.println("L�tfen bir say� giriniz....!");
            
        }
        
        */
		
	}

}
