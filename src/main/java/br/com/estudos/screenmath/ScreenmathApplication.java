package br.com.estudos.screenmath;

import br.com.estudos.screenmath.model.DadosSerie;
import br.com.estudos.screenmath.services.ConsumoApi;
import br.com.estudos.screenmath.services.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmathApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmathApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//intanciando classe de cunsumo api:
		var consumoApi = new ConsumoApi();
		// a variável json vai receber o que vier do método que faz a requisição:
		var json = consumoApi.obterDados("gilmore girls");
		//imprime o resultado:
		System.out.println("OK: " + json);

		//Instanciando um objeto do tipo ConverteDados:
		ConverteDados conversor = new ConverteDados();
		/*
		Criando uma classe do tipo dadosSerie que recebe um método que obtem dados
		da String json e converte na classe específica, que como eu falei pode ser qualquer classe:
		No exemplo abaixo estou dizendo que a classe Dados série vai receber em seus atrubutos dados da String
		json
		*/
		DadosSerie dadosSerie = conversor.obterDados(json, DadosSerie.class);
		//imprime:
		System.out.println(dadosSerie);

	}
}
