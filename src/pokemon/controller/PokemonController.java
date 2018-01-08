package pokemon.controller;

import pokemon.model.*;
import java.util.*;

public class PokemonController {
	private List<Pokemon> pokedex;
	
	public void start() {
//		setupPokemon();
	}
//	public List<Pokemon> setupPokemon() {
		
//	}
	public List<Pokemon> getPokedex() {
		return pokedex;
	}
	public boolean isValidInteger(String input) {
		return false;
	}
	public boolean isValidDouble(String input) {
		return false;
	}
	public String [] convertPokedex() {
		String [] names = new String [pokedex.size()];
		for (int i = 0; i < pokedex.size(); i++) {
			names[i] = pokedex.get(i).getName();
		}
		return names;
	}
}