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
import static com.co.confecamaras.userinterfaces.mantenimientoeinformes.IngresoPorCCostoPage.*;
import static com.co.confecamaras.userinterfaces.mantenimientoeinformes.IngresoPorCuentaPage.*;
import static com.co.confecamaras.userinterfaces.mantenimientoeinformes.IngresoPorCuentaPage.BTN_CONSULTAR_INGRESO;
import static com.co.confecamaras.utils.mantenimientoeinformes.IngresoPorCCostoConstants.BUSQUEDA_INGRES_C_COSTOS;
import static com.co.confecamaras.utils.mantenimientoeinformes.IngresoPorCuentaConstants.*;
import static com.co.confecamaras.utils.mantenimientoeinformes.IngresoPorCuentaConstants.VALOR_CUENTA_FINAL;

public class IngresoPorCCosto implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(TXT_BUSQUEDA_INPUT),
                Enter.theValue(BUSQUEDA_INGRES_C_COSTOS).into(TXT_BUSQUEDA_INPUT),
                WaitInteractions.untilBeEnable(BTN_INGRESO_C_COSTOS),
                Click.on(BTN_INGRESO_C_COSTOS)
        );

        actor.attemptsTo(
                CambiarALaSiguientePestana.siguiente(),
                WaitInteractions.untilBeEnable(INPUT_COSTO_INI),
                Enter.theValue(VALOR_CUENTA_INICIAL).into(INPUT_COSTO_INI),
                WaitInteractions.untilBeEnable(INPUT_COSTO_FINAL),
                Enter.theValue(VALOR_CUENTA_FINAL).into(INPUT_COSTO_FINAL),
                WaitInteractions.untilBeEnable(INPUT_FECHA_INICIAL),
                Enter.theValue(VALOR_FECHA_INICIAL).into(INPUT_FECHA_INICIAL),
                WaitInteractions.untilBeEnable(INPUT_FECHA_FINAL),
                Enter.theValue(VALOR_FECHA_FINAL).into(INPUT_FECHA_FINAL),
                WaitInteractions.untilBeEnable(BTN_CONSULTAR_INGRESO),
                Click.on(BTN_CONSULTAR_INGRESO),
                AcceptAlert.aceptar()
        );

        actor.attemptsTo(
                WaitInteractions.untilBeEnable(BTN_GENERAR_EXCEL_C_COSTOS),
                Click.on(BTN_GENERAR_EXCEL_C_COSTOS)

        );
    }

    public static IngresoPorCCosto consultar(){
        return Tasks.instrumented(IngresoPorCCosto.class);
    }
}
