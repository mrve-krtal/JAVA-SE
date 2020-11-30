package anonimInnerClass;

public class Main {

	public static void main(String[] args) {

		IOgrenci ogrenci=new IOgrenci() {

			@Override
			public void ders_calis() {
				System.out.println("Ders �al���yorum..");
			}

			@Override
			public void derse_gir() {
				System.out.println("Derse giriyorum..");
			}
			
		};
		ogrenci.ders_calis();
		ogrenci.derse_gir(); 
		
		
		System.out.println("------------------**********--------------");
		
		AOgrenci ogrenci2=new AOgrenci("Merve", 14545534) {
			
			@Override
			void kayit_yaptir() {
				System.out.println(getIsim()+" isimli "+getNumara()+" numaral� ��renci kay�d� yap�l�yor..");
			}
		};
		ogrenci2.kayit_yaptir();
		ogrenci2.selamla();
		

	}
	public static abstract class AOgrenci{
		
		private String isim;
		private int numara;
		
		
		public AOgrenci(String isim, int numara) {
			super();
			this.isim = isim;
			this.numara = numara;
		}

		
		public String getIsim() {
			return isim;
		}


		public void setIsim(String isim) {
			this.isim = isim;
		}


		public int getNumara() {
			return numara;
		}


		public void setNumara(int numara) {
			this.numara = numara;
		}


		abstract void kayit_yaptir();
		
		public void selamla() {
			
			System.out.println("Selamlar..");
		}
		
	}
	public interface IOgrenci{
		
		void ders_calis();
		void derse_gir();
	}

}
