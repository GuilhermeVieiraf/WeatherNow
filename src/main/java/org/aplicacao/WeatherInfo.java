package org.aplicacao;

public class WeatherInfo {
    private String nomeCidade;
    private String descricao;
    private double temperatura;
    private int umidade;
    private double velocidadeVento;

    public WeatherInfo(String nomeCidade, String descricao, double temperatura, int umidade, double velocidadeVento) {
        this.nomeCidade = nomeCidade;
        this.descricao = descricao;
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.velocidadeVento = velocidadeVento;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public int getUmidade() {
        return umidade;
    }

    public double getVelocidadeVento() {
        return velocidadeVento;
    }
}
