package ýnterface;

public class MakineMuhendisi implements IMuhendis, ICalisma {

	private boolean askerlik;
	private boolean adli_sicil;
	
	public MakineMuhendisi(boolean askerlik, boolean adli_sicil) {
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
		if (array.length==0) {
			System.out.println("Herhangi bir iþ tecrübem bulunmuyor..");
			
		}
		else {
			System.out.println("Makine mühendisi olarak þu þirketlerde çalýþtým..");
			for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}
		}
	}
	
		public void referans_getir(String[] array) {
		
			if (array.length==0) {
				System.out.println("Herhangi bir referansým bulunmuyor..");
			}
			else {
				System.out.println("Referanslarým..");
				for (int i = 0; i < array.length; i++) {
					System.out.println(array[i]);
				}
				
			}
		}

		@Override
		public void calis() {
			System.out.println("Makine Mühendisi çalýþýyor...");
			
		}

}
