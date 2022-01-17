package com.cmc.test;

import com.cmc.entidades.Direccion;
import com.cmc.entidades.Persona;

public class TestPersona {

	public static void main(String[] args) {
		Persona p= new Persona();
		System.out.println("nombre: "+p.getNombre()); 
		System.out.println("nombre: "+p.getEdad());
		System.out.println("nombre: "+p.getDireccion());
	
		Direccion dir= p.getDireccion();
		if(dir!=null) {
			System.out.println("Calle Principal: "+dir.getCallePrincipal());
		}else {
			System.out.println("no hay dirrecion");
		}
	}
	
	

}
