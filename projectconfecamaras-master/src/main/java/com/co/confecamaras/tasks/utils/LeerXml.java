package com.co.confecamaras.tasks.utils;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Assert;

import java.io.IOException;
import java.net.URL;

public class LeerXml implements Task {

    private final String urlXml;

    public LeerXml(String urlXml) {
        this.urlXml = urlXml;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            // 🔹 Cargar el XML o HTML desde la URL abierta
            Document doc = Jsoup.parse(new URL(urlXml), 10000);

            // 🔹 Validar que el documento contiene el tag raíz o un elemento esperado
            boolean contieneFactura = doc.toString().contains("<Factura") || doc.toString().contains("<?xml");

            Assert.assertTrue("El archivo XML no contiene una estructura esperada.", contieneFactura);

            System.out.println("✅ XML leído correctamente desde: " + urlXml);

        } catch (IOException e) {
            Assert.fail("Error al leer el XML desde la URL: " + e.getMessage());
        }
    }
}
