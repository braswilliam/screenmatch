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

		var consumoApi = new ConsumoApi();
		var json = consumoApi.obterDados("gilmore girls");
		System.out.println("OK: " + json);

		ConverteDados conversor = new ConverteDados();
		DadosSerie dadosSerie = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dadosSerie);

	}
}
