package amok;

public class LitterBox {

	private int soilLvl;

	public LitterBox(int soilLvl) {
		this.soilLvl = soilLvl;
	}

	public int cleanLitterBox() {
		soilLvl = 0;
		return soilLvl;
	}

	public int getSoilLvl() {
		return soilLvl;
	}

	public void soilLitterBox() {
		int waste = 1;
		soilLvl += waste;
	}

	@Override
	public String toString() {
		return "LitterBox waste lvl: " + soilLvl;
	}

}
