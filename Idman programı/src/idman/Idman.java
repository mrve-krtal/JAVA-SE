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
			else if (hareketTuru.equals("�inav")) {
				
				sinavYap(sayi);
				
			}
			else if (hareketTuru.equals("Squat")) {
				
				squatYap(sayi);
				
			}
			else {
				System.out.println("Ge�ersiz Hareket..");
			}
		
		public void burpeeYap(int sayi) {
			
			if (burpee_sayisi==0) {
				System.out.println("yapacak burpee kalmad�..");
				
			}
			if(burpee_sayisi-sayi<0) {
				System.out.println("hedefledi�in burpee say�s�n� ge�tin tebrik ederiz.");
				burpee_sayisi=0;
				System.out.println("Kalan burpee :"+burpee_sayisi);
			}
			else {
				burpee_sayisi-=sayi;
				System.out.println("kalan burpee say�s�: "+burpee_sayisi);
			}
		}
		public void sinavYap(int sayi) {
				
				if (sinavsayisi==0) {
					System.out.println("yapacak �inav kalmad�..");
					
				}
				if(sinavsayisi-sayi<0) {
					System.out.println("hedefledi�in �inav say�s�n� ge�tin tebrik ederiz.");
					sinavsayisi=0;
					System.out.println("Kalan �inav :"+sinavsayisi);
				}
				else {
					sinavsayisi-=sayi;
					System.out.println("kalan �inav say�s�: "+sinavsayisi);
				}
			}
		public void mekikYap(int sayi) {
			
			if (mekik_sayisi==0) {
				System.out.println("yapacak mekik kalmad�..");
				
			}
			if(burpee_sayisi-sayi<0) {
				System.out.println("hedefledi�in mekik say�s�n� ge�tin tebrik ederiz.");
				mekik_sayisi=0;
				System.out.println("Kalan burpee :"+mekik_sayisi);
			}
			else {
				mekik_sayisi-=sayi;
				System.out.println("kalan mekik say�s�: "+mekik_sayisi);
			}
		}
		public void squatYap(int sayi) {
			
			if (squat_sayisi==0) {
				System.out.println("yapacak squat kalmad�..");
				
			}
			if(squat_sayisi-sayi<0) {
				System.out.println("hedefledi�in squat say�s�n� ge�tin tebrik ederiz.");
				burpee_sayisi=0;
				System.out.println("Kalan squat :"+squat_sayisi);
			}
			else {
				squat_sayisi-=sayi;
				System.out.println("kalan squat say�s�: "+squat_sayisi);
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
