package aplicacao;
import java.util.Scanner;
public class Programa {

	public static void main (String[] args) {
	Scanner leia = new Scanner (System.in);
	Produto produto = new Produto();
	
	System.out.println ("Insira o Nome do Produto: ");
		produto.produto = leia.next();
	
	System.out.println ("Insira a Quantidade no Estoque: ");
		produto.quantidade = leia.nextDouble();
		
	System.out.println ("Insira o Preço do Produto: ");
		produto.preco = leia.nextDouble();
		
	System.out.println ("Produto: " +produto.produto+ " Estoque Atual: " +produto.quantidade+ " Preço: " +produto.preco);
	
	System.out.println ("Insira a Quantidade de Produtos Adicionais: ");
		int estoque = leia.nextInt();
		produto.adcProduto(estoque);
		
	System.out.println("Atualização: " +produto.produto+ " Estoque Atual: " +produto.quantidade+ " Preço: " +produto.preco);

	System.out.println("Insira a Quantidade de Vendas: ");
	estoque = leia.nextInt();
	produto.subProduto(estoque);
	
	System.out.println("Atualização pos Vendas: " +produto.produto+ " Estoque Atual: " +produto.quantidade+ " Preço: " +produto.preco);
	double lucro;
	lucro = produto.preco * estoque;
    System.out.println ("Lucro Financeiro: " +(float)lucro);
	
	leia.close();
	}
}
