package com.co.confecamaras.interactions;

import com.google.zxing.*;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Scroll;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;

import com.google.zxing.common.HybridBinarizer;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.JavascriptExecutor;

import static net.serenitybdd.screenplay.Tasks.*;

public class ReadQrCode implements Interaction {

    private Target imagenQr;

    public ReadQrCode(Target imagenQr) {
        this.imagenQr = imagenQr;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        System.out.println(imagenQr.resolveFor(actor).isCurrentlyVisible());
        actor.attemptsTo(Scroll.to(imagenQr));
        String qrCodeFileUrl = imagenQr.resolveFor(actor).getAttribute("src");
        System.out.println("QR Code Image URL is: "+ qrCodeFileUrl);
        String textInQrCode = "";
        String base64Image = qrCodeFileUrl.split(",")[1];
        byte[] imageBytes = javax.xml.bind.DatatypeConverter.parseBase64Binary(base64Image);
        try {
            //URL urlOfImage = new URL(qrCodeFileUrl);
            //BufferedImage bufferedImage = ImageIO.read(urlOfImage);
            BufferedImage bufferedImage = ImageIO.read(new ByteArrayInputStream(imageBytes));
            LuminanceSource luminanceSource = new BufferedImageLuminanceSource(bufferedImage);
            BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(luminanceSource));
            Result result = new MultiFormatReader().decode(binaryBitmap);
            textInQrCode = result.getText();
        } catch (IOException | NotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("The Text in QR Code is: "+textInQrCode);
        JavascriptExecutor jse = (JavascriptExecutor) BrowseTheWeb.as(actor).getDriver();
        jse.executeScript("window.open('');");
        actor.attemptsTo(Switch.toNewWindow());
        BrowseTheWeb.as(actor).getDriver().get(textInQrCode);
    }

    public static ReadQrCode inThePage(Target imagenQr) {
        return instrumented(ReadQrCode.class, imagenQr);
    }
}