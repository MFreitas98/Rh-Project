package br.com.alura.rh.Service.tributacao;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Promocao implements ReajusteTributario{

    private BigDecimal valor;
    private LocalDate data;

    public Promocao(BigDecimal valor) {
        this.valor = valor;
        this.data = LocalDate.now();
    }

    @Override
    public BigDecimal valor() {
        return null;
    }

    @Override
    public LocalDate data() {
        return null;
    }

    @Override
    public BigDecimal valorImpostoDeRenda() {
        return valor.multiply(new BigDecimal("0.1"));
    }
}
