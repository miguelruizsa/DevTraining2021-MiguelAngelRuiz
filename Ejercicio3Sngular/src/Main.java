import java.util.Scanner;

public class Main {


	private long binario;

	private Scanner entrada = new Scanner(System.in);

	private void ingresarBinario() {

		System.out.println("Por favor ingresa un número en binario: ");
		binario = entrada.nextLong();

	}


	private void binarioADecimal() {

		int decimal = 0;
		int digito;
		final long DIVISOR = 10;
		for (long i = binario, j = 0; i > 0; i /= DIVISOR, j++) {
			digito = (int) (i % DIVISOR);
			if (digito != 0 && digito != 1) {
				System.out.println("No se ingresó un número binario");
			}
			decimal += digito * Math.pow(2, j);
		}

		System.out.println(decimal);

	}


	public static void main(String[] args) {

		Main m = new Main();

		m.ingresarBinario();

		m.binarioADecimal();

	}




}
