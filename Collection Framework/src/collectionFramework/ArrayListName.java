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
		
		
		//Elemanlarý çaðýrma
		System.out.println(list.get(0));
		System.out.println(list.get(2));
		// System.out.println(list.get(3));		//java.lang.IndexOutOfBoundsException hatasý verecektir çünkü öyle bir index mevcut deðil.
		
		System.out.println("---------------------------");
		
		//for döngüsü ile elemanlarý çaðýrma
		for (int i = 0; i < list.size(); i++) {
			
			System.out.println(list.get(i));
			
		}
		

		System.out.println("---------------------------");
		
		//foreach ile elemanlarý çaðýrma
		for (String s : list) {
			System.out.println(s);
			
		}


		System.out.println("---------------------------");
		
		
		//Liste'den eleman silme ve sýralama
		list.remove(1);
		list.remove("Python");
		
		for (String s : list) {
			System.out.println(s);
			
		}
		
		
		

	}

}
