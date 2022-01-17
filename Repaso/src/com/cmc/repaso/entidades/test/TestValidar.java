package com.cmc.repaso.entidades.test;

import com.cmc.repaso.entidades.Validar;

public class TestValidar {

	public static void main(String[] args) {
		Validar v = new Validar();
		boolean repuesta=v.validarMonto(100);
		System.out.println(repuesta);
	}

}
