package objectOrientedProgramlamayaGiris;

public class PrivateArabaMain {

	public static void main(String[] args) {

		PrivateAraba araba=new PrivateAraba();
		
		araba.setModel("Mercedes");
		
		System.out.println("Araban�n Markas�: "+araba.getModel());

		araba.setKapi(-5);
		//System.out.println("Araban�n "+araba.getKapi()+ " var");
	}

}
