package staticOlmayanClasslar;

import java.util.Scanner;

public class Matematik {
	
	private double PI=Math.PI;
	
	public class Faktoriyel{
		
		public void faktoriyel() {
			
			Scanner scanner=new Scanner(System.in);
			
			System.out.println("Faktöriyel için Bir sayý giriniz :");
			
			int sayi=scanner.nextInt();
			int fakt=1;
			
			for (int i = 2; i <= sayi; i++) {
				
				fakt*=i;
			}
			System.out.println("Faktöriyeli : "+fakt);
			
		}
		
	}
		public class Asal {
			
			public boolean asal_mi(int sayi) {
				
				int i=2;
				while (i<sayi) {
					if (sayi%i==0) {
						
						return false;
					}
					i++;
					
				}
				return true;
				
			}
		}
		
		public class Alan{
			public class Daire_alan{
				public void daire_alan(int yaricap) {
					 
					System.out.println("Dairenin alaný :"+(yaricap*yaricap*PI));
					//ýnner class'larýmýz private özelliðine eriþebilir.
				}
			}
		}
			

}
	
	

