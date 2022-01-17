package com.cmc.colecciones;

import java.util.ArrayList;

import com.cmc.entidades.Persona;

public class Ejemplo4 {

	public static void main(String[] args) {
		ArrayList<Persona> listaPersona = new ArrayList<Persona>();

		listaPersona.add(new Persona("Pedro", 10));
		listaPersona.add(new Persona("Lucas", 10));
		listaPersona.add(new Persona("Lola", 10));

		System.out.println(listaPersona.size());

		Persona per = null;
		for (int i = 0; i < listaPersona.size(); i++) {
			per = listaPersona.get(i);
			System.out.println(per.getNombre()+" "+per.getEdad());
		}
	}

}
