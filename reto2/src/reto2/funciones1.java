package reto2;

import java.util.Scanner;

public class funciones1 {

	public static int dimeEntero(String texto,Scanner sc) {
		
		do {
		try {
			System.out.println(texto);
			String a = sc.nextLine();
			int numero = Integer.parseInt(a);
			return numero;
			
		}
		catch (Exception e) {System.out.println("Pon un numero para escoger un menu: ");}
		}
		while(true);
	}
}
