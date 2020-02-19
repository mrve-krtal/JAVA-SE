package objectOrientedProgramlamayaGiris;

public class PrivateAraba {
	
	private String renk;
	private int kapi;
	private String motorGucu;
	private String model;
	private int tekerlek;
	
	public void setModel(String modelYeni) {

		model=modelYeni;
	}
	public String getModel() {
		
		return this.model;
	}
	public String getRenk() {
		return renk;
	}
	public void setRenk(String renk) {
		this.renk = renk;
	}
	public int getKapi() {
		return kapi;
	}
	public void setKapi(int kapi) {
		if(kapi<0) {
			System.out.println("kapý numarasý 0'dan küçük olmaz..");
		}
		this.kapi = kapi;
	}
	public String getMotorGucu() {
		return motorGucu;
	}
	public void setMotorGucu(String motorGucu) {
		this.motorGucu = motorGucu;
	}
	public int getTekerlek() {
		return tekerlek;
	}
	public void setTekerlek(int tekerlek) {
		this.tekerlek = tekerlek;
	}

}
