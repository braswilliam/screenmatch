package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {

    private String recomendacao;


    public void filtra(Classicavel classicavel) {
        if (classicavel.getClassificacao() >= 4.0) {
            System.out.println("Está entre os preferidos dos usuários.");
        } else if (classicavel.getClassificacao() >= 2.0) {
            System.out.println("Muito bem avaliado no momento.");
        } else {
            System.out.println("Coloque na sua lista para assistir depois.");
        }
    }

}
