package com.cmc.test;

import com.cmc.colecciones.AdminPersona;
import com.cmc.entidades.Persona;

public class TestAdmin {

	public static void main(String[] args) {
		AdminPersona admin = new AdminPersona();
		admin.agregar(new Persona("Coco",10));
		admin.agregar(new Persona("Carlos",17));
		admin.agregar(new Persona("Sofia",30));
		
		admin.imprimir();
	}

}
