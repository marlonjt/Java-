package com.cmc.test;

import com.cmc.entidades.Direccion;
import com.cmc.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		Estudiante estudiante= new Estudiante("121","Juan");
		estudiante.imprimir();
		
		Direccion d1= new Direccion();
		d1.setCallePrincipal("chilibulo");
		d1.setCalleSecundaria("angochagua");
		estudiante.setDireccion(d1);
		
		estudiante.imprimir();
		
		Estudiante est= new Estudiante("12345", "Pepe");
		est.setDireccion(new Direccion ("pintado","chile","1234"));
		est.imprimir();
		
	}

}
