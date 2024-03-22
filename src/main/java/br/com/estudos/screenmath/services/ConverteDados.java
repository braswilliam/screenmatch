package br.com.estudos.screenmath.services;

import br.com.estudos.screenmath.model.DadosSerie;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

//uma classe que implementa o método IConverteDados
public class ConverteDados implements IConverteDados{

    //Para fazer a converção usando o jackson preciso instanciar um ObjectMapper:
    private final ObjectMapper mapper = new ObjectMapper();

    //Por contrato implementa o método:
    @Override
    public <T> T obterDados(String json, Class<T> classe) {
        try {
            //leia o json e trasforme em uma classe pode ser qualquer uma classe ex: Ator, filme, Diretor e etc...:
            return mapper.readValue(json, classe);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

}
