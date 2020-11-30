package kullaniciGirisi;

import java.util.Scanner;

public class KullaniciGirisi {

	public static void main(String[] args) {
// while döngüsü yardýmýyla bir kullanýcý giriþi yazmaya çalýþýn.
        
		 Scanner scanner = new Scanner(System.in);
	        
	        int giris_hakki = 3;
	        
	        String sys_kullanici_adi = "Merve";
	        String sys_parola = "12345";
	        
	        System.out.println("*****************************");
	        System.out.println("Kullanýcý Giriþine Hoþgeldiniz...");
	        System.out.println("*****************************");
	        
	        while (true) {
	            System.out.print("Kullanýcý Adý : ");
	            String kullanici = scanner.nextLine();
	            System.out.print("Parola : ");
	            String parola = scanner.nextLine();
	            
	            if (kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)) {
	                System.out.println("Hoþgeldiniz, " + kullanici);
	                break;
	            }
	            else if(!kullanici.equals(sys_kullanici_adi) || !parola.equals(sys_parola)) {
	            	  System.out.println("Kullanýcý Adýnýz Veya Parolanýz Yanlýþ...");
		                giris_hakki -= 1;
		                System.out.println("Giriþ Hakký : " + giris_hakki);
	            }
	            else {
	                System.out.println("Kullanýcý Adýnýz ve Parolanýz Yanlýþ...");
	                
	                giris_hakki -= 1;
	                System.out.println("Giriþ Hakký : " + giris_hakki);
	                
	            }
	            if (giris_hakki == 0){
	                
	                System.out.println("Giriþ hakkýnýz bitti. Tekrar Bekleriz....");
	                break;
	            }
	           
	        }
	    }
	}

