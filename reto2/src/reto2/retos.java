package reto2;

import java.util.Scanner;

public class retos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int menu = funciones1.dimeEntero("Elige opción 1, 2 o 0", sc);
		Scanner scanner = new Scanner (System.in);
		boolean valido;
		String a = sc.nextLine();
		
			switch (a) {
			case 1: {
				
				do {
					System.out.println("Selecciona el tipo de conversion:");
					System.out.println("1. Longitud");
					System.out.println("2. Peso");
					System.out.println("3. Temperatura");
					System.out.println("4. Volumen");
					System.out.println("0. Salir");
					String input = scanner.nextLine();
					try {
						menu = Integer.parseInt(input);
						if (menu >=0 && menu<=4) {
							valido = true;
						} else {
							System.out.println("N�mero incorrecto.");
							valido = false;
						}
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println("N�mero no reconocido.");
						valido = false;
					}
				} while (!valido);
				
			}
			case 2: {
				do {
					System.out.println("Selecciona el tipo de conversion de longitud:");
					System.out.println("1. Millas a kilometros");
					System.out.println("2. Kilometros a Millas");
					System.out.println("0. Salir");
					String input = scanner.nextLine();
					try {
						menu = Integer.parseInt(input);
						if (menu >=0 && menu<=4) {
							valido = true;
						} else {
							System.out.println("N�mero incorrecto.");
							valido = false;
						}
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println("N�mero no reconocido.");
						valido = false;
					}
				} while (!valido);
			}
			default:
				break;
			}
			
	
	}
}
