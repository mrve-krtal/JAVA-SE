package metotlardaReturnKullan�m�;

public class Return {
	
	public static int topla(int a, int b, int c) {
		
		//int toplam=a+b+c;
		//System.out.println("say�lar�n toplam�: "+toplam);
		return a+b+c;
		
	}
	
	public static int carp(int a) {
		return a*2;
		
	}
	
	public static int c�kar(int b) {
		return b-2;
		
	}

	public static void main(String[] args) {
		
		System.out.println("sonu�:"+c�kar(carp(topla(102, 5, 9))));
		
		//returnun alt�ndaki hi� bir �ey �al��mayacakt�r.
		

	}

}
