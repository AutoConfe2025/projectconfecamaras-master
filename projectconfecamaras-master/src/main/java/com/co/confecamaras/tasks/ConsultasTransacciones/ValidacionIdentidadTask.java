package com.co.confecamaras.tasks.ConsultasTransacciones;

import com.co.confecamaras.interactions.News.*;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.userinterfaces.consultasytransacciones.ValidacionIdentidadPage;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import com.co.confecamaras.utils.constantes.bandeja.ValidacionIdentidadConstantes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

public class ValidacionIdentidadTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectFromOptions.byVisibleText(ValidacionIdentidadConstantes.TIPO_IDENTIFICACION).from(ValidacionIdentidadPage.SLC_TIPO_IDENTIFICACION),
                Enter.theValue(ValidacionIdentidadConstantes.NUMERO_IDENTIFICACION).into(ValidacionIdentidadPage.INP_NUMERO_IDENTIFICACION)
        );

        if (ValidacionIdentidadConstantes.ACEPTAR_TERMINOS.equalsIgnoreCase("si")) {
            actor.attemptsTo(
                    JavaScriptClick.on(ValidacionIdentidadPage.CHK_TRATAMIENTO_DATOS),
                    JavaScriptClick.on(ValidacionIdentidadPage.CHK_TERMINOS_CONDICIONES),
                    Click.on(ValidacionIdentidadPage.BTN_CONTINUAR_VI),
                    ManagePageAlert.accept(ValidacionIdentidadPage.ALERT1_VI, ValidacionIdentidadPage.BTN_CERRAR_VI),
                    WaitInteractions.untilAppears(ValidacionIdentidadPage.TITLE_VALIDACION),
                    Enter.theValue(ValidacionIdentidadConstantes.FECHA_EXPEDICION).into(ValidacionIdentidadPage.INP_FECHA_EXPEDICION)
            );

            String[] nombre = ValidacionIdentidadConstantes.NOMBRE_COMPLETO.split(" ");
            if (nombre.length > 2)
                actor.attemptsTo(
                        Enter.theValue(nombre[0]).into(ValidacionIdentidadPage.INP_PRIMER_NOMBRE),
                        Enter.theValue(nombre[1]).into(ValidacionIdentidadPage.INP_SEGUNDO_NOMBRE),
                        Enter.theValue(nombre[2]).into(ValidacionIdentidadPage.INP_PRIMER_APELLIDO),
                        Enter.theValue(nombre[3]).into(ValidacionIdentidadPage.INP_SEGUNDO_APELLIDO)
                );
            else
                actor.attemptsTo(
                        Enter.theValue(nombre[0]).into(ValidacionIdentidadPage.INP_PRIMER_NOMBRE),
                        Enter.theValue(nombre[1]).into(ValidacionIdentidadPage.INP_PRIMER_APELLIDO)
                );

            String[] pregunta = ValidacionIdentidadPage.LABEL_PREGUNTA.resolveFor(actor).getText().split(" ");
            System.out.println("NUMEROS ECONTRADOS PARA RESPONDER: " + pregunta[3] + " " + pregunta[4] + " " + pregunta[5]);
            actor.attemptsTo(
                    Enter.theValue(ValidacionIdentidadConstantes.CORREO_ELECTRONICO).into(ValidacionIdentidadPage.INP_CORREO_ELECTRONICO),
                    Enter.theValue(ValidacionIdentidadConstantes.CORREO_ELECTRONICO).into(ValidacionIdentidadPage.INP_REPETIR_CORREO),
                    Enter.theValue(ValidacionIdentidadConstantes.NUMERO_CELULAR).into(ValidacionIdentidadPage.INP_NUMERO_CELULAR),
                    Enter.theValue(ValidacionIdentidadConstantes.DIRECCION).into(ValidacionIdentidadPage.INP_DIRECCION),
                    SelectFromOptions.byVisibleText(ValidacionIdentidadConstantes.PAIS).from(ValidacionIdentidadPage.SLC_PAIS),
                    SelectFromOptions.byVisibleText(ValidacionIdentidadConstantes.MUNICIPIO).from(ValidacionIdentidadPage.SLC_MUNICIPIO),
                    Enter.theValue(ValidacionIdentidadConstantes.RESULTADO).into(ValidacionIdentidadPage.INP_RESULTADO),
                    LogEvent.recordevent(Reportes.INFO, "Se ha ingresado la información según lo esperado"),
                    Click.on(ValidacionIdentidadPage.BTN_CONTINUAR_VI),
                    WaitInteractions.untilAppears(ValidacionIdentidadPage.ALERT2_VI),
                    ManagePageAlert.accept(ValidacionIdentidadPage.ALERT2_VI, ValidacionIdentidadPage.BTN_OK_VI)
            );
        } else {
            actor.attemptsTo(
                    Click.on(ValidacionIdentidadPage.BTN_CONTINUAR_VI),
                    WaitInteractions.untilAppears(ValidacionIdentidadPage.ALERT2_VI), GetTextOfElement.de(ValidacionIdentidadPage.ALERT2_VI),
                    Click.on(ValidacionIdentidadPage.BTN_OK_VI),
                    WaitInteractions.untilAppears(ValidacionIdentidadPage.CHK_TRATAMIENTO_DATOS),
                    JavaScriptClick.on(ValidacionIdentidadPage.CHK_TRATAMIENTO_DATOS),
                    Click.on(ValidacionIdentidadPage.BTN_CONTINUAR_VI),
                    WaitInteractions.untilAppears(ValidacionIdentidadPage.ALERT2_VI), GetTextOfElement.de(ValidacionIdentidadPage.ALERT2_VI),
                    Click.on(ValidacionIdentidadPage.BTN_OK_VI)
            );
        }
    }

    public static ValidacionIdentidadTask validar() {
        return new ValidacionIdentidadTask();
    }

}
