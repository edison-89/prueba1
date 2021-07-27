package danilo.german.alvarracin.yunga;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Crear un programa que solicite ingresar un número (solo positivos), y 
		  así seguirá solicitando ingresar un número hasta que se ingrese el número cero (0), 
		  cuando se ingrese el numero cero, ya no solicitará más números y en ese momento el programa debe
		   imprimir la suma y el promedio de los números ingresados hasta ese momento. Adicional deberá imprimir 
		   la cantidad de números ingresados por el usuario.*/

		Scanner lector=new Scanner(System.in);
		System.out.println("Ingrese un numero:");
		int nup;
		int n=lector.nextInt();

		while(n!=0 || n>0) {
			
			System.out.print("Ingrese un numero:");
			n=lector.nextInt();
			 
		}
		
		int suma=n;
		System.out.println("la suma de los numero es :"+suma);
		
	

		
	}

}
