package bedenKitle;

import java.util.Scanner;

public class BedenKitle�ndeksi {

	public static void main(String[] args) {
		//kulan�c�dan ald���m�z boy ve kilo de�erlerine g�re kullan�c�n�n beden kitle indeksini buluruz.
		
		//beden kitle indeksi : K�LO /BOY(m)*BOY(m)
		
		Scanner proje=new Scanner(System.in);
		
		System.out.println("l�tfen kilonuzu giriniz: ");
		int kilo=proje.nextInt();
		
		System.out.println("l�tfen boyunuzu giriniz(�rne�in:1,80): ");
		double boy=proje.nextDouble();
		
		double bedenKitle�ndeksi=kilo/boy*boy;
		System.out.println("beden kitle indeksiniz: "+bedenKitle�ndeksi);

	}

}
