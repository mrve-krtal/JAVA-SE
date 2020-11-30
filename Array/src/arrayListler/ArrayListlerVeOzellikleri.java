package arrayListler;

import java.util.ArrayList;

public class ArrayListlerVeOzellikleri {
	
	//Bir arrayList'i fonksiyona gönderme
	public static void yazdir(ArrayList<String> a) {
		
		for (int i = 0; i < a.size(); i++) {
			
			System.out.println("Element "+(i+1)+" :" +a.get(i));
			
		}
	}

	public static void main(String[] args) {

		ArrayList<String> arrayList=new ArrayList<String>();
		
		arrayList.add("Metallica");
		arrayList.add("Iron Maiden");
		arrayList.add("Sezen Aksu");
		arrayList.add("Cem Adrian");
		arrayList.add("Sezen Aksu");
		
		//3. indiks'deki elemaný bumak için
		System.out.println(arrayList.get(3));
		
		//toplam eleman sayýsý 
		System.out.println(arrayList.size()+" toplam eleman var..");
		System.out.println("********");
		
		
		//Array'imin hangi indis de olduðunu bulmak için
		System.out.println(arrayList.indexOf("Sezen Aksu"));
		
		//arrayListte 2 tane sezen aksu var. ilk Sezen Aksu 2. indis de yer aldýðý için 5. indid'i yazmayacak bunun için
		System.out.println(arrayList.lastIndexOf("Sezen Aksu"));
		
		//ArrayListte olmayan bir veriyi arattýðýmýzda -1 deðerini dönecektir..
		System.out.println(arrayList.indexOf("merve kartal"));
		
		//arrayListte güncelleme
		arrayList.set(4, "Ceylan ertem");
		
		
		//bütün array'leri sýralamak için
		for (int i = 0; i < arrayList.size(); i++) {
			
			System.out.println(arrayList.get(i));
			
		}
		
		
		System.out.println("---------");
		
		//Array'den eleman silme
				arrayList.remove("Metallica"); 
				arrayList.remove(0);
				
		for (int i = 0; i < arrayList.size(); i++) {
					
				System.out.println(arrayList.get(i));
					
		}
		
		System.out.println("-----");
		
		yazdir(arrayList);		
				
				
		
		
	}

}
