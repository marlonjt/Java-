package com.cmc.test;

import com.cmc.arreglos.AdminContactos;
import com.cmc.entidades.Contacto;

public class TestAdmin {

	public static void main(String[] args) {
		AdminContactos admin = new AdminContactos();
		admin.agregar(new Contacto("222","Sofia"));
		admin.agregar(new Contacto("333","Juan"));
		admin.agregar(new Contacto("323","Pepe"));
		admin.agregar(new Contacto("124","Polo"));
		
		admin.imprimir();
		
	}

}
