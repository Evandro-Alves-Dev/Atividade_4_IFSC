package cadastros;

import java.util.Scanner;

public class Funcionarios extends Pessoas {
	private float salario;
	private String cargo;
	private String setor;
	
	public void cadastrar() {
		System.out.println("----------SETOR CADASTRO DE FUNCIONARIOS-----------");
		Scanner scan1 = new Scanner(System.in);
		System.out.print("Qual seu nome? ");
		this.setNome(scan1.nextLine());
		Scanner scan2 = new Scanner(System.in);
		System.out.print("Qual o seu CPF? ");
		this.setCPF(scan2.nextInt());
		Scanner scan3 = new Scanner(System.in);
		System.out.print("Qual seu endereço? ");
		this.setEndereco(scan3.nextLine());
		Scanner scan4 = new Scanner(System.in);
		System.out.print("Salario? ");
		this.setSalario(scan4.nextFloat());
		Scanner scan5 = new Scanner(System.in);
		System.out.print("Cargo? ");
		this.setCargo(scan5.nextLine());
		Scanner scan6 = new Scanner(System.in);
		System.out.print("Setor? ");
		this.setSetor(scan6.nextLine());
	}

	public void imprimir() {
		System.out.println("----------RELATÓRIO DE FUNCIONARIOS-----------");
		System.out.println("Funcionário " + getNome());
		System.out.println("CPF cadastrado " + getCPF());
		System.out.println("Endereço informado " + getEndereco());
		System.out.println("Salario R$ " + getSalario());
		System.out.println("Cargo " + getCargo());
		System.out.println("Setor de trabalho " + getSetor());
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	

}
