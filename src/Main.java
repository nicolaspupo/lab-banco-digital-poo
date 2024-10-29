
public class Main {

	public static void main(String[] args) {
		
		Conta cc1 = new ContaCorrente(new Cliente("Nicolas"));
		Conta cc2 = new ContaCorrente(new Cliente("André"));
		Conta pp1 = new ContaPoupanca(new Cliente("Katia"));

		cc1.depositar(100);
		cc1.sacar(500);
		cc1.transferir(150, pp1);
		cc2.depositar(50);
		cc1.imprimirExtrato();
		pp1.imprimirExtrato();

		System.out.println(Conta.listaClientes);
		
		
	}

}
