package com.cmc.colecciones;

import java.util.ArrayList;

import com.cmc.entidades.Persona;

public class Ejemplo1 {

	public static void main(String[] args) {
		Persona p;
		p = new Persona("pepe",2);

		ArrayList<String> lista;
		lista = new ArrayList<String>();
		System.out.println(lista + ""+ p);

		Persona p1 = new Persona("juan",4);
		ArrayList<String> lista1 = new ArrayList<String>();
		System.out.println(lista1 + "" + p1);
	}
}
