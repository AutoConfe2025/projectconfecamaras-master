package com.co.confecamaras.tasks.administracion;

import com.co.confecamaras.interactions.cambiarpestana.CambiarALaSiguientePestana;
import com.co.confecamaras.interactions.waitinteractions.ModalLoader;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static com.co.confecamaras.userinterfaces.MenuSistema.TXT_BUSQUEDA_INPUT;
import static com.co.confecamaras.userinterfaces.administracion.CuposAfiliacionPage.CUPOS_AFILIACION;
import static com.co.confecamaras.userinterfaces.administracion.TipoDocuemtoRuesPage.*;
import static com.co.confecamaras.utils.administracion.CuposAfiliadosConstants.CUPOS_AFILIADOS_TEXTO;
import static com.co.confecamaras.utils.administracion.TipoDocumentoRues.TIPO_DOCUEMNTO_BUSQUEDA;
import static com.co.confecamaras.utils.administracion.TipoDocumentoRues.VALOR_HOM_RUES;

public class TipoDoc implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(TXT_BUSQUEDA_INPUT),
                Enter.theValue(TIPO_DOCUEMNTO_BUSQUEDA).into(TXT_BUSQUEDA_INPUT),
                WaitInteractions.untilBeEnable(TIPOS_DOC_RUES),
                Click.on(TIPOS_DOC_RUES)
        );

        actor.attemptsTo(
                CambiarALaSiguientePestana.siguiente(),
                WaitInteractions.untilBeEnable(RECIBOS_CAJA_PRIVADOS),
                Enter.theValue(VALOR_HOM_RUES).into(RECIBOS_CAJA_PRIVADOS),
                WaitInteractions.untilBeEnable(GRABAR_TIPO_DOC),
                Click.on(GRABAR_TIPO_DOC)
        );

        actor.attemptsTo(
                Clear.field(RECIBOS_CAJA_PRIVADOS),
                WaitInteractions.untilBeEnable(GRABAR_TIPO_DOC),
                Click.on(GRABAR_TIPO_DOC)
        );

    }
    public static TipoDoc rues(){
        return Tasks.instrumented(TipoDoc.class);
    }
}
