package inheritance1;

public class Yonetici extends Calisan { //subClass

	private int sorumlu_kisi; //Ekstra �zellik
	
	public Yonetici(String isim, int maas, String departman,int sorumlu_kisi) {
		super(isim, maas, departman); //miras ald���m class'�n constructor kullanabilirim. ��nk� benim �zelliklerim private

		this.sorumlu_kisi=sorumlu_kisi;

	} 
	public void zam_yap(int zam_miktari) {
		
		System.out.println("�al��anlara  "+zam_miktari+" TL zam yap�ld�.");
	}

	public void bilgileriG�ster() {
		/*
		System.out.println("isim:"+getIsim());
		System.out.println("maaa�:"+getMaas());
		System.out.println("Departman:"+getDepartman());
		*/
		super.bilgileriG�ster();
		System.out.println("sorumlu ki�i say�s�: "+this.sorumlu_kisi);
	}
	
	

}
