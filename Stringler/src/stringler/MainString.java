package stringler;

public class MainString {

	public static void main(String[] args) {
		
		String a="java ";
		String b="Programlama ";
		String c="Dili ";
		
		String toplam=a+b+c;
		
		System.out.println("String toplamý : " +toplam);
		System.out.println("------****------");
		
		
		int d=35;
		String e=a+d;
		
		System.out.println("Sring ile integer toplamý: "+e);
		System.out.println("------****------");
		
		
		double f=3.52;
		byte g=8;
		
		a=a+d+f+g;
		System.out.println(a);
		System.out.println("------****------");
		
		
		char k='?';
		String l="merhaba nasýlsýnýz"+k;
		
		System.out.println(l);
		System.out.println("------****------");
		
		
		String stringOzellikleri="java "+
							" mükemmel "
							+" bir dil ";
		System.out.println(stringOzellikleri);
		System.out.println("------****------");
		
		
		String t="java\tprogramlama\tdili";
		String n="java\nprogramlama\nöðreniyorum";
		
		System.out.println(" TErs slash t kullanýmý 1 tab kadar boþluk býrakýr. "+t);
		System.out.println("------****------");
		
		System.out.println("TErs slash n kullanýmý 1 alt satýra geçiþ yapar. "+n);
		System.out.println("------****------");
		
		
		
		
		
		
		
	}

}
