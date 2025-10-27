package com.co.confecamaras.interactions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.screenplay.rest.interactions.Post;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.junit.Assert;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import static net.serenitybdd.screenplay.Tasks.*;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CapturaUrlPdf implements Interaction {

    private static final String URLPDF = "https://sii3qa.confecamaras.co/controlador/Route.php";
    private static final String RESOURCE = "";


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.whoCan(CallAnApi.at(URLPDF));

        actor.attemptsTo(
                Post.to(RESOURCE)
                        .with(requestSpecification -> requestSpecification
                                .headers("cookie","PHPSESSID=psrkqgt3nou6bmtprksfij6pk8;")
                                .headers("content-type","application/x-www-form-urlencoded; charset=UTF-8")
                                .body("libro=RM15&registro=347120&dupli=01&x_c=c0wAzPidXIMgc&y_c=c0nS/quVMjBZk")
                                .relaxedHTTPSValidation().log().all())
        );
        assertThat(SerenityRest.lastResponse().statusCode()).isEqualTo(200);

        try {
            textPdfDos();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void textPdfDos() throws IOException {

        String response = SerenityRest.lastResponse().jsonPath().get("link");
        System.out.println("Este es el link:" + response);
        URL url = new URL(response);

        InputStream is = url.openStream();
        BufferedInputStream fileParse = new BufferedInputStream(is);
        PDDocument document = null;

        document = PDDocument.load(fileParse);
        String pdfContent = new PDFTextStripper().getText(document);
        System.out.println(pdfContent);

        Assert.assertTrue(pdfContent.contains("CAMARA DE COMERCIO CORE QA 20"));
    }

    public static CapturaUrlPdf urlPdf(){
        return instrumented(CapturaUrlPdf.class);
    }
}