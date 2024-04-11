package aplicacao;

import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        Produto produto = new Produto();

        System.out.println("Insira o produto cadastrado: ");
        produto.produto = leia.next();

        System.out.println("Insira a quantidade de produtos no estoque: ");
        produto.quantidade = leia.nextDouble();

        System.out.println("Insira o preço individual: ");
        produto.preco = leia.nextDouble();

        System.out.println("Confirmacao: " + produto.produto + " estoque atual: " + produto.quantidade + " Preco: "
                + produto.preco);

        System.out.println("Insira a quantidade de produtos adicionais no estoque: ");
        int estoque = leia.nextInt();
        produto.adcProduto(estoque);

        System.out.println("Atualização: " + produto.produto + ", Estoque Atual: " + produto.quantidade + ", preco: "
                + produto.preco);

        System.out.println("Quantidade de vendas: ");
        estoque = leia.nextInt();
        produto.subProduto(estoque);

        System.out.println("Atualização pos vendas: " + produto.produto + ", Estoque " + produto.quantidade + ", preco "
                + produto.preco);

        leia.close();

    }

}
