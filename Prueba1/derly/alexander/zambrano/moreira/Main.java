package derly.alexander.zambrano.moreira;

import java.util.Scanner;

public class Main {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
					
					// Derly Zambrano
					Scanner lector = new Scanner(System.in);
					
					System.out.println("Calculo de suma");
					System.out.println("--------Universidad Central del Ecuador---------");
					
					int n = 0, suma = 0, promedio=0;
					System.out.println("----------------");
					
					do
					{
						System.out.println("Ingrese un numero: ");
					n = lector.nextInt();
					suma = suma + n;
					
				
					
					}while(n != 0 ) ;
					
					System.out.println("La suma total de los numeros es:"+ suma);
				
						
					


		


	}

}
