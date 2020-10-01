package cadastros;

public class Almoxarifado {

	private int quantidadeMinima = 10;
	
	public void estoque(Produtos produto) {
		
		System.out.println("----------SETOR ESTOQUE-----------");
		
		if (produto.getQuantidade() > getQuantidadeMinima() ) {
			System.out.println("Nível de estoque normal.");
		}
		else {
			System.out.println("Item abaixo do estoque minimo.");
		}		
	}

	public int getQuantidadeMinima() {
		return quantidadeMinima;
	}

	public void setQuantidadeMinima(int quantidadeMinima) {
		this.quantidadeMinima = quantidadeMinima;
	}
}
