package beybladeProgrami;

public class Dranza extends Beyblade {
	
	private String kutsalCanavar;

	public Dranza(String beybladeci, int donusHizi, int saldiriGucu, String kutsalCanavar) {
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
		// TODO Auto-generated method stub
		super.kutsalCanavarOrtayaCikar();
		
		System.out.println(getBeybladeci()+" "+kutsalCanavar+"� ortaya ��kart�yor..");
		System.out.println(getBeybladeci()+"'�n Sald�r�s: Alev k�l�c�s�");
	}

	@Override
	public void bilgileriGoster() {
		System.out.println("kutsal canavar ad�:"+kutsalCanavar);
		
	}
	
	
	

}
