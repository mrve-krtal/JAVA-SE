package Donguler;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		/*
		int i=0;

		do {
			System.out.println("i="+i);
			i++;
			
		} while (i<5);
		
		*/
		
		// BÝR SAYININ RAKAMLARI TOPLAMINI BUL
		
		Scanner say=new Scanner(System.in);
		
		System.out.println("Bir sayý giriniz:");
		int sayi=say.nextInt();
		int toplam=0;
		
		do {
			toplam=toplam+sayi%10;
			
			sayi=sayi/10;
			
			System.out.println("sayi:"+sayi);
			
		} while (sayi>0);
		System.out.println("Rakamlarý toplamý:"+toplam);
		
	}

}
