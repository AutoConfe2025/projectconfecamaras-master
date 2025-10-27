package com.co.confecamaras.tasks.Bandeja;

import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.WaitInterrupted3Segundos;
import com.co.confecamaras.interactions.waitinteractions.ModalLoader;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.co.confecamaras.userinterfaces.Bandejas.BandejaRLeyPONALPage.TXT_BUSCAR_MENU_LATERAL;
import static com.co.confecamaras.userinterfaces.Bandejas.HistorialYTransaccionesPage.*;
import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.clickopciones.ClickPrimeraOpcion.BTN_PRIMERA_OPCION;

public class RealizarConsulta implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(TXT_BUSCAR_MENU_LATERAL),
                Enter.theValue("historial de transacciones").into(TXT_BUSCAR_MENU_LATERAL),
                WaitInteractions.untilBeEnable(BTN_PRIMERA_OPCION),
                Click.on(BTN_PRIMERA_OPCION)
//                WaitInteractions.untilBeEnable(BTN_CONSULTAS_TRANSACCIONES),
//                Click.on(BTN_CONSULTAS_TRANSACCIONES),
//                WaitInteractions.untilBeEnable(BTN_CONSULTAS_REGISTROS_PUBLICOS),
//                Scroll.to(BTN_CONSULTAS_REGISTROS_PUBLICOS),
//                JavaScriptClick.on(BTN_HISTORIAL_TRANSACCIONES)
        );

        //Consulta Codigo de barras

        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(INPUT_CODIGO_DE_BARRAS),
                Enter.theValue("692731").into(INPUT_CODIGO_DE_BARRAS),
                WaitInteractions.untilBeEnable(BTN_CONSULTAR_HISTORIAL),
                Scroll.to(BTN_CONSULTAR_HISTORIAL),
                Click.on(BTN_CONSULTAR_HISTORIAL),
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(BTN_REGRESAR),
                Click.on(BTN_REGRESAR),
                WaitInteractions.untilBeEnable(BTN_LIMPIAR),
                Scroll.to(BTN_LIMPIAR),
                Click.on(BTN_LIMPIAR)
        );

        //Consulta por expediente

        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(INPUT_EXPEDIENTE),
                Enter.theValue("43999").into(INPUT_EXPEDIENTE),
                WaitInteractions.untilBeEnable(BTN_CONSULTAR_HISTORIAL),
                Scroll.to(BTN_CONSULTAR_HISTORIAL),
                Click.on(BTN_CONSULTAR_HISTORIAL),
                Ensure.that(LBL_EXPEDIENTE).text().contains("43999"),
                WaitInteractions.untilBeEnable(BTN_REGRESAR),
                Click.on(BTN_REGRESAR),
                WaitInteractions.untilBeEnable(BTN_LIMPIAR),
                Scroll.to(BTN_LIMPIAR),
                Click.on(BTN_LIMPIAR)
        );

        //Consulta por NIT

        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(INPUT_NIT),
                Enter.theValue("8909360970").into(INPUT_NIT),
                WaitInteractions.untilBeEnable(BTN_CONSULTAR_HISTORIAL),
                Scroll.to(BTN_CONSULTAR_HISTORIAL),
                Click.on(BTN_CONSULTAR_HISTORIAL)
        );
        if(actor.asksFor(ElementoElegible.para(LBL_NIT))){
            actor.attemptsTo(
                    Ensure.that(LBL_NIT).text().contains("8909360970"),
                    WaitInteractions.untilBeEnable(BTN_REGRESAR),
                    Click.on(BTN_REGRESAR),
                    WaitInteractions.untilBeEnable(BTN_LIMPIAR),
                    Scroll.to(BTN_LIMPIAR),
                    WaitInteractions.untilBeEnable(BTN_LIMPIAR),
                    Click.on(BTN_LIMPIAR)
            );
        } else {
            for (int i = 0; i <= 50; i++) {
                actor.attemptsTo(
                        WaitSeconds.seconds(5)
                );
                if(actor.asksFor(ElementoElegible.para(LBL_NIT))){
                    actor.attemptsTo(
                            Ensure.that(LBL_NIT).text().contains("8909360970"),
                            WaitInteractions.untilBeEnable(BTN_REGRESAR),
                            Click.on(BTN_REGRESAR),
                            WaitInteractions.untilBeEnable(BTN_LIMPIAR),
                            Scroll.to(BTN_LIMPIAR),
                            WaitInteractions.untilBeEnable(BTN_LIMPIAR),
                            Click.on(BTN_LIMPIAR)
                    );
                    int indexFila = i = 50;
                    System.out.println("For de espera Implicita Finalizada");
                } else {
                    int indexFila = i + 1;
                    System.out.println("Espera implicita de 5 segundos " + indexFila + " repeticiones");
                }
            }
        }

        //Consulta por fechas y estado de liquidacion

        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(FECHA_INICIAL),
                Enter.theValue("2024-07-01").into(FECHA_INICIAL),
                WaitInteractions.untilBeEnable(FECHA_FINAL),
                Enter.theValue("2024-07-16").into(FECHA_FINAL),
                WaitInteractions.untilBeEnable(SELECT_ESTADO_LIQUIDACION),
                Scroll.to(SELECT_ESTADO_LIQUIDACION),
                SelectFromOptions.byValue("07").from(SELECT_ESTADO_LIQUIDACION),
                WaitInteractions.untilBeEnable(BTN_CONSULTAR_HISTORIAL),
                Click.on(BTN_CONSULTAR_HISTORIAL),
                ModalLoader.modalLoader(),
                WaitInterrupted3Segundos.esperaConstante3()
               /* Ensure.that(LBL_HISTORIAL_TITULO).text().contains("Historial de transacciones"),
                WaitInterrupted3Segundos.esperaConstante3()*/
        );
    }

    public static RealizarConsulta historialTransaccion() {
        return Tasks.instrumented(RealizarConsulta.class);
    }
}
