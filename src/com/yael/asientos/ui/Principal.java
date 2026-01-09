package com.yael.asientos.ui;
import java.util.Scanner;
import com.yael.asientos.service.*;

public class Principal {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		AsientoService funciones = new AsientoService();
		int eleccion;
		
		System.out.println("\tBienvenido al sistema de reservaciones de asientos");
		do {
			System.out.println();
			System.out.println("Selecciona una opcion: "
					+"\n1.Mostrar Asientos\n2.Reservar Asiento\n3.Liberar Asiento\n4.Salir");
			eleccion = teclado.nextInt();
			
			switch(eleccion) {
			
			case 1:
				funciones.mostrarAsientos();
				break;
				
			case 2:
				
				System.out.print("Ingresa el numero de fila del asiento: ");
				int filaRev = teclado.nextInt();
				System.out.print("Ingresa el numero de columna del asiento: ");
				int columnaRev = teclado.nextInt();
				funciones.reservarAsiento(filaRev, columnaRev);
				break;
				
			case 3:
				
				System.out.print("Ingresa el numero de fila del asiento: ");
				int filaLib = teclado.nextInt();
				System.out.print("Ingresa el numero de columna del asiento: ");
				int columnaLib = teclado.nextInt();
				funciones.liberarAsiento(filaLib, columnaLib);
				break;
				
			case 4:
				System.out.println("Gracias!");
				break;
				
			default:
				System.out.println("Opcion no existente");
				break;
			}
			
			
		}while(eleccion !=4);
	}
}
