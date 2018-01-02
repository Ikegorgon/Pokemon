package pokemon.model;

public class Graveler extends Geodude{
	public Graveler () {
		super(1, "Graveler");
		setup();
	}
	public Graveler (String name) {
		super(1, name);
		setup();
	}
	public Graveler (int number, String name) {
		super(number, name);
		setup();
	}
	@Override
	protected void setup() {
		super.setup();
	}
}
