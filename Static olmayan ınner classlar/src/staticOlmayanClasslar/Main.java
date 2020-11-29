package staticOlmayanClasslar;

import java.util.Scanner;

import staticOlmayanClasslar.Matematik.Faktoriyel;

public class Main {

	public static void main(String[] args) {
		
		Matematik.Faktoriyel factorial=new Matematik().new Faktoriyel();
		Matematik.Asal asal=new Matematik().new Asal();
		Matematik.Alan.Daire_alan alan=new Matematik().new Alan().new Daire_alan(); 
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Say�n�n say� olup olmad���na bak (say� giriniz) : ");
		int sayi=scanner.nextInt();
		
		if (asal.asal_mi(sayi)) {
			System.out.println("Bu say� asald�r..");
		}
		else {
			System.out.println("Bu say� asal de�ild�r.");
		}
		
		factorial.faktoriyel();
		alan.daire_alan(5);
	
	}

}
