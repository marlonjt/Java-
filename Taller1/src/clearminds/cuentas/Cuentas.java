package clearminds.cuentas;

public class Cuentas {
	private String id;
	private String tipo;
	private double saldo;
	
	
	public Cuentas(String id, String tipo) {
		//super();
		this.id = id;
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getId() {
		return id;
	}
	
	public void imprimirComMiEstilo() {
		System.out.println("***********");
		System.out.println("CUENTA");
		System.out.println("***********");
		System.out.println("Numero de cuenta: "+ id);
		System.out.println("Tipo: "+tipo);
		System.out.println("Saldo: "+saldo);
	}
	
}
