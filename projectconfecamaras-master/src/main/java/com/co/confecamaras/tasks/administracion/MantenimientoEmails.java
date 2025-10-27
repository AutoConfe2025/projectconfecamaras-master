package com.co.confecamaras.tasks.administracion;

import com.co.confecamaras.interactions.cambiarpestana.CambiarALaSiguientePestana;
import com.co.confecamaras.interactions.waitinteractions.ModalLoader;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static com.co.confecamaras.userinterfaces.MenuSistema.TXT_BUSQUEDA_INPUT;
import static com.co.confecamaras.userinterfaces.administracion.MaestroClasesVinculosPage.TXT_DESCRIPCION;
import static com.co.confecamaras.userinterfaces.administracion.MaestroTransaccionesOrdenPage.MAESTRO_TRANSACCIONES_ORDEN;
import static com.co.confecamaras.userinterfaces.administracion.MantenimientoEmailsProgramadosPage.*;
import static com.co.confecamaras.utils.administracion.MaestroClasesVinculosConstants.DESCRIPCION_UNO;
import static com.co.confecamaras.utils.administracion.MaestroTransaccionConstants.BUSQUEDA_MAESTRO_TRANSACCIONES;
import static com.co.confecamaras.utils.administracion.MantenimientoEmailsConstants.*;

public class MantenimientoEmails implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(TXT_BUSQUEDA_INPUT),
                Enter.theValue(BUSQUEDA_MANTENIMIENTO_EMAIL).into(TXT_BUSQUEDA_INPUT),
                WaitInteractions.untilBeEnable(MANTENIMEINTO_EMAILS_PROGRAMADOS),
                Click.on(MANTENIMEINTO_EMAILS_PROGRAMADOS)
        );

        actor.attemptsTo(
                CambiarALaSiguientePestana.siguiente(),
                WaitInteractions.untilBeEnable(BTN_AGREGAR_NUEVO),
                Click.on(BTN_AGREGAR_NUEVO),
                WaitInteractions.untilBeEnable(INPUT_IDE),
                Enter.theValue(VALOR_ID).into(INPUT_IDE),
                WaitInteractions.untilBeEnable(BTN_TIPO),
                Enter.theValue(VALOR_TIPO).into(BTN_TIPO),
                WaitInteractions.untilBeEnable(BTN_ENAIL),
                Enter.theValue(VALOR_EMAIL).into(BTN_ENAIL),
                WaitInteractions.untilBeEnable(BTN_GUARDAR),
                Click.on(BTN_GUARDAR),
                Ensure.that(TEXTO_NOMBRE_ADM).text().isEqualTo(VALOR_TIPO)
        );

        actor.attemptsTo(
                WaitInteractions.untilBeEnable(BTN_ELIMINAR_EMAIL),
                Click.on(BTN_ELIMINAR_EMAIL)
        );

    }
    public static MantenimientoEmails programados(){
        return Tasks.instrumented(MantenimientoEmails.class);
    }
}
