package genericMetotlar2;

public class EsitAgirlik extends Aday{

	public EsitAgirlik(int turkce, int matematik, int fizik, int edebiyat) {
		super(turkce, matematik, fizik, edebiyat);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int puanHesapla() {
	
		return getTurkce()*5+getMatematik()*5+getEdebiyat()*4+getFizik()*1;
		
	}

}
