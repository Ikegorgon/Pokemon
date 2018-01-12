package pokemon.model;

import java.util.*;
/*
 * Pokemon Object
 */
public abstract class Pokemon {
	private int healthPoints;
	private int attackPoints;
	private double enhancemetModifier;
	private int number;
	private String name;
	private boolean canEvolve;
	
	public Pokemon (int number, String name) {
		this.name = name;
		this.number = number;
		
	}
	public String[] getPokemonTypes() {
		String[] types = null;
		Class<?> currentClass= this.getClass();
		ArrayList<String> parentType = new ArrayList<String>();
		while(currentClass.getSuperclass() != null) {
			Class<?> [] pokemonTypes = currentClass.getInterfaces();
			types = new String[pokemonTypes.length];
			for (int i = 0; i < types.length; i++) {
				String currentInterface = pokemonTypes[i].getCanonicalName();
				currentInterface = currentInterface.replaceAll(this.getClass().getPackage().getName() + ".", "");
				parentType.add(currentInterface);
			}
		}
		types = new String [parentType.size()];
		for (int i = 0; i < parentType.size(); i++) {
			types[i] = parentType.get(i);
		}
		return types;
	}
	public String toString() {
		String description = "Hi, I am a " + name + ", and my HP is " + healthPoints;
		return description;
	}
	public String getPokemonInformation() {
		String pokemonInfo = "This pokemon is of type: " + this.getClass().getSimpleName();
		return pokemonInfo;
	}
	
	public int getHealthPoints() {
		return healthPoints;
	}
	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}
	public int getAttackPoints() {
		return attackPoints;
	}
	public void setAttackPoints(int attackPoints) {
		this.attackPoints = attackPoints;
	}
	public double getEnhancemetModifier() {
		return enhancemetModifier;
	}
	public void setEnhancemetModifier(double enhancemetModifier) {
		this.enhancemetModifier = enhancemetModifier;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isCanEvolve() {
		return canEvolve;
	}
	public void setCanEvolve(boolean canEvolve) {
		this.canEvolve = canEvolve;
	}
	public int getNumber() {
		return number;
	}
}
