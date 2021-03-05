import org.junit.Assert;
import org.junit.Test;

public class PruebaCamelCase {

	@Test
	public void testGeneraCamelCase() {

		String expected = "HelloCase";
		String resultado;

		CamelCase cc = new CamelCase();
		resultado = cc.generaCamelCase("hello case");

		System.out.println(resultado);
		Assert.assertTrue((expected.equals(resultado)));


	}

}
