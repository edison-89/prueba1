package pablo.mateo.layedra.rebolledo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Ingresar un número:");
		Scanner teclado=new Scanner(System.in);
		int N= teclado.nextInt();
		
		while  (N>0) {
			System.out.println("Ingresar un número:");
			Scanner teclado2=new Scanner(System.in);
			int N= teclado2.nextInt();
			System.out.println(N);	
		}
	}
}
