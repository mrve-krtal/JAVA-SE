package beybladeProgrami;

public class Draciel extends Beyblade{
	
	private String kutsalCanavar;

	public Draciel(String beybladeci, int donusHizi, int saldiriGucu, String kutsalCanavar) {
		super(beybladeci, donusHizi, saldiriGucu);
		this.kutsalCanavar = kutsalCanavar;
	}

	@Override
	public void kutsalCanavarOrtayaCikar() {

		System.out.println(getBeybladeci()+" "+kutsalCanavar+"� ortaya ��kart�yor..");
		System.out.println(getBeybladeci()+"'�n Savunmas� : Kale savunmas�");
	}

	@Override
	public void bilgileriGoster() {

		System.out.println("kutsal canavar ad�:"+kutsalCanavar);
	}
	
	

}
