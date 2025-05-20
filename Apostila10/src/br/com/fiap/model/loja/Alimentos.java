package br.com.fiap.model.loja;

import java.time.LocalDate;

public class Alimentos {
    LocalDate vencimento;

    //Sobreescrita do método do pai
    public double calcularDesconto(){
        //Calcular desconto de 15%
        return calcularDesconto(15);
    }

    public LocalDate getVencimento() {
        return vencimento;
    }

    public void setVencimento(LocalDate vencimento) {
        this.vencimento = vencimento;
    }
}
