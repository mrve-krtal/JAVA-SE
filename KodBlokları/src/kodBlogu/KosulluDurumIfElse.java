package kodBlogu;

import java.util.Scanner;

public class KosulluDurumIfElse {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Lütfen notunuzu giriniz:");
	        int not = scanner.nextInt();
	        
	        if (not >= 90) {
	            System.out.println("AA");
	            
	        }
	        if (not >=  85) {
	            System.out.println("BA");

	        }
	        if (not >=  80) {
	            System.out.println("BB");

	        }
	        if (not >=  75) {
	            System.out.println("CB");

	        }
	        if (not >=  70) {
	            System.out.println("CC");

	        }
	        if (not >=  65) {
	            System.out.println("DC");

	        }
	        if (not >=  60) {
	            System.out.println("DD");

	        }
	        
	        else {
	            System.out.println("Dersten Kaldýnýz...");

	            
	        }
	        

	}

}
