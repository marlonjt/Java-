package com.cmc.fujo;

import com.cmc.flujo.test.Auto;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto = new Auto(60);
		System.out.println(auto.getCapacidadGasolina());
		auto.cargarGasolina(10);
		System.out.println(auto.getCapacidadGasolina());
		auto.cargarGasolina(20);
		System.out.println(auto.getCapacidadGasolina());
		auto.cargarGasolina(20);
		System.out.println(auto.getCapacidadGasolina());
		auto.cargarGasolina(20);
		System.out.println(auto.getCapacidadGasolina());
	
	}

}
