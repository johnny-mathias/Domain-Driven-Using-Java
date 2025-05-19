package br.com.fiap.model.loja;

import java.time.LocalDate;

public class Alimentos {
    LocalDate vencimento;

    public LocalDate getVencimento() {
        return vencimento;
    }

    public void setVencimento(LocalDate vencimento) {
        this.vencimento = vencimento;
    }
}
