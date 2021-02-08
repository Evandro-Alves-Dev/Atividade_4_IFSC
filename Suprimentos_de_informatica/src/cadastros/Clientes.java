package cadastros;

import java.util.Scanner;

@Data
public class Clientes extends Pessoas {
	private float renda;
	private int idade;
	private int telefone;

	public void cadastrar() {
		System.out.println("----------SETOR CADASTRO DE CLIENTES-----------");
		Scanner scan1 = new Scanner(System.in);
		System.out.print("Qual seu nome? ");
		this.setNome(scan1.nextLine());
		Scanner scan2 = new Scanner(System.in);
		System.out.print("Qual o seu CPF? ");
		this.setCPF(scan2.nextInt());
		Scanner scan3 = new Scanner(System.in);
		System.out.print("Qual seu endere�o? ");
		this.setEndereco(scan3.nextLine());
		Scanner scan4 = new Scanner(System.in);
		System.out.print("Qual sua renda? ");
		this.setRenda(scan4.nextFloat());
		Scanner scan5 = new Scanner(System.in);
		System.out.print("Qual sua idade? ");
		this.setIdade(scan5.nextInt());
		Scanner scan6 = new Scanner(System.in);
		System.out.print("Qual seu telefone? ");
		this.setTelefone(scan6.nextInt());
	}

	public void imprimir() {
		System.out.println("----------RELAT�RIO DE CLIENTES-----------");
		System.out.println("Cliente " + getNome());
		System.out.println("CPF cadastrado " + getCPF());
		System.out.println("Endere�o informado " + getEndereco());
		System.out.println("Renda mensal R$ " + getRenda());
		System.out.println("Idade do cliente " + getIdade());
		System.out.println("Contato " + getTelefone());
	}

	public float getRenda() {
		return renda;
	}

	public void setRenda(float renda) {
		this.renda = renda;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
}
