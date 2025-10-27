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
import static com.co.confecamaras.userinterfaces.mantenimientoeinformes.IngresoPorCuentaPage.*;
import static com.co.confecamaras.userinterfaces.mantenimientoeinformes.IngresoPorServicioTipoDeVentaPage.BTN_DESCARGAR_CSV_SERV;
import static com.co.confecamaras.userinterfaces.mantenimientoeinformes.IngresoPorServicioTipoDeVentaPage.BTN_INGRESO_SERVICIO_TIPO_VENTA;
import static com.co.confecamaras.utils.mantenimientoeinformes.IngresoPorCuentaConstants.*;
import static com.co.confecamaras.utils.mantenimientoeinformes.IngresoPorServicioTipoDeVentaConstants.BUSQUEDA_INGRESO_POR_SERVICIO_TIPO_VENTA;

public class IngresoServicioTipoVenta implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(TXT_BUSQUEDA_INPUT),
                Enter.theValue(BUSQUEDA_INGRESO_POR_SERVICIO_TIPO_VENTA).into(TXT_BUSQUEDA_INPUT),
                WaitInteractions.untilBeEnable(BTN_INGRESO_SERVICIO_TIPO_VENTA),
                Click.on(BTN_INGRESO_SERVICIO_TIPO_VENTA)
        );

        actor.attemptsTo(
                CambiarALaSiguientePestana.siguiente(),
                WaitInteractions.untilBeEnable(INPUT_FECHA_INICIAL),
                Enter.theValue(VALOR_FECHA_INICIAL).into(INPUT_FECHA_INICIAL),
                WaitInteractions.untilBeEnable(INPUT_FECHA_FINAL),
                Enter.theValue(VALOR_FECHA_FINAL).into(INPUT_FECHA_FINAL),
                WaitInteractions.untilBeEnable(BTN_CONSULTAR_INGRESO),
                Click.on(BTN_CONSULTAR_INGRESO),
                AcceptAlert.aceptar()
        );

        actor.attemptsTo(
                WaitInteractions.untilBeEnable(BTN_DESCARGAR_CSV_SERV),
                Click.on(BTN_DESCARGAR_CSV_SERV)

        );
    }

    public static IngresoServicioTipoVenta consultar() {
        return Tasks.instrumented(IngresoServicioTipoVenta.class);
    }
}
