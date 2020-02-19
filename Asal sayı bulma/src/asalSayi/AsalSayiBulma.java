package asalSayi;

public class AsalSayiBulma {

	public static boolean asalMi(int sayi) {
		
		for (int i = 2; i <sayi; i++) {
			if (sayi%i==0) {
				return false; //Baþka deðerlere de tam bölündüðü için asal deðil
			}
			
		}
		return true; //burada sayýlarýmýz asal
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 2; i <100; i++) {
			
			if (asalMi(i)) {
				System.out.println(i+" sayýsý asaldýr");
				
			}
			
		}
		
	}

}
