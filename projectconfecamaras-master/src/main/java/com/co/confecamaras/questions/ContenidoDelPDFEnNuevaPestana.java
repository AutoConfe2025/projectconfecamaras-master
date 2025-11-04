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
import java.util.Set;

public class ContenidoDelPDFEnNuevaPestana implements Question<String> {

    private static final Logger logger = LoggerFactory.getLogger(ContenidoDelPDFEnNuevaPestana.class);
    private final String originalWindowHandle;

    public ContenidoDelPDFEnNuevaPestana(String originalWindowHandle) {
        this.originalWindowHandle = originalWindowHandle;
    }

    @Override
    public String answeredBy(Actor actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();


        Set<String> currentHandles = driver.getWindowHandles();
        currentHandles.remove(originalWindowHandle);

        if (currentHandles.isEmpty()) {
            throw new RuntimeException("No se encontró una nueva pestaña abierta para el PDF.");
        }


        String newWindowHandle = currentHandles.iterator().next();
        driver.switchTo().window(newWindowHandle);

        String pdfUrl = driver.getCurrentUrl();
        logger.info("URL del PDF encontrada: {}", pdfUrl);
        String contenidoPDF = leerContenidoPDFDesdeURL(pdfUrl);


        driver.close();
        driver.switchTo().window(originalWindowHandle);

        return contenidoPDF;
    }


    public static ContenidoDelPDFEnNuevaPestana es(String originalHandle) {
        return new ContenidoDelPDFEnNuevaPestana(originalHandle);
    }


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