package pokemon.model;

public class Golem extends Graveler{
	public Golem () {
		super(1, "Golem");
		setup();
	}
	public Golem (String name) {
		super(1, name);
		setup();
	}
	public Golem (int number, String name) {
		super(number, name);
		setup();
	}
	@Override
	protected void setup() {
		super.setup();
		this.setCanEvolve(false);
	}
}
