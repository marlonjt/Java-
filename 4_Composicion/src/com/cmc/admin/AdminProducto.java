package com.cmc.admin;

import com.cmc.entidades.Producto;

public class AdminProducto {
	
	public Producto obtenerProductoCaro(Producto a, Producto b) {
		if(a.getPrecio()>b.getPrecio()) {
			return a;
		}else if(a.getPrecio()<b.getPrecio()) {
			return b;
		}else {
			return null;
		}
		
	}
		
}
