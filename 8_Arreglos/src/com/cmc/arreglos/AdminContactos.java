package com.cmc.arreglos;

import com.cmc.entidades.Contacto;

public class AdminContactos {

	private Contacto[] contactos;
	private int elementosAgregados;

	public AdminContactos() {
		contactos = new Contacto[10];
	}

	public void agregar(Contacto contacto) {
		if (elementosAgregados < contactos.length) {
			contactos[elementosAgregados] = contacto;
			elementosAgregados = elementosAgregados + 1;
		}
	}
	
	public void imprimir() {
		
		Contacto con= null;
		for(int i= 0; i<contactos.length;i++) {
			con = contactos[i];
			System.out.println(con);
		}
	}
}
