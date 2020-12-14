package exception;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Sabiha Gökçen Havalimanýna Hoþgeldiniz....");

		String sartlar = "Yurtdýþý Çýkýþ Kurallarý...\n" + "Herhangi bir siyasi yasaðýnýzýn bulunmamasý gerekiyor...\n"
				+ "15 Tl harç bedelinizi tam olarak yatýrmanýz gerekiyor...\n"
				+ "Gideceðiniz ülkeye vizenizin bulunmasý gerekiyor...";
		String message = "Yurtdýþý þartlarýndan hepsini saðlamanýz gerekiyor";

		while (true) {
			System.out.println("--------------------------------------------");
			System.out.println(sartlar);
			System.out.println("--------------------------------------------");

			Yolcu yolcu = new Yolcu();

			System.out.println("Harç Bedeli Kontrol Ediliyor...");

			Thread.sleep(3000);

			try {
				yolcu.yurtdisiHarciKontrol();
			} catch (HarcException ex) {
				ex.printStackTrace();
				continue;

			}

			System.out.println("Siyasi Yasak Kontrol Ediliyor...");
			Thread.sleep(3000);

			try {
				yolcu.siyasiYasakKontrol();
			} catch (SiyasiException ex) {
				ex.printStackTrace();
				continue;

			}

			System.out.println("Vize Durumu Kontrol Ediliyor...");
			Thread.sleep(3000);

			try {
				yolcu.vizeDurumuKontrol();
			} catch (VizeException ex) {
				ex.printStackTrace();
				continue;
			}

			System.out.println("\nÝþlemleriniz Tamam ! Yurtdýþýna çýkabilirsiniz...");
			break;

		}

	}

}
