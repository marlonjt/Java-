package com.clearminds.test;
import com.clearminds.entidades.Auto;

public class TestAuto {

	public static void main(String[] args) {
		Auto a1;
		a1 = new Auto();
		System.out.println("auto:"+ a1.getMarca());
		System.out.println("auto:"+ a1.getPrecio());
		System.out.println("auto:"+ a1.getAnio());
		
		System.out.println("++++++++ Auto numero uno +++++++++");
		
		a1.setMarca("Nisan");
		a1.setPrecio(20000);
		a1.setAnio(2018);
		
		System.out.println("auto:"+ a1.getMarca());
		System.out.println("auto:"+ a1.getPrecio());
		System.out.println("auto:"+ a1.getAnio());
		
		System.out.println("++++++++ Auto numero dos +++++++++");
		
		Auto a2;
		a2 = new Auto();
		
		a2.setMarca("Nisan");
		a2.setPrecio(20000);
		a2.setAnio(2018);
		
		System.out.println("auto:"+ a2.getMarca());
		System.out.println("auto:"+ a2.getPrecio());
		System.out.println("auto:"+ a2.getAnio());
		
		System.out.println("++++++++ Auto numero tres +++++++++");
		
		Auto a3 = new Auto("Audi",3333,2021);
		System.out.println("auto:"+ a3.getMarca());
		System.out.println("auto:"+ a3.getPrecio());
		System.out.println("auto:"+ a3.getAnio());

	}

}
