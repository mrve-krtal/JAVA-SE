package hipotenüs;

import java.util.Scanner;

public class HipotenüsHesaplama {

	public static void main(String[] args) {

		Scanner hipo=new Scanner(System.in);
		
		int a;
		int b;
		
		System.out.println("birinci kenar uzunluðu: ");
		a=hipo.nextInt();
		
		System.out.println("ikinci kenar uzunluðu: ");
		b=hipo.nextInt();
		
		double h=Math.sqrt(a*a+b*b);
		
		System.out.println("üçgenimizin hipotenüs uzunluðu: "+h);

		
	}

}
