package linkedListler;

import java.util.ArrayList;

public class LÝnkedList {

	public static void main(String[] args) {

		ArrayList<String> diller=new ArrayList<String>();
		
		diller.add("Java");
		diller.add("JSP");
		diller.add("JSF");
		diller.add("JPA");
		diller.add("Spring");
		
		//ArrayList oluþturduk.
		for (String s : diller) {
			System.out.println(s);
			
		}
		// Oluþturduðumuz ArrayList'in 1. indeksine veri ekleme iþelemi yapalým..
		System.out.println("*******");
		diller.add(1,"SERVLET");
		for (String s : diller) {
			System.out.println(s);
			
		}

	}
}
