package com.co.confecamaras.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.junit.Assert;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class PdfVal implements Interaction {

    public void lecturaPdf() throws InterruptedException, IOException {

try {

        URL url = new URL(GetNewUrl.newUrl);
        URLConnection urlConnection = url.openConnection();
        urlConnection.addRequestProperty("User-Agent", "Mozilla");
        InputStream ip = urlConnection.getInputStream();
        BufferedInputStream bf = new BufferedInputStream(ip);

        PDDocument pdDocument = PDDocument.load(bf);

        int pageCount = pdDocument.getNumberOfPages();
        System.out.println("pages count: " + pageCount);
        Assert.assertEquals(pageCount, 1);

        System.out.println("------meta data of pdf-------");
        System.out.println(pdDocument.getVersion());
        System.out.println(pdDocument.getCurrentAccessPermission().canPrint());
        System.out.println(pdDocument.getCurrentAccessPermission().isReadOnly());
        System.out.println(pdDocument.getCurrentAccessPermission().isOwnerPermission());

        System.out.println(pdDocument.getDocumentInformation().getSubject());
        System.out.println(pdDocument.getDocumentInformation().getTitle());
        System.out.println(pdDocument.getDocumentInformation().getCreator());
        System.out.println(pdDocument.getDocumentInformation().getCreationDate());

        System.out.println(pdDocument.isEncrypted());
        System.out.println(pdDocument.getDocumentId());


        PDFTextStripper pdfStripper = new PDFTextStripper();
		String pdfFullText = pdfStripper.getText(pdDocument);
		System.out.println(pdfFullText);
		Assert.assertTrue(pdfFullText.contains("CONSTANCIA DE INSCRIPCIÓN EN LOS REGISTROS PÚBLICOS"));

        pdfStripper.setStartPage(1);
        String pdfPageText = pdfStripper.getText(pdDocument);
        System.out.println(pdfPageText);

        pdDocument.close();
} catch (Exception e){
    System.out.println("ERROR LECTURA"+e);
}
    }

    public static PdfVal session() {
        return new PdfVal();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            lecturaPdf();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
