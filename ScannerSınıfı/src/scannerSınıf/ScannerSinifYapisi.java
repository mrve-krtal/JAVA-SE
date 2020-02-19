package scannerSýnýf;

import java.util.Scanner;

public class ScannerSinifYapisi {

	public static void main(String[] args) {
		
		Scanner a=new Scanner(System.in);
		
		/*
		System.out.println("Lütfen yaþýnýzý giriniz: ");
		int yas=a.nextInt();
		System.out.println("yaþýnýz: "+yas);
		*/
		
		/*
		System.out.println("Lütfen sayý giriniz: ");
		double sayi=a.nextDouble();
		System.out.println("sayýnýz:"+sayi);
		*/
		
		System.out.println("lütfen bir yazý giriniz:");
		String yazi=a.nextLine();
		System.out.println("yazýnýz: "+yazi);
		
		/*
		 
		 * BU KODDA KULLANICI ÝNTEGER BÝR TANIMLAMA YAPMIÞ FAKAT 
		 * STRÝNG TÝPÝNDE BÝR DEÐER GÝRÝYORSA PROGRAM HAVA VERECEKTÝK.
		 * BU YÜZDEN ÝF BLOKLARI ÖNEMLÝ
		 
		 
		  if (a.hasNextInt()){
              int sayi = a.nextInt();
              System.out.println("Sayý: " + sayi);
        }
        else {
            System.out.println("Lütfen bir sayý giriniz....!");
            
        }
        
        */
		
	}

}
