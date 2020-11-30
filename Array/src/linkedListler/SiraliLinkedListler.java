package linkedListler;

import java.util.LinkedList;
import java.util.ListIterator;

public class SiraliLinkedListler {
	
	public static void listeyi_bastir(LinkedList<String> gidilecek_yerler) {
			
			ListIterator<String> iterator=gidilecek_yerler.listIterator();
			
			while (iterator.hasNext()) { //iterator'�n g�sterdi�i herhangi bir obje var m�?
				System.out.println(iterator.next()); //Iterator'�n bir sonraki g�sterdi�i iterator'� yazd�racak..
				
			}
			
		}
	
	public static void sirali_ekle(LinkedList<String> gidilecek_yerler, String yeni){
		
		ListIterator<String> iterator=gidilecek_yerler.listIterator();
		while (iterator.hasNext()) {

			int karsilastir=iterator.next().compareTo(yeni); //CompareTo demek alfabetik �ekilde siral� demek
			
			if (karsilastir==0) {
				//iki de�er e�it
				System.out.println("Listeniz de bu eleman zaten var..");
				
				return;
				
			}
			else if (karsilastir<0) {
				
				//Yeni de�er iterator.next'den daha b�y�k(alfabetik olarak s�zl���n arka taraflarda..)
				
			}
			else if (karsilastir>0) {
				
				//iterator'� geri alma(Alfabetik olarak A' dan Z'ye
				iterator.previous();
				iterator.add(yeni);
				
				return;
			}
		}	
		
		iterator.add(yeni); //B�t�n elemanlar� ekleme i�lemi
	}


	public static void main(String[] args) {
		
		LinkedList<String> gidilecek_yerler=new LinkedList<String>();
		
		sirali_ekle(gidilecek_yerler, "Okul");
		sirali_ekle(gidilecek_yerler, "��");
		sirali_ekle(gidilecek_yerler, "Spor salonu");
		sirali_ekle(gidilecek_yerler, "Okul");
		sirali_ekle(gidilecek_yerler, "Pazar");
		
		//LikedListe'e direk olarak s�ral� de�er ekleme..
		listeyi_bastir(gidilecek_yerler);
	}

}
