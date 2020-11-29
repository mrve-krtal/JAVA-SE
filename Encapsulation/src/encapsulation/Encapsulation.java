package encapsulation;

public class Encapsulation {

	public static void main(String[] args) {
		/*
		Abone abone=new Abone();
		
		abone.isim="merve kartal";
		abone.sehir="Malatya";
		abone.bakiye=200;
		
		abone.dogalgaz_kullan(150);
		*/
		
		GelismisAbone abone=new GelismisAbone("merve", 100, "malatya");
		abone.bakiye_ogren();

	}

}
