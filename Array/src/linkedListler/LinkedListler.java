package linkedListler;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListler {
	
	public static void listeyi_bastir(LinkedList<String> gidilecek_yerler) {
		/*
		for (String gd : gidilecek_yerler) {
			System.out.println(gd);
			
		}
		*/
		
		ListIterator<String> iterator=gidilecek_yerler.listIterator();
		
		while (iterator.hasNext()) { //iterator'�n g�sterdi�i herhangi bir obje var m�?
			System.out.println(iterator.next()); //Iterator'�n bir sonraki g�sterdi�i iterator'� yazd�racak..
			
		}
		
	}
	
	public static void main(String[] args) {
		
		LinkedList<String> gidilecek_yerler=new LinkedList<String>();
		
		gidilecek_yerler.add("K�t�phane");
		gidilecek_yerler.add("Ev");
		gidilecek_yerler.add("�stanbul");
		gidilecek_yerler.add("Spor salonu");
		gidilecek_yerler.add("Banka");
		
		listeyi_bastir(gidilecek_yerler);
		System.out.println("--------");
		
		gidilecek_yerler.add(4,"Al��veri� merkezi");
		listeyi_bastir(gidilecek_yerler);
		
		System.out.println("---**----");
		gidilecek_yerler.remove(3);
		listeyi_bastir(gidilecek_yerler);
	
	}

}
