package armstrongSayi;

import java.util.Scanner;

public class ArmstrongSayiBulma {

	public static void main(String[] args) {
		 /*
        Girilen bir sayýnýn armstrong sayýsýný olup olmadýðýný bulmaya çalýþýn.
        Örneðin, 4 basamaklý bir sayýnýn armstrong sayýsý olmasý için þu þartý saðlamasý gerekmektedir.
        1634 = 1^4 + 6^4 + 3^4 + 4^4 (Buradaki 4 basamak sayýsý)
        371 = 3^3 + 7^3 + 1^3 (Buradaki 3 basamak sayýsý)
    
        Bu programý do while döngüsü yardýmýyla yapabilirsiniz.
        */
		
		Scanner armstrong=new Scanner(System.in);
		
		System.out.println("Bir sayý giriniz:");
		int sayi=armstrong.nextInt();
		
		System.out.println("Basamak sayýsýný giriniz:");
		int basamak_sayisi=armstrong.nextInt();
		
		int gecici_sayi=sayi;
		int toplam=0;
		
		do {
			int basamak_degeri=gecici_sayi%10;
			gecici_sayi/=10;
			
			toplam+=Math.pow(basamak_degeri, basamak_sayisi);
					
		} while (gecici_sayi>0);
		
		if(sayi==toplam) {
			System.out.println("bu sayi bir armstrong sayýsýdýr.");
			
		}
		else {
			System.out.println("Bu sayý bir armstrong sayýsý deðildir.");
		}
		
	}

}
