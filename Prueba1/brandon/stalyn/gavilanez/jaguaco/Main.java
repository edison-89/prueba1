package brandon.stalyn.gavilanez.jaguaco;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.print("Ingrese un numero positivo:");
		Scanner teclado = new Scanner(System.in);
		int n = teclado.nextInt();
		while(n!=0){
		System.out.print("Ingrese un numero positivo:");	
		if(n==0){
		int r=n+n;
		int r2=n/n;
		System.out.print("la suma es:"+r);
		System.out.print("El promedio es:"+r2);	
		}
		}	
		}

	}



