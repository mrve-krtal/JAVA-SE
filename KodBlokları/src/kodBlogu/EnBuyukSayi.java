package kodBlogu;

import java.util.Scanner;

public class EnBuyukSayi {

	public static void main(String[] args) {
		
		Scanner en=new Scanner(System.in);
		
		System.out.println("3 tane sayý giriniz:");
		
		System.out.print("1. sayý: ");
		int sayi1=en.nextInt();
		
		System.out.print("2. sayý: ");
		int sayi2=en.nextInt();
		
		System.out.print("3. sayý: ");
		int sayi3=en.nextInt();
		
		int maks=-1;
		
		if(sayi1>=sayi2 && sayi1>=sayi3) {
			
			maks=sayi1;
		}
		
		else if(sayi2>=sayi1 && sayi2>=sayi3) {
			
			maks=sayi2;
		}
		
		else {
			maks=sayi3;
		}
		
		System.out.println("maksimum sayý: "+maks);

	}

}
