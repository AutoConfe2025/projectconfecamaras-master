package com.co.confecamaras.tasks.proponentes;

import com.co.confecamaras.interactions.*;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Map;

import static com.co.confecamaras.userinterfaces.ExpedientesUI.*;


public class CargaContratosRup implements Task {

    public final Map<String, String> data;

    public CargaContratosRup(Map<String, String> data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInterrupted2Segundos.esperaConstante2(),
                WaitInteractions.untilBeEnable(SELECT_CONSULTA_POR_EXPEDIENTES),
                SelectFromOptions.byVisibleText("Proponente").from(SELECT_CONSULTA_POR_EXPEDIENTES),
                WaitInteractions.untilBeEnable(TXT_INGRESAR_INFORMACION_EXPEDIENTES),
                Enter.theValue(data.get("Proponente")).into(TXT_INGRESAR_INFORMACION_EXPEDIENTES),
                Click.on(BTN_CONTINUAR_EXPEDIENTES),
                WaitInteractions.untilBeEnable(BTN_ACCIONES_DISPONIBLES_EXPEDIENTES),
                Click.on(BTN_ACCIONES_DISPONIBLES_EXPEDIENTES),
                WaitInteractions.untilBeEnable(BTN_OPERACIONES_PROPONENTES_EXPEDIENTES),
                Click.on(BTN_OPERACIONES_PROPONENTES_EXPEDIENTES)
        );

        if (actor.asksFor(ElementoElegible.para(BTN_ACTUALIZACION_REGISTRO_PROPONENTES_EXPEDIENTES)))
            actor.attemptsTo(
                    Click.on(BTN_ACTUALIZACION_REGISTRO_PROPONENTES_EXPEDIENTES)
            );
        else if (actor.asksFor(ElementoElegible.para(BTN_INSCRIPCION_PROPONENTE_EXPEDIENTES)))
            actor.attemptsTo(
                    Click.on(BTN_INSCRIPCION_PROPONENTE_EXPEDIENTES)
            );

