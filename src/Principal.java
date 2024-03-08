import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();

        meuFilme.setNome("Duna parte dois");
        meuFilme.setAnoDeLancamento(2024);
        meuFilme.setDuracaoEmMinutos(180);



        meuFilme.avalia(10.0);
        meuFilme.avalia(9.5);
        meuFilme.avalia(9.8);

        meuFilme.exibeFichaTecnica();
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());
        System.out.printf("%.2f%n", meuFilme.pegaMedia());

        System.out.println("-----------------------");

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setMinutosPorEpisodio(50);
        lost.setEpisodiosPortemporada(10);
        System.out.println("Duração para maratonar " + lost.getNome() + ":" + lost.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();


        Filme outroFilme = new Filme();

        outroFilme.setNome("Avatar - O Caminho da Água");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

        calculadora.incluirNaCalculadora(outroFilme);
        calculadora.incluirNaCalculadora(meuFilme);
        calculadora.incluirNaCalculadora(lost);

        //pega o tempo total do filme:
        System.out.println(calculadora.getTempoTotal());





    }
}
