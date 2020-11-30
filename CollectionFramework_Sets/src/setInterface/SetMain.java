package setInterface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {

	public static void main(String[] args) {
		
/*			
 			Set Interface ----> HashSet,LinkedHashSet, TreeSet
	
		    Set Interface ile List Interface�in fark�
		    List interface�i implemente eden classlar bir elementten birden fazla depolayabilirken,  
		    Set interface�i implemente eden classlar bir elementten sadece bir tane depolarlar.
	
		    HashSet S�n�f�
	
		    HashSet extends AbstractSet implements Set Interface extends Collection extends Iterable
	
		    1.HashSet elementleri "hashing" yani hash table  mekanizmas�na uygun bir bi�imde depolarlar
		    (Her element belli bir key'e g�re depolan�r.)
	
		    2.HashSet bir element'i sadece bir defa depolar.(Set Interface)
	
		    3. Elementlerin ekleme s�ras�na g�re depolamaz.
	
		    LinkedHashSet S�n�f�
	
		    LinkedHashSet extends HashSet extends AbstractSet implements Set Interface extends Collection extends Iterable
	
		    1. LinkedHashSet hem HashTable hem de Set Interface'in LinkedList implementasyonu gibi davran�r.
	
		    2. HashSette oldu�u gibi bir elementi sadece bir defa depolar.(Set Interface)
	
		    3. Elementleri ekleme s�ras�na g�re depolar.
	
	
		    TreeSet S�n�f�
	
		    TreeSet s�n�f� NavigableSet inteface'ini implemente eder ve AbstractSet s�n�f�ndan miras al�r. 
		    NavigableSet interface'i de SortedSet interfaceinden miras al�r. 
	
		    1. Elementleri depolamak i�in Tree yani A�a� yap�s�n� kullan�r.
	
		    2. Elementleri alfabetik olarak s�ralarlar.
	
	
	
		    HashSet vs LinkedHashSet vs TreeSet
	
		    HashSet, Hash Table mekanizmas�n� uygulad��� i�in elementler s�ral� de�ildir. Ekleme,��karma ve
		    Arama metodlar� sabit zamanda( Time Complexity : O(1) ) �al���r. 
	
		    TreeSet, elementleri tree yap�s�na yani a�a� yap�s�na uygun depolar. Ekleme,��karma ve 
		    Arama metodlar� O(log(n)) complexitysi ile �al���r.
	
		    LinkedHashSet s�n�f� hashtable ile linked list yap�s�n� kullanarak elementleri depolar.Bu y�zden,
		    elemetler ekleme s�ras�na g�re depolan�r. Ekleme,��karma ve Arama metodlar� 
		    sabit zamanda( Time Complexity : O(1) ) �al���r. 

	*/		    
		    
	/*
	 		Set<String> set1 = new HashSet<String>();
	 
		    Set<String> set2 = new LinkedHashSet<String>();
		    Set<String> set3 = new TreeSet<String>();
		           // System.out.println(set1.isEmpty());
		
		    // HashSet
		    set1.add("Java");
		    set1.add("Python");
		    set1.add("C++");
		    set1.add("Javascript");
		    set1.add("Php");
		    
		    // LinkedHashSet
		    set2.add("Java");
		    set2.add("Python");
		    set2.add("C++");
		    set2.add("Javascript");
		    set2.add("Php");
		    
		    // TreeSet
		    set3.add("Java");
		    set3.add("Python");
		    set3.add("C++");
		    set3.add("Javascript");
		    set3.add("Php");

		    set3.add("Php");
*/
	/*	    
		    System.out.println("\nHashSet********");
		    for (String s: set1){
		        System.out.println(s);
		        
		    }
		    System.out.println("\nLinkedHashSet*******");
		    for (String s: set2){
		        System.out.println(s);
		        
		    }
		    System.out.println("\nTreeSet*********");
		    for (String s: set3){
		        System.out.println(s);
		    }   
	*/
	
/*	//Contains : Set1 i�erisinde o element var m�, yo mu bunun kontrolunu sa�lar.
		    System.out.println(set1.contains("Java"));
		    System.out.println(set1.contains("Go"));
		    
	//isEmpty : Set1 i�erisinde eleman var m� yok mu kontrol eder. var ise false, yoksa true d�ner.
		    System.out.println(set1.isEmpty());
		    
		    set1.remove("C#");
		    System.out.println("\nHashSet********");
		    for (String s: set1){
		        System.out.println(s);
		    }
*/		    
		
		 	Set<String> set1 = new HashSet<String>();
		    Set<String> set2 = new HashSet<String>();
		    
		    set1.add("Java");
		    set1.add("C++");
		    set1.add("Python");
		    set1.add("Javascript");
		    set1.add("Php");
		    
		    set2.add("Go");
		    set2.add("Java");
		    set2.add("CSS");
		
		//Fark�n� bulma
		    System.out.println("Fark k�mesi bulma");
		    Set<String> fark = new HashSet<String>(set2);
		    System.out.println(fark.removeAll(set1));
	        System.out.println(fark);
	        
	     //Kesi�im k�mesini bulma
	        System.out.println("\nKesi�im k�mesi");
	        Set<String> kesisim = new HashSet<String>(set2);
	        System.out.println(kesisim.retainAll(set1));
	        System.out.println(kesisim);
	}

}
