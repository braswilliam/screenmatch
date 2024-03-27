package br.com.estudos.screenmath.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//ignora as oputras propriedades dando atenção somente a estas:
@JsonIgnoreProperties(ignoreUnknown = true)
//Crie os atributos com os apelidos refenciados na API:
public record DadosSerie(
        @JsonAlias("Title") String titulo,
        @JsonAlias("totalSeasons") Integer totalTemporada,
        @JsonAlias("imdbRating") String avaliacao
) {}
