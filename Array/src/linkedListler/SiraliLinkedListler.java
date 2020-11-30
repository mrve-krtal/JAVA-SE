package linkedListler;

import java.util.LinkedList;
import java.util.ListIterator;

public class SiraliLinkedListler {
	
	public static void listeyi_bastir(LinkedList<String> gidilecek_yerler) {
			
			ListIterator<String> iterator=gidilecek_yerler.listIterator();
			
			while (iterator.hasNext()) { //iterator'ýn gösterdiði herhangi bir obje var mý?
				System.out.println(iterator.next()); //Iterator'ýn bir sonraki gösterdiði iterator'ý yazdýracak..
				
			}
			
		}
	
	public static void sirali_ekle(LinkedList<String> gidilecek_yerler, String yeni){
		
		ListIterator<String> iterator=gidilecek_yerler.listIterator();
		while (iterator.hasNext()) {

			int karsilastir=iterator.next().compareTo(yeni); //CompareTo demek alfabetik þekilde siralý demek
			
			if (karsilastir==0) {
				//iki deðer eþit
				System.out.println("Listeniz de bu eleman zaten var..");
				
				return;
				
			}
			else if (karsilastir<0) {
				
				//Yeni deðer iterator.next'den daha büyük(alfabetik olarak sözlüðün arka taraflarda..)
				
			}
			else if (karsilastir>0) {
				
				//iterator'ý geri alma(Alfabetik olarak A' dan Z'ye
				iterator.previous();
				iterator.add(yeni);
				
				return;
			}
		}	
		
		iterator.add(yeni); //Bütün elemanlarý ekleme iþlemi
	}


	public static void main(String[] args) {
		
		LinkedList<String> gidilecek_yerler=new LinkedList<String>();
		
		sirali_ekle(gidilecek_yerler, "Okul");
		sirali_ekle(gidilecek_yerler, "Ýþ");
		sirali_ekle(gidilecek_yerler, "Spor salonu");
		sirali_ekle(gidilecek_yerler, "Okul");
		sirali_ekle(gidilecek_yerler, "Pazar");
		
		//LikedListe'e direk olarak sýralý deðer ekleme..
		listeyi_bastir(gidilecek_yerler);
	}

}
