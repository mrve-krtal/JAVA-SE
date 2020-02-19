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
		System.out.println(getBeybladeci()+" "+kutsalCanavar+"� ortaya ��kart�yor..");
		System.out.println(getBeybladeci()+"'�n Sald�r�s: Kaplan pen�esi");
	
	}

	@Override
	public void bilgileriGoster() {
		System.out.println("kutsal canavar ad�:"+kutsalCanavar);
	
}
}
