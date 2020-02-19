package bedenKitle;

import java.util.Scanner;

public class BedenKitleÝndeksi {

	public static void main(String[] args) {
		//kulanýcýdan aldýðýmýz boy ve kilo deðerlerine göre kullanýcýnýn beden kitle indeksini buluruz.
		
		//beden kitle indeksi : KÝLO /BOY(m)*BOY(m)
		
		Scanner proje=new Scanner(System.in);
		
		System.out.println("lütfen kilonuzu giriniz: ");
		int kilo=proje.nextInt();
		
		System.out.println("lütfen boyunuzu giriniz(örneðin:1,80): ");
		double boy=proje.nextDouble();
		
		double bedenKitleÝndeksi=kilo/boy*boy;
		System.out.println("beden kitle indeksiniz: "+bedenKitleÝndeksi);

	}

}
