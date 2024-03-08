package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classicavel;

public class Filme extends Titulo implements Classicavel {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }


    @Override
    public double getClassificacao() {
        return pegaMedia() / 2;
    }


}

