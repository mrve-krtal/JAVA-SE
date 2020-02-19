package objectOrientedProgramlamayaGiris;

public class ArabaMain {

	public static void main(String[] args) {

		Araba oop=new Araba();
		
		oop.kapi=4;
		oop.model="Mercedes";
		oop.renk="Kýrmýzý";
		oop.motorGucu="3000V";
		
		System.out.println(oop.renk+" renkli, "+oop.model+" Modeli,"+oop.kapi+" kapýlý, "+oop.motorGucu+" beygir olan sýfýr araba aldým");
		
	}

}
