package �nterface;

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
			System.out.println("Askerli�imi yapt�m..");
		}
		else {
			System.out.println("Askerli�imi hen�z yapmad�m..");
		}
		
	}

	@Override
	public String mezuniyet_ortalamasi(double derece) {
		
		return "ortalamam:"+derece;
	}

	
	@Override
	public void adli_sicil_sorgula() {
		if (adli_sicil) {
			System.out.println("Adli sicil kayd�m bulunuyor..");
		}
		else {
			System.out.println("Adli sicil kayd�m bulunmuyor.");
		}
	}

	
	@Override
	public void is_tecrubesi(String[] array) {
		System.out.println("Bilgisayar m�hendisi olarak �u �irketlerde �al��t�m..");
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.println(array[i]);
			
		}
		
	}

}
