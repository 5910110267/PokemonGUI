import java.util.*;

public class Bag {
	private ArrayList<Pokemon> pokemons ;
	Masterball masterball;
	Greatball greatball;
	Ultraball ultraball;
	public Bag(int Mnum,int Gnum,int Unum) {
		pokemons = new ArrayList<Pokemon>();
		masterball = new Masterball();
		greatball = new Greatball();
		ultraball = new Ultraball();
		masterball.addBall(Mnum);
		greatball.addBall(Gnum);
		ultraball.addBall(Unum);
//		(Masterball)(pokeballs.get(0).AddBall(M));
		
	}
	public boolean hasPokeball(String name) {
		if(name.equals("Greatball")) {
			if(greatball.GreatballNum==0) {
				return false;
			}else {
				return true;
			}

		}else if(name.equals("Ultraball")) {
			if(ultraball.UltraballNum==0) {
				return false;
			}else {
				return true;
			}
		}else if(name.equals("Masterball")){
			if(masterball.MasterballNum==0) {
				return false;
			}else {
				return true;
			}
		}else {
			System.out.println("Unknown error occur");
			return false;
		}
	}
	
	public void usePokeball(String name) {
		if(name.equals("Greatball")) {
			greatball.useBall(1);
		}else if(name.equals("Ultraball")) {
			ultraball.useBall(1);
		}else if(name.equals("Masterball")){
			masterball.useBall(1);;
		}else {
			System.out.println("Unknown error occur");
		}
	}
	
	public float getBallpricision(String name) {
		if(name.equals("Greatball")) {
			return greatball.getPrecision();
		}else if(name.equals("Ultraball")) {
			return ultraball.getPrecision();
		}else if(name.equals("Masterball")){
			return masterball.getPrecision();
		}else {
			System.out.println("Unknown error occur");
			return -1;
		}
	}

}
