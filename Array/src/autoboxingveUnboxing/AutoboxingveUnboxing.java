package autoboxingveUnboxing;

import java.util.ArrayList;

public class AutoboxingveUnboxing {

	public static void main(String[] args) {
		 /*
		  
        Wrapper Class 
        
        boolean ------> Boolean
        char ---------> Character
        byte ---------> Byte
        short --------> Short
        int ----------> Integer
        long ---------> Long
        float --------> Float
        double -------> Double
        
        
        */
		
		ArrayList<String> arrayList=new ArrayList<String>();
		
		ArrayList<Integer> arrayList2=new ArrayList<Integer>();
		
		//autoboxing iþlemi
		for (int i = 0; i <10 ; i++) {
			arrayList2.add(Integer.valueOf(i*4)); //Autoboxing
			//arrayList2.add((i*4)); java kendisi autoboxing iþlemi yapýyor.
			
		}
		System.out.println(arrayList2);
		
		//unboxing iþelemi
		for (int i = 0; i <arrayList2.size(); i++) {
			
			System.out.println(arrayList2.get(i).intValue()); //Unboxing
			//System.out.println(arrayList2.get(i)); java kendisi unboxing iþlemi yapýyor.
		}
		
	}

}
