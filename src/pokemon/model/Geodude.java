package pokemon.model;

public class Geodude extends Pokemon implements Rock{
	public Geodude () {
		super(1, "Geodude");
		setup();
	}
	public Geodude (String name) {
		super(1, name);
		setup();
	}
	public Geodude (int number, String name) {
		super(number, name);
		setup();
	}
	protected void setup() {
		this.setAttackPoints(1);
		this.setCanEvolve(true);
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
