import org.junit.Assert;
import org.junit.Test;

public class PruebaBinarioADecimal {

	@Test
	public void testGeneraCamelCase() {

		long expected = 2;
		long resultado;

		BinariosDecimales bd = new BinariosDecimales();
		resultado = bd.binarioADecimal("[0, 0, 1, 0");

		System.out.println("Resultado: ");

		// Se evalua el resultado
		if(resultado==-1){

			System.out.println("No se ingresó un número binario");
			Assert.assertTrue(true);

		} else {

			// Se imprime el binario
			System.out.println(resultado);
			Assert.assertTrue(expected==resultado);

		}



	}

}
