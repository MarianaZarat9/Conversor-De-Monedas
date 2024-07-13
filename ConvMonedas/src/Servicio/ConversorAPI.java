package Servicio;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversorAPI {
    public void obtenerDatos(String divisaBase,
                               String divisaDestino,
                               double valorAConvertir) {

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        String direccion = "https://v6.exchangerate-api.com/v6" +
                "/64dac7aa4f16a076128e9cdd/pair/"+
                divisaBase+ "/" +
                divisaDestino+ "/"+
                valorAConvertir;

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            //System.out.println(json);

            Divisas conversorER = gson.fromJson(json,Divisas.class);
           // System.out.println(conversorER);
            System.out.println("El valor convertido a la divisa es: " + conversorER.conversion_result());


        } catch(Exception e){
            e.getMessage();
        }
    }
}
