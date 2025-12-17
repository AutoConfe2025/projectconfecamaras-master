package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class ContenidoDelPDFEnMismaPestana implements Question<String> {

    private static final Logger logger = LoggerFactory.getLogger(ContenidoDelPDFEnMismaPestana.class);

    @Override
    public String answeredBy(Actor actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();

        // 1. Obtener la URL actual (el actor ya está en la URL del PDF)
        String pdfUrl = driver.getCurrentUrl();
        logger.info("URL del PDF encontrada: {}", pdfUrl);

        // 2. Leer y extraer el contenido del PDF desde la URL
        return leerContenidoPDFDesdeURL(pdfUrl);
    }

    public static ContenidoDelPDFEnMismaPestana es () {
        // La clase se llama ContenidoDelPDFEnMismaPestana.
        return new ContenidoDelPDFEnMismaPestana();
    }

    /**
     * Reutiliza la lógica de lectura de PDFBox, pero sin el manejo de ventanas.
     */
    private String leerContenidoPDFDesdeURL(String urlString) {
        try (InputStream is = new URL(urlString).openStream();
             PDDocument document = PDDocument.load(is)) {

            PDFTextStripper pdfStripper = new PDFTextStripper();
            return pdfStripper.getText(document);

        } catch (IOException e) {
            logger.error("Error al leer el contenido del PDF desde la URL: {}", urlString, e);
            throw new RuntimeException("Fallo al procesar el PDF: " + e.getMessage());
        }
    }
}