package pablo.mateo.layedra.rebolledo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Ingresar un n�mero:");
		Scanner teclado=new Scanner(System.in);
		int N= teclado.nextInt();
		
		while (N<0 && N>0) {
			System.out.println("Ingresar un n�mero:");
			Scanner teclado2=new Scanner(System.in);
			int N2= teclado.nextInt();
			System.out.println(N2);
		}
	}
}
