package kodBlogu;

public class MantiksalOperatorler {

	public static void main(String[] args) {
		
		 /*
        Mant�ksal Operat�rler
        && --> and Operat�r�
        B�t�n sonu�lar kendi i�inde true ise genel sonu� true, en az birisi bile false ise genel sonu� false olur.
        
        || --> or Operat�r�
        Sonu�lardan en az birisi bile true ise genel sonu� true,hepsi false ise genel sonu� false olur.
      
        ! ---> not Operat�r�  DE��L� demek yani true ise false, false ise true olacak     
        */
       
        System.out.println(3 == 3);
        System.out.println(2 < 3);
        System.out.println("Murat" =="Murat");
        System.out.println("-------***---------\n");
        
        
        
        System.out.println(3 != 3 || 2 > 3 || "Murat" !="Murat");
        System.out.println("-------***---------\n");
        
        System.out.println(!(3 < 4));
        System.out.println("-------not ifadesi de�ilini ald� ---- \n");
        
        System.out.println(!((3 < 4 && "Murat" == "Murat") || 3.4 > 2.1));
        System.out.println("-------parantez �nceli�i---------\n");
	}

}