        actor.attemptsTo(
                /*******Actualizacion # recuperacion RUP************/
                WaitInteractions.untilBeEnable(BTN_RECUPERAR_TRAMITE),
                Click.on(BTN_RECUPERAR_TRAMITE)

                /****************************************************/
//                WaitInteractions.untilBeEnable(BTN_CONTINUAR_EXPEDIENTES),
//                Click.on(BTN_CONTINUAR_EXPEDIENTES),
//                WaitInteractions.untilAppears(BTN_INICIAR_TRAMITE_EXPEDIENTES),
//                Scroll.to(BTN_INICIAR_TRAMITE_EXPEDIENTES),
//                Click.on(BTN_INICIAR_TRAMITE_EXPEDIENTES),
        );
        if (actor.asksFor(ElementoElegible.para(TXT_CODIGO_RECUPERACION)))
            actor.attemptsTo(
                    Enter.theValue(data.get("Recuperacion")).into(TXT_CODIGO_RECUPERACION),
                    Click.on(BTN_RECUPERAR_EXPEDIENTES)
            );
        else if (actor.asksFor(ElementoElegible.para(TXT_CODIGO_RECUPERACION_INSCRIPCION)))
            actor.attemptsTo(
                    Enter.theValue(data.get("Recuperacion")).into(TXT_CODIGO_RECUPERACION_INSCRIPCION),
                    Click.on(BTN_CONTINUAR_RECUPERAR_EXPEDIENTES)
            );

        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(BTN_FORMULARIO_EXPEDIENTES),
                Scroll.to(BTN_FORMULARIO_EXPEDIENTES),
                JavaScriptClick.on(BTN_FORMULARIO_EXPEDIENTES),
                ModalLoader.modalLoader()
        );

        /*********************************************************************************************/
        /**************************** Bloque ***************************************************/
        /*********************************************************************************************/
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(BTN_BLOQUE_EXPEDIENTES),
                Scroll.to(BTN_BLOQUE_EXPEDIENTES).andAlignToBottom(),
                Click.on(BTN_BLOQUE_EXPEDIENTES),
                WaitInterrupted2Segundos.esperaConstante2()
        );
        List<WebElementFacade> filas = null;
        int numTabla = 0;
        if (actor.asksFor(ElementoElegible.para(TABLA_EXPERIENCIA3))) {
            filas = TABLA_EXPERIENCIA3.resolveAllFor(actor);
            numTabla = 3;
        } else if (actor.asksFor(ElementoElegible.para(TABLA_EXPERIENCIA4))) {
            filas = TABLA_EXPERIENCIA4.resolveAllFor(actor);
            numTabla = 4;
        }
        for (int i = 0; i <= 50; i++) {
            int indexFila = i + 1;
            System.out.println("Fila actual: " + indexFila);
            actor.attemptsTo(
                    WaitInterrupted5Segundos.esperaConstante5(),
                    MoveMouse.to(BTN_CARGAR_SOPORTE_1.of(String.valueOf(numTabla),String.valueOf(indexFila))).andThen(actions -> actions.click()),
                    //JavaScriptClick.on(BTN_CARGAR_SOPORTE_1.of(String.valueOf(indexFila))),
                    ModalLoader.modalLoader(),
                    Enter.theValue("8070022709").into(TXT_IDENTIFICACION_ANEXO_EXPEDIENTES),
                    Enter.theValue("1234").into(TXT_NUMERO_IDENTIFICACION_EXPEDIENTES),
                    Enter.theValue("2024-10-12").into(TXT_FECHA_DOCUMENTO_EXPEDIENTES),
                    Enter.theValue("QA").into(TXT_ORIGEN_DOCUMENTO_EXPEDIENTES),
                    //WaitInterrupted2Segundos.esperaConstante2(),
                     SubirArchivoCargaContratos.enConfecamaraSII(),
                    //SendKeys.of(FileUploadDos.subirArchivo().fileToUploadDos()).into(BTN_SUBIR_ARCHIVO_EXPEDIENTES),
                    // WaitInterrupted2Segundos.esperaConstante2(),
                    Scroll.to(BTN_GRABAR_DOS_EXPEDIENTES),
                    Click.on(BTN_GRABAR_DOS_EXPEDIENTES),
                    //WaitInterrupted2Segundos.esperaConstante2(),
                    WaitInteractions.untilBeEnable(ESPERA_MODAL_EXPEDIENTES),
                    JavaScriptClick.on(BTN_OK_EXPEDIENTES),
                    ModalLoader.modalLoader(),

                    MoveMouse.to(BTN_CARGAR_SOPORTE_2.of(String.valueOf(numTabla),String.valueOf(indexFila))).andThen(actions -> actions.click()),
                    //JavaScriptClick.on(BTN_CARGAR_SOPORTE_2.of(String.valueOf(indexFila))),
                    ModalLoader.modalLoader(),
                    Enter.theValue("8070022709").into(TXT_IDENTIFICACION_ANEXO_EXPEDIENTES),
                    Enter.theValue("1234").into(TXT_NUMERO_IDENTIFICACION_EXPEDIENTES),
                    Enter.theValue("2024-10-12").into(TXT_FECHA_DOCUMENTO_EXPEDIENTES),
                    Enter.theValue("QA").into(TXT_ORIGEN_DOCUMENTO_EXPEDIENTES),
                    //WaitInterrupted2Segundos.esperaConstante2(),
                    //SubirArchivoCargaContratos.enConfecamaraSII(),
                    SendKeys.of(FileUploadDos.subirArchivo().fileToUploadDos()).into(BTN_SUBIR_ARCHIVO_EXPEDIENTES),
                    //WaitInterrupted2Segundos.esperaConstante2(),
                    Scroll.to(BTN_GRABAR_DOS_EXPEDIENTES),
                    JavaScriptClick.on(BTN_GRABAR_DOS_EXPEDIENTES),
                    //WaitInterrupted2Segundos.esperaConstante2(),
                    WaitInteractions.untilBeEnable(ESPERA_MODAL_EXPEDIENTES),
                    JavaScriptClick.on(BTN_OK_EXPEDIENTES),
                    //WaitInterrupted2Segundos.esperaConstante2(),
                    ModalLoader.modalLoader()
            );
        }

    }

    public static CargaContratosRup cargaContratosRup(Map<String, String> data) {
        return Tasks.instrumented(CargaContratosRup.class, data);
    }
}