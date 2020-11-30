package genericMetotlar;

import genericMetotlar2.Ogrenciler;

public class Test {
	
	public static void main(String[] args) {
		
		Character[] char_dizi= {'J','A','V','A'};
		
		Integer[] integer_dizi= {1,2,3,4,5,6};
		
		String[] string_dizi= {"Java","Python","C#"};
		
		Ogrenciler[] ogrenci_dizi= {new Ogrenciler("Merve"), new Ogrenciler("Kadir"),new Ogrenciler("Hüseyin")};
		
		yazdir(char_dizi);
		System.out.println("-------------");
		yazdir(string_dizi);
		System.out.println("-------------");
		yazdir(integer_dizi);
		System.out.println("-------------");
		yazdir(ogrenci_dizi);
	}
	
	public static <E> void yazdir(E[] dizi) {
		
		for (E e : dizi) {
			System.out.println(e);
		}
		
	}

}
