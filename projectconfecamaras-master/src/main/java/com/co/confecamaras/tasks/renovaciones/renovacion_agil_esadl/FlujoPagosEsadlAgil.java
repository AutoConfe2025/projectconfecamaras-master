package com.co.confecamaras.tasks.renovaciones.renovacion_agil_esadl;

import com.co.confecamaras.interactions.News.PressKey;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import com.co.confecamaras.interactions.WaitInterrupted5Segundos;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import com.co.confecamaras.utils.News.Acciones.TypeKey;
import com.co.confecamaras.utils.RobotRecargarPestana;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.Certificados.Demas.PagoUsuarioPublicoNoPresencial.*;
import static com.co.confecamaras.userinterfaces.Certificados.Demas.PagoUsuarioPublicoNoPresencial.BTN_FINALIZAR;
import static com.co.confecamaras.userinterfaces.ServiciosVirtuales.PagarElectronicamentePage.BTN_PSE;
import static com.co.confecamaras.userinterfaces.renovaciones.FlujoActualizarProponentePage.BOTON_CONTINUAR_RECIBIR_PAGO_ACTUALIZAR_PROPONENTE;
import static com.co.confecamaras.userinterfaces.renovaciones.FlujoAgilEsadlPage.*;
import static com.co.confecamaras.userinterfaces.renovaciones.FlujoPnEstCajaPage.BOTON_CERRAR_BAJA_ACTIVO_ALERTA_1;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class FlujoPagosEsadlAgil implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInterrupted2Segundos.esperaConstante2(),
                SwitchToNewWindow.switchToNewTab(),
                WaitUntil.the(BOTON_CONTINUAR_RECIBIR_PAGO_ACTUALIZAR_PROPONENTE, isPresent()).forNoMoreThan(120).seconds(),
                Click.on(BOTON_CONTINUAR_RECIBIR_PAGO_ACTUALIZAR_PROPONENTE)
        );

        if (BOTON_CERRAR_BAJA_ACTIVO_ALERTA_1.isVisibleFor(actor)) {
            actor.attemptsTo(
                    WaitUntil.the(BOTON_CERRAR_BAJA_ACTIVO_ALERTA_1, isPresent()).forNoMoreThan(10).seconds(),
                    Click.on(BOTON_CERRAR_BAJA_ACTIVO_ALERTA_1)
            );
        }

        actor.attemptsTo(
                SelectFromOptions.byValue("PN").from(LISTA_SELECCION_TIPO_CLIENTE),
                SelectFromOptions.byValue("1").from(LISTA_SELECCION_TIPO_IDENTIFICACION),
                Enter.theValue("1026265083").into(CAMPO_INGRESO_IDENTIFICACION_CLIENTE),
                PressKey.press(TypeKey.TAB),
                Scroll.to(BOTON_PAGAR_CON_PSE).andAlignToTop(),
                Click.on(BOTON_PAGAR_CON_PSE)
        );

        //PAGO TU COMPRA

        actor.attemptsTo(
                WaitInterrupted5Segundos.esperaConstante5(),
                WaitUntil.the(MENU_DESPLE_TIPO_DOCUMENTO,isPresent()).forNoMoreThan(360).seconds(),
                Click.on(MENU_DESPLE_TIPO_DOCUMENTO),
                Click.on(MENU_DESPLE_CC)
        );

        if (TXT_TELEFONO_PAGO.isVisibleFor(actor)) {
            actor.attemptsTo(
                    Scroll.to(TXT_TELEFONO_PAGO),
                    Clear.field(TXT_TELEFONO_PAGO),
                    Enter.theValue("6707475").into(TXT_TELEFONO_PAGO),
                    Scroll.to(TXT_CELULAR_PAGO)
            );
        }

        actor.attemptsTo(
                Enter.theValue("3165376606").into(TXT_CELULAR_PAGO),
                Scroll.to(MENU_DESPLE_PAIS),
                Click.on(MENU_DESPLE_PAIS),
                Enter.theValue("COLOMBIA").into(TXT_PAIS),
                Click.on(BTN_COLOMBIA),
                WaitSeconds.seconds(10),
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

        if (actor.asksFor(ElementoElegible.para(MENU_DESPLEGABLE_CUOTA))) {
            actor.attemptsTo(
                    WaitInteractions.untilBeEnable(MENU_DESPLEGABLE_CUOTA),
                    Click.on(MENU_DESPLEGABLE_CUOTA),
                    Click.on(BTN_CUOTA),
                    Click.on(BTN_PAGAR),
                    WaitSeconds.seconds(7)
            );

            if (actor.asksFor(ElementoElegible.para(BTN_FINALIZAR))) {
                actor.attemptsTo(
                        WaitInteractions.untilBeEnable(BTN_FINALIZAR),
                        JavaScriptClick.on(BTN_FINALIZAR),
                        Switch.toTheOtherWindow()
                );

            } else {

                actor.attemptsTo(
//                        Log.message("Salio RECAPTCHA"),
                        RobotRecargarPestana.toCloseTab(),
                        WaitInteractions.untilAppears(MENU_DESPLE_TIPO_DOCUMENTO),
                        Click.on(MENU_DESPLE_TIPO_DOCUMENTO),
                        Click.on(MENU_DESPLE_CC),
                        Scroll.to(TXT_TELEFONO_PAGO),
                        Enter.theValue("6707475").into(TXT_TELEFONO_PAGO),
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
                        Click.on(BTN_PSE),
//                        Log.message("Boton PSE"),
                        Click.on(MENU_DES_TIPO_PERSONA),
                        Click.on(BTN_PN),
                        Click.on(MENU_DES_BANCO_PSE),
                        Click.on(BTN_BANCO),
                        Click.on(BTN_PAGAR),
                        WaitSeconds.seconds(7),
                        WaitInteractions.untilBeEnable(BTN_FINALIZAR),
                        JavaScriptClick.on(BTN_FINALIZAR),
                        Switch.toTheOtherWindow()
                );
            }

        } else {
            actor.attemptsTo(
                    Click.on(BTN_PAGAR),
                    WaitSeconds.seconds(7),
                    WaitInteractions.untilBeEnable(BTN_FINALIZAR),
                    JavaScriptClick.on(BTN_FINALIZAR),
                    Switch.toTheOtherWindow()
            );

        }
    }





    public static FlujoPagosEsadlAgil pagosEsdalAgil(){
        return instrumented(FlujoPagosEsadlAgil.class);
    }
}
