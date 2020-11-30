package genericMetotlar2;

public class Ogrenciler {

	private String isim;

	
	public Ogrenciler(String isim) {
		super();
		this.isim = isim;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	@Override
	public String toString() {
	
		return "isim :"+isim;
	}
}