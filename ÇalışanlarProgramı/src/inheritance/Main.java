package inheritance;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner scanner=new Scanner(System.in);
		
		System.out.println("�al��anlar program�na ho�geldiniz..");
		
		String islemler="islemler..\n"
						+"1.Yaz�l�mc� i�lemleri \n"
						+"2.y�netici i�lemleri \n"
						+"��k�� i�in q' a bas�n.";
		
		System.out.println("*************-------*********");
		System.out.println(islemler);
		System.out.println("----------****---------");
		
		while (true) {
			System.out.println("i�lem se�iniz: ");
			String islem=scanner.nextLine();
			
			if (islem.equals("q")) {
				
				System.out.println("��k�� yap�l�yor..");
				
			}
			else if (islem.equals("1")) {
				
				Yazilimci yazilimci=new Yazilimci("merve", "kartal", 1, "java,python");
				String yazilimci_islemleri="1.Format at :)) \n"
											+"2.Bilgileri g�ster \n"
											+"��k�� i�in q'ya bas�n.";
				System.out.println(yazilimci_islemleri);
				
				while (true) {
					
					System.out.println("i�lem se�iniz:");
					String islem1=scanner.nextLine();
					
					if (islem1.equals("q")) {
						System.out.println("Yaz�l�mc� i�lemlerinden ��k�� yapmak i�in q'a bas�n.");
						break;
					}
					else if (islem1.equals("1")) {
						
						System.out.println("��letim sistemi : ");
						String isletim_sistemi=scanner.nextLine();
						yazilimci.formatAt(isletim_sistemi);
					}
					else if (islem1.equals("2")) {

						yazilimci.bilgileriGoster();
						
					}
					else {
						System.out.println("ge�ersiz yaz�l�mc� giri�i..");
					}
				}
				
			}
			else if (islem.equals("2")) {
				Yonetici yyonetici=new Yonetici("H�seyin", "Sa�lam", 44, 2);
				String yonetici_islemleri="1.Zam Yap :)) \n"
											+"2. Bilgileri g�ster \n"
											+"��k�� i�in q'ya bas�n.";
				System.out.println(yonetici_islemleri);
				
				while (true) {
					System.out.println("i�lem se�iniz:");
					String y_islem=scanner.nextLine();
					
					if (y_islem.equals("q")) {
						System.out.println("Y�netici i�lemlerinden ��k�� yapmak i�in q'a bas�n.");
						break;
					}
					else if (y_islem.equals("1")) {
						System.out.println("Y�neticinin ne kadar zam yapmas�n� istiyorsunuz..");
						int zamMiktari=scanner.nextInt();
						yyonetici.zamYap(zamMiktari);
					}
					else if(y_islem.equals("2")) {
						
						yyonetici.bilgileriGoster();
					}
					else {
						System.out.println("Ge�ersiz y�netici i�lemleri..");
					}
				}
				
			}
			else {
				System.out.println("ge�ersiz i�lem..");
			}
		}
		
	}

}
