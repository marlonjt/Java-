package com.clearminds.test;
import com.clearminds.conceptos.Calculadora;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora c = new Calculadora();
		int resultado = c.sumar(7, 7);
		System.out.println("el resultado es: " + resultado);
		
		int r = c.restar(4, 3);
		System.out.println("el resultado es: " + r);
		
		int m = c.multiplicar(3, 9);
		System.out.println("el resultado es: "+ m);
		
		float d = c.dividir(10,3);
		System.out.println("el resultado es: "+ d);
	}

}
