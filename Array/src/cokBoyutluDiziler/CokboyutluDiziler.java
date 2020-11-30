package cokBoyutluDiziler;

import java.util.Scanner;

public class CokboyutluDiziler {

	public static void main(String[] args) {
/*
		int [][] array=new int[2][2];
		
		array[0][0]=10;
		array[0][1]=20;
		array[1][0]=30;
		array[1][1]=40;
		
		System.out.println(array[1][1]);
		
		
		int [][] array2= {{10,20},{30,40}};
		
		System.out.println(array2[0][1]);
*/
		
		//Kullanýcýdan çok boyutlu dizinin elemanlarýný almak..
		int [][] array3=new int[2][2];
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("dizinin elemanlarýný giriniz..");
		for (int i = 0; i < 2; i++) {
			
			for (int j = 0; j < 2 ; j++) {
				array3[i][j]=scanner.nextInt();
			}
		}
		
		System.out.println("******");
		
		for (int i = 0; i < 2; i++) {
			
			for (int j = 0; j < 2; j++) {
				System.out.print(array3[i][j]+ " ");
			}
			System.out.println(" ");
		}
		
	}

}
