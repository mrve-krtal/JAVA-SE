package hipoten�s;

import java.util.Scanner;

public class Hipoten�sHesaplama {

	public static void main(String[] args) {

		Scanner hipo=new Scanner(System.in);
		
		int a;
		int b;
		
		System.out.println("birinci kenar uzunlu�u: ");
		a=hipo.nextInt();
		
		System.out.println("ikinci kenar uzunlu�u: ");
		b=hipo.nextInt();
		
		double h=Math.sqrt(a*a+b*b);
		
		System.out.println("��genimizin hipoten�s uzunlu�u: "+h);

		
	}

}
