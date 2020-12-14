package exception;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Sabiha G�k�en Havaliman�na Ho�geldiniz....");

		String sartlar = "Yurtd��� ��k�� Kurallar�...\n" + "Herhangi bir siyasi yasa��n�z�n bulunmamas� gerekiyor...\n"
				+ "15 Tl har� bedelinizi tam olarak yat�rman�z gerekiyor...\n"
				+ "Gidece�iniz �lkeye vizenizin bulunmas� gerekiyor...";
		String message = "Yurtd��� �artlar�ndan hepsini sa�laman�z gerekiyor";

		while (true) {
			System.out.println("--------------------------------------------");
			System.out.println(sartlar);
			System.out.println("--------------------------------------------");

			Yolcu yolcu = new Yolcu();

			System.out.println("Har� Bedeli Kontrol Ediliyor...");

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

			System.out.println("\n��lemleriniz Tamam ! Yurtd���na ��kabilirsiniz...");
			break;

		}

	}

}
