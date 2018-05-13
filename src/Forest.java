import java.util.*;

public class Forest {
	private ArrayList<Pokemon> pokemons;
	private int ran;
	private Scanner commandScanner;
	private String PokFound;
	private Bag bag;
	public Forest(int M,int G,int U) {
		pokemons = new ArrayList<Pokemon>();
		commandScanner = new Scanner(System.in);
		Lapras L;
		Charizard C;
		Oddish O;
		bag = new Bag(M,G,U);
		
//		pokemons.add(arg0);
	}
	public void hunt() {
		ran = (int) (Math.random()*10);
		switch(ran) {
		case 0:
			PokFound = "Charizard";
			Found("Charizard");
			break;
		case 1:
			PokFound = "Charizard";
			Found("Charizard");
			break;
		case 2:
			PokFound = "Lapras";
			Found("Lapras");
			break;
		case 3:
			PokFound = "Oddish";
			Found("Oddish");
			break;
		case 4:
			PokFound = "Oddish";
			Found("Oddish");
			break;
		case 5:
			PokFound = "Oddish";
			Found("Oddish");
			break;
		case 6:
			PokFound = "Rhyhorn";
			Found("Rhyhorn");
			break;
		case 7:
			PokFound = "Rhyhorn";
			Found("Rhyhorn");
			break;
		case 8:
			PokFound = "Rhyhorn";
			Found("Rhyhorn");
			break;
		case 9:
			PokFound = "Charmeleon";
			Found("Charmeleon");
			break;
		}
	}
	private void Found(String poke) {
		System.out.println("You've found " + poke + ".");
		System.out.println("Catch Enter C");
		System.out.println("Run Enter R");
		String command = commandScanner.nextLine();
		String subCommand;
		if(command.equals("C")) {
			boolean canCatch = false;
			float chance = (float)(Math.random());
			System.out.println("Which pokeball do you want to use");
			command = commandScanner.nextLine();
			while(!command.equals("cancel")) {
				if(command.equals("Greatball")) {
					if(bag.hasPokeball("Greatball")) {
						bag.usePokeball("Greatball");
						canCatch = Catch(poke,"Greatball");
						break;
					}else {
						System.out.println("You don't have enough Greatball.");
					}
				}else if(command.equals("Masterball")) {
					if(bag.hasPokeball("Masterball")) {
						bag.usePokeball("Masterball");
						canCatch = Catch(poke,"Masterball");
						break;
					}else {
						System.out.println("You don't have enough Masterball.");
					}
				}else if(command.equals("Ultraball")) {
					if(bag.hasPokeball("Ultraball")) {
						bag.usePokeball("Ultraball");
						canCatch = Catch(poke,"Ultraball");
						break;
					}else {
						System.out.println("You don't have enough pokeball.");
					}
				}else {
					System.out.println("Wrong command please enter only pokeball's name");
				}
				if(canCatch == true) {
					break;
				}
				command = commandScanner.nextLine();
			}
			
			
			
		}else if(command.equals("R")) {
			
		}else {
			System.out.println("Wrong command enter R or C");
		}
	}
	private boolean Catch(String poke,String ball) {
		float chance = (float)(Math.random());
		
			if((chance*bag.getBallpricision(poke))>0.5) {
				return true;
			}else {
				return false;
			}
		
	}

}
