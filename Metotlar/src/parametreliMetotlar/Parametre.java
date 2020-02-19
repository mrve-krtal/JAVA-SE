package parametreliMetotlar;

public class Parametre {
	
	public static void selamlar(String ad) {
		
		System.out.println("selam " +ad);
	}
	
	public static void topla(int a, int b, int c) {
		
		int toplam=a+b+c;
		System.out.println("sayýlarýn toplamý: "+toplam);
		
	}

	public static void main(String[] args) {

		selamlar("millet");
		
		topla(3,5,7);
		topla(15, 20, 30);
		


	}

}
