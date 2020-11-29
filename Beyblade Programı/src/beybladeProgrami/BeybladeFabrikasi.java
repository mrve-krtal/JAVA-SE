package beybladeProgrami;

public class BeybladeFabrikasi {
	
	public Beyblade beybladeUret(String beyblade_turu){
		
		if (beyblade_turu.equals("Dragon")) {
			
			return new Dragon("Takao", 800, 30, "Mavi ejderha", "Kutsal canavarla konu�ma");
			
		}
		else if (beyblade_turu.equals("Dranza")) {
			return new Dranza("Kai", 600, 400, "K�rm�z� Anka ku�u");
		}
		else if (beyblade_turu.equals("Drayga")) {
			return new Drayga("Rei", 800, 250, "Beyaz kaplan");
			
		}
		else if (beyblade_turu.equals("Draciel")) {
			return new Draciel("max", 400, 1000, "kara kaplumba�a");
		}
		else {
			return null;
		}
	}
}
