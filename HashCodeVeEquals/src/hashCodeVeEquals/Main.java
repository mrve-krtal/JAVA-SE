package hashCodeVeEquals;

import java.util.HashSet;
import java.util.Set;

class Player {
	
	private int id;
	private String isim;
	
	public Player(int id, String isim) {
		super();
		this.id = id;
		this.isim = isim;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", isim=" + isim + "]";
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((isim == null) ? 0 : isim.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (id != other.id)
			return false;
		if (isim == null) {
			if (other.isim != null)
				return false;
		} else if (!isim.equals(other.isim))
			return false;
		return true;
	}
	
	
}
public class Main {

	public static void main(String[] args) {
		
		Set<Player> hashSet=new HashSet<Player>();
		
		Player player1=new Player(44, "Merve");
		Player player2=new Player(44, "Merve");
		Player player3=new Player(31, "Merve");
		Player player4=new Player(44, "Hüseyin");
		Player player5=new Player(31, "Hüseyin");
		
		hashSet.add(player1);
		hashSet.add(player2);
		hashSet.add(player3);
		hashSet.add(player4);
		hashSet.add(player5);
		
		for (Player p : hashSet) {
			
			System.out.println(p);
			
		}

	}

}
