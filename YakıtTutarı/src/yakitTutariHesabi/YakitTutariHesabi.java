package yakitTutariHesabi;

import java.util.Scanner;

public class YakitTutariHesabi {

	public static void main(String[] args) {


		Scanner yakit=new Scanner(System.in);
		
		System.out.println("Arac�n�z kilometrede ka� kuru� yak�yor? (�rne�in:0,34) : ");
		double kurus=yakit.nextDouble();
		
		System.out.println("Arac�n�z ka� kilometre yol yapm�t�r? : ");
		int yol=yakit.nextInt();
		
		System.out.println("Toplam tutar�n�z: "+kurus*yol+" TL'dir.");
		
		

	}

}
