package constructor2;

public class Test {

	public static void main(String[] args) {
		
		Account account1 = new Account(); // Yapici metot da bir parametre yoksa ve çağırdığımız nesne de paramtre
		//almıyorsa özelliklerimize varsayılan değerler ekleyebiliyoruz.
	       
        //System.out.println(account1.getEmail());
       Account account2 = new Account("Ahmet Can","example@gmail.com","87987897");
       
        /*System.out.println(account2.getEmail());
        System.out.println(account2.getBakiye());*/
       
       Account account3=account2; //if koşulu ile referansları kontrol edebiliriz. 
       
       if (account2==account3) {
    	   
    	   System.out.println("Referanslar aynı yeri göstermektedir.");
    	   
       }
        
        account2.bilgilerigoster();
        
        
	}

}
