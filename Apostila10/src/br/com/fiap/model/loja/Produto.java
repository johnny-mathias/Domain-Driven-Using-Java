package br.com.fiap.model.loja;

public class Produto {
    private int codigo;
    private String descricao;
    private double preco;



    //Métodos
    //Calcula e retorna o valor com desconto
    public double calcularDesconto(double porcentagem){
        return preco * (100-porcentagem)/100f;
    }

    //Calcula o desconto padrão de 5%
    public double calcularDesconto(String padrao){
        return calcularDesconto(5);
    }

    //Sobrecarga do método de calcular desconto:
    //Recebe uma String (cupom) FIAP10 -> 10%, FIAP20 -> 20%

    //Sobrescrita do método na classe Alimentos
    //Recebe uma String (cupom) FIAP10 -> 10%, FIAP20 -> 20%, FIAP40 -> 40%

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
