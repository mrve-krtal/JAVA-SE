package inheritance1;

public class Yonetici extends Calisan { //subClass

	private int sorumlu_kisi; //Ekstra özellik
	
	public Yonetici(String isim, int maas, String departman,int sorumlu_kisi) {
		super(isim, maas, departman); //miras aldýðým class'ýn constructor kullanabilirim. çünkü benim özelliklerim private

		this.sorumlu_kisi=sorumlu_kisi;

	} 
	public void zam_yap(int zam_miktari) {
		
		System.out.println("Çalýþanlara  "+zam_miktari+" TL zam yapýldý.");
	}

	public void bilgileriGöster() {
		/*
		System.out.println("isim:"+getIsim());
		System.out.println("maaaþ:"+getMaas());
		System.out.println("Departman:"+getDepartman());
		*/
		super.bilgileriGöster();
		System.out.println("sorumlu kiþi sayýsý: "+this.sorumlu_kisi);
	}
	
	

}
