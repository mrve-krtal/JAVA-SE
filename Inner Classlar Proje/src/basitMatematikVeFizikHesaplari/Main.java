package basitMatematikVeFizikHesaplari;

import java.util.Scanner;

public class Main {

	//Basit matematik ve Fizik Problemleri
	//Daire Alan-Matematik
	//Üçgen çevresi
	//3 boyutlu vektörlerin çarpýmý
	
	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Matematik ve Fizik Problemleri Programýna Hoþgeldiniz..");
		
		String islemler="Ýþlemler.. \n"
						+"1. Dairenin Alaný .. \n"
						+"2. Üçgenin çevresi.. \n"
						+"3. Vektörün iç çarpýmýný hesaplama.. \n"
						+"Çýkýþ için q";
		
		while (true) {
			System.out.println(islemler);
			System.out.println("Ýþlemi seçiniz..");
			String islem=scanner.nextLine();
			
			if (islem.equals("q")) {
				System.out.println("Programdan çýkýlýyor.");
				break;
				
			}
			else if (islem.equals("1")) {
				System.out.println("Dairenin yarýçapý : ");
				int yaricap=scanner.nextInt();
				scanner.nextLine();
				
				Problemler.Matematik.daireAlan(yaricap);
				
				System.out.println("--------------");
			}
			else if (islem.equals("2")) {
				System.out.println("Kenar1 : ");
				int kenar1=scanner.nextInt();
				scanner.nextLine();
				
				System.out.println("Kenar2 : ");
				int kenar2=scanner.nextInt();
				scanner.nextLine();
				
				System.out.println("Kenar3 : ");
				int kenar3=scanner.nextInt();
				scanner.nextLine();
				
				Problemler.Matematik.ucgenCevresi(kenar1, kenar2, kenar3);
				
				System.out.println("--------------");
				
			}
			else if (islem.equals("3")) {
				
				Vec vec1=new Vec("Vektör1");
				Vec vec2=new Vec("Vektör2");

				Problemler.Fizik.icCarpim(vec1, vec2);
				

				System.out.println("--------------");
			}
			else {
				System.out.println("Geçersiz iþlem..");
			}
			
		}
		

	}

}
