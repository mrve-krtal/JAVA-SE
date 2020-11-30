package array;

import java.util.Scanner;

public class ArrayVeOzellikleri {
	
	public static void array_bastir(int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.println("Ýndis "+(i+1)+" :"+array[i]);
			
		}
	}
	
	public static double ortalamaBul(int[] array) {
		int toplam=0;
		
		for (int i = 0; i < array.length; i++) {
			toplam+=array[i];
		}
		return ((double)toplam/array.length);
	}

	public static void main(String[] args) {
	/*
	 * 1. kullaným
		int[] a= {20,10,36,44,31,23};
		
		//Arrayler 0. indeks'den baþlar!!
		
		System.out.println(a[0]);
		System.out.println(a[5]);
		System.out.println(a[4]);
		
	*/
		
	/*
	 * 2. kullaným
	 
		int[] a=new int[5];
		
		for(int i=0;i<5;i++) {
			
			a[i]=i*2+4;
		}

		for (int i = 0; i <5; i++) {
			
			System.out.println(a[i]);
			
		}
		
	*/
	
	/*
	 * 3. kullaným
		int[] a=new int[5];
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Dizinin deðerlerini giriniz..");
		
		for (int i = 0; i <5; i++) {
			
			a[i]=scanner.nextInt(); //kullanýcýdan deðer almak için
		}
		

		System.out.println("*******");
		for (int i = 0; i < 5; i++) {
		
			System.out.println(a[i]);
			
		}
	*/
	
		int[] a=new int[5];
		
		int[] b= {10,20,30,50,80,9};
		
		//System.out.println("Array'imizin uzunluðu:"+b.length);
		
		array_bastir(b);
		
		System.out.println("Ortalama: "+ortalamaBul(b));
		

	}

}
