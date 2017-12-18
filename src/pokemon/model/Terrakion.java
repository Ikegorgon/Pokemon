package pokemon.model;

public class Terrakion extends Pokemon implements Fighting, Rock{
	public Terrakion (int number, String name) {
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
