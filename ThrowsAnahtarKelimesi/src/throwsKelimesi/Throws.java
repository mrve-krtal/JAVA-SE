package throwsKelimesi;

import java.io.IOException;
import java.util.Scanner;

public class Throws {

		public static void mekan_kontrol(int yas) throws IOException {
	        
	        if (yas < 18) {
	            throw new IOException();
	            
	        }
	        else {
	            System.out.println("Mekana hoþgeldiniz...");
	        }
	        
	    }
	    public static void main(String[] args)  {
	        
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Lütfen yaþýnýzý giriniz: ");
	        int yas = scanner.nextInt();
	        
	        try {
				mekan_kontrol(yas);
			} 
	        catch (IOException e) {
				System.out.println("IOException oluþtu..");
			}
	       
	        
	    }

}
