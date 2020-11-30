package arrayListler;

import java.util.ArrayList;

public class SarkiciProjesi {
	
	private ArrayList<String> sarkicilar_listesi=new ArrayList<String>();
	
	public void sarkicilari_bastir() {
		
		System.out.println("�ark�c� Listesinden "+sarkicilar_listesi.size()+" tane �ark�c� var");
		
		for (int i = 0; i < sarkicilar_listesi.size(); i++) {
			
			System.out.println((i+1)+". �ark�c�n�n ismi : "+sarkicilar_listesi.get(i));
			
		}
		
	}
	public void sarkici_ekle(String isim) {
		sarkicilar_listesi.add(isim);
		
		System.out.println("�ark�c� listesi g�ncellendi..");
	}
	
	public void sarkici_guncelle(String yeni_isim, int pozisyon) {
		
		sarkicilar_listesi.set(pozisyon, yeni_isim);
		
		System.out.println("�ark�c� listesi g�ncelledi..");
	}
	
	
	public void sarkici_sil(int pozisyon) {
		
		String isim=sarkicilar_listesi.get(pozisyon);
		
		sarkicilar_listesi.remove(pozisyon);
		
		System.out.println(isim+" isimli �ark�c� silindi..");
		
	}
	
	public void sarkici_ara(String sarkici_ismi) {
		
		int pozisyon=sarkicilar_listesi.indexOf(sarkici_ismi);
		
		if (pozisyon>=0) {
			
			System.out.println("�ark�c� bulundu..");
			System.out.println(sarkici_ismi+" isimli �ark�c� "+(pozisyon+1)+". s�rada");
			
		}
		else {
			System.out.println("�ark�c� bulunamad�..");
		}
	}

}
