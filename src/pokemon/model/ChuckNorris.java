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
		this.setAttackPoints(Integer.MAX_VALUE);
		this.setCanEvolve(false);
		this.setEnhancemetModifier(Double.MAX_VALUE);
		this.setHealthPoints(Integer.MAX_VALUE);
	}
	public String roundhouseKick(int damage) {
		return "You died";
	}
	public String rapidFire(int damage) {
		return "Pew Pew Pew Pew Pew Pew Pew Pew Pew Pew Pew Pew";
	}
	public boolean intimidate(int damage) {
		return true;
	}
	public boolean shearAwesomeness(int damage) {
		return true;
	}
}
