package br.com.alura.rh.Service.reajuste;

import br.com.alura.rh.model.Funcionario;
import br.com.alura.rh.model.ValidacaoException;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidacaoPeruidicidadeEntreReajustes  implements ValidacaoReajuste {

    public void validar(Funcionario funcionario, BigDecimal aumento) {
        LocalDate dataUtiloReajuste = funcionario.getDataUltimoReajuste();
        LocalDate dataAtual = LocalDate.now();
        long mesesDesdeUltimoReajuste = ChronoUnit.MONTHS.between(dataUtiloReajuste, dataAtual);

        if (mesesDesdeUltimoReajuste < 6) {
            throw new ValidacaoException("Intervalo entre reajustes deve ser no minimo de 6 meses");
        }
    }
}
