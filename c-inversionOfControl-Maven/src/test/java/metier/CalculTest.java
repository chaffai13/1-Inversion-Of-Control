package metier;

import org.junit.Test;

import c_inversionOfControl_Maven.metier.Calcul;
import junit.framework.Assert;

public class CalculTest {
	private Calcul calcul;

	@Test
	public void testSomme() {
		calcul = new Calcul();
		double a = 5;
		double b = 9;
		double expected = 14;

		double result = calcul.somme(a, b);

		Assert.assertTrue(result == expected);

	}

}
