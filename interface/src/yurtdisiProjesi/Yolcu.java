package yurtdisiProjesi;

import java.util.Scanner;

public class Yolcu implements YurtDisiKurallari{
	
	private int harc;
	private boolean siyasiYasak;
	private boolean vizeDurumu;
	
	public Yolcu() {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Yatýrdýðýnýz harç bedeli: ");
		this.harc=scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Herhangi bir siyasi yasaðýnýz bulunuyor mu? (evet yada hayýr) ");
		
		String cevap=scanner.nextLine();
		
		if (cevap.equals("evet")) {
			this.siyasiYasak=true;
		}
		else {
			this.siyasiYasak=false;
		}
		
		System.out.println("Vizeniz bulunuyor mu? (evet ya da hayýr");
		
		String cevap2=scanner.nextLine();
		
		if (cevap2.equals("evet")) {
			this.vizeDurumu=true;
		}
		else {
			this.vizeDurumu=false;
		}
		
		
	}
	
	@Override
	public boolean yurtdisiharcikontrol() {
		if (this.harc<15) {
			System.out.println("Lütfen çýkýþ harcýný tam yatýrýn..");
			return false;
		}
		else {
			System.out.println("Yurtdýþý harcý iþlemi tamam!");
			return true;
		}

	}
	@Override
	public boolean siyasiYasakKontrol() {
		if (this.siyasiYasak==true) {
			System.out.println("Siyasi yasaðýnýz bulunuyor. Yurtdýþýna çýkamazsýnýz..");
			return false;
		}
		else {
			System.out.println("Siyasi yasaðýnýz bulunmuyor...");
			return true;
		}
	}
	@Override
	public boolean vizeDurumuKontrol() {
		if (this.vizeDurumu==true) {
			System.out.println("Vize iþlemleri tamam!");
			return true;
		}
		else {
			System.out.println("vizeniz gideceðiniz ülkeye bulunmuyor.");
			return false;
		}
	}
	
	
	

}
