package com.cmc.flujo.test;

public class Auto {
	private int cantidadGasolina;
	private int capacidadTanque;
	
	public Auto(int capacidadTanque) {
		if(capacidadTanque<=0) {
			System.out.println("no vale numeros negativos");
		}else {
			this.capacidadTanque=capacidadTanque;
		}
	}
	
	public void cargarGasolina(int cantidad) {
		if(cantidadGasolina+cantidad>capacidadTanque) {
			System.out.println("exede capacidad");
		}else {
			cantidadGasolina=cantidadGasolina+cantidad;
		}
	}
	
	public int getCapacidadGasolina() {
		return cantidadGasolina;
	}
}
