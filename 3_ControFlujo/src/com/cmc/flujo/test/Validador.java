package com.cmc.flujo.test;

public class Validador {
	public void validarEdadint (int edad) {
		if (edad>18) {
			System.out.println("es mayor de edad");
		}else if(edad <18){
			System.out.println("es menor de edad");
		}else{
			System.out.println("su edad es 18");

		}
	}	
	public String validarEdadMsm(int edad){
		if(edad >18) {
			return "es mayor de edad";
		}else if(edad<18) {
			return "es mayor de edad";
		}else {
			return "es mayor de edad";
		}
			
	}
	
	public boolean esMayorEdad(int edad) {
		if(edad >18) {
			return true;
		}else {
			return false;
		}
	}
}
