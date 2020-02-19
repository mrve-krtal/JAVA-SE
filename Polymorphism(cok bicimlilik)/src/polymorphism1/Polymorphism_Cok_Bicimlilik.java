package polymorphism1;

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
public class Polymorphism_Cok_Bicimlilik {
	
	public static void konustur(Hayvan hayvan) {
		
		System.out.println(hayvan.Konus());
	}

	public static void main(String[] args) {
		
		/*
		Hayvan hayvan=new Kopek("Karaba�");
		System.out.println(hayvan.Konus());
		
		Hayvan hayvan1=new Kedi("limon");
		System.out.println(hayvan1.Konus());
		
		Hayvan hayvan2=new Aslan("Kral");
		System.out.println(hayvan2.Konus());
		
		Hayvan hayvan3=new Hayvan("limon");
		System.out.println(hayvan3.Konus());

		*/
		
		//konustur ad�nda yeni bir metot olu�turdum. ve bu �ekilde �a��rd�m. yukardaki �a��rma �ekli ile ayn�d�r.
		
		konustur(new Kedi("limon"));
		konustur(new Kopek("karaba�"));
		konustur(new Aslan("Kral"));
		konustur(new Hayvan("limon"));

	}

}
