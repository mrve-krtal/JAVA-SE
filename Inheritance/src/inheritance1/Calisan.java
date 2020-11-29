package inheritance1;

public class Calisan { //superClass veya BaseClass
	
	private String isim;
	private int maas;
	private String departman;
	
	
	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getMaas() {
		return maas;
	}

	public void setMaas(int maas) {
		this.maas = maas;
	}

	public String getDepartman() {
		return departman;
	}

	public void setDepartman(String departman) {
		this.departman = departman;
	}

	public Calisan(String isim, int maas, String departman) {
		super();
		this.isim = isim;
		this.maas = maas;
		this.departman = departman;
	}
	
	public void calis() {
		
		System.out.println("�al��an �al���yor..");
	}
	
	public void bilgileriG�ster() {
		System.out.println("isim:"+isim);
		System.out.println("maaa�:"+maas);
		System.out.println("Departman:"+departman);
	}
	
	public void departman_degistir(String yeniDepartman) {
		System.out.println("Departman de�i�tiriliyor..");
		this.departman=yeniDepartman;
		
		System.out.println("yeni departman�n�z: "+yeniDepartman);
	}
	

}
