package stringSiniflari;

public class StringSiniflari {

	public static void main(String[] args) {
		
		String a="Merve";
		
		String b=new String("Mustafa");
		
		System.out.println(b);
		
		System.out.println("Harf say�s�: "+b.length());
		
		System.out.println("0. indeks "+b.charAt(0));
		System.out.println("2. indeks "+b.charAt(2));
		System.out.println("Son eleman: "+b.charAt(b.length()-1));
		
		System.out.println("******");
		
		//Her indeks'i alm�� oluyorum..
		for (int i = 0; i < a.length(); i++) {
			System.out.println(a.charAt(i));
			
		}
		
		//bu String "Me" ile ba�l�yor mu..
		System.out.println(a.startsWith("Me"));

		System.out.println(a.startsWith("Mee"));
		
		//Bu string "ce" ile bitiyor muu?
		System.out.println(a.endsWith("ce"));
		
		//Bir tane String'in i�erisinde bir tane harf aramak
		System.out.println(a.indexOf('e'));
		
		//Geriden ba�l�yor ve ilk g�rd��� indeks'i b�ze d�n�yor..
		System.out.println(a.lastIndexOf('e'));
		
		//String'in b�t�n karakterlerini b�y�k harf yapma..
		System.out.println(a.toUpperCase());
		
		//String'in b�t�n karakterlerini k���k harf yapma..
		System.out.println(a.toLowerCase());
		
		//String'den integer' e �evirme
		String a1="12345";
		int b1=Integer.parseInt(a1);
		System.out.println(b1);
		
		System.out.println(b1-42);// Integer ��kartmas� yapm�� oldum..
		
		//Integer'i string'e �evirme
		int b2=123;
		String a2=String.valueOf(b1);
		System.out.println(a2);
		
		System.out.println("---------");
		
		//String i�erikleri e�it ise E�ittir d�necektir.. Merve=Merve
		String m1="Merve";
		String m2="Merve";
		
		if (m1==m2) {
			System.out.println("E�itler..");
			
		}
		
		//bunlar referans e�itlemesi oldu�u i�in (yani farkl� yerleri g�sterdi�i i�in) e�it olmazlar..
		String n1=new String("Ne�e");
		String n2=new String("Ne�e");
		
		if (n1==n2) {
			System.out.println("E�itler");
			
		}
		else {
			System.out.println("Referans e�itlemeleri bellekte farkl� yeri g�sterdikleri i�in e�it de�ildir..");
		}
		
		if (n1.equals(n2)) {
			System.out.println("��erikleri e�ittir..");

		}
		else {
			System.out.println("��erikleri e�it de�ildir..");
		}


	}

}
