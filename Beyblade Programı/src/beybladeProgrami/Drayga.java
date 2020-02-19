package beybladeProgrami;

public class Drayga extends Beyblade {

	private String kutsalCanavar;

	public Drayga(String beybladeci, int donusHizi, int saldiriGucu, String kutsalCanavar) {
		super(beybladeci, donusHizi, saldiriGucu);
		this.kutsalCanavar = kutsalCanavar;
	}

	public String getKutsalCanavar() {
		return kutsalCanavar;
	}

	public void setKutsalCanavar(String kutsalCanavar) {
		this.kutsalCanavar = kutsalCanavar;
	}

	@Override
	public void kutsalCanavarOrtayaCikar() {
		System.out.println(getBeybladeci()+" "+kutsalCanavar+"ý ortaya çýkartýyor..");
		System.out.println(getBeybladeci()+"'ýn Saldýrýs: Kaplan pençesi");
	
	}

	@Override
	public void bilgileriGoster() {
		System.out.println("kutsal canavar adý:"+kutsalCanavar);
	
}
}
