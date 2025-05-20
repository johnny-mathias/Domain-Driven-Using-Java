package br.com.fiap.model.teste;

import br.com.fiap.model.loja.Alimentos;
import br.com.fiap.model.loja.Produto;

public class Terminal {
    public static void main(String[] args) {
        //Instanciar um produto
        Produto produto = new Produto();

        //Setar o preco
        produto.setPreco(100);

        //Calcular o valor com desconto
        System.out.println(produto.calcularDesconto(10));
        //Calcular o desconto padrão
        System.out.println(produto.calcularDesconto(5));

        //Instanciar o alimento
        Alimentos alimentos = new Alimentos();

        //Setar o preço do alimento
        alimentos.setPreco(100);

        //Calcular e exibir o valor com desconto padrão
        System.out.println(produto.calcularDesconto(5));


    }
}
