package Donguler;

import java.util.Scanner;

public class AtmProgram� {

	public static void main(String[] args) {
		/*

        While d�ng�s� yard�m�yla bir tane ATM program� yapmaya �al���n.
        
        ��lemler 
        1.��lem : Bakiye ��renme
        2.��lem : Para �ekme
        3.��lem : Para Yat�rma
        ��k�� : q
        
        */
		int bakiye=10000;
        Scanner banka = new Scanner(System.in);
        String islemler="1. i�lem Bakiye ��renme\n"+
        				"2. i�lem Para �ekme \n"+
        				"3. i�lem Para yat�rma \n"+
        				"��k�� i�in q 'a bas�n\n ";
        
        System.out.println("------///////-------");
        System.out.println(islemler);
        System.out.println("-------*******------");
        
        while (true) {
        	
        	System.out.println("i�lem se�iniz:");
        	String islem=banka.nextLine();
        	
        	if(islem.equals("q")) {
        		System.out.println("Kart�n�z� veriliyor.");
        		break;
        		
        	}
        	else if (islem.equals("1")) {
        		System.out.println("Bakiyeniz:"+bakiye);
				
			} 
        	
        	else if(islem.equals("2"))
			{
        		System.out.println("�ekmek istedi�iniz para tutar�n� giriniz:");
        		int cek=banka.nextInt();
        		
        		if (bakiye-cek<0) {
        			System.out.println("Yeterli bakiyeniz yok.");
					
				}
				bakiye=bakiye-cek;
				System.out.println("G�ncel bakiyeniz:"+bakiye);
   
			}
        	else if(islem.equals("3")) {
        		System.out.println("Yat�rmak istedi�iniz para tutar�n� giriniz:");
        		int yat=banka.nextInt();
        		bakiye=bakiye+yat;
        		System.out.println("G�ncel bakiyeniz:"+bakiye);
        	}
        	else {
        		
        		System.out.println("Yanl�� se�im yapt�n�zz..");
        	}
			break;
		}
        
    }

}
