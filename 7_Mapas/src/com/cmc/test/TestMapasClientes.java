package com.cmc.test;

import java.util.HashMap;

import com.cmc.entidades.Cliente;
import com.cmc.mapas.AdminClientes;

public class TestMapasClientes {

	public static void main(String[] args) {
		HashMap<String,Cliente> mapa = new HashMap<String,Cliente>();
		mapa.put("1234", new Cliente("1234","Pepe"));
		mapa.put("12345", new Cliente("12345","Lola"));
		mapa.put("123456", new Cliente("123456","Lala"));
		
		Cliente c =mapa.get("12345");
		System.out.println(c);
		
		AdminClientes mapa1= new AdminClientes();
		mapa1.agregarCliente(new Cliente("1723","Juan"));
		mapa1.agregarCliente(new Cliente("1717","Pedro"));
		mapa1.agregarCliente(new Cliente("888","Lula"));
		Cliente res = mapa1.Recuperar("888");
		System.out.println(res);

	}

}
