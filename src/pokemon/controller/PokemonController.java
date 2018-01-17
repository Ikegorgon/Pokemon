package pokemon.controller;

import pokemon.model.*;
import pokemon.view.*;
import java.util.*;

public class PokemonController {
	private List<Pokemon> pokedex;
	private PokemonFrame appFrame;
	
	public PokemonController() {
		pokedex = new ArrayList<Pokemon>();
		pokedex.add(new Geodude());
		pokedex.add(new Graveler());
		pokedex.add(new Golem());
		pokedex.add(new Wobbuffet());
		pokedex.add(new Terrakion());
		pokedex.add(new TheRock());
		pokedex.add(new ShawnSpencer());
		pokedex.add(new ChuckNorris());
		appFrame = new PokemonFrame(this);
	}
//	public List<Pokemon> setupPokemon() {
		
//	}
	public List<Pokemon> getPokedex() {
		return pokedex;
	}
	public boolean isValidInteger(String input) {
		return true;
	}
	public boolean isValidDouble(String input) {
		return true;
	}
	public String [] convertPokedex() {
		String [] names = new String [pokedex.size()];
		for (int i = 0; i < pokedex.size(); i++) {
			names[i] = pokedex.get(i).getName();
		}
		return names;
	}
	public void updateSelected(int selection, int health, int attack, boolean evolve,
			double modify, String name) {
		Pokemon selected = pokedex.get(selection);
		selected.setAttackPoints(attack);
		selected.setCanEvolve(evolve);
		selected.setEnhancemetModifier(modify);
		selected.setHealthPoints(health);
		selected.setName(name);
		FileController.savePokemonToFile((ArrayList<Pokemon>) pokedex);
	}
}