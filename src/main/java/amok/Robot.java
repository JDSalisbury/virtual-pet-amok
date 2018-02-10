package amok;

public abstract class Robot extends VirtualPet {

	protected int oil;

	public int getOiled() {
		return oil;
	}

	public void oil() {
		int penzoil = 1;
		oil += penzoil;
	}

}
