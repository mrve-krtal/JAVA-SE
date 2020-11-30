package tryCatch;

public class TryCatch {

	public static void main(String[] args) {
		 /*
	        try {
	            // Exception Oluþturabilecek Kodlar
	        }
	        
	        catch(Exception_Türü e) {
	            // Exception Durumunda Yapýlacak Ýþlemler
	        }
        */
        
       // int a = 30 / 0; // Unchecked Exception
       // int[] a = {1,2,3,4,5};
        
        // System.out.println(a[6]);
        
        //System.out.println("Burasý çalýþýyor...");
	/*	
		try {
			
			int a=30/0; //AritmeticException
			
		} 
		catch (Exception e) {
			System.out.println("Bu sayý 0'a bölünmez..");
			
		}
     */
	
		/*
		try {
			int[] a = {1,2,3,4,5};
            System.out.println(a[6]);
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Dizinin boyutunu aþýyorsunuz..");
		}
	*/
		
		try {
            int[] a = {1,2,3,4,5};
            System.out.println(a[6]);
            int b = 30 / 12;

        }
        
        catch (ArithmeticException e) {
            System.out.println("Bir sayý 0'a bölünemez...");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            
            System.out.println("Arrayin boyunu aþtýnýz...");
        }
        catch (Exception e) {										//Exception; ArithmeticException ve ArrayIndexOutOfBoundsException 'ý türettiði için en üstte yazýlýrsa hata verecektir. O yüzden en sonda tutulmalý..
            System.out.println("Bir hata oluþtu...");
            e.printStackTrace();
            
        }
        
        
        System.out.println("Burasý Çalýþýyor....");
    }
    

    
}
