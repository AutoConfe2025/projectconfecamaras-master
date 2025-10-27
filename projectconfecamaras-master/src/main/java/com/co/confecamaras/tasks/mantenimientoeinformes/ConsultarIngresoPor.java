package com.co.confecamaras.tasks.mantenimientoeinformes;

import com.co.confecamaras.interactions.News.AcceptAlert;
import com.co.confecamaras.interactions.cambiarpestana.CambiarALaSiguientePestana;
import com.co.confecamaras.interactions.waitinteractions.ModalLoader;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static com.co.confecamaras.userinterfaces.MenuSistema.TXT_BUSQUEDA_INPUT;
import static com.co.confecamaras.userinterfaces.clickopciones.ClickPrimeraOpcion.BTN_PRIMERA_OPCION;
import static com.co.confecamaras.userinterfaces.mantenimientoeinformes.DetalladoGastoAdmPage.BTN_GENERAR_;
import static com.co.confecamaras.userinterfaces.mantenimientoeinformes.IngresoPorCuentaPage.INPUT_FECHA_FINAL;
import static com.co.confecamaras.userinterfaces.mantenimientoeinformes.IngresoPorCuentaPage.INPUT_FECHA_INICIAL;
import static com.co.confecamaras.userinterfaces.mantenimientoeinformes.IngresoPorOperadorPage.BTN_DESCARGAR_INFO_INGRESO_OPERADOR;
import static com.co.confecamaras.utils.mantenimientoeinformes.DetalladoGastoAdmConstants.VALOR_FECHA_FI;
import static com.co.confecamaras.utils.mantenimientoeinformes.DetalladoGastoAdmConstants.VALOR_FECHA_INI;
import static com.co.confecamaras.utils.mantenimientoeinformes.IngresosPorOperadorConstants.BUSQUEDA_INGRESO_POR_OPERADOR;

public class ConsultarIngresoPor  implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(TXT_BUSQUEDA_INPUT),
                Enter.theValue(BUSQUEDA_INGRESO_POR_OPERADOR).into(TXT_BUSQUEDA_INPUT),
                WaitInteractions.untilBeEnable(BTN_PRIMERA_OPCION),
                Click.on(BTN_PRIMERA_OPCION)
        );

        actor.attemptsTo(
                CambiarALaSiguientePestana.siguiente(),
                WaitInteractions.untilBeEnable(INPUT_FECHA_INICIAL),
                Enter.theValue(VALOR_FECHA_INI).into(INPUT_FECHA_INICIAL),
                WaitInteractions.untilBeEnable(INPUT_FECHA_FINAL),
                Enter.theValue(VALOR_FECHA_FI).into(INPUT_FECHA_FINAL),
                WaitInteractions.untilBeEnable(BTN_GENERAR_),
                Click.on(BTN_GENERAR_),
                AcceptAlert.aceptar()
        );

        actor.attemptsTo(
                WaitInteractions.untilBeEnable(BTN_DESCARGAR_INFO_INGRESO_OPERADOR),
                Click.on(BTN_DESCARGAR_INFO_INGRESO_OPERADOR)
        );

    }

    public static ConsultarIngresoPor operador(){
        return Tasks.instrumented(ConsultarIngresoPor.class);
    }
}
