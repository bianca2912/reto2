package reto2;

import java.util.Scanner;

public class retos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int opcion;
        
        int menus = funciones1.dimeEntero("Selecciona el tipo de conversión:\n1 - Opicon 1 \n2 - Opcion 2\n0 - Salir", sc);
        
        switch (menus) {
        case 1: 
        	do {
                opcion = funciones1.dimeEntero("Selecciona el tipo de conversión:\n1 - Longitud\n2 - Peso\n3 - Temperatura\n4 - Volumen\n0 - Salir", sc);

                switch (opcion) {
                    case 1:
                        funciones1.menuLongitud(sc);
                        break;
                    case 2:
                        funciones1.menuPeso(sc);
                        break;
                }
            } while (opcion != 0);
        default:
        	break;
        

      
    }
        sc.close();
	}
	}
