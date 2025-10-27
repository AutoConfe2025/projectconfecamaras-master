package com.co.confecamaras.tasks.utils;

import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.serenitybdd.annotations.Step;
import org.json.JSONObject;
import org.junit.Assert;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class LeerJson implements Task {
    private final String url;
    private final String[] keys;

    public LeerJson(String url, String... keys) {
        this.url = url;
        this.keys = keys;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            //Intentara leer el Json como un string haciendo conexion con la url
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setRequestMethod("GET");

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();

            String inputLine;
            while ((inputLine = bufferedReader.readLine()) != null) {
                response.append(inputLine);
            }
            bufferedReader.close();

            //Convertira a objeto JsonObj el json leido
            JSONObject jsonObject = new JSONObject(response.toString());

            //Iterara por cada key almacenando el valor si existe
            for (String key : keys) {
                if (jsonObject.has(key)){
                    Object valor = jsonObject.get(key);
                    Reportes.reportEvent(Reportes.PASSED, "Valor del key [" + key.toUpperCase() + "]: " + valor.toString());
                }else{
                    Reportes.reportEvent(Reportes.WARNING, "No se encontro la key: [" + key.toUpperCase() + "] en el Json");

                }
            }

        } catch (Exception e) {
            Reportes.reportEvent(Reportes.FAILED, e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    public static LeerJson leer(String url, String... keys) {
        return new LeerJson(url, keys);
    }
}
