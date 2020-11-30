package kodBlogu;

import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {

		Scanner hesap=new Scanner(System.in);
		
		String islem="1.Toplama \n"+
					 "2.Çýkartma \n"
					 +"3.Çarpma \n"
					 +"4. Bölme \n";
		
		System.out.println(islem);
		
		System.out.println("----*****------");
		
		System.out.println("Bir iþlem seçiniz:");
		
		islem=hesap.nextLine();
		
		int a;
		int b;
		
		switch (islem) {
		case "1":
			System.out.print("1. sayýyý giriniz: ");
			 a=hesap.nextInt();
			
			System.out.print("2. sayýyý giriniz: ");
			 b=hesap.nextInt();
			
			int toplam=a+b;
			
			System.out.println(a+"+"+b+"="+toplam);
			break;
			
		case "2":
			System.out.print("1. sayýyý giriniz: ");
			 a=hesap.nextInt();
			
			System.out.print("2. sayýyý giriniz: ");
			b=hesap.nextInt();
			
			int cýkarma=a-b;
			
			System.out.println(a+"-"+b+"="+cýkarma);
			break;
			
		case "3":
			System.out.print("1. sayýyý giriniz: ");
			 a=hesap.nextInt();
			
			System.out.print("2. sayýyý giriniz: ");
			b=hesap.nextInt();
			
			int carpma=a*b;
			
			System.out.println(a+"*"+b+"="+carpma);
			break;
			
		case "4":
			System.out.print("1. sayýyý giriniz: ");
			 a=hesap.nextInt();
			
			System.out.print("2. sayýyý giriniz: ");
			b=hesap.nextInt();
			
			double bolme=a/b;
			
			System.out.println(a+"/"+b+"="+bolme);
			break;
			
			default:
			System.out.println("Geçersiniz bir iþlem seçtiniz!!");
			break;

		}
		
	}

}
