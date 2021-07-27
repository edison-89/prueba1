package alex.fernando.pachacama.nacimba;

import java.util.Scanner;

public class Prueba1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("---------Prueba 1--------- ");
		Scanner teclado = new Scanner(System.in);
		int num,suma;
		 suma=0;
		 do
		 {
		 System.out.print("Introduzca un número: ");
		 num=teclado.nextInt();
		 suma=suma+num;
		 }
		 while(num!=0);
		 
		 System.out.println("La suma de todos los numeros es: "+suma);
		 
		 }
		}
