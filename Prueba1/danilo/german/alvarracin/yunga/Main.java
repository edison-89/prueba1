package danilo.german.alvarracin.yunga;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Crear un programa que solicite ingresar un n�mero (solo positivos), y 
		  as� seguir� solicitando ingresar un n�mero hasta que se ingrese el n�mero cero (0), 
		  cuando se ingrese el numero cero, ya no solicitar� m�s n�meros y en ese momento el programa debe
		   imprimir la suma y el promedio de los n�meros ingresados hasta ese momento. Adicional deber� imprimir 
		   la cantidad de n�meros ingresados por el usuario.*/

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
