package kullaniciGirisi;

import java.util.Scanner;

public class KullaniciGirisi {

	public static void main(String[] args) {
// while d�ng�s� yard�m�yla bir kullan�c� giri�i yazmaya �al���n.
        
		 Scanner scanner = new Scanner(System.in);
	        
	        int giris_hakki = 3;
	        
	        String sys_kullanici_adi = "Merve";
	        String sys_parola = "12345";
	        
	        System.out.println("*****************************");
	        System.out.println("Kullan�c� Giri�ine Ho�geldiniz...");
	        System.out.println("*****************************");
	        
	        while (true) {
	            System.out.print("Kullan�c� Ad� : ");
	            String kullanici = scanner.nextLine();
	            System.out.print("Parola : ");
	            String parola = scanner.nextLine();
	            
	            if (kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)) {
	                System.out.println("Ho�geldiniz, " + kullanici);
	                break;
	            }
	            else if(!kullanici.equals(sys_kullanici_adi) || !parola.equals(sys_parola)) {
	            	  System.out.println("Kullan�c� Ad�n�z Veya Parolan�z Yanl��...");
		                giris_hakki -= 1;
		                System.out.println("Giri� Hakk� : " + giris_hakki);
	            }
	            else {
	                System.out.println("Kullan�c� Ad�n�z ve Parolan�z Yanl��...");
	                
	                giris_hakki -= 1;
	                System.out.println("Giri� Hakk� : " + giris_hakki);
	                
	            }
	            if (giris_hakki == 0){
	                
	                System.out.println("Giri� hakk�n�z bitti. Tekrar Bekleriz....");
	                break;
	            }
	           
	        }
	    }
	}

