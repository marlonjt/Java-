package com.clearminds.test;
import com.clearminds.conceptos.Rectangulo;
public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r = new Rectangulo(10,5);
		//r.base = 10;
		//r.altura = 5;
		int perimetro = r.calacularPerimetro();
		int area = r.calcularArea();
		System.out.println("el perimetro es: " +  perimetro);
		System.out.println("el area es: "+area);
		
		Rectangulo r2 = new Rectangulo(3,3);
		//r2.base= 3;
		//r2.altura=  3;
		int perimetro2 = r2.calacularPerimetro();
		int area2 = r2.calcularArea();
		System.out.println("el perimetro2 es: "+perimetro2);
		System.out.println("el area2 es: "+area2);
		
	}

}
