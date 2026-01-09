package com.yael.asientos.service;
import com.yael.asientos.model.*;

public class AsientoService {
	
	private int[][] asientos;
	int contadorLibres;
	int contadorOcupados;
	
	public AsientoService() {
		asientos = new int[5][5];
		contadorLibres = asientos.length * asientos[0].length;
		contadorOcupados = 0;
	}
		
	
	public void mostrarAsientos() {
	    for (int i = 0; i < asientos.length; i++) {
	        for (int j = 0; j < asientos[i].length; j++) {
	            System.out.print(Asiento.getSimbolo(asientos[i][j]) + "\t");
	        }
	        System.out.println();
	    }
	    
	    System.out.println("Asientos libres: " + contadorLibres);
	    System.out.println("Asientos ocupados: " + contadorOcupados);
	}

	
	public void reservarAsiento(int fila,int columna) {
		
		if( (fila < 0 || fila > asientos.length-1) || 
				(columna < 0 || columna > asientos.length-1)){
			System.out.println("Asientos no existentes");
			return;
		}
		if(asientos[fila][columna] == Asiento.ocupado ) {
			System.out.println("ASIENTO OCUPADO!!");
		}
		else {
			asientos[fila][columna] = 1;
			contadorOcupados++;
			contadorLibres--;
		}
	}
	
	
	public void liberarAsiento(int fila,int columna) {
		
		if(asientos[fila][columna] == Asiento.ocupado) {
			asientos[fila][columna] = Asiento.libre;
			contadorLibres++;
			contadorOcupados--;
		}else if(asientos[fila][columna] == Asiento.libre) {
			System.out.println("El asiento ya se encuentra libre");
		}
	}
	
	
}
