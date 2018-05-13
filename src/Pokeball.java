
public class Pokeball {
	protected float precision;
	private String type;
	private int num;
	protected static int MasterballNum =0 ;
	protected static int GreatballNum =0 ;
	protected static int UltraballNum =0 ;
	
	
	public Pokeball(String type,float precision) {
		this.precision = precision;
		this.type = type;
	}
	public float getPrecision() {
		return precision;
	}

}
