package Donguler;

import java.util.Scanner;

public class ForDongusu {

	public static void main(String[] args) {
		/*
        for (baslatma ; kosul ; artýrma veya azaltma iþlemleri) {
            Döngü koþulumuz doðru olduðu sürece burasý çalýþacak.
        
        }
        
        */
      /* 
      int i;
       
       for (i = 0; i < 5 ; i++) {
           
           System.out.println("i = " + i);
           
       } 
      System.out.println("---****-----");
      
     for (int j = 5; j > 0 ; j--) {
          System.out.println("j = " + j);
          
      }
     */
		
     /*
      
      for (int i = 10 ; i >= 0 ; i--) {
         
         System.out.println("i = " + i);
         
     }
     
     */
     
     /*
      
      int i = 0;
     
     for(; i < 5 ;i++) {
         System.out.println("Java Öðreniyorum...");
     }
     
     */
   
      /*
      int i = 0;
      int j = 10;
     
     for (; i < 10 && j > 0; i++,j--){
         
         System.out.println("i = " + i);
         System.out.println("j = " + j);
         System.out.println("--");
     }
     */
		
		/*
      	for (int i = 2 ; i < 100 ; i *= 2){
      	
         	System.out.println("i=" + i);
     	}
     */
		
		
     // 5! = 5 4 3 2 1
     // BÝR SAYININ FAKTÖRÝYELÝNÝ HESAPLAMA
		
    Scanner fak=new Scanner(System.in);
    
    int faktoriyel=1;
    
    System.out.println("Bir sayý giriniz:");
    
    int sayi=fak.nextInt();
    
    for (int i = 1; i <=sayi; i++) {
    	
    	faktoriyel=faktoriyel*i; //faktoriyel*=i;
    	   
    }
    
    System.out.println(sayi+" sayýsýnýn faktöriyel sonucu:"+faktoriyel);

    }

}
