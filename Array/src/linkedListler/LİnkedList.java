package linkedListler;

import java.util.ArrayList;

public class L�nkedList {

	public static void main(String[] args) {

		ArrayList<String> diller=new ArrayList<String>();
		
		diller.add("Java");
		diller.add("JSP");
		diller.add("JSF");
		diller.add("JPA");
		diller.add("Spring");
		
		//ArrayList olu�turduk.
		for (String s : diller) {
			System.out.println(s);
			
		}
		// Olu�turdu�umuz ArrayList'in 1. indeksine veri ekleme i�elemi yapal�m..
		System.out.println("*******");
		diller.add(1,"SERVLET");
		for (String s : diller) {
			System.out.println(s);
			
		}

	}
}
