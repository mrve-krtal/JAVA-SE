package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListName {

	public static void main(String[] args) {


		//ArrayList<String> arrayList=new ArrayList<String>();
		
		List<String> list=new ArrayList<String>();
		
		//Eleman ekleme
		list.add("Java");
		list.add("C#");
		list.add("Python");
		
		
		//Elemanlar� �a��rma
		System.out.println(list.get(0));
		System.out.println(list.get(2));
		// System.out.println(list.get(3));		//java.lang.IndexOutOfBoundsException hatas� verecektir ��nk� �yle bir index mevcut de�il.
		
		System.out.println("---------------------------");
		
		//for d�ng�s� ile elemanlar� �a��rma
		for (int i = 0; i < list.size(); i++) {
			
			System.out.println(list.get(i));
			
		}
		

		System.out.println("---------------------------");
		
		//foreach ile elemanlar� �a��rma
		for (String s : list) {
			System.out.println(s);
			
		}


		System.out.println("---------------------------");
		
		
		//Liste'den eleman silme ve s�ralama
		list.remove(1);
		list.remove("Python");
		
		for (String s : list) {
			System.out.println(s);
			
		}
		
		
		

	}

}
