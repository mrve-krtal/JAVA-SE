package genericMetotlar2;

public class Test {

	public static void main(String[] args) {
	
		Sayisal sayisal1=new Sayisal(30, 40, 22, 10);
		Sayisal sayisal2=new Sayisal(30, 50, 30, 10);
		
		Sayisal birinci=birinci(sayisal1, sayisal2);
		System.out.println("Sayýsal alanýnda birinci öðrencinin puaný :"+birinci.puanHesapla());
		
		EsitAgirlik esit1=new EsitAgirlik(50, 10, 3, 30);
		EsitAgirlik esit2=new EsitAgirlik(40, 25, 3, 30);
		
		EsitAgirlik birinci1=birinci(esit1, esit2);
		System.out.println("Eþitaðýrlýk alanýnda birinci öðrencinin puaný: "+birinci1.puanHesapla());
	}
	
		public static <E extends Aday>  E birinci(E s1, E s2) {
		
			if (s1.puanHesapla()>s2.puanHesapla()) {
				
				return s1;
			}
			else {
				
				return s2;
			}
			
		}
	
	
	
	/*
	
	public static Sayisal birinci(Sayisal s1, Sayisal s2) {
		
		if (s1.puanHesapla()>s2.puanHesapla()) {
			
			return s1;
		}
		else {
			
			return s2;
		}
		
	}
	
	public static EsitAgirlik birinci(EsitAgirlik e1, EsitAgirlik e2) {
		
		if (e1.puanHesapla()>e2.puanHesapla()) {
			
			return e1;	
		}
		else {
			
			return e2;
			
		}
		
	}
	*/

}
