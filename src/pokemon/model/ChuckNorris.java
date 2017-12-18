package pokemon.model;

public class ChuckNorris extends Pokemon implements Fighting{
	public ChuckNorris (int number, String name) {
		super(number, name);
	}
	public String roundhouseKick(int damage) {
		return "You died";
	}
	public String rapidFire(int damage) {
		return "Rarr";
	}
	public boolean intimidate(int damage) {
		return true;
	}
	public boolean shearAwesomeness(int damage) {
		return true;
	}
}
