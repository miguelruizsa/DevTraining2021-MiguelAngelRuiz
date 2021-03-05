import org.junit.Assert;
import org.junit.Test;

public class PruebaMain {


	@Test
	public void testOrdenarNumeros() {
		long expected = 9875543221L;
		long resultado;

		OrdenarNumeros on = new OrdenarNumeros();
		resultado = on.ordenarNumero(1254859723);

		System.out.println("Resultado: ");


		if(resultado==0){

			System.out.println("El número ingresado debe ser un entero positivo");
			Assert.assertTrue((true));

		} else {

			System.out.println(resultado);
			Assert.assertTrue((expected==resultado));

		}


	}


}
