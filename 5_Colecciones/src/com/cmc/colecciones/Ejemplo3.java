package com.cmc.colecciones;

import java.util.ArrayList;

import com.cmc.entidades.Persona;

public class Ejemplo3 {

	public static void main(String[] args) {
		ArrayList<Persona> listaPersona= new ArrayList<Persona>();
		
		listaPersona.add(new Persona("Pedro",10));
		Persona p = listaPersona.get(0);
		System.out.println(p);
	}

}
