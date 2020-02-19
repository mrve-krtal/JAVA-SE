package overloading;

public class OverloadingMetotlar {
	
	public static void toplama(int a, int b) {
		
		System.out.println("toplam: "+(a+b));
		
	}
	public static void toplama(String a, String b) {
			
			System.out.println("String toplamý: "+a+" "+b);
			
	}
	
//OVERLOADÝNG: toplama metot isimleri ayný parametreleri farklý
	
	public static void main(String[] args) {
		
		toplama(30, 60);
		toplama("yazýlým", "mühendisliði");
	}

}
