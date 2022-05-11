package br.com.alura.rh.Service.promocao;

import br.com.alura.rh.model.Funcionario;
import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.ValidacaoException;

public class PromocaoService {

    public void promover(Funcionario funcionario, Boolean metaBatida) {
        Cargo cargoAtual = funcionario.getCargo();

        if(Cargo.GERENTE == cargoAtual) {
            throw new ValidacaoException("Gerentes nao podem ser promovidos!");
        }

        if(metaBatida) {
            Cargo novoCargo = cargoAtual.getProximoCargo();
            funcionario.promover(novoCargo);
        } else {
            throw  new ValidacaoException("Funcionario nao bateu a meta");
        }

    }
}


