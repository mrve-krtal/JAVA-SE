package objectOrientedProgramlamayaGiris;

public class ArabaMain {

	public static void main(String[] args) {

		Araba oop=new Araba();
		
		oop.kapi=4;
		oop.model="Mercedes";
		oop.renk="K�rm�z�";
		oop.motorGucu="3000V";
		
		System.out.println(oop.renk+" renkli, "+oop.model+" Modeli,"+oop.kapi+" kap�l�, "+oop.motorGucu+" beygir olan s�f�r araba ald�m");
		
	}

}
