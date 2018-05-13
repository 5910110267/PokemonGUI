
public class Greatball extends Pokeball {
	public Greatball () {
		super("Greatball",0.8f);
		GreatballNum ++ ;
	}
	public void addBall(int n) {
		GreatballNum += n ;
		System.out.println("Now you have "+GreatballNum+" in your bag." );
	}
	public void useBall(int n) {
		GreatballNum -= n ;
		
	}
}
