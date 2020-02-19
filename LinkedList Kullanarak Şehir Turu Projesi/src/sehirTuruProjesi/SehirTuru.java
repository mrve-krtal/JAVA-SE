package sehirTuruProjesi;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class SehirTuru {
	
	public static void islemleri_bastir() {
		
		System.out.println("0- ��lemleri G�r�nt�le");
		System.out.println("1- Bir sonraki �ehre git");
		System.out.println("2- Bir �nceki �ehre git");
		System.out.println("3- Uygulamadan ��k");
		
	}
	
	public static void sehirleri_turla(LinkedList<String> sehirler) {
		
		ListIterator<String> iterator=sehirler.listIterator();
		
		int islem;
		
		islemleri_bastir();
		
		Scanner scanner=new Scanner(System.in);
		
		if (!iterator.hasNext()) {
			
			System.out.println("Herhangi bir �ehir bulunmuyor..");
			
		}
		boolean cikis=false;
		boolean ileri=true;
		
		while (!cikis) {
			System.out.println("bir i�lem se�iniz..");
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
					System.out.println("�ehre gidiiyor.."+iterator.next());
				}
				else {
					System.out.println("gidilecek �ehir kalmad�..");
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
					
					System.out.println("�ehre gidiliyor.."+iterator.previous());
				}
				else {
					System.out.println("�ehir turu bitti..");
				}
				
				break;
			
			case 3:
				cikis=true;
				System.out.println("Uygulamadan ��k�l�yor..");
				break;

			}
			
		}
		
	}

	public static void main(String[] args) {
		
		LinkedList<String> sehirler=new LinkedList<String>();
		
		sehirler.add("�stanbul");
		sehirler.add("Malatya");
		sehirler.add("Elaz��");
		sehirler.add("Hatay");
		
		sehirleri_turla(sehirler);
		

	}

}
