package idman;

public class Idman {
	
	private int sinavsayisi; 
	private int burpee_sayisi; 
	private int mekik_sayisi;
	private int squat_sayisi;
	
		public Idman(int sinavsayisi, int burpee_sayisi, int mekik_sayisi, int squat_sayisi) {
			super();
			this.sinavsayisi = sinavsayisi;
			this.burpee_sayisi = burpee_sayisi;
			this.mekik_sayisi = mekik_sayisi;
			this.squat_sayisi = squat_sayisi;
		}
		
		public int getSinavsayisi() {
			return sinavsayisi;
		}
	
		public void setSinavsayisi(int sinavsayisi) {
			this.sinavsayisi = sinavsayisi;
		}
	
		public int getBurpee_sayisi() {
			return burpee_sayisi;
		}
	
		public void setBurpee_sayisi(int burpee_sayisi) {
			this.burpee_sayisi = burpee_sayisi;
		}
	
		public int getMekik_sayisi() {
			return mekik_sayisi;
		}
	
		public void setMekik_sayisi(int mekik_sayisi) {
			this.mekik_sayisi = mekik_sayisi;
		}
	
		public int getSquat_sayisi() {
			return squat_sayisi;
		}
	
		public void setSquat_sayisi(int squat_sayisi) {
			this.squat_sayisi = squat_sayisi;
		}
	
		public void hareketYap(String hareketTuru, int sayi) {
			
			if (hareketTuru.equals("Burpee")) {
				
				burpeeYap(sayi);
			}
			else if (hareketTuru.equals("Mekik")) {
				
				mekikYap(sayi);
				
			}
			else if (hareketTuru.equals("þinav")) {
				
				sinavYap(sayi);
				
			}
			else if (hareketTuru.equals("Squat")) {
				
				squatYap(sayi);
				
			}
			else {
				System.out.println("Geçersiz Hareket..");
			}
		
		public void burpeeYap(int sayi) {
			
			if (burpee_sayisi==0) {
				System.out.println("yapacak burpee kalmadý..");
				
			}
			if(burpee_sayisi-sayi<0) {
				System.out.println("hedeflediðin burpee sayýsýný geçtin tebrik ederiz.");
				burpee_sayisi=0;
				System.out.println("Kalan burpee :"+burpee_sayisi);
			}
			else {
				burpee_sayisi-=sayi;
				System.out.println("kalan burpee sayýsý: "+burpee_sayisi);
			}
		}
		public void sinavYap(int sayi) {
				
				if (sinavsayisi==0) {
					System.out.println("yapacak þinav kalmadý..");
					
				}
				if(sinavsayisi-sayi<0) {
					System.out.println("hedeflediðin þinav sayýsýný geçtin tebrik ederiz.");
					sinavsayisi=0;
					System.out.println("Kalan þinav :"+sinavsayisi);
				}
				else {
					sinavsayisi-=sayi;
					System.out.println("kalan Þinav sayýsý: "+sinavsayisi);
				}
			}
		public void mekikYap(int sayi) {
			
			if (mekik_sayisi==0) {
				System.out.println("yapacak mekik kalmadý..");
				
			}
			if(burpee_sayisi-sayi<0) {
				System.out.println("hedeflediðin mekik sayýsýný geçtin tebrik ederiz.");
				mekik_sayisi=0;
				System.out.println("Kalan burpee :"+mekik_sayisi);
			}
			else {
				mekik_sayisi-=sayi;
				System.out.println("kalan mekik sayýsý: "+mekik_sayisi);
			}
		}
		public void squatYap(int sayi) {
			
			if (squat_sayisi==0) {
				System.out.println("yapacak squat kalmadý..");
				
			}
			if(squat_sayisi-sayi<0) {
				System.out.println("hedeflediðin squat sayýsýný geçtin tebrik ederiz.");
				burpee_sayisi=0;
				System.out.println("Kalan squat :"+squat_sayisi);
			}
			else {
				squat_sayisi-=sayi;
				System.out.println("kalan squat sayýsý: "+squat_sayisi);
			}
		}
		}
	
	private void sinavYap(int sayi) {
		// TODO Auto-generated method stub
		
	}

	private void squatYap(int sayi) {
		// TODO Auto-generated method stub
		
	}

	private void mekikYap(int sayi) {
		// TODO Auto-generated method stub
		
	}

	private void burpeeYap(int sayi) {
		// TODO Auto-generated method stub
		
	}

	
	
}
