package ebob;

public class EbobBulma {
	public static int ebobB(int sayi1, int sayi2) {
		
		int ebob=1;
		for (int i = 1; i <=sayi1 && i<=sayi2 ; i++) {
	
				if((sayi1%i==0) && (sayi2%i==0)) {
					
					ebob=i;
		
				}
		}
		return ebob;
		
	}

	public static void main(String[] args) {

		System.out.println("sayýnýn ebobu: "+ebobB(16, 20));
		

	}

}
