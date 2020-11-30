package tryCatch;

public class TryCatch {

	public static void main(String[] args) {
		 /*
	        try {
	            // Exception Olu�turabilecek Kodlar
	        }
	        
	        catch(Exception_T�r� e) {
	            // Exception Durumunda Yap�lacak ��lemler
	        }
        */
        
       // int a = 30 / 0; // Unchecked Exception
       // int[] a = {1,2,3,4,5};
        
        // System.out.println(a[6]);
        
        //System.out.println("Buras� �al���yor...");
	/*	
		try {
			
			int a=30/0; //AritmeticException
			
		} 
		catch (Exception e) {
			System.out.println("Bu say� 0'a b�l�nmez..");
			
		}
     */
	
		/*
		try {
			int[] a = {1,2,3,4,5};
            System.out.println(a[6]);
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Dizinin boyutunu a��yorsunuz..");
		}
	*/
		
		try {
            int[] a = {1,2,3,4,5};
            System.out.println(a[6]);
            int b = 30 / 12;

        }
        
        catch (ArithmeticException e) {
            System.out.println("Bir say� 0'a b�l�nemez...");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            
            System.out.println("Arrayin boyunu a�t�n�z...");
        }
        catch (Exception e) {										//Exception; ArithmeticException ve ArrayIndexOutOfBoundsException '� t�retti�i i�in en �stte yaz�l�rsa hata verecektir. O y�zden en sonda tutulmal�..
            System.out.println("Bir hata olu�tu...");
            e.printStackTrace();
            
        }
        
        
        System.out.println("Buras� �al���yor....");
    }
    

    
}
