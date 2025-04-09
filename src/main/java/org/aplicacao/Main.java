package org.aplicacao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WeatherServiceInterface weatherService = new WeatherService();

        System.out.println("WeatherNow");
        System.out.print("Digite o nome da cidade: ");
        String cidade = scanner.nextLine();

        try {
            WeatherInfo info = weatherService.buscarClima(cidade);

            System.out.println("\nClima em " + info.getNomeCidade() + ":");
            System.out.println("- Descrição: " + info.getDescricao());
            System.out.println("- Temperatura: " + info.getTemperatura() + "°C");
            System.out.println("- Umidade: " + info.getUmidade() + "%");
            System.out.println("- Vento: " + info.getVelocidadeVento() + " m/s");

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
