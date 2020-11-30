package abstractClass;

public class Kare extends Sekil {

	private int kenar;
	
	public Kare(String isim, int kenar) {
		super(isim);
		this.kenar=kenar;
	}

	@Override
	void alan_hesapla() {
		System.out.println(getIsim()+" alanı : "+(kenar*kenar)+" 'dır.");
		
	}

	public void cevre_Hesapla() {
		System.out.println(getIsim()+" çevresi :"+(4*kenar)+" 'dir.");
	}
	
}
