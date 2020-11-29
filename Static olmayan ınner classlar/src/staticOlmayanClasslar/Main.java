package staticOlmayanClasslar;

import java.util.Scanner;

import staticOlmayanClasslar.Matematik.Faktoriyel;

public class Main {

	public static void main(String[] args) {
		
		Matematik.Faktoriyel factorial=new Matematik().new Faktoriyel();
		Matematik.Asal asal=new Matematik().new Asal();
		Matematik.Alan.Daire_alan alan=new Matematik().new Alan().new Daire_alan(); 
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Sayýnýn sayý olup olmadýðýna bak (sayý giriniz) : ");
		int sayi=scanner.nextInt();
		
		if (asal.asal_mi(sayi)) {
			System.out.println("Bu sayý asaldýr..");
		}
		else {
			System.out.println("Bu sayý asal deðildýr.");
		}
		
		factorial.faktoriyel();
		alan.daire_alan(5);
	
	}

}
