package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapClass {
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> hashMap=new HashMap<Integer,String>();
		
		hashMap.put(10, "Java");
		hashMap.put(20, "C#");		
		hashMap.put(20, "C#");	
		hashMap.put(30, "Python");
		hashMap.put(50, "PHP");	
		hashMap.put(50, "GO");
		
		System.out.println(hashMap);
	/*
		//Key'e göre deðer arama iþlemi
		System.out.println(hashMap.get(10));
		System.out.println(hashMap.get(100)); 	//burada key deðeri olmadýðý için null dönecektir. Hataya sebebiyet vermeyecektir.
	*/
		
		for (Map.Entry<Integer, String> entry:  hashMap.entrySet()) {
			System.out.println("Anahtar : "+entry.getKey()+ "--> Deðer : "+entry.getValue());
		}
	}

}
