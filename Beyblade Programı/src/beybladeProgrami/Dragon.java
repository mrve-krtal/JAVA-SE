package beybladeProgrami;

public class Dragon extends Beyblade {
	
	private String kutsalCanavar;
	private String gizliYetenek;

	public Dragon(String beybladeci, int donusHizi, int saldiriGucu, String kutsalCanavar, String gizliYetenek) {
		super(beybladeci, donusHizi, saldiriGucu);
		this.kutsalCanavar = kutsalCanavar;
		this.gizliYetenek = gizliYetenek;
	}
	
	@Override
	public void kutsalCanavarOrtayaCikar() {
		System.out.println(getBeybladeci()+" "+kutsalCanavar+"� ortaya ��kart�yor..");
		System.out.println(getBeybladeci()+"'�n Sald�r�s� : hayalet kas�rgas�");
	}

	@Override
	public void bilgileriGoster() {
		// TODO Auto-generated method stub
		super.bilgileriGoster();
		System.out.println("Kutsal Canavar Ad�:"+kutsalCanavar);
		System.out.println("Gizli Yetenek: "+gizliYetenek);
	}


}
