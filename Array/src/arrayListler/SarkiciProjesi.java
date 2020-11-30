package arrayListler;

import java.util.ArrayList;

public class SarkiciProjesi {
	
	private ArrayList<String> sarkicilar_listesi=new ArrayList<String>();
	
	public void sarkicilari_bastir() {
		
		System.out.println("Þarkýcý Listesinden "+sarkicilar_listesi.size()+" tane þarkýcý var");
		
		for (int i = 0; i < sarkicilar_listesi.size(); i++) {
			
			System.out.println((i+1)+". þarkýcýnýn ismi : "+sarkicilar_listesi.get(i));
			
		}
		
	}
	public void sarkici_ekle(String isim) {
		sarkicilar_listesi.add(isim);
		
		System.out.println("Þarkýcý listesi güncellendi..");
	}
	
	public void sarkici_guncelle(String yeni_isim, int pozisyon) {
		
		sarkicilar_listesi.set(pozisyon, yeni_isim);
		
		System.out.println("Þarkýcý listesi güncelledi..");
	}
	
	
	public void sarkici_sil(int pozisyon) {
		
		String isim=sarkicilar_listesi.get(pozisyon);
		
		sarkicilar_listesi.remove(pozisyon);
		
		System.out.println(isim+" isimli þarkýcý silindi..");
		
	}
	
	public void sarkici_ara(String sarkici_ismi) {
		
		int pozisyon=sarkicilar_listesi.indexOf(sarkici_ismi);
		
		if (pozisyon>=0) {
			
			System.out.println("Þarkýcý bulundu..");
			System.out.println(sarkici_ismi+" isimli þarkýcý "+(pozisyon+1)+". sýrada");
			
		}
		else {
			System.out.println("Þarkýcý bulunamadý..");
		}
	}

}
