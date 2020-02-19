package beybladeProgrami;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("Beyblade program�na hosgeldiniz..");
		System.out.println("��k�� i�in q'a bas�n�z..");
		

		Scanner scanner=new Scanner(System.in);
		
		while(true) {
			
			System.out.println("Hangi Beyblede'i �retmek istiyorsunuz..");
			String islem=scanner.nextLine();
			if (islem.equals("q")) {
				
				System.out.println("Programdan ��k�l�yor..");
				break;
			}
			else {
				BeybladeFabrikasi fabrika=new BeybladeFabrikasi();
				Beyblade beyblade=fabrika.beybladeUret(islem);
				
				if (beyblade==null) {
					
					System.out.println("L�tfen ge�erli bir beyblade ismi giriniz..");
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
