package kur;

public class TL implements KurHesabi {

	
	private int bakiye;
	
	public TL(int bakiye) {
		super();
		this.bakiye = bakiye;
	}

	@Override
	public void paraYatirma(int tutar) {
		System.out.println("\nHesab�n�za para yat�r�l�yor..");
		bakiye += tutar;
		System.out.println("Yeni bakiye : "+bakiye);
		
	}
	
	@Override
	public void kurCevirme() {
		System.out.println("\nParan�z $ �eviriliyor..");
		bakiye=bakiye/7;
		System.out.println("Hesab�n�z da :" +bakiye+" $ var");
		
	}

	@Override
	public void paraCekme(int tutar) {
	
		if (bakiye-tutar<0) {
			
			System.out.println("Bakiye Yok");
		}
		else 
			System.out.println("\nHesab�n�zdan para �ekiliyor..");
			bakiye-=tutar;
			System.out.println("Yeni bakiye : "+bakiye);
	}
	
}
