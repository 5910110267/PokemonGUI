
public class Masterball extends Pokeball{
	public Masterball() {
		super("Masterball",0.8f);
		MasterballNum ++ ;
	}
	public void addBall(int n) {
		MasterballNum += n ;
		System.out.println("Now you have "+MasterballNum+" in your bag." );
	}
	public void useBall(int n) {
		MasterballNum -= n ;
	}
	

}
