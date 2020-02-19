package ınterface;

public class Main {

	public static void main(String[] args) {

		// IMuhendis muhendis1=new IMuhendis();  
		//böyle bir şey yapmamı mümkün değil çünkü interfacelerimizden obje oluşturamayız.
		//onu implement eden class'ların objelerine referans oluyor.
		
		PcMuhendisi muhendis= new PcMuhendisi(true, false);
		//IMuhendisi muhendis= new PcMuhendisi(true, false);
		
		muhendis.adli_sicil_sorgula();
		muhendis.askerlik_durumu_sorgula();
		muhendis.mezuniyet_ortalamasi(3.02);
		
		String[] tecrube= {"Vestel", "Türksat"};
		muhendis.is_tecrubesi(tecrube);

		System.out.println("************");
		
		MakineMuhendisi muhendis2= new MakineMuhendisi(true, false);
		
		String[] tecrube2= {};
		String[] referans= {"Merve Kartal","Erkan Tanyıldızı"};
		
		muhendis2.askerlik_durumu_sorgula();
		muhendis2.adli_sicil_sorgula();
		muhendis2.is_tecrubesi(tecrube2);
		muhendis2.mezuniyet_ortalamasi(2.33);
		muhendis2.referans_getir(referans);
		
		/*
		 * MakineMuhendisi claas'ında farklı bir method oluşturduğum için IMuhendis kisminda tanımlı olmadığından hata verdi
		 * bu yüzden dönüşüm yapmak zorundayız.. 
		IMuhendis muhendis2= new MakineMuhendisi(true, false);
		
		String[] tecrube2= {};
		String[] referans= {"Merve Kartal","Erkan Tanyıldızı"};
		
		muhendis2.askerlik_durumu_sorgula();
		muhendis2.adli_sicil_sorgula();
		muhendis2.is_tecrubesi(tecrube2);
		muhendis2.mezuniyet_ortalamasi(2.33);
		
		//ekstra'dan tür dönüşümü yapmaya gerek yok.
		!!!	 (MakineMuhendisi)muhendis2.referans_getir(referans);
		
		*/
		
		muhendis2.calis();
		
	}

}
