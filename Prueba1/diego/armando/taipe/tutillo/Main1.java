package diego.armando.taipe.tutillo;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector =new Scanner(System.in);
		int n=0;
		int NumElementos=0;
		int sumar=0;
		int promedio=0;
		
		while(n>=0) {
			sumar += n;
			NumElementos++;
			System.out.print("Ingrese un número positivo: ");
			n=lector.nextInt();
		}
		if (n==0) {
			
		}
		else {
			promedio=sumar / NumElementos;
			
			System.out.print("el promedio es: "+promedio);
			
			System.out.print("numero de elementos: "+NumElementos);
		}
	}

}
