package br.com.estudos.screenmath.services;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumoApi {


    public String obterDados(String endereco) {
        //criando uma String que recebe uma string concatenada com o endereco;
        String apiEndereco = "https://omdbapi.com/?t=" + endereco.replace(" ", "+") + "&apikey=482b7d4f";

        //cirando a requisição:
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(apiEndereco))
                .build();
        HttpResponse<String> response = null;
        //vai tentar fazer uma requisução:
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        //captura as duas exceções:
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
        //retorna o conteúdo em formato String:
        return response.body();
    }


}
