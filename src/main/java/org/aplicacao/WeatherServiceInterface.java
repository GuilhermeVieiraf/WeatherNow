package org.aplicacao;

public interface WeatherServiceInterface {
    WeatherInfo buscarClima(String cidade) throws Exception;
}
