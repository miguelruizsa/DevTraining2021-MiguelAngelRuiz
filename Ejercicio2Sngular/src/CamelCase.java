public class CamelCase {

	String generaCamelCase(String cad) {

		// Se crea un array con las palabras separadas por espacio
		String[] palabras = cad.split("\\W+");
		String cadena = "";

		// Recorremos el array de palabras
		for (String palabra: palabras){

			// Se concatenan las palabras con la primara letra capitalizada (mayúscula)
			cadena = cadena.concat(palabra.substring(0, 1).toUpperCase() + palabra.substring(1));

		}

		// Se retorna la cadena resultante
		return cadena;

	}



	public static void main(String[] args) {

		String resultado;

		// Se instacia un objeto de tipo CamelCase
		CamelCase cc = new CamelCase();
		//Se obtiene el resultado del método generaCamelCase
		resultado = cc.generaCamelCase("miguel angel ruiz santillanes");

		System.out.println("Resultado: ");
		// Se imprime la cadena en camel case
		System.out.println(resultado);



	}




}
