package es.Studium.Compara;

import java.util.Scanner;

public class Compara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1, numero2; //números Enteros
		//Creamos el objeto que nos permite leer por teclados
		java.util.Scanner teclado = new Scanner(System.in);
		//mostramos por pantalla y recojemos un numero por teclado
		System.out.println("Dame un número");
		numero1 = teclado.nextInt();
		//mostramos por pantalla y recojemos un numero por teclado
		System.out.println("Dame otro número");
		numero2 = teclado.nextInt();
		teclado.close();
		if(numero1==numero2) 
		{
			System.out.println("Los numeros son iguales");
		}
		else 
		{
			if(numero1>numero2) 
			{
				System.out.println("El número "+numero1+" es mayor que el número "+numero2);
			}
			else 
			{
				System.out.println("El número "+numero2+" es mayor que el número "+numero1);
			}
		}
	}

}
