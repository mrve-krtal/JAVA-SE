package metotlardaReturnKullanýmý;

public class Return {
	
	public static int topla(int a, int b, int c) {
		
		//int toplam=a+b+c;
		//System.out.println("sayýlarýn toplamý: "+toplam);
		return a+b+c;
		
	}
	
	public static int carp(int a) {
		return a*2;
		
	}
	
	public static int cýkar(int b) {
		return b-2;
		
	}

	public static void main(String[] args) {
		
		System.out.println("sonuç:"+cýkar(carp(topla(102, 5, 9))));
		
		//returnun altýndaki hiç bir þey çalýþmayacaktýr.
		

	}

}
