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
		
		//Arrays sýnýfý
		Arrays.sort(array);
		array_bastir(array);
	}
	public static void main(String[] args) {
		
		int[] a=array_doldur(5);
		//array_bastir(a);
		
		array_sort(a); //array'i sýralama


		//Bu iki array'in içerikleri ayný osa dahi eþit deðildir. çünkü bellekte farklý yerleri göstermektedir.
	
		int[] a1= {1,2,3,4,5,6};
		int[] a2= {1,2,3,4,5,6};
		
		if (a1==a2) {
			System.out.println("Eþitler");
		}
		else {
			System.out.println("Eþit deðiller");
		}
		
		
		//iki array'in içeriklerini kontrol etmek için; Arrays.equals(a1,a2) metodu ile kontrol edebiliriz.

		int[] b1= {1,2,3,4,5,6};
		int[] b2= {1,2,3,4,5,6};
		
		if (Arrays.equals(b1, b2)) {
			System.out.println("Ýçerikleri Eþit");
		}
		else {
			System.out.println("Eþit deðiller");
		}
		
	}

}
