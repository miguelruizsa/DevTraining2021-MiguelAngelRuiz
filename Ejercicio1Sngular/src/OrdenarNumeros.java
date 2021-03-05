import java.util.Arrays;

class OrdenarNumeros {


	long ordenarNumero(double n) {

		long numero;
		String numerosal = "";

		// Se evalua que el numero sea entero
		if(n == (long)n){

			numero = (long)n;

			// Se evalua que el número obtenido sea positivo
			if(numero>=1){

				// Se convierte el número a cadena para generar un array de tipo int
				int[] numeros = Long.toString(numero).chars().map(c -> c-'0').toArray();
				// Reorganizamos los numeros obtenidos en el array
				Arrays.sort(numeros);

				// se recorre el array para concatenar los valores
				for (int i = numeros.length-1; i >= 0; i--) {

					numerosal = numerosal.concat(String.valueOf(numeros[i]));

				}

				// Se convierte la cadena obtenida a long
				numero = Long.parseLong(numerosal);

			} else {

				// Si no es número positivo se retorna cero
				return 0;

			}

		} else {

			// Si no es número entero se retorna cero
			return 0;

		}


		// Se retorna el numero resultante
		return numero;

	}




	public static void main(String[] args) {

		long resultado;

		// Se instacia un objeto de tipo OrdenarNumeros
		OrdenarNumeros on = new OrdenarNumeros();
		//Se obtiene el resultado del método ordenarNumero
		resultado = on.ordenarNumero(123456789);

		System.out.println("Resultado: ");

		// Se evalua el resultado
		if(resultado==0){

			System.out.println("El número ingresado debe ser un entero positivo");

		} else {

			// Se imprime el número reorganizado de manera descendente
			System.out.println(resultado);

		}



	}


}
