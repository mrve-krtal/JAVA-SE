package constructor2;

public class Test {

	public static void main(String[] args) {
		
		Account account1 = new Account(); // Yapici metot da bir parametre yoksa ve çaðýrdýðýmýz nesne de paramtre
		//almýyorsa özelliklerimize varsayýlan deðerler ekleyebiliyoruz.
	       
        //System.out.println(account1.getEmail());
       Account account2 = new Account("Ahmet Can","example@gmail.com","87987897");
       
        /*System.out.println(account2.getEmail());
        System.out.println(account2.getBakiye());*/
       
       Account account3=account2; //if koþulu ile referanslarý kontrol edebiliriz. 
       
       if (account2==account3) {
    	   
    	   System.out.println("Referanslar ayný yeri göstermektedir.");
    	   
       }
        
        account2.bilgilerigoster();
        
        
	}

}
