package objectOrientedProgramlamayaGiris;

public class PrivateArabaMain {

	public static void main(String[] args) {

		PrivateAraba araba=new PrivateAraba();
		
		araba.setModel("Mercedes");
		
		System.out.println("Arabanýn Markasý: "+araba.getModel());

		araba.setKapi(-5);
		//System.out.println("Arabanýn "+araba.getKapi()+ " var");
	}

}
