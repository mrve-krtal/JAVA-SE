package yakitTutariHesabi;

import java.util.Scanner;

public class YakitTutariHesabi {

	public static void main(String[] args) {


		Scanner yakit=new Scanner(System.in);
		
		System.out.println("Aracýnýz kilometrede kaç kuruþ yakýyor? (Örneðin:0,34) : ");
		double kurus=yakit.nextDouble();
		
		System.out.println("Aracýnýz kaç kilometre yol yapmþtýr? : ");
		int yol=yakit.nextInt();
		
		System.out.println("Toplam tutarýnýz: "+kurus*yol+" TL'dir.");
		
		

	}

}
