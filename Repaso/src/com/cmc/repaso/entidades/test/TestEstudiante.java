package com.cmc.repaso.entidades.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		Estudiante est = new Estudiante("juan");
		est.setNota(8);
		System.out.println(est.getNota());
		est.notaCalificar(8);
	}

}
