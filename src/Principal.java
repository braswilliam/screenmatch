public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();

        meuFilme.nome = "Duna parte dois";
        meuFilme.anoDeLancamento = 2024;


        meuFilme.avalia(10.0);
        meuFilme.avalia(9.5);
        meuFilme.avalia(9.8);

        meuFilme.exibeFichaTecnica();

        System.out.printf("%.2f%n", meuFilme.pegaMedia());





    }
}
