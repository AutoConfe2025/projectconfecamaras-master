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
import static com.co.confecamaras.userinterfaces.administracion.MttoCodigoBarrasPage.MMTO_CODIGO_BARRAS;
import static com.co.confecamaras.userinterfaces.administracion.MttoLiquidacionPage.*;
import static com.co.confecamaras.utils.administracion.MttoCodBarrasConstants.BUSQUEDA_MANTENIMIENTO_CODIGO_BARRAS;
import static com.co.confecamaras.utils.administracion.MttoLiquidacionesConstants.*;

public class MttoLiquidacion implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(TXT_BUSQUEDA_INPUT),
                Enter.theValue(BUSQUEDA_MTTO_LIQUIDACIONES).into(TXT_BUSQUEDA_INPUT),
                WaitInteractions.untilBeEnable(BUSQUEDA_MMTO_LIQUIDACIONES),
                Click.on(BUSQUEDA_MMTO_LIQUIDACIONES)
        );

        actor.attemptsTo(
                CambiarALaSiguientePestana.siguiente(),
                WaitInteractions.untilBeEnable(INPUT_NUMERO_LIQUIDACION),
                Enter.theValue(VALOR_MATRICULA).into(INPUT_NUMERO_LIQUIDACION),
                WaitInteractions.untilBeEnable(BTN_EDITAR_LIQUIDACION),
                Click.on(BTN_EDITAR_LIQUIDACION),
                WaitInteractions.untilBeEnable(SELECT_ESTADO_LIQUIDACION),
                SelectFromOptions.byValue(PRIMER_VALOR_ESTADO).from(SELECT_ESTADO_LIQUIDACION),
                WaitInteractions.untilBeEnable(GRABAR_DATOS_BASICOS),
                Click.on(GRABAR_DATOS_BASICOS),
                WaitInteractions.untilBeEnable(BTN_ACEPTAR_),
                Click.on(BTN_ACEPTAR_)
        );

        actor.attemptsTo(
                WaitInteractions.untilBeEnable(SELECT_ESTADO_LIQUIDACION),
                Scroll.to(SELECT_ESTADO_LIQUIDACION),
                Ensure.that(VALOR_ESTADO).text().isEqualTo(VALOR_ESTADO_ORGINAL),
                SelectFromOptions.byValue(_VALOR_ESTADO_ORIGINAL).from(SELECT_ESTADO_LIQUIDACION),
                WaitInteractions.untilBeEnable(GRABAR_DATOS_BASICOS),
                Click.on(GRABAR_DATOS_BASICOS),
                WaitInteractions.untilBeEnable(BTN_ACEPTAR_)
        );
    }

    public static MttoLiquidacion hacer(){
        return Tasks.instrumented(MttoLiquidacion.class);
    }
}
