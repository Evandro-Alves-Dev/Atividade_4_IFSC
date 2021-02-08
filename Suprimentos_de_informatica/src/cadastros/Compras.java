package cadastros;

public class Compras {
	
	private int comprarMinima = 10;
	
	public void compras(Produtos produto, Almoxarifado estoque) {
		
		System.out.println("----------SETOR COMPRAS-----------");
		
		if (produto.getQuantidade() < estoque.getQuantidadeMinima()) {
			System.out.println("Realizar compra de " + getComprarMinima() + " unidades.");
		}
		else {
			System.out.println("N�o � necessario realizar compra.");
		}
	}

	public int getComprarMinima() {
		return comprarMinima;
	}

	public void setComprarMinima(int comprarMinima) {
		this.comprarMinima = comprarMinima;
	}
	

}
