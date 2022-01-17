package com.clearminds.conceptos;
public class Rectangulo {
	private int base;
	private int altura;
	
	public Rectangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public int calacularPerimetro() {
		int p = (2*base)+(2*altura);
		return p;
	}
	public int calcularArea() {
		int a = base * altura;
		return a;
	}

}
