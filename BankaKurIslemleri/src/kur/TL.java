package kur;

public class TL implements KurHesabi {

	
	private int bakiye;
	
	public TL(int bakiye) {
		super();
		this.bakiye = bakiye;
	}

	@Override
	public void paraYatirma(int tutar) {
		System.out.println("\nHesabınıza para yatırılıyor..");
		bakiye += tutar;
		System.out.println("Yeni bakiye : "+bakiye);
		
	}
	
	@Override
	public void kurCevirme() {
		System.out.println("\nParanız $ çeviriliyor..");
		bakiye=bakiye/7;
		System.out.println("Hesabınız da :" +bakiye+" $ var");
		
	}

	@Override
	public void paraCekme(int tutar) {
	
		if (bakiye-tutar<0) {
			
			System.out.println("Bakiye Yok");
		}
		else 
			System.out.println("\nHesabınızdan para çekiliyor..");
			bakiye-=tutar;
			System.out.println("Yeni bakiye : "+bakiye);
	}
	
}
