package com.co.confecamaras.interactions.leerpdf;

import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Actor;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import java.io.IOException;
import java.net.URL;

public class LeerContenidoDelPDF implements Interaction {
    private String url;

    public LeerContenidoDelPDF(String url) {
        this.url = url;
        System.out.println("URL recibida: " + url); // Verifica qué URL se pasa
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            PDDocument document = PDDocument.load(new URL(url).openStream());
            PDFTextStripper pdfStripper = new PDFTextStripper();
            String text = pdfStripper.getText(document);
            document.close();
            actor.remember("textoPDF", text);
        } catch (IOException e) {
            throw new RuntimeException("No se pudo leer el PDF desde la URL: " + url, e);
        }
    }

    public static LeerContenidoDelPDF desde(String url) {
        return new LeerContenidoDelPDF(url);
    }
}
