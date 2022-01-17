package clearminds.cuentas.tets;

import clearminds.cuentas.Cuentas;

public class TestCuenta {

	public static void main(String[] args) {
		System.out.println("Valores iniciales");
		Cuentas cuenta1 = new Cuentas("03476", "A");
		cuenta1.setSaldo(67.5);
		cuenta1.imprimirComMiEstilo();
		
		Cuentas cuenta2 = new Cuentas("03476", "C");
		cuenta2.setSaldo(98);
		cuenta2.imprimirComMiEstilo();
		System.out.println("***************");
		
		Cuentas cuenta3 = new Cuentas("03476", "C");
		cuenta3.setSaldo(98);
		cuenta3.imprimirComMiEstilo();
		System.out.println("***************");
		System.out.println("Valores modificados");

		cuenta1.setSaldo(444);
		cuenta1.imprimirComMiEstilo();
		cuenta2.setSaldo(567);
		cuenta2.imprimirComMiEstilo();
		cuenta3.setTipo("D");
		cuenta3.imprimirComMiEstilo();
		
		Cuentas cuenta4 = new Cuentas("0001","E");
		cuenta4.setSaldo(122);
		cuenta4.imprimirComMiEstilo();
		
		

	}

}
