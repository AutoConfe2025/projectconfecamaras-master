package com.co.confecamaras.interactions;

import com.google.zxing.*;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.time.Duration;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ReadQrCode implements Interaction {

    private final Target imagenQr;
    public static WebDriver externalDriver;
    public static ChromeDriverService service;

    public ReadQrCode(Target imagenQr) {
        this.imagenQr = imagenQr;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Scroll.to(imagenQr));

        // Obtener base64 del QR
        String src = imagenQr.resolveFor(actor).getAttribute("src");

        String base64Part;
        try {
            base64Part = src.split(",")[1];
        } catch (Exception e) {
            throw new RuntimeException("El atributo src del QR no contiene base64 válido: " + src, e);
        }

        String qrLink;
        try {
            byte[] bytes = javax.xml.bind.DatatypeConverter.parseBase64Binary(base64Part);
            BufferedImage bufferedImage = ImageIO.read(new ByteArrayInputStream(bytes));
            LuminanceSource source = new BufferedImageLuminanceSource(bufferedImage);
            BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
            Result result = new MultiFormatReader().decode(bitmap);
            qrLink = result.getText();

        } catch (Exception e) {
            throw new RuntimeException("Error decodificando QR: ", e);
        }

        try {
            // Iniciar servicio ChromeDriver independiente
            service = new ChromeDriverService.Builder()
                    .usingPort(9515)          // puerto diferente al de Serenity
                    .build();

            service.start();

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");

            externalDriver = new RemoteWebDriver(service.getUrl(), options);
            externalDriver.get(qrLink);

            new WebDriverWait(externalDriver, Duration.ofSeconds(30))
                    .until(d -> ((org.openqa.selenium.JavascriptExecutor) d)
                            .executeScript("return document.readyState").equals("complete"));

        } catch (Exception e) {
            throw new RuntimeException("ERROR iniciando navegador externo", e);
        }
    }

    public static ReadQrCode inThePage(Target imagenQr) {
        return instrumented(ReadQrCode.class, imagenQr);
    }
}
