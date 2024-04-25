import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class principal {

    public static void main(String[] args) throws IOException, InterruptedException {

        int salir = 1;

        String menu = """
                *** BIENVENIDO AL CONVERSOR DE MONEDAS ***
                1.- USD a MXN
                2.- MXN a USD
                3.- USD a ARS
                4.- ARS a USD
                5.- USD a BRL
                6.- BRL a USD
                7.- SALIR
                ******************************************
                --- elije una opcion CORRECTA ---
                """;

        while (salir !=2){
        System.out.println(menu);

        Scanner opcion = new Scanner(System.in);
        int opcion1 = opcion.nextInt();


            Scanner cantidad = new Scanner(System.in);
            System.out.println("cantidad a cambiar");
            double cantidad1 = cantidad.nextDouble();

            switch (opcion1){
                case 1:
                    HttpClient client1 = HttpClient.newHttpClient();
                    HttpRequest request1 = HttpRequest.newBuilder()
                            .uri(URI.create("https://v6.exchangerate-api.com/v6/1ad88c1c8b2ea169c4e32ec8/pair/USD/MXN"))
                            .build();

                    HttpResponse<String> response = client1
                            .send(request1, HttpResponse.BodyHandlers.ofString());

                    String json = response.body();
                    //System.out.println(json);

                    double usd1;
                    usd1= cantidad1;

                    Gson gson = new Gson();
                    conversion_rate miConversion = gson.fromJson(json, conversion_rate.class);
                    //System.out.println("su cambio es : " + miConversion.conversion_rate());

                    double mx1;
                    mx1 = miConversion.conversion_rate();

                    double resultado;
                    resultado = usd1 * mx1;
                    System.out.println("el cambio es de: " + resultado +" " +"USD");

                    break;


                case 2:
                    double mx2;
                    mx2= cantidad1;

                    HttpClient client2 = HttpClient.newHttpClient();
                    HttpRequest request2 = HttpRequest.newBuilder()
                            .uri(URI.create("https://v6.exchangerate-api.com/v6/1ad88c1c8b2ea169c4e32ec8/pair/MXN/USD"))
                            .build();
                    HttpResponse<String> response2 = client2
                            .send(request2, HttpResponse.BodyHandlers.ofString());

                    String jsonMX = response2.body();
                    //System.out.println(json);



                    Gson gsonmx = new Gson();
                    conversion_rate miConversionmx = gsonmx.fromJson(jsonMX, conversion_rate.class);
                    //System.out.println("su cambio es : " + miConversion.conversion_rate());

                    double usd2;
                    usd2 = miConversionmx.conversion_rate();

                    double resultadomx;
                    resultado = usd2 * mx2;
                    System.out.println("el cambio es de: " + resultado +" " +"MXN");
                    break;

                case  3:
                    double usd3;
                    usd3= cantidad1;

                    HttpClient client3 = HttpClient.newHttpClient();
                    HttpRequest request3 = HttpRequest.newBuilder()
                            .uri(URI.create("https://v6.exchangerate-api.com/v6/1ad88c1c8b2ea169c4e32ec8/pair/USD/ARS"))
                            .build();
                    HttpResponse<String> response3 = client3
                            .send(request3, HttpResponse.BodyHandlers.ofString());

                    String jsonUSDARS = response3.body();
                    //System.out.println(json);

                    Gson gsonUSDARS = new Gson();
                    conversion_rate miConversionUASDARS = gsonUSDARS.fromJson(jsonUSDARS, conversion_rate.class);
                    //System.out.println("su cambio es : " + miConversion.conversion_rate());

                    double arg1;
                    arg1 = miConversionUASDARS.conversion_rate();

                    double resultadoUSDARS;
                    resultado = usd3 * arg1;
                    System.out.println("el cambio es de: " + resultado +" " +"USD");
                    break;

                case  4:

                    double arg2;
                    arg2= cantidad1;

                    HttpClient client4 = HttpClient.newHttpClient();
                    HttpRequest request4 = HttpRequest.newBuilder()
                            .uri(URI.create("https://v6.exchangerate-api.com/v6/1ad88c1c8b2ea169c4e32ec8/pair/ARS/USD"))
                            .build();
                    HttpResponse<String> response4 = client4
                            .send(request4, HttpResponse.BodyHandlers.ofString());

                    String json4 = response4.body();
                    //System.out.println(json);

                    Gson gson4 = new Gson();
                    conversion_rate miConversion4 = gson4.fromJson(json4, conversion_rate.class);
                    //System.out.println("su cambio es : " + miConversion.conversion_rate());

                    double usd4;
                    usd4 = miConversion4.conversion_rate();

                    double resultado4;
                    resultado = usd4 * arg2;
                    System.out.println("el cambio es de: " + resultado +" " +"ARS");
                    break;

                case 5:

                    HttpClient client5 = HttpClient.newHttpClient();
                    HttpRequest request5 = HttpRequest.newBuilder()
                            .uri(URI.create("https://v6.exchangerate-api.com/v6/1ad88c1c8b2ea169c4e32ec8/pair/USD/BRL"))
                            .build();
                    HttpResponse<String> response5 = client5
                            .send(request5, HttpResponse.BodyHandlers.ofString());

                    String json5 = response5.body();
                    //System.out.println(json);

                    double usd5;
                    usd5= cantidad1;

                    Gson gson5 = new Gson();
                    conversion_rate miConversion5 = gson5.fromJson(json5, conversion_rate.class);
                    //System.out.println("su cambio es : " + miConversion.conversion_rate());

                    double brl1;
                    brl1 = miConversion5.conversion_rate();

                    double resultado5;
                    resultado = usd5 * brl1;
                    System.out.println("el cambio es de: " + resultado +" " +"USD");
                    break;

                case 6:

                    HttpClient client6 = HttpClient.newHttpClient();
                    HttpRequest request6 = HttpRequest.newBuilder()
                            .uri(URI.create("https://v6.exchangerate-api.com/v6/1ad88c1c8b2ea169c4e32ec8/pair/BRL/USD"))
                            .build();
                    HttpResponse<String> response6 = client6
                            .send(request6, HttpResponse.BodyHandlers.ofString());

                    String json6 = response6.body();
                    //System.out.println(json);

                    double brl2;
                    brl2= cantidad1;

                    Gson gson6 = new Gson();
                    conversion_rate miConversion6 = gson6.fromJson(json6, conversion_rate.class);
                    //System.out.println("su cambio es : " + miConversion.conversion_rate());

                    double usd6;
                    usd6 = miConversion6.conversion_rate();

                    double resultado6;
                    resultado = usd6 * brl2;
                    System.out.println("el cambio es de: " + resultado +" " +"BRL");
                    break;
            }
            Scanner teclado = new Scanner(System.in);
            System.out.println("preess 1 to exit");
            salir = teclado.nextInt();

        }
    }
}

















