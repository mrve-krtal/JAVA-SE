package composition1;

public class Test {

	public static void main(String[] args) {
		//özelden genele doðru gidelim..
		
		Resolution resolution=new Resolution(1920, 1080);
		Monitor monitor=new Monitor("VS197DE", "ASUS", "17.5", resolution);
		Kasa kasa=new Kasa("SHADOW BLADE", "SHADOW", "Temperli Cam");
		Anakart anakart=new Anakart("B250-PRO", "ASUS", "WINDOWS 10", 10);
		
		Bilgisayar pc=new Bilgisayar(monitor, kasa, anakart);
		
		pc.getKasa().bilgisayariAc();
		pc.getMonitor().monitoruKapat();
		pc.getAnakart().isletim_sistemi_yukle("ubuntu 16.04");
	}

}
