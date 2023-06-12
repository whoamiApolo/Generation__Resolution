package aula_07;

public class TestaCliente {
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Olecram", 52, "12345678-9", "Av. Paulista, 1500", 911112222);
		cliente.visualizar();
		
		cliente.setEndereco("Av. Paulista, 1500 - Bela Vista.");
		cliente.visualizar();
	}
}
