package pokemon.model;

public class Geodude extends Pokemon implements Rock{
	public Geodude (int number, String name) {
		super(number, name);
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
