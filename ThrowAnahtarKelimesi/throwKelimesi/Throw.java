package throwKelimesi;

import java.util.Scanner;

public class Throw {
	
		    public static void mekan_kontrol(int yas) {
		        
		        if (yas < 18) {
		            throw new ArithmeticException();
		            
		        }
		        else {
		            System.out.println("Mekana ho�geldiniz...");
		        }
	        
	    }
	    public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("L�tfen ya��n�z� giriniz: ");
	        int yas = scanner.nextInt();
	        
	        try {
	            mekan_kontrol(yas);
	        
	        }
	        catch (ArithmeticException e) {
	            
	            System.out.println("18 ya��ndan k���kler mekana giremez...");
	        }
	        
	    }
	
}
