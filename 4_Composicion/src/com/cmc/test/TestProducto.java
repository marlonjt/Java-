package com.cmc.test;

import com.cmc.admin.AdminProducto;
import com.cmc.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		AdminProducto admin= new AdminProducto(); 
		Producto uno= new Producto("papas", 0.55);
		Producto dos= new Producto("doritos", 0.55);
		Producto caro= admin.obtenerProductoCaro(uno, dos);
		if(caro == null) {
			System.out.println("mismo precio");
		}else {
			System.out.println("producto caro es: "+caro.getNombre());
		}
		

	}

}
