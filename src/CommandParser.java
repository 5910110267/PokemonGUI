import java.util.*;
import java.io.*;

class CommandParser{
	private PokemonFarm pokemonFarm;
	private Scanner commandScanner;
	private boolean isRunning;

	public CommandParser(PokemonFarm pokemonFarm){
		this.pokemonFarm = pokemonFarm;
		commandScanner = new Scanner(System.in);
		isRunning = false;
	}

	public void run(){
		isRunning = true;
		String command;

		System.out.println("Hello Pokemon Game");
		while(isRunning){
			System.out.print("\nEnter your command Type: ");
			command = commandScanner.next();
			if(command.equals("quit")){
				isRunning = false;
				System.out.println("Good bye, See you next time.");
			}
			else if(command.equals("add")) {
				System.out.print("Enter your new pokamon's name : ");
				String name = commandScanner.next();
				System.out.print("Enter your pokamon's species : ");
				String species = commandScanner.next();
				commandScanner.nextLine();
				System.out.println("\nYour pokemon's name is "+name+" and his species is "+species);
				this.addPokemon(name,species);
				
				
			}else if(command.equals("list")) {
				this.listPokemons();
			}else if(command.equals("feed")) {
				this.feedPokemons();
			}else if(command.equals("select")){
				System.out.print("Enter your list order : ");
				String subCommand = commandScanner.nextLine();
				int i = Integer.parseInt(subCommand);
				if(i<pokemonFarm.getsize()) {
					System.out.print(pokemonFarm.getName(i)+" are selected,Entered your command: ");
					subCommand = commandScanner.nextLine();
					while(!subCommand.equals("exit")) {
						if(subCommand.equals("feed")) {
							
						}else if(subCommand.equals("feed")) {
							
						}else if(subCommand.equals("walk")) {
							pokemonFarm.walk(i);
						}else {
							System.out.println("You've entered wrong command ,try again.");
						}
						subCommand = commandScanner.nextLine();
					}
				}else {
					System.out.println("The list order you've entered didn't exist ,try again.");
				}
			}else if(command.equals("hunt")){
				
				
				
				
				
			}else {
				System.out.println("You've entered wrong command ,try again.");
			}
		}

	}

	private void addPokemon(String name,String species){

		if(species.equals("Lapras")){
			Lapras lapras = new Lapras(name, 10f, 5f);
			pokemonFarm.addPokemon(lapras);
		}else if(species.equals("Lizardon")) {
			Charmander charmander = new Charmander(name, 8f, 6f);
			pokemonFarm.addPokemon(charmander);
		}
	}

	private void listPokemons(){
		System.out.println("==========================================");
		System.out.println("Pokemon List ");
		System.out.println("==========================================");
		this.pokemonFarm.list();
		System.out.println("==========================================");
	}

	private void feedPokemons(){
		System.out.print("Which pokemon do you want to feed? ");
		String name = this.commandScanner.next();
		System.out.print("What do you want to feed your pokemon? ");
		String item = this.commandScanner.next();
		this.pokemonFarm.feed(name,item);

	}

}

