package ýnterface;

public class PcMuhendisi implements IMuhendis {
	
	private boolean askerlik;
	private boolean adli_sicil;
	

	public PcMuhendisi(boolean askerlik, boolean adli_sicil) {
		super();
		this.askerlik = askerlik;
		this.adli_sicil = adli_sicil;
	}

	@Override
	public void askerlik_durumu_sorgula() {
		if (askerlik) {
			System.out.println("Askerliðimi yaptým..");
		}
		else {
			System.out.println("Askerliðimi henüz yapmadým..");
		}
		
	}

	@Override
	public String mezuniyet_ortalamasi(double derece) {
		
		return "ortalamam:"+derece;
	}

	
	@Override
	public void adli_sicil_sorgula() {
		if (adli_sicil) {
			System.out.println("Adli sicil kaydým bulunuyor..");
		}
		else {
			System.out.println("Adli sicil kaydým bulunmuyor.");
		}
	}

	
	@Override
	public void is_tecrubesi(String[] array) {
		System.out.println("Bilgisayar mühendisi olarak þu þirketlerde çalýþtým..");
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.println(array[i]);
			
		}
		
	}

}
