package aplicacao;

public class Produto {
	public String produto;
	public double quantidade;
	public double preço;
	
	public void adcProduto (int estoque) {
		//this - Faz referencia a variavel para adicionar ou diminuir algo.
		this.quantidade += estoque;
	}
	
	public void subProduto (int estoque) {
		this.quantidade -= estoque;
		
		
}

}
