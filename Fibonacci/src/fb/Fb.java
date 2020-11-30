package fb;

import java.util.Scanner;

public class Fb {

	public static void main(String[] args) {
		  int t0,t1,tp;
	        
	        Scanner fc=new Scanner(System.in);
	        System.out.println("Bir sayý giriniz: ");
	        int sayi=fc.nextInt();
	        
	         t0=0; t1=1;
	        
	        System.out.println(sayi+ " sayýnýn fibonacci deðerleri");
	        for(int i=0; i<=sayi-2; i++){
	            
	            tp=t0+t1;
	            
	            System.out.println(tp+"\t");
	          
	            
	            t0=t1;
	            
	            t1=tp;
	}

}
}
