package inheritance2;

public class Kopek extends Hayvan{
	
	private int dis_sayisi;

	public Kopek(String isim, int kilo, int boy, int bacak_sayisi, int dis_sayisi) {
		super(isim, kilo, boy, bacak_sayisi);
		this.dis_sayisi = dis_sayisi;
	}

	public int getDis_sayisi() {
		return dis_sayisi;
	}

	public void setDis_sayisi(int dis_sayisi) {
		this.dis_sayisi = dis_sayisi;
	}
	
	public void hareketeGec(int hiz) {
		
		System.out.println("k�pek "+hiz+" ile hareket ediyor.");
	}
	public void kos(int hiz) {
		System.out.println("k�pek ko�uyor.");
		
		//super.hareketeGec(hiz);
		//k�pek s�n�f�nda hareketeGec metodu tan�mlamak daha mant�kl�  
		//bu y�zden super.hareketeGec(hiz) yazm�yorum. �st s�n�ftaki metodu �al��t�rm�yorum.
		
		hareketeGec(hiz);
	}
	

}
