package pokemon.model;

public class Wobbuffet extends Pokemon implements Psychic{
	public Wobbuffet () {
		super(1, "Wobbuffet");
		setup();
	}
	public Wobbuffet (String name) {
		super(1, name);
		setup();
	}
	public Wobbuffet (int number, String name) {
		super(number, name);
		setup();
	}
	protected void setup() {
		this.setAttackPoints(1);
		this.setCanEvolve(false);
		this.setEnhancemetModifier(.1);
		this.setHealthPoints(100);
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
