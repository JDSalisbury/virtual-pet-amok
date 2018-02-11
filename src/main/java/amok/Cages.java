package amok;

public class Cages {

	private int soilLvl;

	public Cages(int soilLvl) {
		this.soilLvl = soilLvl;
	}

	public int cleanCage() {
		soilLvl = 0;
		return soilLvl;
	}

	public int getSoilLvl() {
		return soilLvl;
	}

	public void soilCage() {
		int waste = 1;
		soilLvl += waste;
	}

	@Override
	public String toString() {
		return "Cages waste lvl: " + soilLvl;
	}

}
