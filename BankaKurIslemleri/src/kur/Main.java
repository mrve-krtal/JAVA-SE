package kur;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		KurHesabi Tl_hes=new TL(200);
		Tl_hes.paraYatirma(200);
		Tl_hes.paraCekme(50);
		Tl_hes.kurCevirme();
		
		KurHesabi dol_hes=new Dolar(200);
		dol_hes.paraYatirma(50);
		dol_hes.paraCekme(100);
		dol_hes.kurCevirme();
	}

}
