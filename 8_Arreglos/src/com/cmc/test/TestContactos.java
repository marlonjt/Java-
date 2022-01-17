package com.cmc.test;

import com.cmc.entidades.Contacto;

public class TestContactos {

	public static void main(String[] args) {
		Contacto [] contactos= new Contacto [5];
		
		contactos [0] = new Contacto("1234","Juan");
		contactos [1] = new Contacto("4321","Pepe");
		
		Contacto res = contactos[1];
		System.out.println(res);
		
		
		Contacto con= null;
		for(int i= 0; i<contactos.length;i++) {
			con = contactos[i];
			System.out.println(con);
		}
		

	}

}
