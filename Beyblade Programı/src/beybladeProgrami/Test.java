package beybladeProgrami;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("Beyblade programýna hosgeldiniz..");
		System.out.println("Çýkýþ için q'a basýnýz..");
		

		Scanner scanner=new Scanner(System.in);
		
		while(true) {
			
			System.out.println("Hangi Beyblede'i üretmek istiyorsunuz..");
			String islem=scanner.nextLine();
			if (islem.equals("q")) {
				
				System.out.println("Programdan çýkýlýyor..");
				break;
			}
			else {
				BeybladeFabrikasi fabrika=new BeybladeFabrikasi();
				Beyblade beyblade=fabrika.beybladeUret(islem);
				
				if (beyblade==null) {
					
					System.out.println("LÜtfen geçerli bir beyblade ismi giriniz..");
				}
				else {
					beyblade.bilgileriGoster();
					beyblade.saldir();
					beyblade.kutsalCanavarOrtayaCikar();
				}
				
			}

		}
		

	}

}
