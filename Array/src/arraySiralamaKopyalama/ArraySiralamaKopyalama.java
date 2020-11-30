package arraySiralamaKopyalama;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySiralamaKopyalama {

	public static int[] array_doldur(int sayi) {
		
		Scanner scanner=new Scanner(System.in);
		
		int[] cikti=new int[sayi];
		
		for (int i = 0; i < sayi; i++) {
			cikti[i]=scanner.nextInt();
		}
		
		return cikti;
	}
	
	public static void array_bastir(int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("indiks "+(i+1)+": "+array[i]);
			
		}
	}
	public static void array_sort(int[] array) {
		
		//Arrays s�n�f�
		Arrays.sort(array);
		array_bastir(array);
	}
	public static void main(String[] args) {
		
		int[] a=array_doldur(5);
		//array_bastir(a);
		
		array_sort(a); //array'i s�ralama


		//Bu iki array'in i�erikleri ayn� osa dahi e�it de�ildir. ��nk� bellekte farkl� yerleri g�stermektedir.
	
		int[] a1= {1,2,3,4,5,6};
		int[] a2= {1,2,3,4,5,6};
		
		if (a1==a2) {
			System.out.println("E�itler");
		}
		else {
			System.out.println("E�it de�iller");
		}
		
		
		//iki array'in i�eriklerini kontrol etmek i�in; Arrays.equals(a1,a2) metodu ile kontrol edebiliriz.

		int[] b1= {1,2,3,4,5,6};
		int[] b2= {1,2,3,4,5,6};
		
		if (Arrays.equals(b1, b2)) {
			System.out.println("��erikleri E�it");
		}
		else {
			System.out.println("E�it de�iller");
		}
		
	}

}
