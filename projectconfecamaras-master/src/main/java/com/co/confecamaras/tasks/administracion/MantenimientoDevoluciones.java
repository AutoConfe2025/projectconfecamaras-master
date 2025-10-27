package com.co.confecamaras.tasks.administracion;

import com.co.confecamaras.interactions.cambiarpestana.CambiarALaSiguientePestana;
import com.co.confecamaras.interactions.waitinteractions.ModalLoader;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.utils.bandejaponal.BandejaPonalConstans;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.co.confecamaras.userinterfaces.Bandejas.BandejaRLeyPONALPage.TEXTO_COMENTARIO_ALMACENADO;
import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static com.co.confecamaras.userinterfaces.MenuSistema.TXT_BUSQUEDA_INPUT;
import static com.co.confecamaras.userinterfaces.administracion.MttoDevolucionesPage.*;
import static com.co.confecamaras.utils.administracion.MmtoDevolucionesConstants.*;

public class MantenimientoDevoluciones  implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(TXT_BUSQUEDA_INPUT),
                Enter.theValue(BUSQUEDA_MTTO_DEVOLUCIONES).into(TXT_BUSQUEDA_INPUT),
                WaitInteractions.untilBeEnable(MMTO_DEVOLUCIONES),
                Click.on(MMTO_DEVOLUCIONES)
        );

        actor.attemptsTo(
                CambiarALaSiguientePestana.siguiente(),
                WaitInteractions.untilBeEnable(BTN_CONTINUAR_CONSULTA_DEVOLUCIONES),
                Click.on(BTN_CONTINUAR_CONSULTA_DEVOLUCIONES),
                WaitInteractions.untilAppears(INPUT_DEVOLUCIONES),
                Enter.theValue(COD_BARRAS).into(INPUT_DEVOLUCIONES),
                WaitInteractions.untilBeEnable(BTN_EDITAR),
                Click.on(BTN_EDITAR),
                WaitInteractions.untilBeEnable(SELECT_PROCEDE_REINGRESO),
                SelectFromOptions.byValue(VALOR_DEFINITIVA).from(SELECT_PROCEDE_REINGRESO),
                WaitInteractions.untilBeEnable(BTN_GUARDAR),
                Scroll.to(BTN_GUARDAR),
                Click.on(BTN_GUARDAR)
        );

        actor.attemptsTo(
                WaitInteractions.untilBeEnable(INPUT_DEVOLUCIONES),
                Enter.theValue(COD_BARRAS).into(INPUT_DEVOLUCIONES),
                WaitInteractions.untilBeEnable(BTN_EDITAR),
                Click.on(BTN_EDITAR),
                Ensure.that(VALOR_ESTADO_PROCEDE_REINGRESO).text().isEqualTo(VALOR_ACTUAL_ESTADO),
                WaitInteractions.untilBeEnable(SELECT_PROCEDE_REINGRESO),
                SelectFromOptions.byValue(VALOR_REINGRESABLE).from(SELECT_PROCEDE_REINGRESO),
                WaitInteractions.untilBeEnable(BTN_GUARDAR),
                Scroll.to(BTN_GUARDAR),
                Click.on(BTN_GUARDAR)
        );

        actor.attemptsTo(
                WaitInteractions.untilBeEnable(INPUT_DEVOLUCIONES),
                Enter.theValue(COD_BARRAS).into(INPUT_DEVOLUCIONES),
                WaitInteractions.untilBeEnable(BTN_EDITAR),
                Click.on(BTN_EDITAR)
        );

    }

    public static MantenimientoDevoluciones editar(){
        return Tasks.instrumented(MantenimientoDevoluciones.class);
    }
}
