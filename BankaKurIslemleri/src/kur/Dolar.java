package kur;

public class Dolar implements KurHesabi {
	
	
	private int bakiye;

	public Dolar(int bakiye) {
		super();
		this.bakiye = bakiye;
	}

	
	@Override
	public void paraYatirma(int tutar) {
		System.out.println("-----------------------------------");
		System.out.println("\nDolar hesab�n�z a��l�yor..");
		
		System.out.println("Hesab�n�za para ekleniyor..");
		bakiye += tutar;
		System.out.println("Yeni bakiye : "+bakiye);
		
	}
	
	@Override
	public void kurCevirme() {
		System.out.println("\nKur �evirme i�lemi yap�l�yor..");
		bakiye=bakiye*7;
		System.out.println("Hesab�n�zda :" +bakiye+" TL var");
		
	}

	@Override
	public void paraCekme(int tutar) {
	
		System.out.println("\nHesab�n�zdan para �ekiliyor.. ");
		if (bakiye-tutar<0) {
			
			System.out.println("Bakiye Yok");
		}
		else 
			bakiye-=tutar;
			System.out.println("Yeni bakiye : "+bakiye);
	}
	

}
