package com.co.confecamaras.tasks.registro_publico;

import com.co.confecamaras.questions.bandeja.estudio_general.ValidaComentarioPresente;
import com.co.confecamaras.questions.registros_publicos.ValidaRegistrosPublicos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.general.GeneralPage.BOTON_FIRMAR;
import static com.co.confecamaras.userinterfaces.registros_publicos.FirmadoElectronicoPage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static org.hamcrest.Matchers.is;

public class FlujoFirmadoElectronico implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CAMPO_NUMERO_RECUPERACION,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_NUMERO_RECUPERACION),
                Enter.theValue("UBHZRX").into(CAMPO_NUMERO_RECUPERACION),
                Click.on(CAMPO_EMAIL_FIRMANTE),
                Enter.theValue("frojas@confecaramas.org.co").into(CAMPO_EMAIL_FIRMANTE),
                Click.on(CAMPO_IDENTIFICACION_FIRMANTE),
                Enter.theValue("11314260").into(CAMPO_IDENTIFICACION_FIRMANTE),
                Click.on(CAMPO_NOMBRE_FIRMANTE),
                Enter.theValue("FRANCISCO").into(CAMPO_NOMBRE_FIRMANTE),
                Click.on(CAMPO_CELULAR_FIRMANTE),
                Enter.theValue("3107649396").into(CAMPO_CELULAR_FIRMANTE),
                Click.on(CAMPO_CLAVE_FIRMANTE),
                Enter.theValue("2837279").into(CAMPO_CLAVE_FIRMANTE),
                SelectFromOptions.byValue("A").from(LISTA_AMBIENTE),
                SelectFromOptions.byValue("N").from(LISTA_AFECTAR_LIQUIDACION),
                SelectFromOptions.byValue("no").from(LISTA_CONTROL_FIRMANTE),
                Click.on(BOTON_FIRMAR)
        );

        actor.should(
                seeThat("La tarjeta de comentarios es visible",
                        ValidaComentarioPresente.tarjetaCompleta(), is(true))
        );
    }

    public static FlujoFirmadoElectronico firmadoElectronico(){
        return new FlujoFirmadoElectronico();
    }
}
