
public class Ultraball extends Pokeball{
	public Ultraball() {
		super("Ultraball",1.0f);
		UltraballNum ++ ;
	}
	public void addBall(int n) {
		UltraballNum += n ;
		System.out.println("Now you have "+UltraballNum+" in your bag." );
	}
	public void useBall(int n) {
		UltraballNum -= n ;
		
	}
}
