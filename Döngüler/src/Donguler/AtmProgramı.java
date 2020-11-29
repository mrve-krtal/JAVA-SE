package Donguler;

import java.util.Scanner;

public class AtmProgramý {

	public static void main(String[] args) {
		/*

        While döngüsü yardýmýyla bir tane ATM programý yapmaya çalýþýn.
        
        Ýþlemler 
        1.Ýþlem : Bakiye Öðrenme
        2.Ýþlem : Para Çekme
        3.Ýþlem : Para Yatýrma
        Çýkýþ : q
        
        */
		int bakiye=10000;
        Scanner banka = new Scanner(System.in);
        String islemler="1. iþlem Bakiye Öðrenme\n"+
        				"2. iþlem Para Çekme \n"+
        				"3. iþlem Para yatýrma \n"+
        				"çýkýþ için q 'a basýn\n ";
        
        System.out.println("------///////-------");
        System.out.println(islemler);
        System.out.println("-------*******------");
        
        while (true) {
        	
        	System.out.println("iþlem seçiniz:");
        	String islem=banka.nextLine();
        	
        	if(islem.equals("q")) {
        		System.out.println("Kartýnýzý veriliyor.");
        		break;
        		
        	}
        	else if (islem.equals("1")) {
        		System.out.println("Bakiyeniz:"+bakiye);
				
			} 
        	
        	else if(islem.equals("2"))
			{
        		System.out.println("Çekmek istediðiniz para tutarýný giriniz:");
        		int cek=banka.nextInt();
        		
        		if (bakiye-cek<0) {
        			System.out.println("Yeterli bakiyeniz yok.");
					
				}
				bakiye=bakiye-cek;
				System.out.println("Güncel bakiyeniz:"+bakiye);
   
			}
        	else if(islem.equals("3")) {
        		System.out.println("Yatýrmak istediðiniz para tutarýný giriniz:");
        		int yat=banka.nextInt();
        		bakiye=bakiye+yat;
        		System.out.println("Güncel bakiyeniz:"+bakiye);
        	}
        	else {
        		
        		System.out.println("Yanlýþ seçim yaptýnýzz..");
        	}
			break;
		}
        
    }

}
