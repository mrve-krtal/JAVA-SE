package abstractClass;

public class Main {

	public static void main(String[] args) {


		//Sekil sekil=new Sekil("�ekil"); abstract class'larda nesne olu�maz..
		
		Sekil sekil;	//Abstract classtan bir referans olu�turduk.
		sekil=new Kare("Kare2",5); 	//Sekil referans�n� alt class'lara referans olabiliyor yani e�itleyebiliyorum... 
		
		sekil.alan_hesapla();
		
		Kare kare1=new Kare("Kare1", 6);
		Daire daire1=new Daire("Daire",5);
		
		kare1.alan_hesapla();
		daire1.alan_hesapla();
		
		kare1.cevre_Hesapla();
		
		
	}

}
