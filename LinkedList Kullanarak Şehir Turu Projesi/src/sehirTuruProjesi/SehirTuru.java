package sehirTuruProjesi;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class SehirTuru {
	
	public static void islemleri_bastir() {
		
		System.out.println("0- Ýþlemleri Görüntüle");
		System.out.println("1- Bir sonraki þehre git");
		System.out.println("2- Bir önceki þehre git");
		System.out.println("3- Uygulamadan çýk");
		
	}
	
	public static void sehirleri_turla(LinkedList<String> sehirler) {
		
		ListIterator<String> iterator=sehirler.listIterator();
		
		int islem;
		
		islemleri_bastir();
		
		Scanner scanner=new Scanner(System.in);
		
		if (!iterator.hasNext()) {
			
			System.out.println("Herhangi bir þehir bulunmuyor..");
			
		}
		boolean cikis=false;
		boolean ileri=true;
		
		while (!cikis) {
			System.out.println("bir iþlem seçiniz..");
			islem=scanner.nextInt();
			
			switch (islem) {
			case 0:
				islemleri_bastir();
				break;
				
			case 1:
				
				if (!ileri) {
					if (iterator.hasNext()) {
						
						iterator.next();
					}
					ileri=true;
				}
				if (iterator.hasNext()) {
					System.out.println("Þehre gidiiyor.."+iterator.next());
				}
				else {
					System.out.println("gidilecek þehir kalmadý..");
					ileri=true;
				}
				
				break;
				
			case 2:
				if(ileri) {
					if (iterator.hasPrevious()) {
						iterator.previous();
						
					}
					ileri=false;
				}
				if (iterator.hasPrevious()) {
					
					System.out.println("Þehre gidiliyor.."+iterator.previous());
				}
				else {
					System.out.println("Þehir turu bitti..");
				}
				
				break;
			
			case 3:
				cikis=true;
				System.out.println("Uygulamadan çýkýlýyor..");
				break;

			}
			
		}
		
	}

	public static void main(String[] args) {
		
		LinkedList<String> sehirler=new LinkedList<String>();
		
		sehirler.add("Ýstanbul");
		sehirler.add("Malatya");
		sehirler.add("Elazýð");
		sehirler.add("Hatay");
		
		sehirleri_turla(sehirler);
		

	}

}
