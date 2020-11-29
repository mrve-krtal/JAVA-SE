package foreach;

public class Foreach {

	public static void main(String[] args) {
		
		String[] array= {"Elma","Armut","Kiraz"};
		
		/*
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			
		}
		*/
		
		for (String a : array) {
			System.out.println(a);
			
		}
		System.out.println("--------");
		
		
		
		int[] array2= {1,2,3,4,5};
		
		for (int i : array2) {
			System.out.println(i);
			
		}
		
		
		
		Deneme[] array3= {new Deneme("Mustafa"),new Deneme("Murat"), new Deneme("Merve")};

		for (Deneme d: array3) {
			d.yaz();
			
		}

	} 

}
