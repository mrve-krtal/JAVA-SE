package Donguler;

import java.util.Scanner;

public class WhileDongusu {

	public static void main(String[] args) {
		
		 /*
		  *
        while(d�ng� ko�ulu) {
            // Ko�ul do�ru oldu�u s�rece �al���r.
        }
        
        */
		int i=0;
		int j=10;
		while (i<10 && j>0) {
			
			System.out.println("i:"+i+" j:"+j);
			i++;
			j--;
			
		}
		
		Scanner whileFak=new Scanner(System.in);
		
		System.out.println("bir say� giriniz:");
		
		int sayi=whileFak.nextInt();
		
		int fakt=1;
		
		while(sayi>0) {
			
			fakt*=sayi;
			sayi--;
		}
		System.out.println("i�lemin sonucu:"+fakt);
	
		
		
	}

}
