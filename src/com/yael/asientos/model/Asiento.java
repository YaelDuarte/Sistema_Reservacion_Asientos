package com.yael.asientos.model;

public class Asiento {
	public static final int libre = 0;
	public static final int ocupado = 1;
	
	public static char getSimbolo(int estado) {
		return (estado == ocupado) ? 'O' : 'L';
	}

	
}
