package operat�rler;

public class TemelOperatorler {

	public static void main(String[] args) {
		
		//MATEMAT�K OPERAT�RLER�
		System.out.println(3+4.2-5);
		System.out.println(3-5f); //float de�er al�r.
		
		System.out.println(10/4);
		System.out.println(10f/4d); // Tam sonu� almak i�in
		
		System.out.println(10d%3f);
		System.out.println("------****-------");
		
		//ATAMA OPERAT�RLER�
		int a=4;
		a+=2; //a=a+2
		System.out.println("a'n�n yeni de�eri: "+a);
		
		a*=3; 
		System.out.println("a'n�n 2. yeni de�eri : "+a);
		System.out.println("------****-------");
		
		int b=8;
		
		System.out.println("postfix g�sterimi: ");
		System.out.println(b++);
		System.out.println(++b);
		System.out.println("------****-------");
		
		int c=8; 
		System.out.println("prefix g�sterimi : ");
		System.out.println(++c);
		System.out.println("------****-------");
		
		
		
	}

}
