package com.co.confecamaras.tasks.registro_publico;

import com.co.confecamaras.interactions.*;
import com.co.confecamaras.userinterfaces.FirmadoManuscritoSobre;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.co.confecamaras.userinterfaces.mantenimientoeinformes.FirmaRegistrolMercantilEsadl.BOTON_FIRMAR;
import static com.co.confecamaras.userinterfaces.registros_publicos.PageCambioDomicilio.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

@AllArgsConstructor
public class CambioDomicilio implements Task {

    private final String nit;

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(CAMPO_NIT, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_NIT),
                Enter.theValue(nit).into(CAMPO_NIT),
                Click.on(BOTON_CONSULTAR_NIT)
        );

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        String clave = Target.the("clave de recuperación")
                .locatedBy("//small[@id='recuperacion']")
                .resolveFor(actor)
                .getText();

        System.out.println("Clave obtenida: " + clave);

        actor.remember("clave", clave);

        actor.attemptsTo(

                WaitUntil.the(BOTON_FIRMA_MANUSCRITA, isPresent()).forNoMoreThan(400).seconds(),
                Scroll.to(BOTON_FIRMA_MANUSCRITA),
                Click.on(BOTON_FIRMA_MANUSCRITA),
                Click.on(CAMPO_CORREO_ELECTRONICO),
                Enter.theValue("analistaqa@confecamaras.org.co").into(CAMPO_CORREO_ELECTRONICO),
                Click.on(LISTA_TIPO_IDENTIFICACION),
                Click.on(OPCION_CEDULA_LISTA_TIPO_IDENTIFICACION),
                Click.on(CAMPO_CELULAR),
                Enter.theValue("3166537660").into(CAMPO_CELULAR),
                Click.on(BOTON_GENERAR_QR),
                ReadQrCode.inThePage(IMG_QR_FIRMA)
        );

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        actor.attemptsTo(
                DoFirmaSobreCanvas.enElCanvas("//canvas[@data-testid='canvas-element']"),
                ContinueMainFlow.now()
        );



    }

    public static CambioDomicilio cambioDomicilioQr(String nit) {
        return new CambioDomicilio(nit);
    }
}
