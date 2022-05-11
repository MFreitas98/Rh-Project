package br.com.alura.rh.Service.tributacao;

import java.math.BigDecimal;

public interface ReajusteTributario extends Reajuste {

    BigDecimal valorImpostoDeRenda();
}
