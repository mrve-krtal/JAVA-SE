package geometrikSekiller;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		
		String islemler="Ýþlemler.. \n"
						+"1. Kare Alaný Hesapla \n"
						+"2. Üçgen Alaný Hesapla \n"
						+"3. Dairenin Alaný Hesapla \n"
						+"Çýkýþ : q";
		
		while (true) {
			System.out.println(islemler);
			System.out.println("Hangi þeklin alanýný hesaplamak istiyorsunuz..");
			String sekil_turu=scanner.nextLine();
			
			Sekil sekil=null; //Önemli !!!
			
			if (sekil_turu.equals("q")) {
				System.out.println("Programdan çýkýyor.");
				System.out.println("--------------");
				
				break;
				
			}
			else if (sekil_turu.equals("1")) {
				
				System.out.println("Karenin Kenarý: ");
				int kenar=scanner.nextInt();
				scanner.nextLine();
				
				sekil=new Kare("kare1", kenar);
				sekil.alanHesapla();
				System.out.println("--------------");
				
			}
			else if (sekil_turu.equals("2")) {
				
				System.out.println("Kenar1 : ");
				int kenar1=scanner.nextInt();
				System.out.println("Kenar2 : ");
				int kenar2=scanner.nextInt();
				System.out.println("Kenar3 : ");
				int kenar3=scanner.nextInt();
				scanner.nextLine();
				
				sekil=new Ucgen("Ucgen1", kenar1, kenar2, kenar3);
				
				sekil.alanHesapla();
				System.out.println("--------------");
				
			}
			else if (sekil_turu.equals("3")) {
				
				System.out.println("Dairenin yarýçapý :");
				int yaricap=scanner.nextInt();
				scanner.nextLine();
				
				sekil=new Daire("Daire1", yaricap);
				sekil.alanHesapla();
				System.out.println("--------------");
				
				
			}
			else {
				System.out.println("Geçersiz iþlem..");
				System.out.println("--------------");
				
			}
		}
		

		
	}

}
