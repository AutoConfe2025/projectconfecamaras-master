package com.co.confecamaras.interactions;

import com.google.zxing.*;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.*;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.util.Map;

public class ReadQrCodeMobile implements Interaction {

    private final Target qrTarget;

    public ReadQrCodeMobile(Target qrTarget) {
        this.qrTarget = qrTarget;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = Serenity.getDriver();

        if (!(driver instanceof ChromeDriver)) {
            throw new IllegalStateException("Este método solo funciona con ChromeDriver");
        }

        ChromeDriver chromeDriver = (ChromeDriver) driver;

        // Activar emulación mobile
        Map<String, Object> deviceMetrics = Map.of(
                "width", 375,
                "height", 812,
                "pixelRatio", 3.0
        );
        Map<String, Object> mobileEmulation = Map.of(
                "deviceMetrics", deviceMetrics,
                "userAgent", "Mozilla/5.0 (iPhone; CPU iPhone OS 13_6 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/13.1.2 Mobile/15E148 Safari/604.1"
        );
        chromeDriver.executeCdpCommand("Emulation.setDeviceMetricsOverride", mobileEmulation);

        try {
            Thread.sleep(1000); // espera a que cargue el QR

            // Tomar screenshot del QR
            WebElement qrElement = qrTarget.resolveFor(actor).findElement(By.xpath("."));
            byte[] screenshot = qrElement.getScreenshotAs(OutputType.BYTES);
            BufferedImage bufferedImage = ImageIO.read(new ByteArrayInputStream(screenshot));

            // Leer QR
            LuminanceSource source = new BufferedImageLuminanceSource(bufferedImage);
            BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
            Result result = new MultiFormatReader().decode(bitmap);

            String qrText = result.getText();
            System.out.println("QR Code Value: " + qrText);

            // Abrir URL del QR en nueva pestaña
            if (qrText.startsWith("http")) {
                ((JavascriptExecutor) driver).executeScript("window.open(arguments[0], '_blank');", qrText);
                // Cambiar a la nueva pestaña
                for (String handle : driver.getWindowHandles()) {
                    driver.switchTo().window(handle);
                }
            }

        } catch (NotFoundException e) {
            System.out.println("No se encontró ningún QR en la imagen");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ReadQrCodeMobile from(Target qrTarget) {
        return Tasks.instrumented(ReadQrCodeMobile.class, qrTarget);
    }
}
