package operatörler;

public class TemelOperatorler {

	public static void main(String[] args) {
		
		//MATEMATÝK OPERATÖRLERÝ
		System.out.println(3+4.2-5);
		System.out.println(3-5f); //float deðer alýr.
		
		System.out.println(10/4);
		System.out.println(10f/4d); // Tam sonuç almak için
		
		System.out.println(10d%3f);
		System.out.println("------****-------");
		
		//ATAMA OPERATÖRLERÝ
		int a=4;
		a+=2; //a=a+2
		System.out.println("a'nýn yeni deðeri: "+a);
		
		a*=3; 
		System.out.println("a'nýn 2. yeni deðeri : "+a);
		System.out.println("------****-------");
		
		int b=8;
		
		System.out.println("postfix gösterimi: ");
		System.out.println(b++);
		System.out.println(++b);
		System.out.println("------****-------");
		
		int c=8; 
		System.out.println("prefix gösterimi : ");
		System.out.println(++c);
		System.out.println("------****-------");
		
		
		
	}

}
