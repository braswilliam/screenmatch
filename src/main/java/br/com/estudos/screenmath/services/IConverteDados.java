package br.com.estudos.screenmath.services;

public interface IConverteDados {
    //Vai retornar alguma coisa:
    <T> T obterDados(String json, Class<T> classe);
}
