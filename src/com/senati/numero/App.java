package com.senati.numero;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {

		try {
			Numero Onum = new Numero();
			Scanner Leer = new Scanner(System.in);
			System.out.print("\n Ingrese el número : ");
			double n = Leer.nextDouble();
			Onum.valor = n;
			System.out.println(" " + Onum.Primo());
			System.out.println(" " + Onum.Perfecto());
			System.out.println(" Factorial " + Onum.Factorial());
			System.out.println(" Fibonacci: " + Onum.Fibonacci());
			System.out.println(" " + Onum.numeroToTexto());
			
		}catch (Exception ex) {
			
		}			
	}

}
