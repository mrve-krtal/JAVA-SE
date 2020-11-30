package sayiDegistirme;

import java.util.Scanner;

public class SayiDegistirmeAtama {

	public static void main(String[] args) {

		Scanner degis=new Scanner(System.in);
		
		int birinci_sayi;
		int ikinci_sayi;
		
		System.out.println("Birinci sayýyý giriniz: ");
		birinci_sayi=degis.nextInt();
		
		System.out.println("Ýkinci sayýyý giriniz: ");
		ikinci_sayi=degis.nextInt();
		
		int gecici=birinci_sayi;
		birinci_sayi=ikinci_sayi;
		ikinci_sayi=gecici;
		
		System.out.println("yeni birinci sayýnýz : "+birinci_sayi);
		System.out.println("yeni ikinci sayýnýz : "+ikinci_sayi);
	}

}
