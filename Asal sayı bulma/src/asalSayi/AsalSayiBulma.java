package asalSayi;

public class AsalSayiBulma {

	public static boolean asalMi(int sayi) {
		
		for (int i = 2; i <sayi; i++) {
			if (sayi%i==0) {
				return false; //Ba�ka de�erlere de tam b�l�nd��� i�in asal de�il
			}
			
		}
		return true; //burada say�lar�m�z asal
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 2; i <100; i++) {
			
			if (asalMi(i)) {
				System.out.println(i+" say�s� asald�r");
				
			}
			
		}
		
	}

}
