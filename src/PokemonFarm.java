import java.util.*;

class PokemonFarm {
	private ArrayList<Pokemon> pokemons;
	public PokemonFarm(){
		pokemons = new ArrayList<Pokemon>();
	}
	
	public void addPokemon(Pokemon pokemon){
		pokemons.add(pokemon);
	}
	
//	public void feed(String item){
	 	
//	}
	public String getName(int i) {
		return pokemons.get(i).getName();
	}
	
	public void list(){
		if(pokemons.size() == 0) {
			System.out.println("There is no pokemon in the farm.");
		}
		for(int i =0;i<pokemons.size();i++){
			pokemons.get(i).print();
		}
	}

	public void feed(String pokemonName,String item){
		if(pokemonName.equals("all")){
			for(Pokemon pokemon: pokemons){
				pokemon.eat(item);
			}
		}else {
			System.out.println("An unknown error occur.");
		}
	}
	public void feed(int i,String item){
		
			pokemons.get(i).eat(item);
			
	}
	
	public int getsize() {
		return pokemons.size();
	}
	public void walk(int i) {
		pokemons.get(i).walk();
	}
}
