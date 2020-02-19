package yurtdisiProjesi;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		 
		System.out.println("Sabiha Gökçen havalimanýna Hoþgeldniz..");
		
		String sartlar="Yurtdýþý çýkýþ kurallarý.. \n"
						+"Herhangi bir siyasi yasaðýnýzýn olmamasý gerekiyor... \n"
						+"15 TL harç bedelinizi ödemeniz gerekiyor.. \n"
						+"Gideceðiniz ülkeye vizenizin bulunmasý gerekiyor..";
		
		String message="Yurtdýþý þartlarýnýn hepsini saðlamanýz gerekiyor..";
		
		while(true) {
			System.out.println("*******************");
			System.out.println(sartlar);
			System.out.println("--------------------");
			
			Yolcu yolcu=new Yolcu();
			
			System.out.println("Harç bedeli kontrol ediliyor..");
			
			Thread.sleep(3000); //programýmýzý 3 saniye beklettik.
			if(yolcu.yurtdisiharcikontrol()==false) {
				
				System.out.println(message);
				continue;
			}
			System.out.println("Siyasi yasak kontrol ediliyor..");
			Thread.sleep(4000);
			
			if (yolcu.siyasiYasakKontrol()==false) {
				System.out.println(message);
				continue;
				
			}
			System.out.println("Vize durumu kontrol ediliyor..");
			Thread.sleep(5000);
			
			if (yolcu.vizeDurumuKontrol()==false) {
				System.out.println(message);
				continue;
				
			}
			System.out.println("iþlemleriniz tamam yurtdýþýna çýkabilirsiniz..");
			break;
		}
		
	}

}
