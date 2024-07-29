import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;

	public String getNome() {

		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	public void listarContas(){
		System.out.println("Contas do banco: " + getNome() + " :");
		for (Conta conta : contas){
			System.out.println("Nome do cliente: " + conta.cliente.getNome());
			System.out.println("Numero da conta: " + conta.getNumero());
			System.out.println("Numero da agencia: " + conta.getAgencia());
			System.out.println("Saldo: " + conta.getSaldo());
			System.out.println("======================================================= \n\n");
		}
	}
}
