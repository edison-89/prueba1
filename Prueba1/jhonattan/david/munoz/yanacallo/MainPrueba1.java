package jhonattan.david.munoz.yanacallo;

import java.util.Scanner;

public class MainPrueba1 {

	public MainPrueba1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Scanner lee = new Scanner(System.in);

		System.out.print("Ingrese un numero positivo: ");
		int Numero = lee.nextInt();

		while (Numero > 0) {
			System.out.println("Ingrese un numero positivo: ");
			Numero = lee.nextInt();
		}

		if (Numero == 0) {
			int S = Numero + Numero;

			System.out.println("°°°°°°°°°°°°°°°°°°°");
			System.out.print("Suma fue: " + S);
			System.out.println("°°°°°°°°°°°°°°°°°°°");

			int P = S + Numero;
			System.out.println("°°°°°°°°°°°°°°°°°°°");
			System.out.println("Promedio: " + P);
			System.out.println("°°°°°°°°°°°°°°°°°°°");

			System.out.println("°°°°°°°°°°°°°°°°°°°");
			System.out.println("Cantidad de #: " + Numero);
			System.out.println("°°°°°°°°°°°°°°°°°°°");
		}

		
	}

}
