package pokemon.model;

public class TheRock extends Pokemon implements Rock{
	public TheRock () {
		super(1, "Dwayne The Rock Johnson");
		setup();
	}
	public TheRock (String name) {
		super(1, name);
		setup();
	}
	public TheRock (int number, String name) {
		super(number, name);
		setup();
	}
	protected void setup() {
		this.setAttackPoints(1);
		this.setCanEvolve(false);
		this.setEnhancemetModifier(.1);
		this.setHealthPoints(100);
	}
	public String armCrush(int damage) {
		return "Dead";
	}
	public String rockSmash(int damage) {
		return "Dead";
	}
	public String rockBottom(int damage) {
		return "Pinned and dead";
	}
	public String sizeUp(int damage) {
		return "You're screwed";
	}
}
