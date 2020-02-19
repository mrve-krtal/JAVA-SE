package basitMatematikVeFizikHesaplari;

import java.util.Scanner;

public class Main {

	//Basit matematik ve Fizik Problemleri
	//Daire Alan-Matematik
	//��gen �evresi
	//3 boyutlu vekt�rlerin �arp�m�
	
	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Matematik ve Fizik Problemleri Program�na Ho�geldiniz..");
		
		String islemler="��lemler.. \n"
						+"1. Dairenin Alan� .. \n"
						+"2. ��genin �evresi.. \n"
						+"3. Vekt�r�n i� �arp�m�n� hesaplama.. \n"
						+"��k�� i�in q";
		
		while (true) {
			System.out.println(islemler);
			System.out.println("��lemi se�iniz..");
			String islem=scanner.nextLine();
			
			if (islem.equals("q")) {
				System.out.println("Programdan ��k�l�yor.");
				break;
				
			}
			else if (islem.equals("1")) {
				System.out.println("Dairenin yar��ap� : ");
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
				
				Vec vec1=new Vec("Vekt�r1");
				Vec vec2=new Vec("Vekt�r2");

				Problemler.Fizik.icCarpim(vec1, vec2);
				

				System.out.println("--------------");
			}
			else {
				System.out.println("Ge�ersiz i�lem..");
			}
			
		}
		

	}

}
