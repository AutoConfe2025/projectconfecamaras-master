package com.co.confecamaras.tasks.tableros;

import com.co.confecamaras.interactions.waitinteractions.*;
import com.co.confecamaras.userinterfaces.MenuSistema;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.Switch;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static com.co.confecamaras.userinterfaces.Certificados.UsuarioPublico.CoCertificadoCdEsadlUsPu.BTN_TRAMITES_CONSULTA_EXPEDIENTES;
import static com.co.confecamaras.userinterfaces.MenuSistema.TXT_BUSQUEDA_INPUT;
import static com.co.confecamaras.userinterfaces.tableros.tableroSection.*;

public class TableroGestion implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(TXT_BUSQUEDA_INPUT),
                Enter.theValue("Tableros de gestión").into(TXT_BUSQUEDA_INPUT),
                Click.on(MenuSistema.SELECCIONAR_OPT),
                ModalLoader.modalLoader(),
                WaitInterrupted10Segundos.esperaConstante10(),
                WaitInterrupted7Segundos.esperaConstante7(),
                Switch.toFrame(0),
                Scroll.to(TITULO_MATRICULADOS_METAS),
                WaitInterrupted5Segundos.esperaConstante5(),
                Scroll.to(TOTAL_INGRESOS_PRESOPUESTO),
                WaitInterrupted5Segundos.esperaConstante5(),
                Scroll.to(TITULO_INGRESO_TIPO_INGRESO),
                WaitInterrupted5Segundos.esperaConstante5(),
                Scroll.to(TITULO_COMPARATIVO_INGRESO_POR_GRUPO_INGRESO)

        );
    }

    public static TableroGestion consultar (){
        return Tasks.instrumented(TableroGestion.class);
    }
}
