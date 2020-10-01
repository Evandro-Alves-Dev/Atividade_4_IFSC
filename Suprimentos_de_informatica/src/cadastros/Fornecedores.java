package cadastros;

import java.util.Scanner;

public class Fornecedores extends Pessoas {
	
	private int CNPJ;
	private int contato;
	
	public void cadastrar() {
		System.out.println("----------SETOR CADASTRO DE FORNECEDORES-----------");
		Scanner scan1 = new Scanner(System.in);
		System.out.print("Nome da empresa? ");
		this.setNome(scan1.nextLine());		
		Scanner scan3 = new Scanner(System.in);
		System.out.print("Endereço? ");
		this.setEndereco(scan3.nextLine());
		Scanner scan4 = new Scanner(System.in);
		System.out.print("CNPJ: ");
		this.setCNPJ(scan4.nextInt());
		Scanner scan5 = new Scanner(System.in);
		System.out.print("Contato telefonico? ");
		this.setContato(scan5.nextInt());		
	}

	public void imprimir() {
		System.out.println("----------RELATÓRIO DE FORNECEDORES-----------");
		System.out.println("Empresa " + getNome());		
		System.out.println("Endereço informado " + getEndereco());
		System.out.println("CNPJ " + getCNPJ());
		System.out.println("Contato telefonico " + getContato());		
	}
	
	public int getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(int cNPJ) {
		CNPJ = cNPJ;
	}
	public int getContato() {
		return contato;
	}
	public void setContato(int contato) {
		this.contato = contato;
	}
}
