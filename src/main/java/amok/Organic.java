package amok;

public abstract class Organic extends VirtualPet {

	protected int food;
	protected int drink;
	protected int potty;

	public int getFood() {
		return food;
	}

	public int getDrink() {
		return drink;
	}

	public int getPotty() {
		return potty;
	}

	public void feed() {
		int eat = 1;
		food += eat;
		potty += eat;
		health+= eat;
	}

	public void water() {
		int drank = 1;
		drink += drank;
		potty += drank;
		health+= drank;
	}

	public void bathroom() {
		int bathroom = 1;
		potty -= bathroom;
	}

}
