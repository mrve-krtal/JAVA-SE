package foreach;

public class Deneme {

	private String isim;

	public Deneme(String isim) {
		super();
		this.isim = isim;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}
	
	public void yaz() {
		
		System.out.println(isim);
		
	}
	
}
