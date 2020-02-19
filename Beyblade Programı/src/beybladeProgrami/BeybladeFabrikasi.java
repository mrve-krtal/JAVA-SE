package beybladeProgrami;

public class BeybladeFabrikasi {
	
	public Beyblade beybladeUret(String beyblade_turu){
		
		if (beyblade_turu.equals("Dragon")) {
			
			return new Dragon("Takao", 800, 30, "Mavi ejderha", "Kutsal canavarla konuþma");
			
		}
		else if (beyblade_turu.equals("Dranza")) {
			return new Dranza("Kai", 600, 400, "Kýrmýzý Anka kuþu");
		}
		else if (beyblade_turu.equals("Drayga")) {
			return new Drayga("Rei", 800, 250, "Beyaz kaplan");
			
		}
		else if (beyblade_turu.equals("Draciel")) {
			return new Draciel("max", 400, 1000, "kara kaplumbaða");
		}
		else {
			return null;
		}
	}
}
