package constructor2;

public class Test {

	public static void main(String[] args) {
		
		Account account1 = new Account(); // Yapici metot da bir parametre yoksa ve �a��rd���m�z nesne de paramtre
		//alm�yorsa �zelliklerimize varsay�lan de�erler ekleyebiliyoruz.
	       
        //System.out.println(account1.getEmail());
       Account account2 = new Account("Ahmet Can","example@gmail.com","87987897");
       
        /*System.out.println(account2.getEmail());
        System.out.println(account2.getBakiye());*/
       
       Account account3=account2; //if ko�ulu ile referanslar� kontrol edebiliriz. 
       
       if (account2==account3) {
    	   
    	   System.out.println("Referanslar ayn� yeri g�stermektedir.");
    	   
       }
        
        account2.bilgilerigoster();
        
        
	}

}
