import java.util.Scanner;

public class Main {

	private String cadena;
	private Scanner entrada = new Scanner(System.in);

	private void ingresarPalabra() {

		System.out.println("Por favor ingresa una cadena: ");
		cadena = entrada.nextLine();

	}


	private void generaCamelCase() {

		String[] palabras = cadena.split("\\W+");
		cadena = "";

		for (String palabra: palabras){

			cadena = cadena.concat(palabra.substring(0, 1).toUpperCase() + palabra.substring(1));

		}

		System.out.println("Resultado: ");
		System.out.println(cadena);

	}



	public static void main(String[] args) {

		Main m = new Main();

		m.ingresarPalabra();

		m.generaCamelCase();

	}



}
