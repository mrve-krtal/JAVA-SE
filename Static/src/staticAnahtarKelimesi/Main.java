package staticAnahtarKelimesi;

public class Main {

	public static void main(String[] args) {
		
		Seyirci seyirci1=new Seyirci("Merve Kartal");
		Seyirci seyirci2=new Seyirci("Kadir Kartal");
	
		seyirci1.oyun_seyret();
		
		System.out.println("Seyirci sayýsý: "+Seyirci.seyirci_sayisi);
		System.out.println("Seyirci2 sayýsý : "+seyirci2.seyirci_sayisi);
		System.out.println("Seyirci sayýsý :"+Seyirci.getSeyirciSayisi());
	
		selamla();
		
		System.out.println("Pi sayýsý : "+Math.PI);
		
	}
	
	 public static void selamla() {
		 
		 System.out.println("Selamlar..");
	 }

} 
