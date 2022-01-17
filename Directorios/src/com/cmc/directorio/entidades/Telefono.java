package com.cmc.directorio.entidades;

public class Telefono {
	private String operadora;
	private String numero;
	private int codigo;
	private boolean whatsapp;
	
	public Telefono(String operadora, String numero, int codigo) {
		//super();
		this.operadora = operadora;
		this.numero = numero;
		this.codigo = codigo;
	}

	public String getOperadora() {
		return operadora;
	}

	public String getNumero() {
		return numero;
	}

	public int getCodigo() {
		return codigo;
	}

	public boolean isWhatsapp() {
		return whatsapp;
	}
	
	
	
	
	
	
}
