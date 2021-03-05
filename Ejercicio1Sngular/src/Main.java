import java.util.Arrays;
import java.util.Scanner;

public class Main {


	private int numero;
	private String numerosal = "";

	private Scanner entrada = new Scanner(System.in);


	private void ingresarNumero() {

		System.out.println("Por favor ingresa un número: ");
		numero = entrada.nextInt();

	}


	private void ordenar() {

		System.out.println("Número ingresado: " + numero);

		int [] numeros = Integer.toString(numero).chars().map(c -> c-'0').toArray();
		Arrays.sort(numeros);

		for (int i = numeros.length-1; i >= 0; i--) {

			numerosal = numerosal.concat(String.valueOf(numeros[i]));

		}

		numero = Integer.parseInt(numerosal);
		System.out.println(numero);

	}


	public static void main(String[] args) {

		Main m = new Main();

		m.ingresarNumero();

		m.ordenar();

	}

}
