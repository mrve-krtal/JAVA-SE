package comparableInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Player implements Comparable<Player>{
	
	private String isim;
	private int id;
	
	public Player(String isim, int id) {
		this.id=id;
		this.isim=isim;
		
	}
	
	@Override
	public String toString() {
	       return "|||| ID: " + id + " Ýsim :" + isim + " |||";
	       
	    }

	@Override
	public int compareTo(Player player) {
//Þu an küçükten büyüðe doðru sýralamýþ olduk.  this.id > player.id  return -1;  dersek tam tersi olacak
        if (this.id < player.id) {
            
            return -1;
            
        }
        else if (this.id > player.id) {
            return 1;
            
        }
        return 0;

    }
    
}

public class Main {

	public static void main(String[] args) {
   /* List<String> list_string = new ArrayList<String>();
        
        
        list_string.add("Java");
        list_string.add("C++");
        list_string.add("Python");
        list_string.add("Php");
        list_string.add("Go");
         
        Collections.sort(list_string);
        
        for (String s : list_string) {
            System.out.println(s);
        }
      
	*/	
        List<Player> list_player = new ArrayList<Player>();
        
        list_player.add(new Player("Murat", 5));
        list_player.add(new Player("Emre", 1));
        list_player.add(new Player("Oðuz", 10));
        list_player.add(new Player("Yusuf", 4));
        
        Player p1 = new Player("Murat", 5);
        Player p3 = new Player("Oðuz", 10);
        
      // System.out.println(p3.compareTo(p1));
      
/* ID GÖRE SIRALAMAK ICIN  / Eðer biz kendi objelerimizi sýralamk istiyorsak  Comparable implements etmemiz gerekiyor..
   		Collections.sort(list_player);
        
        for (Player p : list_player) {
            
            System.out.println(p);
            
        }
        */
        
        Set<Player> treeset = new  TreeSet<Player>();
        
        treeset.add(new Player("Murat", 5));
        treeset.add(new Player("Emre", 1));
        treeset.add(new Player("Oðuz", 10));
        treeset.add(new Player("Yusuf", 4));
        
        for (Player p : treeset) {
            System.out.println(p);
            
        }
        
        
	}

}
