package reto2;

import java.util.Scanner;

public class funciones1 {

	
	public static int dimeEntero (String intStart, Scanner scanner) {
		
		while (true) {
			System.out.println(intStart);
			String entrada = scanner.nextLine();
			try {
				int entero = Integer.parseInt(entrada);
				return entero;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Error");	
			}
		}
	}
	
	
	
	public static void menuPeso(Scanner scanner) {
        int option;
        do {
            System.out.println("Selecciona la conversión de peso:");
            System.out.println("1. Libras a Kilogramos");
            System.out.println("2. Kilogramos a Libras");
            System.out.println("0. Salir");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Ingrese libras: ");
                    double libras = scanner.nextDouble();
                    System.out.println(libras + " libras = " + librasAKilogramos(libras) + " kilogramos");
                    break;
                case 2:
                    System.out.print("Ingrese kilogramos: ");
                    double kilogramos = scanner.nextDouble();
                    System.out.println(kilogramos + " kilogramos = " + kilogramosALibras(kilogramos) + " libras");
                    break;
                case 0:
                    System.out.println("Volviendo al menú principal.");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (option != 0);
    }
	
	public static double millasAKilometros(double millas) {
        return millas * 1.60934;
    }

    public static double kilometrosAMillas(double kilometros) {
        return kilometros * 0.621371;
    }

    public static double librasAKilogramos(double libras) {
        return libras * 0.453592;
    }

    public static double kilogramosALibras(double kilogramos) {
        return kilogramos * 2.20462;
    }

}

