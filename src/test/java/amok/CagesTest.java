package amok;


import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class CagesTest {

	
	private int soilLvl =0;

	@Test
	public void shouldMakeCageThathascleanlinessValue() {
		Cages underTest = new Cages(soilLvl);
		int check = underTest.cleanCage();
		assertEquals(check, 0);
	}
	
	@Test
	public void shouldAddWaste() {
		Cages underTest = new Cages(soilLvl);
		underTest.soilCage();
		assertEquals(underTest.getSoilLvl(),1);
	}
}
