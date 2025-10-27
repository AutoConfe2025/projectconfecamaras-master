package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.*;
import com.co.confecamaras.interactions.ModalLoader;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import com.co.confecamaras.questions.devdos.RutaDocumentosQuestion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import com.co.confecamaras.userinterfaces.*;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.MenuSistema.BTN_MENU_LATERAL;
import static com.co.confecamaras.userinterfaces.RutaDocumentos.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoRutaDocumentos implements Task {

    private final String codBarras;
    private final String operacion;
    private final String recibo;
    private final String nombre;
    private final String identificacion;
    private final String matricula;
    private final String fechaInicio;
    private final String fechaFinal;

    public DoRutaDocumentos(String codBarras, String operacion, String recibo, String nombre, String identificacion, String matricula, String fechaInicio, String fechaFinal) {
        this.codBarras = codBarras;
        this.operacion = operacion;
        this.recibo = recibo;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.matricula = matricula;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
    }

    public static Performable rutaDocumentos(String codBarras, String operacion, String recibo, String nombre, String identificacion, String matricula, String fechaInicio, String fechaFinal){
        return instrumented(DoRutaDocumentos.class, codBarras, operacion, recibo, nombre, identificacion, matricula, fechaInicio, fechaFinal);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                WaitSeconds.seconds(1),
                Enter.theValue("Ruta de documentos").into(MenuSistema.BUSQUEDA_INPUT),
                Click.on(MenuSistema.SELECCIONAR_OPT)
        );

        // ----- Codigo Barras ----- //

        actor.attemptsTo(
                Enter.theValue(codBarras).into(RutaDocumentos.CODIGO_BARRAS_INPUT),
                JavaScriptClick.on(RutaDocumentos.CONTINUAR_BTN)
        );
        for (int i = 0; i <= 50; i++){
            if(actor.asksFor(ElementoElegible.para(ACCION_BTN))){
                actor.attemptsTo(
                        WaitUntil.the(ACCION_BTN, WebElementStateMatchers.isClickable()),
                        Scroll.to(ACCION_BTN),
                        JavaScriptClick.on(ACCION_BTN),
                        ModalLoader.modalLoader()
                );
                if(actor.asksFor(ElementoElegible.para(CERRAR_BTN_1))) {
                    actor.attemptsTo(
                            WaitSeconds.seconds(1),
                            JavaScriptClick.on(RutaDocumentos.CERRAR_BTN)
                    );
                } else {
                    actor.attemptsTo(
                            WaitSeconds.seconds(1),
                            JavaScriptClick.on(BTN_OK_1)
                    );
                }
                int indexFila = i = 50;
                System.out.println("Ingreso al if " + indexFila + " repeticiones");
            } else {
                int indexFila = i++;
                actor.attemptsTo(WaitSeconds.seconds(5));
                System.out.println("Espera implicita de 5 segundos " + indexFila + " repeticiones");
            }
        }
        if(actor.asksFor(ElementoElegible.para(ACCION_DOS_BTN))){
            actor.attemptsTo(
                    Scroll.to(ACCION_DOS_BTN),
                    JavaScriptClick.on(ACCION_DOS_BTN),
                    ModalLoader.modalLoader(),
                    WaitSeconds.seconds(2)
            );
        }
        actor.attemptsTo(
                JavaScriptClick.on(RutaDocumentos.CERRAR_BTN),
                Scroll.to(RutaDocumentos.NUEVA_CONSULTA_BTN),
                JavaScriptClick.on(RutaDocumentos.NUEVA_CONSULTA_BTN),
                WaitConstant.esperaConstante(),
                JavaScriptClick.on(RutaDocumentos.LIMPIAR_BTN)
                );

       // ----- Operacion ----- //

        actor.attemptsTo(
                Enter.theValue("01-CAJAQA-20250204-0007").into(RutaDocumentos.OPERACION_INPUT),
                JavaScriptClick.on(RutaDocumentos.CONTINUAR_BTN)
        );
        for (int i = 0; i <= 50; i++){
            if(actor.asksFor(ElementoElegible.para(BTN_CERRER_INFORMACON))) {
                actor.attemptsTo(
                        WaitInteractions.untilBeEnable(BTN_CERRER_INFORMACON),
                        JavaScriptClick.on(BTN_CERRER_INFORMACON),
                        WaitSeconds.seconds(1),
                        Clear.field(RutaDocumentos.OPERACION_INPUT),
                        Enter.theValue("99-USUPUBXX-20250101-0001").into(RutaDocumentos.OPERACION_INPUT),
                        JavaScriptClick.on(RutaDocumentos.CONTINUAR_BTN)
                );
            }
            if(actor.asksFor(ElementoElegible.para(ACCION_BTN))){
                actor.attemptsTo(
                        Scroll.to(ACCION_BTN),
                        JavaScriptClick.on(ACCION_BTN),
                        ModalLoader.modalLoader(),
                        JavaScriptClick.on(RutaDocumentos.CERRAR_BTN)
                );
                if(actor.asksFor(ElementoElegible.para(CERRAR_BTN_1))) {
                    actor.attemptsTo(
                            WaitSeconds.seconds(1),
                            JavaScriptClick.on(RutaDocumentos.CERRAR_BTN)
                    );
                } else {
                    actor.attemptsTo(
                            WaitSeconds.seconds(1),
                            JavaScriptClick.on(BTN_OK_1)
                    );
                }
                int indexFila = i = 50;
            } else {
                int indexFila = i+1;
                actor.attemptsTo(WaitSeconds.seconds(4));
                System.out.println("Espera implicita de 5 segundos " + indexFila + " repeticiones");
            }
        }
        if(actor.asksFor(ElementoElegible.para(ACCION_DOS_BTN))){
            actor.attemptsTo(
                    Scroll.to(ACCION_DOS_BTN),
                    JavaScriptClick.on(ACCION_DOS_BTN),
                    ModalLoader.modalLoader(),
                    WaitSeconds.seconds(2),
                    JavaScriptClick.on(RutaDocumentos.CERRAR_BTN),
                    WaitSeconds.seconds(2)
            );
        }
        actor.attemptsTo(
                Scroll.to(RutaDocumentos.NUEVA_CONSULTA_BTN),
                WaitSeconds.seconds(2),
                JavaScriptClick.on(RutaDocumentos.NUEVA_CONSULTA_BTN),
                WaitSeconds.seconds(5),
                JavaScriptClick.on(RutaDocumentos.LIMPIAR_BTN)
        );

        // ----- Recibo ----- //

        actor.attemptsTo(
                WaitSeconds.seconds(2),
                Enter.theValue("S001031286").into(RutaDocumentos.RECIBO_INPUT),
                JavaScriptClick.on(RutaDocumentos.CONTINUAR_BTN),
                ModalLoader.modalLoader(),
                WaitSeconds.seconds(5),
                //WaitUntil.the(RutaDocumentos.ACCION_BTN, WebElementStateMatchers.isClickable()),
                Scroll.to(ACCION_BTN),
                JavaScriptClick.on(ACCION_BTN),
                //WaitInteractions.untilBeEnable(RutaDocumentos.ESPERA_MODAL),
                WaitSeconds.seconds(2),
                JavaScriptClick.on(RutaDocumentos.CERRAR_BTN)
        );
        if(actor.asksFor(ElementoElegible.para(ACCION_DOS_BTN))){
            actor.attemptsTo(
                    Scroll.to(ACCION_DOS_BTN),
                    JavaScriptClick.on(ACCION_DOS_BTN),
                    ModalLoader.modalLoader(),
                    WaitSeconds.seconds(2),
                    JavaScriptClick.on(RutaDocumentos.CERRAR_BTN)
            );
        }
        actor.attemptsTo(
                Scroll.to(RutaDocumentos.NUEVA_CONSULTA_BTN),
                JavaScriptClick.on(RutaDocumentos.NUEVA_CONSULTA_BTN),
                JavaScriptClick.on(RutaDocumentos.LIMPIAR_BTN)
                );

        // ----- Nombre ----- //

        actor.attemptsTo(
                Enter.theValue(nombre).into(RutaDocumentos.NOMBRE_INPUT),
                JavaScriptClick.on(RutaDocumentos.CONTINUAR_BTN)
        );
        for (int i = 0; i <= 50; i++){
            if(actor.asksFor(ElementoElegible.para(VER_RUTA_BTN_1))){
                int indexFila = i = 50;
            } else {
                int indexFila = i+1;
                actor.attemptsTo(WaitSeconds.seconds(5));
                System.out.println("Espera implicita de 5 segundos " + indexFila + " repeticiones");
            }
        }
        actor.attemptsTo(
                Scroll.to(RutaDocumentos.VER_RUTA_BTN).andAlignToBottom(),
                JavaScriptClick.on(RutaDocumentos.VER_RUTA_BTN),
                Scroll.to(RutaDocumentos.ANEXOS_ACCION_BTN),
                JavaScriptClick.on(RutaDocumentos.ANEXOS_ACCION_BTN),
                ModalLoader.modalLoader(),
                JavaScriptClick.on(RutaDocumentos.CERRAR_BTN),
                Scroll.to(RutaDocumentos.NUEVA_CONSULTA_BTN),
                JavaScriptClick.on(RutaDocumentos.NUEVA_CONSULTA_BTN),
                WaitConstant.esperaConstante(),
                JavaScriptClick.on(RutaDocumentos.LIMPIAR_BTN)
        );

         //----- Identificacion ----- //

        actor.attemptsTo(
                Enter.theValue(identificacion).into(RutaDocumentos.IDENTIFICACION_INPUT),
                ModalLoader.modalLoader(),
                JavaScriptClick.on(RutaDocumentos.CONTINUAR_BTN),
                ModalLoader.modalLoader(),
                Scroll.to(RutaDocumentos.VER_RUTA_BTN).andAlignToBottom(),
                JavaScriptClick.on(RutaDocumentos.VER_RUTA_BTN),
                ModalLoader.modalLoader(),
                Scroll.to(RutaDocumentos.ANEXOS_ACCION_BTN),
                JavaScriptClick.on(RutaDocumentos.ANEXOS_ACCION_BTN),
                ModalLoader.modalLoader()
        );
        if(actor.asksFor(ElementoElegible.para(CERRAR_BTN_1))) {
            actor.attemptsTo(
                    WaitSeconds.seconds(1),
                    JavaScriptClick.on(RutaDocumentos.CERRAR_BTN)
            );
        } else {
            actor.attemptsTo(
                    WaitSeconds.seconds(1),
                    JavaScriptClick.on(BTN_OK_1)
            );
        }
        actor.attemptsTo(
                Scroll.to(RutaDocumentos.NUEVA_CONSULTA_BTN),
                JavaScriptClick.on(RutaDocumentos.NUEVA_CONSULTA_BTN),
                WaitConstant.esperaConstante(),
                JavaScriptClick.on(RutaDocumentos.LIMPIAR_BTN)
        );

        // ----- Matricula ----- //

        actor.attemptsTo(
                Enter.theValue(matricula).into(RutaDocumentos.MATRICULA_INPUT),
                JavaScriptClick.on(RutaDocumentos.CONTINUAR_BTN),
                ModalLoader.modalLoader(),
                WaitInterrupted5Segundos.esperaConstante5(),
                Scroll.to(RutaDocumentos.VER_RUTA_BTN),
                JavaScriptClick.on(RutaDocumentos.VER_RUTA_BTN),
                Scroll.to(RutaDocumentos.ANEXOS_ACCION_BTN),
                ModalLoader.modalLoader(),
                JavaScriptClick.on(RutaDocumentos.ANEXOS_ACCION_BTN),
                ModalLoader.modalLoader()
        );
        if(actor.asksFor(ElementoElegible.para(CERRAR_BTN_1))) {
            actor.attemptsTo(
                    WaitSeconds.seconds(1),
                    JavaScriptClick.on(RutaDocumentos.CERRAR_BTN)
            );
        } else {
            actor.attemptsTo(
                    WaitSeconds.seconds(1),
                    JavaScriptClick.on(BTN_OK_1)
            );
        }
        actor.attemptsTo(
                Scroll.to(RutaDocumentos.NUEVA_CONSULTA_BTN),
                JavaScriptClick.on(RutaDocumentos.NUEVA_CONSULTA_BTN),
                WaitConstant.esperaConstante(),
                JavaScriptClick.on(RutaDocumentos.LIMPIAR_BTN)
        );

                // ----- Fechas ----- //

        actor.attemptsTo(
                Enter.theValue(fechaInicio).into(RutaDocumentos.FECHA_INICIAL_INPUT),
                Enter.theValue(fechaFinal).into(RutaDocumentos.FECHA_FINAL_INPUT),
                JavaScriptClick.on(RutaDocumentos.CONTINUAR_BTN),
                ModalLoader.modalLoader(),
                Scroll.to(RutaDocumentos.VER_RUTA_BTN),
                JavaScriptClick.on(RutaDocumentos.VER_RUTA_BTN),
                Scroll.to(RutaDocumentos.ANEXOS_ACCION_BTN),
                JavaScriptClick.on(RutaDocumentos.ANEXOS_ACCION_BTN),
                ModalLoader.modalLoader()
        );
        if(actor.asksFor(ElementoElegible.para(CERRAR_BTN_1))) {
            actor.attemptsTo(
                    WaitSeconds.seconds(1),
                    JavaScriptClick.on(RutaDocumentos.CERRAR_BTN)
            );
        } else {
            actor.attemptsTo(
                    WaitSeconds.seconds(1),
                    JavaScriptClick.on(BTN_OK_1)
            );
        }
        actor.attemptsTo(
                WaitSeconds.seconds(2),
                JavaScriptClick.on(RutaDocumentos.CERRAR_BTN),
                WaitSeconds.seconds(2),
                Scroll.to(RutaDocumentos.NUEVA_CONSULTA_BTN),
                JavaScriptClick.on(RutaDocumentos.NUEVA_CONSULTA_BTN),
                WaitConstant.esperaConstante(),
                JavaScriptClick.on(RutaDocumentos.LIMPIAR_BTN)
        );
    }
}