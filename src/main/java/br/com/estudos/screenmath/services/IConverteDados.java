package br.com.estudos.screenmath.services;

//uma interface que vai retornar um T:
public interface IConverteDados {
    //Vai retornar alguma coisa:
    <T> T obterDados(String json, Class<T> classe);
}
