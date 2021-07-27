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
		System.out.println("Ingrese un numero");
		int numero=lector.nextInt();
		while(numero!=0 && numero<0) {
			if(numero>0) {
				numero++;
			}
		}

		int suma=numero;
		System.out.println("la suma es :"+suma);
		
	}

}
