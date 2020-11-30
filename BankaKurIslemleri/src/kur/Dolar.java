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
		System.out.println("\nDolar hesabınız açılıyor..");
		
		System.out.println("Hesabınıza para ekleniyor..");
		bakiye += tutar;
		System.out.println("Yeni bakiye : "+bakiye);
		
	}
	
	@Override
	public void kurCevirme() {
		System.out.println("\nKur çevirme işlemi yapılıyor..");
		bakiye=bakiye*7;
		System.out.println("Hesabınızda :" +bakiye+" TL var");
		
	}

	@Override
	public void paraCekme(int tutar) {
	
		System.out.println("\nHesabınızdan para çekiliyor.. ");
		if (bakiye-tutar<0) {
			
			System.out.println("Bakiye Yok");
		}
		else 
			bakiye-=tutar;
			System.out.println("Yeni bakiye : "+bakiye);
	}
	

}
