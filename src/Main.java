import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");

		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		List<Conta> listaDeContas = new ArrayList<>();
		listaDeContas.add(cc);
		Banco banco = new Banco();
		banco.setContas(listaDeContas);
		System.out.println(banco.getContas());
	}

}
