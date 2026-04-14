package com.co.confecamaras.tasks.registro_publico;

import com.co.confecamaras.interactions.FileRobotUpload;
import com.co.confecamaras.interactions.FileUploadLimpio;
import com.co.confecamaras.interactions.JsEvent;
import com.co.confecamaras.interactions.alerts;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.registros_publicos.ReingresoTramiteRuesPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ReingresoTramiteRues implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CAMPO_NUC, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_NUC),
                Enter.theValue("20260000171").into(CAMPO_NUC),
                Click.on(BOTON_CONSULTAR_NUC),
                WaitUntil.the(CAMPO_NOMBRE_COMPLETO, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_NOMBRE_COMPLETO),
                Enter.theValue("RIOS MARIN ALAN").into(CAMPO_NOMBRE_COMPLETO),
                Click.on(LISTA_TIPO_DOCUMENTO),
                WaitUntil.the(OPCION_CE_TIPO_DOCUMENTO, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(OPCION_CE_TIPO_DOCUMENTO),
                Click.on(CAMPO_NUMERO_DE_IDENTIFICACION),
                Enter.theValue("6536673Y").into(CAMPO_NUMERO_DE_IDENTIFICACION),
                Click.on(CAMPO_FECHA_EXPEDICION),
                Enter.theValue("20250101").into(CAMPO_FECHA_EXPEDICION),
                Click.on(CAMPO_EMAIL),
                Enter.theValue("analistaqa@confecamaras.org.co").into(CAMPO_EMAIL),
                Click.on(CAMPO_TELEFONO_FIJO),
                Enter.theValue("6707475").into(CAMPO_TELEFONO_FIJO),
                Click.on(CAMPO_CELULAR),
                Enter.theValue("3165376606").into(CAMPO_CELULAR),
                Scroll.to(BOTON_TOMAR_FOTO),
                Click.on(BOTON_TOMAR_FOTO),
                Click.on(BOTON_CARA1_CEDULA),
                Click.on(BOTON_CARA2_CEDULA),
                Scroll.to(BOTON_CARGAR_DOCUMENTO),
                Click.on(BOTON_CARGAR_DOCUMENTO),
                FileRobotUpload.withPath(FileUploadLimpio.archivoDoc()),
                alerts.toAlert(),
                WaitUntil.the(BOTON_DOCUMENTO_CARGADO, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_DOCUMENTO_CARGADO)
        );
    }

    public static ReingresoTramiteRues flujoValidaRues() {
        return new ReingresoTramiteRues();
    }
}
