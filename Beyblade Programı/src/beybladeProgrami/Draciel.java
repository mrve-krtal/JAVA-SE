package beybladeProgrami;

public class Draciel extends Beyblade{
	
	private String kutsalCanavar;

	public Draciel(String beybladeci, int donusHizi, int saldiriGucu, String kutsalCanavar) {
		super(beybladeci, donusHizi, saldiriGucu);
		this.kutsalCanavar = kutsalCanavar;
	}

	@Override
	public void kutsalCanavarOrtayaCikar() {

		System.out.println(getBeybladeci()+" "+kutsalCanavar+"ý ortaya çýkartýyor..");
		System.out.println(getBeybladeci()+"'ýn Savunmasý : Kale savunmasý");
	}

	@Override
	public void bilgileriGoster() {

		System.out.println("kutsal canavar adý:"+kutsalCanavar);
	}
	
	

}
