package inheritance1;

public class Test {

	public static void main(String[] args) {

		//IS-A 
		
		Yonetici yonetici1=new Yonetici("merve", 5000, "java developer", 44);
		yonetici1.bilgileriGöster();
		
		yonetici1.zam_yap(500);
		
	}

}
