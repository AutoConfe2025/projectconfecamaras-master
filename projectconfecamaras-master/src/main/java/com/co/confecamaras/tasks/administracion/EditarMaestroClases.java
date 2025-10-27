package com.co.confecamaras.tasks.administracion;

import com.co.confecamaras.interactions.cambiarpestana.CambiarALaSiguientePestana;
import com.co.confecamaras.interactions.waitinteractions.ModalLoader;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.interactions.waitinteractions.WaitInterrupted5Segundos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static com.co.confecamaras.userinterfaces.MenuSistema.TXT_BUSQUEDA_INPUT;
import static com.co.confecamaras.userinterfaces.administracion.MaestroCiiusPage.MAESTRO_CIIUS;
import static com.co.confecamaras.userinterfaces.administracion.MaestroCiiusPage.TEXTO_ACTIVIDAD_COMERCIAL;
import static com.co.confecamaras.userinterfaces.administracion.MaestroClasesVinculosPage.*;
import static com.co.confecamaras.utils.administracion.MaestroCiiusConstants.PRIMER_TEXTO_ACTIVIDAD_COMERCIAL;
import static com.co.confecamaras.utils.administracion.MaestroClasesVinculosConstants.*;

public class EditarMaestroClases implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(TXT_BUSQUEDA_INPUT),
                Enter.theValue(BUSQUEDA_MAESTRO_CLASES_VINCULOS).into(TXT_BUSQUEDA_INPUT),
                WaitInteractions.untilBeEnable(MAESTRO_CLASES_VINCULOS),
                Click.on(MAESTRO_CLASES_VINCULOS)
        );

        actor.attemptsTo(
                CambiarALaSiguientePestana.siguiente(),
                WaitInteractions.untilBeEnable(TXT_DESCRIPCION),
                DoubleClick.on(TXT_DESCRIPCION),
                Enter.theValue(DESCRIPCION_UNO).into(INPUT_DESCRIPCION),
                WaitInteractions.untilBeEnable(BTN_GUARDAR_MAESTRO),
                Scroll.to(BTN_GUARDAR_MAESTRO),
                Click.on(BTN_GUARDAR_MAESTRO),
                Ensure.that(TXT_DESCRIPCION).text().isEqualTo(DESCRIPCION_UNO)
        );

        actor.attemptsTo(
                WaitInteractions.untilBeEnable(TXT_DESCRIPCION),
                DoubleClick.on(TXT_DESCRIPCION),
                WaitInteractions.untilBeEnable(TXT_DESCRIPCION),
                Enter.theValue(DESCRIPCION_DOS).into(INPUT_DESCRIPCION),
                WaitInteractions.untilBeEnable(BTN_GUARDAR_MAESTRO),
                Scroll.to(BTN_GUARDAR_MAESTRO),
                Click.on(BTN_GUARDAR_MAESTRO)
        );
    }

    public static EditarMaestroClases vinculos(){
        return Tasks.instrumented(EditarMaestroClases.class);
    }
}
