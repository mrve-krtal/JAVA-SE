package finallyBlogu;


public class Finally {

	public static void main(String[] args) {
		
		try {
			String s=null;
			System.out.println(s.hashCode());
			
		} 
		catch (NullPointerException e) {
			System.out.println("Null referans hatas�");
		}
		
		finally {
			System.out.println("Finally blogu her seferinde �al��acakt�r.");
		}
		/*        
		 try {
            
            int a = 30 / 0;
            
            
            
            
        }
        catch (ArithmeticException e) {
            System.out.println("Bir say� 0'a b�l�nemez..");
        }
        catch (NullPointerException e) {
            System.out.println("Null Referans Hatas�.... ");
        }
        finally {
            
            System.out.println("Finally blo�u �al���yor....");
        }
        System.out.println("Buras� �al���yor....");
        
        */
		
		
	}

}
