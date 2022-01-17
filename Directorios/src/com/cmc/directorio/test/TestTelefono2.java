package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono2 {

	public static void main(String[] args) {
		Telefono telf = new Telefono("Movi", "0009988", 20);
		AdminTelefono admin = new AdminTelefono();
		admin.activarMensajeria(true);
		System.out.println(telf.getOperadora());
		System.out.println(telf.getCodigo());
		System.out.println(telf.getNumero());
		System.out.println(telf.isWhatsapp());
		System.out.println(admin);
	}

}
