package �nterface;

public class Main {

	public static void main(String[] args) {

		// IMuhendis muhendis1=new IMuhendis();  
		//b�yle bir �ey yapmam� m�mk�n de�il ��nk� interfacelerimizden obje olu�turamay�z.
		//onu implement eden class'lar�n objelerine referans oluyor.
		
		PcMuhendisi muhendis= new PcMuhendisi(true, false);
		//IMuhendisi muhendis= new PcMuhendisi(true, false);
		
		muhendis.adli_sicil_sorgula();
		muhendis.askerlik_durumu_sorgula();
		muhendis.mezuniyet_ortalamasi(3.02);
		
		String[] tecrube= {"Vestel", "T�rksat"};
		muhendis.is_tecrubesi(tecrube);

		System.out.println("************");
		
		MakineMuhendisi muhendis2= new MakineMuhendisi(true, false);
		
		String[] tecrube2= {};
		String[] referans= {"Merve Kartal","Erkan Tany�ld�z�"};
		
		muhendis2.askerlik_durumu_sorgula();
		muhendis2.adli_sicil_sorgula();
		muhendis2.is_tecrubesi(tecrube2);
		muhendis2.mezuniyet_ortalamasi(2.33);
		muhendis2.referans_getir(referans);
		
		/*
		 * MakineMuhendisi claas'�nda farkl� bir method olu�turdu�um i�in IMuhendis kisminda tan�ml� olmad���ndan hata verdi
		 * bu y�zden d�n���m yapmak zorunday�z.. 
		IMuhendis muhendis2= new MakineMuhendisi(true, false);
		
		String[] tecrube2= {};
		String[] referans= {"Merve Kartal","Erkan Tany�ld�z�"};
		
		muhendis2.askerlik_durumu_sorgula();
		muhendis2.adli_sicil_sorgula();
		muhendis2.is_tecrubesi(tecrube2);
		muhendis2.mezuniyet_ortalamasi(2.33);
		
		//ekstra'dan t�r d�n���m� yapmaya gerek yok.
		!!!	 (MakineMuhendisi)muhendis2.referans_getir(referans);
		
		*/
		
		muhendis2.calis();
		
	}

}
