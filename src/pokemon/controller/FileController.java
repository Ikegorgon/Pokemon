package pokemon.controller;

import pokemon.model.*;
import java.io.*;
import java.util.*;

import pokemon.model.Pokemon;

public class FileController {
	public static void savePokemonToFile(ArrayList<Pokemon> pokedex) {
		File saveFile = new File("Saved Pokedex.text");
		try {
			PrintWriter writeToDisk = new PrintWriter(saveFile);
			for (int i = 0; i < pokedex.size(); i++) {
				String name = pokedex.get(i).getName();
				int number = pokedex.get(i).getNumber();
				int attack = pokedex.get(i).getAttackPoints();
				int health = pokedex.get(i).getHealthPoints();
				boolean evolve = pokedex.get(i).isCanEvolve();
				double modify = pokedex.get(i).getEnhancemetModifier();
				
				String row = name + ", " + number + ", " + health + ", " + attack + ", "
				+ modify + ", " + evolve;
				writeToDisk.println(row);
			}
			writeToDisk.close();
		} catch (FileNotFoundException error) {
			System.out.println("There was an error:" + error.getMessage());
		}
	}
	public static String readPokemonFromFile() {
		String contents = "";
		String path = "SavedPokedex.text";
		try {
			Scanner FileScanner= new Scanner(new File(path));
			while (FileScanner.hasNextLine()) {
				String row = FileScanner.nextLine();
				contents += row + "\n";
			}
			FileScanner.close();
		} catch (FileNotFoundException error) {
			System.out.println("There was an error:" + error.getMessage());
		}
		return contents;
	}
}
