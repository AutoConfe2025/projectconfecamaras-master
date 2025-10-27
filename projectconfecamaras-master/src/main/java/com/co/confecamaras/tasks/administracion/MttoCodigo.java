package com.co.confecamaras.tasks.administracion;

import com.co.confecamaras.interactions.cambiarpestana.CambiarALaSiguientePestana;
import com.co.confecamaras.interactions.waitinteractions.ModalLoader;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static com.co.confecamaras.userinterfaces.MenuSistema.TXT_BUSQUEDA_INPUT;
import static com.co.confecamaras.userinterfaces.administracion.MaestroTransaccionesOrdenPage.TEXTO_NOMBRE;
import static com.co.confecamaras.userinterfaces.administracion.MantenimientoEmailsProgramadosPage.MANTENIMEINTO_EMAILS_PROGRAMADOS;
import static com.co.confecamaras.userinterfaces.administracion.MttoCodigoBarrasPage.*;
import static com.co.confecamaras.utils.administracion.MaestroTransaccionConstants.TITULO_MAESTRO;
import static com.co.confecamaras.utils.administracion.MantenimientoEmailsConstants.BUSQUEDA_MANTENIMIENTO_EMAIL;
import static com.co.confecamaras.utils.administracion.MttoCodBarrasConstants.*;

public class MttoCodigo implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(TXT_BUSQUEDA_INPUT),
                Enter.theValue(BUSQUEDA_MANTENIMIENTO_CODIGO_BARRAS).into(TXT_BUSQUEDA_INPUT),
                WaitInteractions.untilBeEnable(MMTO_CODIGO_BARRAS),
                Click.on(MMTO_CODIGO_BARRAS)
        );

        actor.attemptsTo(
                CambiarALaSiguientePestana.siguiente(),
                WaitInteractions.untilBeEnable(INPUT_COD_BARRAS),
                Enter.theValue(VALOR_CODIGO_BARRAS).into(INPUT_COD_BARRAS),
                WaitInteractions.untilBeEnable(BTN_EDITAR_COD),
                Click.on(BTN_EDITAR_COD),
                WaitInteractions.untilBeEnable(SELECT_ESTADO),
                Scroll.to(SELECT_ESTADO),
                SelectFromOptions.byValue(VALOR_ESTADO_ENVIADO).from(SELECT_ESTADO),
                WaitInteractions.untilBeEnable(BTN_GIUARDAR_COD),
                Scroll.to(BTN_GIUARDAR_COD),
                Click.on(BTN_GIUARDAR_COD)
        );
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(INPUT_COD_BARRAS),
                Enter.theValue(VALOR_CODIGO_BARRAS).into(INPUT_COD_BARRAS),
                WaitInteractions.untilBeEnable(BTN_EDITAR_COD),
                Click.on(BTN_EDITAR_COD),
                WaitInteractions.untilBeEnable(SELECT_ESTADO),
                Scroll.to(SELECT_ESTADO),
                Ensure.that(ESTADO_ENVIADO).text().isEqualTo(TEXTO_ESTADO),
                SelectFromOptions.byValue(VALOR_ESTADO_ARCHIVADO).from(SELECT_ESTADO),
                WaitInteractions.untilBeEnable(BTN_GIUARDAR_COD),
                Scroll.to(BTN_GIUARDAR_COD),
                Click.on(BTN_GIUARDAR_COD)
        );

        actor.attemptsTo(
                WaitInteractions.untilBeEnable(INPUT_COD_BARRAS),
                Enter.theValue(VALOR_CODIGO_BARRAS).into(INPUT_COD_BARRAS),
                WaitInteractions.untilBeEnable(BTN_EDITAR_COD),
                Click.on(BTN_EDITAR_COD),
                WaitInteractions.untilBeEnable(SELECT_ESTADO),
                Scroll.to(SELECT_ESTADO)
        );
    }

    public static MttoCodigo barras(){
        return Tasks.instrumented(MttoCodigo.class);
    }
}
