package parametreliMetotlar;

public class SkorOyunu {
	
	public static void skor(String a, int b) {
		
		System.out.println(a+" isimli oyucunun "+b+" puaný.");
	}
	public static void skor(String a) {
			
			System.out.println(a+" isimli oyucunun puaný yok.");
		}
	public static void skor(int b) {
		
		System.out.println("Ýsimsiz oyucunun "+b+" puaný.");
	}

	public static void main(String[] args) {


		skor("merve",444);
		skor(660);
		skor("Hüseyin");

	}

}
