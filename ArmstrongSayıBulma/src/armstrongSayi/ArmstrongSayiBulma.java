package armstrongSayi;

import java.util.Scanner;

public class ArmstrongSayiBulma {

	public static void main(String[] args) {
		 /*
        Girilen bir say�n�n armstrong say�s�n� olup olmad���n� bulmaya �al���n.
        �rne�in, 4 basamakl� bir say�n�n armstrong say�s� olmas� i�in �u �art� sa�lamas� gerekmektedir.
        1634 = 1^4 + 6^4 + 3^4 + 4^4 (Buradaki 4 basamak say�s�)
        371 = 3^3 + 7^3 + 1^3 (Buradaki 3 basamak say�s�)
    
        Bu program� do while d�ng�s� yard�m�yla yapabilirsiniz.
        */
		
		Scanner armstrong=new Scanner(System.in);
		
		System.out.println("Bir say� giriniz:");
		int sayi=armstrong.nextInt();
		
		System.out.println("Basamak say�s�n� giriniz:");
		int basamak_sayisi=armstrong.nextInt();
		
		int gecici_sayi=sayi;
		int toplam=0;
		
		do {
			int basamak_degeri=gecici_sayi%10;
			gecici_sayi/=10;
			
			toplam+=Math.pow(basamak_degeri, basamak_sayisi);
					
		} while (gecici_sayi>0);
		
		if(sayi==toplam) {
			System.out.println("bu sayi bir armstrong say�s�d�r.");
			
		}
		else {
			System.out.println("Bu say� bir armstrong say�s� de�ildir.");
		}
		
	}

}
