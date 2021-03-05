public class BinariosDecimales {

	long binarioADecimal(String b) {

		String cadena = "";

		// Se eliminan algunos caracteres para crear un array facilmente
		b = b.replace("[", "");
		b = b.replace("]", "");
		b = b.replace(",", "");

		// Se crea un array
		String[] binarios = b.split("\\W+");

		// Recorremos el array de numeros
		for (String binario: binarios){

			// Se concatenan los numeros
			cadena = cadena.concat(binario);

		}

		long bin = Long.parseLong(cadena);
		long decimal = 0;
		int digito;
		final long DIVISOR = 10;

		/* Tomamos el modulo de 10 de ese numero.
		Multiplicamos ese numero por 2 elevado al indice correspondiente.
		Lo sumamos al total.
		Dividimos el numero entre 10.
		Repetimos el proceso anterior hasta llegar a 0.
		Si en cualquier momento, la cifra no es cero o uno, retornamos un -1 para indicar que esta mal. */
		for (long i = bin, j = 0; i > 0; i /= DIVISOR, j++) {
			digito = (int) (i % DIVISOR);
			if (digito != 0 && digito != 1) {
				return(-1);
			}
			decimal += digito * Math.pow(2, j);
		}

		return(decimal);

	}


	public static void main(String[] args) {

		long resultado;

		// Se instacia un objeto de tipo OrdenarNumeros
		BinariosDecimales bd = new BinariosDecimales();
		//Se obtiene el resultado del método ordenarNumero
		resultado = bd.binarioADecimal("[0, 1, 0, 1]");

		System.out.println("Resultado: ");

		// Se evalua el resultado
		if(resultado==-1){

			System.out.println("No se ingresó un número binario");

		} else {

			// Se imprime el binario
			System.out.println(resultado);

		}



	}




}
