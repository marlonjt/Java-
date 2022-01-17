package com.cmc.colecciones;

import java.util.ArrayList;

import com.cmc.entidades.Persona;

public class AdminPersona {
	private ArrayList<Persona> personas;
	
	public AdminPersona() {
		personas = new ArrayList<Persona>();
	}

	public void agregar(Persona persona) {
		personas.add(persona);
	}

	public void imprimir() {
		Persona per = null;
		for (int i = 0; i < personas.size(); i++) {
			per=personas.get(i);
			System.out.println("Nombre:"+per.getNombre()+" "+per.getEdad());
		}

	}
	
	

}
