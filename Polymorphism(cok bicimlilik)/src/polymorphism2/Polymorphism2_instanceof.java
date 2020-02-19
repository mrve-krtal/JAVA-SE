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
		return "Hayvan konuþuyor..";
		
	}
}

class Kedi extends Hayvan{

	public Kedi(String isim) {
		super(isim);
	}

	@Override
	public String Konus() {
		// TODO Auto-generated method stub
		return this.getIsim()+" miyavlýyor..";
		
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
		return this.getIsim()+" havlýyor..";
		
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
		return this.getIsim()+" kükrüyor..";
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

		Kopek kopek=new Kopek("Karabaþ");
		
		//INSTANCEOF metodu; bir objenin hangi classtan olduðunu anlamamýz için kullanýyoruz.

		/*
		 	if (kopek instanceof Hayvan) {
			System.out.println("bu nesne Hayvan sýnýfýndandýr..");
		}
		 
		 */
		
		Kopek kopek1=new Kopek("Karabaþ");
		Kedi kedi=new Kedi("limon");
		Aslan aslan=new Aslan("kral");
		Hayvan hayvan=new Hayvan("limon");
		
		konustur(kopek1);
		konustur(kedi);
		konustur(aslan);
		konustur(hayvan);
		
		
		
	}

}


