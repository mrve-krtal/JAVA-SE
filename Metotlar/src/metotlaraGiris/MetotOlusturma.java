package metotlaraGiris;

import java.util.Scanner;

public class MetotOlusturma {
	
	public static void selamlama() {
		
		System.out.println("merhaba nas�l�n�z?");
		System.out.println("Matematik' de iyi misiniz?");
		
	}

	public static void faktoriyelMektodu() {
		
		Scanner mFakt=new Scanner(System.in);
		
		int fakt=1;
		
		System.out.println("\nBir say� giriniz: ");
		int sayi=mFakt.nextInt();
		
		while(sayi>=1) {
			fakt=fakt*sayi;
			sayi--;
			
		}
		System.out.println("fakt�riyeli: "+fakt);
		
	}
	public static void main(String[] args) {
		
		selamlama(); //metot(fonk.) parametre almad��� i�in biz de i�erisine parametre girmedik..
		faktoriyelMektodu();

	}

}
