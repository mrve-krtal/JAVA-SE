package polymorphism2;

class Hayvan{
	private String isim;

	public Hayvan(String isim) {
		super();
		this.isim = isim;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}
	
	public String Konus() {
		return "Hayvan konu�uyor..";
		
	}
}

class Kedi extends Hayvan{

	public Kedi(String isim) {
		super(isim);
	}

	@Override
	public String Konus() {
		// TODO Auto-generated method stub
		return this.getIsim()+" miyavl�yor..";
		
	}
	
}

class Kopek extends Hayvan{

	public Kopek(String isim) {
		super(isim);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String Konus() {
		// TODO Auto-generated method stub
		return this.getIsim()+" havl�yor..";
		
	}
		
}
class Aslan extends Hayvan {

	public Aslan(String isim) {
		super(isim);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String Konus() {
		// TODO Auto-generated method stub
		return this.getIsim()+" k�kr�yor..";
	}
	
}
public class Polymorphism2_instanceof {
	
	public static void konustur(Object object) {
		//System.out.println(object.konus());
		
		if(object instanceof Kopek) {
			Kopek kopek=(Kopek) object;
			System.out.println(kopek.Konus());
		}
		
		else if(object instanceof Kedi) {
			Kedi kedi=(Kedi) object;
			System.out.println(kedi.Konus());
		}
		else if(object instanceof Aslan) {
			Aslan aslan=(Aslan) object;
			System.out.println(aslan.Konus());
		}
		else if(object instanceof Hayvan) {
			Hayvan hayvan=(Hayvan) object;
			System.out.println(hayvan.Konus());
		}
		
	}

	public static void main(String[] args) {

		Kopek kopek=new Kopek("Karaba�");
		
		//INSTANCEOF metodu; bir objenin hangi classtan oldu�unu anlamam�z i�in kullan�yoruz.

		/*
		 	if (kopek instanceof Hayvan) {
			System.out.println("bu nesne Hayvan s�n�f�ndand�r..");
		}
		 
		 */
		
		Kopek kopek1=new Kopek("Karaba�");
		Kedi kedi=new Kedi("limon");
		Aslan aslan=new Aslan("kral");
		Hayvan hayvan=new Hayvan("limon");
		
		konustur(kopek1);
		konustur(kedi);
		konustur(aslan);
		konustur(hayvan);
		
		
		
	}

}


