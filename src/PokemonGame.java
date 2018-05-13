class PokemonGame{
	public static void main(String[] args){
		PokemonFarm pokemonFarm = new PokemonFarm();
		Frame P = new Frame() ;
		CommandParser commandParser = new CommandParser(pokemonFarm);
		

		commandParser.run();
	}

}
