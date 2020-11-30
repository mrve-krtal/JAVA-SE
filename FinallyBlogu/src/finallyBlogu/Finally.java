package finallyBlogu;


public class Finally {

	public static void main(String[] args) {
		
		try {
			String s=null;
			System.out.println(s.hashCode());
			
		} 
		catch (NullPointerException e) {
			System.out.println("Null referans hatasý");
		}
		
		finally {
			System.out.println("Finally blogu her seferinde çalýþacaktýr.");
		}
		/*        
		 try {
            
            int a = 30 / 0;
            
            
            
            
        }
        catch (ArithmeticException e) {
            System.out.println("Bir sayý 0'a bölünemez..");
        }
        catch (NullPointerException e) {
            System.out.println("Null Referans Hatasý.... ");
        }
        finally {
            
            System.out.println("Finally bloðu çalýþýyor....");
        }
        System.out.println("Burasý Çalýþýyor....");
        
        */
		
		
	}

}
