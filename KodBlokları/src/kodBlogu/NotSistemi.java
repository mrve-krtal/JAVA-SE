package kodBlogu;

import java.util.Scanner;

public class NotSistemi {

	public static void main(String[] args) {

		 /*
	    Kullanýcýdan Vize1,Vize2  ve Final notunu alarak bir harf hesaplama sistemi yapmaya çalýþýn. 
	    Ayrýca kullanýcýdan okuldaki genel ortalamasýný alarak,  
	    DD alma ve 2.50’nin altýnda olma koþuluna göre ekrana bir tavsiye mesajý yazdýrýn. 

	    Vize1 toplam notun %30'una etki edecek.

	    Vize2 toplam notun %30'una etki edecek.

	    Final toplam notun %40'ýna etki edecek.


	    Toplam Not >=  90 -----> AA

	    Toplam Not >=  85 -----> BA

	    Toplam Not >=  80 -----> BB

	    Toplam Not >=  75 -----> CB

	    Toplam Not >=  70 -----> CC

	    Toplam Not >=  65 -----> DC

	    Toplam Not >=  60 -----> DD

	    Toplam Not >=  55 -----> FD

	    Toplam Not <  55 -----> FF

	    */
		
		Scanner not=new Scanner(System.in);
		
		System.out.println("vize1 notunu giriniz:");
		int v1=not.nextInt();
		
		System.out.println("vize2 notunu giriniz:");
		int v2=not.nextInt();
		
		System.out.println("final notunu giriniz:");
		int f=not.nextInt();
		
		double hesapla=v1*0.3+v2*0.3+f*0.4;
		
		System.out.println("ortalamanýz: "+hesapla);
		
		if(hesapla>=90) {
			System.out.println("AA");
		}
		else if (hesapla<90 && hesapla>=85) {
			System.out.println("BA");
			
		}
		else if (hesapla<85 && hesapla>=80) {
			System.out.println("BB");
			
		}	
		else if (hesapla<80 && hesapla>=75) {
			System.out.println("CB");
			
		}
		else if (hesapla<75 && hesapla>=70) {
			System.out.println("CC");
			
		}		
		else if (hesapla<70 && hesapla>=65) {
			System.out.println("DC");
			
		}
		else if (hesapla<65 && hesapla>=60) {
			System.out.println("DD");
			
		}		
		else if (hesapla<60 && hesapla>=55) {
			System.out.println("FD");
			
		}
		else if (hesapla<55 && hesapla>=50) {
			System.out.println("FF");
			
		}
		else {
			System.out.println("SINAVA GÝRMEDÝ..");
		}

	}

}
