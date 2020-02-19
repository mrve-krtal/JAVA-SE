package constructor1;

public class Test {

	public static void main(String[] args) {
		/*
		 
		Account account1=new Account();
		
		 * constructor'larýmýz tanýmlanmadan yaparsap böyle tek tek tanýmlama yapmamýz gerekecek.!!!!!
		
		account1.setHesapNo("123456");
		account1.setBakiye(1000.0);
		account1.setIsim("merve");
		account1.setEmail("kartalmerve95@gmail.com");
		account1.setTelefonNo("0555-555-5555");
		
		System.out.println("Bakiye: "+account1.getBakiye());
		
		account1.ParaYatýr(3600);

		 */
		
		//Constructor oluþturduðumuzda da ayný çýktýyý alabiliyoruz. Tek tek deðer atamasý yapmadan..
		
		Account account2 = new Account("123213",1000.0,"Mustafa Murat Coþkun","coskun.m.murat@gmail.com","324324");
        
		System.out.println("Bakiye: "+account2.getBakiye());
		
		account2.ParaYatýr(3600);

	}

}
