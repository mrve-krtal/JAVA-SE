package genericMetotlar2;

public class Sayisal extends Aday {

	public Sayisal(int turkce, int matematik, int fizik, int edebiyat) {
		super(turkce, matematik, fizik, edebiyat);


	}

	@Override
	public int puanHesapla() {
		
		return getMatematik()*5+ getTurkce()*5+ getFizik()*4+ getEdebiyat()*1 ;
		
	}

}
