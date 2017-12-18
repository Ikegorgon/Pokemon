package pokemon.model;

public class Wobbuffet extends Pokemon implements Psychic{
	public Wobbuffet (int number, String name) {
		super(number, name);
	}
	public String waitForIt(int damage) {
		return "Dead";
	}
	public String mindReader(int damage) {
		return "Dead";
	}
	public String randomQuote(int damage) {
		return "Pinned and dead";
	}
	public String pineapple(int damage) {
		return "You're screwed";
	}
}
