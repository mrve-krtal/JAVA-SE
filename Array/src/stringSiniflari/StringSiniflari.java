package stringSiniflari;

public class StringSiniflari {

	public static void main(String[] args) {
		
		String a="Merve";
		
		String b=new String("Mustafa");
		
		System.out.println(b);
		
		System.out.println("Harf sayýsý: "+b.length());
		
		System.out.println("0. indeks "+b.charAt(0));
		System.out.println("2. indeks "+b.charAt(2));
		System.out.println("Son eleman: "+b.charAt(b.length()-1));
		
		System.out.println("******");
		
		//Her indeks'i almýþ oluyorum..
		for (int i = 0; i < a.length(); i++) {
			System.out.println(a.charAt(i));
			
		}
		
		//bu String "Me" ile baþlýyor mu..
		System.out.println(a.startsWith("Me"));

		System.out.println(a.startsWith("Mee"));
		
		//Bu string "ce" ile bitiyor muu?
		System.out.println(a.endsWith("ce"));
		
		//Bir tane String'in içerisinde bir tane harf aramak
		System.out.println(a.indexOf('e'));
		
		//Geriden baþlýyor ve ilk gördüðü indeks'i bþze dönüyor..
		System.out.println(a.lastIndexOf('e'));
		
		//String'in bütün karakterlerini büyük harf yapma..
		System.out.println(a.toUpperCase());
		
		//String'in bütün karakterlerini küçük harf yapma..
		System.out.println(a.toLowerCase());
		
		//String'den integer' e çevirme
		String a1="12345";
		int b1=Integer.parseInt(a1);
		System.out.println(b1);
		
		System.out.println(b1-42);// Integer çýkartmasý yapmýþ oldum..
		
		//Integer'i string'e çevirme
		int b2=123;
		String a2=String.valueOf(b1);
		System.out.println(a2);
		
		System.out.println("---------");
		
		//String içerikleri eþit ise Eþittir dönecektir.. Merve=Merve
		String m1="Merve";
		String m2="Merve";
		
		if (m1==m2) {
			System.out.println("Eþitler..");
			
		}
		
		//bunlar referans eþitlemesi olduðu için (yani farklý yerleri gösterdiði için) eþit olmazlar..
		String n1=new String("Neþe");
		String n2=new String("Neþe");
		
		if (n1==n2) {
			System.out.println("Eþitler");
			
		}
		else {
			System.out.println("Referans eþitlemeleri bellekte farklý yeri gösterdikleri için eþit deðildir..");
		}
		
		if (n1.equals(n2)) {
			System.out.println("Ýçerikleri eþittir..");

		}
		else {
			System.out.println("Ýçerikleri eþit deðildir..");
		}


	}

}
