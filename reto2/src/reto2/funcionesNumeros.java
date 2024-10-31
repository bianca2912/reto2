package reto2;

public class funcionesNumeros {
	package Tema4;

	import java.util.Scanner;

	public class funciones {
		
		public static boolean esInt(String texto) {
			try {
				int text = Integer.parseInt(texto);
				return true;
			}
			catch (Exception e) {return false;}
			
		}
		
		public static boolean esDouble(String texto) {
			try {
				double text = Double.parseDouble(texto);
				return true;
			}
			catch (Exception e) {return false;}
		}
		public static int dimeEntero(String texto,Scanner sc) {
		
			do {
			try {
				System.out.println(texto);
				String a = sc.nextLine();
				int numero = Integer.parseInt(a);
				return numero;
				
			}
			catch (Exception e) {System.out.println("Pon un numero");}
			}
			while(true);
				
		}
		public static double dimeDouble(String texto,Scanner sc) {
			do {
			try {
				System.out.println(texto);
				String a = sc.nextLine();
				double numdoble = Double.parseDouble(a);
				return numdoble;
			}
			
			catch (Exception e) {System.out.println("Pon un numero");}
			}
			while(true);
		}


		}
		
		
	
