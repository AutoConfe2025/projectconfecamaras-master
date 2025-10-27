package com.co.confecamaras.interactions.pagos;

import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import com.co.confecamaras.userinterfaces.Actualizar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;

import static com.co.confecamaras.userinterfaces.Certificados.Demas.PagoUsuarioPublicoNoPresencial.*;


public class PagoUsuarioPublicoNoPresencial implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Switch.toNewWindow(),
                Click.on(BOTON_CONTINUAR),
                WaitSeconds.seconds(1)
        );
        if(actor.asksFor(ElementoElegible.para(BOTON_CERRAR))){
            actor.attemptsTo(
                    WaitInteractions.untilBeEnable(BOTON_CERRAR),
                    Click.on(BOTON_CERRAR)
            );
        }
        actor.attemptsTo(
                Click.on(MENU_DESPLEGABLE_TIPO_DE_CLIENTE),
                Click.on(MENU_DESPLEGABLE_TIPO_IDENTIFICACION),
                Enter.theValue("1026265083").into(TXT_IDENTIFICACIO_CLIENTE),
                Click.on(TXT_PRIMER_APELLIDO),
                Enter.theValue("3165376606").into(TXT_MOVIL),
                Enter.theValue("analistaqa@confecamaras.org.co").into(TXT_CONFIRMACION_CORREO),
                Click.on(BTN_PAGAR_PSE),
                WaitSeconds.seconds(2)
        );
        if(actor.asksFor(ElementoElegible.para(BTN_OK_FALTA_INFORMACION))){
            actor.attemptsTo(
                    Click.on(BTN_OK_FALTA_INFORMACION),
                    Enter.theValue("RIOS").into(TXT_PRIMER_APELLIDO),
                    Enter.theValue("MAYORGA").into(TXT_SEGUNDO_APELLIDO),
                    Enter.theValue("DIEGO").into(TXT_PRIMER_NOMBRE),
                    Enter.theValue("ALBERTO").into(TXT_SEGUNDO_NOMBRE),
                    Enter.theValue("CALLE 199 C # 18-37 QA").into(TXT_DIRECCION),
                    SelectFromOptions.byVisibleText("MANZANARES (CAL)").from(MENUDES_MUNICIPIO),
                    Enter.theValue("6707475").into(TXT_TELEFONO_FIJO),
                    Click.on(BTN_PAGAR_PSE),
                    WaitSeconds.seconds(2)
            );
        }
        /************************TU COMPRA ************************************/
        actor.attemptsTo(
                WaitInteractions.untilAppears(MENU_DESPLE_TIPO_DOCUMENTO),
                Click.on(MENU_DESPLE_TIPO_DOCUMENTO),
                Click.on(MENU_DESPLE_CC),
                Scroll.to(TXT_CELULAR_PAGO),
                Enter.theValue("3165376606").into(TXT_CELULAR_PAGO),
                Scroll.to(MENU_DESPLE_PAIS),
                Click.on(MENU_DESPLE_PAIS),
                Enter.theValue("COLOMBIA").into(TXT_PAIS),
                Click.on(BTN_COLOMBIA),
                WaitSeconds.seconds(1),
                Click.on(MENU_DESPLEGABLE_CIUDAD),
                Enter.theValue("Bogo").into(TXT_CIUDAD),
                Click.on(BTN_BOGOTA),
                Click.on(CHECBOX_POLITICAS),
                Click.on(BTN_VISA),
                WaitSeconds.seconds(1),
                WaitInteractions.untilBeEnable(TXT_NUMETO_TARGETA),
                Scroll.to(TXT_NUMETO_TARGETA),
                Switch.toFrame(0),
                Enter.theValue("4970110000001003").into(TXT_NUMETO_TARGETA_1),
                Switch.toDefaultContext(),
                Switch.toFrame(1),
                Enter.theValue("123").into(TXT_CODIGO_SEGURIDAD),
                Switch.toDefaultContext(),
                Switch.toFrame(2),
                Enter.theValue("1227").into(TXT_FECHA_EXPIRACION),
                Switch.toDefaultContext()
        );
        if(actor.asksFor(ElementoElegible.para(MENU_DESPLEGABLE_CUOTA))){
            actor.attemptsTo(
                    WaitInteractions.untilBeEnable(MENU_DESPLEGABLE_CUOTA),
                    Click.on(MENU_DESPLEGABLE_CUOTA),
                    Click.on(BTN_CUOTA),
                    Click.on(BTN_PAGAR),
                    WaitSeconds.seconds(7),
                    WaitInteractions.untilBeEnable(BTN_FINALIZAR),
                    JavaScriptClick.on(BTN_FINALIZAR),
                    Switch.toTheOtherWindow()
            );
        } else {
            actor.attemptsTo(
                    Click.on(BTN_PAGAR),
                    WaitSeconds.seconds(7),
                    WaitInteractions.untilBeEnable(BTN_FINALIZAR),
                    JavaScriptClick.on(BTN_FINALIZAR),
                    Switch.toTheOtherWindow()
            );
        }
        /************************FIN TU COMPRA ************************************/

        /************************INICIO PLACETOPLAY ************************************/
            /*actor.attemptsTo(
                    WaitInteractions.untilAppears(BTN_TARJETA),
                    Click.on(BTN_TARJETA),
                    Enter.theValue("4111111111111111").into(TXT_DATOS_TARJETA),
                    WaitInterrupted2Segundos.esperaConstante2(),
                    Enter.theValue("12/24").into(TXT_MES_ANO),
                    Enter.theValue("123").into(TXT_CCV),
                    Scroll.to(BTN_PAGAR_PLACETOPLAY),
                    Click.on(BTN_PAGAR_PLACETOPLAY),
                    WaitInteractions.untilAppears(BTN_VOLVER_COMERCIO),
                    Click.on(BTN_VOLVER_COMERCIO),
                    Switch.toTheOtherWindow()
            );
            /************************FIN PLACETOPLAY ************************************/
    }
    public static PagoUsuarioPublicoNoPresencial enConfecamaras() {
        return Tasks.instrumented(PagoUsuarioPublicoNoPresencial.class);
    }
}
