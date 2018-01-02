package pokemon.model;

public class ChuckNorris extends Pokemon implements Fighting{
	public ChuckNorris () {
		super(1, "Chuck Norris");
		setup();
	}
	public ChuckNorris (String name) {
		super(1, name);
		setup();
	}
	public ChuckNorris (int number, String name) {
		super(number, name);
		setup();
	}
	protected void setup() {
		this.setAttackPoints(1);
		this.setCanEvolve(false);
		this.setEnhancemetModifier(.1);
		this.setHealthPoints(100);
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
