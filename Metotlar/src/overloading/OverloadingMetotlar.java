package overloading;

public class OverloadingMetotlar {
	
	public static void toplama(int a, int b) {
		
		System.out.println("toplam: "+(a+b));
		
	}
	public static void toplama(String a, String b) {
			
			System.out.println("String toplam�: "+a+" "+b);
			
	}
	
//OVERLOAD�NG: toplama metot isimleri ayn� parametreleri farkl�
	
	public static void main(String[] args) {
		
		toplama(30, 60);
		toplama("yaz�l�m", "m�hendisli�i");
	}

}
