package org.aplicacao;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WeatherService implements WeatherServiceInterface {

    private final String API_KEY = Config.get("openweather.api.key");

    @Override
    public WeatherInfo buscarClima(String cidade) throws Exception {
        String cidadeFormatada = java.net.URLEncoder.encode(cidade, "UTF-8");
        String urlString = String.format(
                "https://api.openweathermap.org/data/2.5/weather?q=%s&appid=%s&units=metric&lang=pt_br",
                cidadeFormatada, API_KEY
        );


        URL url = new URL(urlString);
        HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
        conexao.setRequestMethod("GET");

        int responseCode = conexao.getResponseCode();

        if (responseCode == 200) {
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(conexao.getInputStream())
            );
            String inputLine;
            StringBuilder resposta = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                resposta.append(inputLine);
            }
            in.close();

            JSONObject json = new JSONObject(resposta.toString());

            String nomeCidade = json.getString("name");
            JSONArray weatherArray = json.getJSONArray("weather");
            String descricao = weatherArray.getJSONObject(0).getString("description");
            double temperatura = json.getJSONObject("main").getDouble("temp");
            int umidade = json.getJSONObject("main").getInt("humidity");
            double vento = json.getJSONObject("wind").getDouble("speed");

            return new WeatherInfo(nomeCidade, descricao, temperatura, umidade, vento);
        } else if (responseCode == 404) {
            throw new Exception("Cidade não encontrada.");
        } else {
            throw new Exception("Erro ao buscar dados do clima (código " + responseCode + ")");
        }
    }
}
