package staticAnahtarKelimesi;

public class Main {

	public static void main(String[] args) {
		
		Seyirci seyirci1=new Seyirci("Merve Kartal");
		Seyirci seyirci2=new Seyirci("Kadir Kartal");
	
		seyirci1.oyun_seyret();
		
		System.out.println("Seyirci say�s�: "+Seyirci.seyirci_sayisi);
		System.out.println("Seyirci2 say�s� : "+seyirci2.seyirci_sayisi);
		System.out.println("Seyirci say�s� :"+Seyirci.getSeyirciSayisi());
	
		selamla();
		
		System.out.println("Pi say�s� : "+Math.PI);
		
	}
	
	 public static void selamla() {
		 
		 System.out.println("Selamlar..");
	 }

} 
