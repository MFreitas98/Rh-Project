package br.com.alura.rh.model;

public class ValidacaoException extends RuntimeException{

    private static final long serialVersionUID = 1l;

    public ValidacaoException(String mensagem) {
        super(mensagem);
    }
}
