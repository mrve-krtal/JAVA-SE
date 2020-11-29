package yurtdisiProjesi;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		 
		System.out.println("Sabiha G�k�en havaliman�na Ho�geldniz..");
		
		String sartlar="Yurtd��� ��k�� kurallar�.. \n"
						+"Herhangi bir siyasi yasa��n�z�n olmamas� gerekiyor... \n"
						+"15 TL har� bedelinizi �demeniz gerekiyor.. \n"
						+"Gidece�iniz �lkeye vizenizin bulunmas� gerekiyor..";
		
		String message="Yurtd��� �artlar�n�n hepsini sa�laman�z gerekiyor..";
		
		while(true) {
			System.out.println("*******************");
			System.out.println(sartlar);
			System.out.println("--------------------");
			
			Yolcu yolcu=new Yolcu();
			
			System.out.println("Har� bedeli kontrol ediliyor..");
			
			Thread.sleep(3000); //program�m�z� 3 saniye beklettik.
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
			System.out.println("i�lemleriniz tamam yurtd���na ��kabilirsiniz..");
			break;
		}
		
	}

}
