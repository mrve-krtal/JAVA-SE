package stringler;

public class MainString {

	public static void main(String[] args) {
		
		String a="java ";
		String b="Programlama ";
		String c="Dili ";
		
		String toplam=a+b+c;
		
		System.out.println("String toplam� : " +toplam);
		System.out.println("------****------");
		
		
		int d=35;
		String e=a+d;
		
		System.out.println("Sring ile integer toplam�: "+e);
		System.out.println("------****------");
		
		
		double f=3.52;
		byte g=8;
		
		a=a+d+f+g;
		System.out.println(a);
		System.out.println("------****------");
		
		
		char k='?';
		String l="merhaba nas�ls�n�z"+k;
		
		System.out.println(l);
		System.out.println("------****------");
		
		
		String stringOzellikleri="java "+
							" m�kemmel "
							+" bir dil ";
		System.out.println(stringOzellikleri);
		System.out.println("------****------");
		
		
		String t="java\tprogramlama\tdili";
		String n="java\nprogramlama\n��reniyorum";
		
		System.out.println(" TErs slash t kullan�m� 1 tab kadar bo�luk b�rak�r. "+t);
		System.out.println("------****------");
		
		System.out.println("TErs slash n kullan�m� 1 alt sat�ra ge�i� yapar. "+n);
		System.out.println("------****------");
		
		
		
		
		
		
		
	}

}
