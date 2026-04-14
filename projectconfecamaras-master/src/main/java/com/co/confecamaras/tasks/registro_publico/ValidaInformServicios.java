package com.co.confecamaras.tasks.registro_publico;

import com.co.confecamaras.interactions.EnterRobot;
import com.co.confecamaras.interactions.News.PressKey;
import com.co.confecamaras.interactions.WaitInterrupted3Segundos;
import com.co.confecamaras.utils.sikulli.SafeActions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static com.co.confecamaras.userinterfaces.registros_publicos.InfoemesPorServicios.*;
import static com.co.confecamaras.userinterfaces.sikuli.informe_resumido_servicios.Principal.BOTON_BUSQUEDA_USUARIO;
import static com.co.confecamaras.userinterfaces.sikuli.informe_resumido_servicios.Principal.SELECCION_USUARIO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class ValidaInformServicios implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                WaitUntil.the(CAMPO_FECHA_INICIAL_RESUMIDO_SERVICIOS, isPresent()).forNoMoreThan(10).seconds(),

                Enter.theValue("01/01/2026").into(CAMPO_FECHA_INICIAL_RESUMIDO_SERVICIOS),
                Enter.theValue("31/01/2026").into(CAMPO_FECHA_FINAL_RESUMIDO_SERVICIOS),

                Click.on(LISTA_SELECCION_USUARIO),
                WaitUntil.the(CAMPO_BUSQUEDA_USUARIO, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_BUSQUEDA_USUARIO),
                Enter.theValue("CAJA").into(CAMPO_BUSQUEDA_USUARIO),
                WaitUntil.the(SELECCION_OPCION_0, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(SELECCION_OPCION_0),

                WaitInterrupted3Segundos.esperaConstante3(),
                Click.on(BOTON_CONSULTAR_INFORME_RESUMIDO),
                WaitUntil.the(OPCION_SI_CAMPO_IMPORTANTE, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(OPCION_SI_CAMPO_IMPORTANTE),
                WaitUntil.the(BOTON_CERRAR, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_CERRAR)
        );
    }

    public static ValidaInformServicios validaInforme() {
        return new ValidaInformServicios();
    }
}
