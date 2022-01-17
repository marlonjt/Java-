package com.clearminds.test;
import com.clearminds.entidades.Persona;

public class TestPersona {

	public static void main(String[] args) {
		
		Persona p;
		p = new Persona("Juan");
		System.out.println("el nombre es: "+p.getNombre());
		System.out.println("el nombre es: "+p.getEdad());
		System.out.println("el nombre es: "+p.getEstatura());
		
		System.out.println("********** Persona uno *********");
		//p.setNombre("Pedro");
		p.setEdad(12);
		p.setEstatura(1.60);
		
		System.out.println("el nombre es: "+p.getNombre());
		System.out.println("el nombre es: "+p.getEdad());
		System.out.println("el nombre es: "+p.getEstatura());
		
		
		System.out.println("********** Persona dos *********");
		Persona p2 = new Persona("Lola");
		//p2.setNombre("Lola");
		p2.setEdad(30);
		p2.setEstatura(1.30);
		System.out.println("el nombre es: "+p2.getNombre());
		System.out.println("el nombre es: "+p2.getEdad());
		System.out.println("el nombre es: "+p2.getEstatura());
		
		System.out.println("********** Persona tres *********");
		Persona p3 = new Persona();
		System.out.println(p3.getNombre());
		
		System.out.println("********** Persona cuatro *********");
		Persona p4 = new Persona("Pepe",30,1);
		System.out.println("el nombre es: "+p4.getNombre());
		System.out.println("el nombre es: "+p4.getEdad());
		System.out.println("el nombre es: "+p4.getEstatura());
		

	}

}
