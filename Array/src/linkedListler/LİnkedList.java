package linkedListler;

import java.util.ArrayList;

public class LİnkedList {

	public static void main(String[] args) {

		ArrayList<String> diller=new ArrayList<String>();
		
		diller.add("Java");
		diller.add("JSP");
		diller.add("JSF");
		diller.add("JPA");
		diller.add("Spring");
		
		//ArrayList oluşturduk.
		for (String s : diller) {
			System.out.println(s);
			
		}
		// Oluşturduğumuz ArrayList'in 1. indeksine veri ekleme işelemi yapalım..
		System.out.println("*******");
		diller.add(1,"SERVLET");
		for (String s : diller) {
			System.out.println(s);
			
		}

	}
}
