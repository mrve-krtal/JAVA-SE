package metotlaraGiris;

import java.util.Scanner;

public class MetotOlusturma {
	
	public static void selamlama() {
		
		System.out.println("merhaba nasýlýnýz?");
		System.out.println("Matematik' de iyi misiniz?");
		
	}

	public static void faktoriyelMektodu() {
		
		Scanner mFakt=new Scanner(System.in);
		
		int fakt=1;
		
		System.out.println("\nBir sayý giriniz: ");
		int sayi=mFakt.nextInt();
		
		while(sayi>=1) {
			fakt=fakt*sayi;
			sayi--;
			
		}
		System.out.println("faktöriyeli: "+fakt);
		
	}
	public static void main(String[] args) {
		
		selamlama(); //metot(fonk.) parametre almadýðý için biz de içerisine parametre girmedik..
		faktoriyelMektodu();

	}

}
