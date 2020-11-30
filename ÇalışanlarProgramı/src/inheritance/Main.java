package inheritance;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Çalýþanlar programýna hoþgeldiniz..");
		
		String islemler="islemler..\n"
						+"1.Yazýlýmcý iþlemleri \n"
						+"2.yönetici iþlemleri \n"
						+"Çýkýþ için q' a basýn.";
		
		System.out.println("*************-------*********");
		System.out.println(islemler);
		System.out.println("----------****---------");
		
		while (true) {
			System.out.println("iþlem seçiniz: ");
			String islem=scanner.nextLine();
			
			if (islem.equals("q")) {
				
				System.out.println("Çýkýþ yapýlýyor..");
				
			}
			else if (islem.equals("1")) {
				
				Yazilimci yazilimci=new Yazilimci("merve", "kartal", 1, "java,python");
				String yazilimci_islemleri="1.Format at :)) \n"
											+"2.Bilgileri göster \n"
											+"Çýkýþ için q'ya basýn.";
				System.out.println(yazilimci_islemleri);
				
				while (true) {
					
					System.out.println("iþlem seçiniz:");
					String islem1=scanner.nextLine();
					
					if (islem1.equals("q")) {
						System.out.println("Yazýlýmcý iþlemlerinden çýkýþ yapmak için q'a basýn.");
						break;
					}
					else if (islem1.equals("1")) {
						
						System.out.println("Ýþletim sistemi : ");
						String isletim_sistemi=scanner.nextLine();
						yazilimci.formatAt(isletim_sistemi);
					}
					else if (islem1.equals("2")) {

						yazilimci.bilgileriGoster();
						
					}
					else {
						System.out.println("geçersiz yazýlýmcý giriþi..");
					}
				}
				
			}
			else if (islem.equals("2")) {
				Yonetici yyonetici=new Yonetici("Hüseyin", "Saðlam", 44, 2);
				String yonetici_islemleri="1.Zam Yap :)) \n"
											+"2. Bilgileri göster \n"
											+"Çýkýþ için q'ya basýn.";
				System.out.println(yonetici_islemleri);
				
				while (true) {
					System.out.println("iþlem seçiniz:");
					String y_islem=scanner.nextLine();
					
					if (y_islem.equals("q")) {
						System.out.println("Yönetici iþlemlerinden çýkýþ yapmak için q'a basýn.");
						break;
					}
					else if (y_islem.equals("1")) {
						System.out.println("Yöneticinin ne kadar zam yapmasýný istiyorsunuz..");
						int zamMiktari=scanner.nextInt();
						yyonetici.zamYap(zamMiktari);
					}
					else if(y_islem.equals("2")) {
						
						yyonetici.bilgileriGoster();
					}
					else {
						System.out.println("Geçersiz yönetici iþlemleri..");
					}
				}
				
			}
			else {
				System.out.println("geçersiz iþlem..");
			}
		}
		
	}

}
