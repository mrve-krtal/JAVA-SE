package sayiDegistirme;

import java.util.Scanner;

public class SayiDegistirmeAtama {

	public static void main(String[] args) {

		Scanner degis=new Scanner(System.in);
		
		int birinci_sayi;
		int ikinci_sayi;
		
		System.out.println("Birinci say�y� giriniz: ");
		birinci_sayi=degis.nextInt();
		
		System.out.println("�kinci say�y� giriniz: ");
		ikinci_sayi=degis.nextInt();
		
		int gecici=birinci_sayi;
		birinci_sayi=ikinci_sayi;
		ikinci_sayi=gecici;
		
		System.out.println("yeni birinci say�n�z : "+birinci_sayi);
		System.out.println("yeni ikinci say�n�z : "+ikinci_sayi);
	}

}
