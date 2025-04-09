package org.aplicacao;

import java.io.InputStream;
import java.util.Properties;

public class Config {
    public static String get(String chave) {
        try (InputStream input = Config.class.getClassLoader().getResourceAsStream("config.properties")) {
            Properties prop = new Properties();
            prop.load(input);
            return prop.getProperty(chave);
        } catch (Exception e) {
            System.out.println("Erro ao carregar configuração: " + e.getMessage());
            return null;
        }
    }
}
