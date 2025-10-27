package com.co.confecamaras.tasks.administracion;

import com.co.confecamaras.interactions.cambiarpestana.CambiarALaSiguientePestana;
import com.co.confecamaras.interactions.waitinteractions.ModalLoader;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static com.co.confecamaras.userinterfaces.MenuSistema.TXT_BUSQUEDA_INPUT;
import static com.co.confecamaras.userinterfaces.administracion.CuposAfiliacionPage.CUPOS_AFILIACION;
import static com.co.confecamaras.userinterfaces.administracion.MaestroDeDescuentoPage.MAESTRO_DESCUENTOS;
import static com.co.confecamaras.userinterfaces.administracion.SistemaExternosPage.*;
import static com.co.confecamaras.utils.administracion.CuposAfiliadosConstants.CUPOS_AFILIADOS_TEXTO;
import static com.co.confecamaras.utils.administracion.SistemasExternosConstants.*;

public class Sistemas implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(TXT_BUSQUEDA_INPUT),
                Enter.theValue(SISTEMAS_EXTRNOS_BUSQUEDA).into(TXT_BUSQUEDA_INPUT),
                WaitInteractions.untilBeEnable(SISTEMA_EXTERNO),
                Click.on(SISTEMA_EXTERNO)
        );

        actor.attemptsTo(
                CambiarALaSiguientePestana.siguiente(),
                WaitInteractions.untilBeEnable(BTN_NUEVO_REGISTRO),
                Click.on(BTN_NUEVO_REGISTRO),
                WaitInteractions.untilBeEnable(TXT_SISTEMA_DESTINO),
                Enter.theValue(SISTEMA_DESTINO).into(TXT_SISTEMA_DESTINO),
                WaitInteractions.untilBeEnable(SELECT_TIPO_REPORTE),
                SelectFromOptions.byValue(TIPO_REPORTE).from(SELECT_TIPO_REPORTE),
                WaitInteractions.untilBeEnable(FECHA_INI),
                Enter.theValue(VALOR_FECHA_INI).into(FECHA_INI),
                WaitInteractions.untilBeEnable(SELECT_MUNICIPIO),
                SelectFromOptions.byValue(MUNICIPIO).from(SELECT_MUNICIPIO),
                WaitInteractions.untilBeEnable(TXT_EMAIL),
                Enter.theValue(VALOR_EMAIL).into(TXT_EMAIL),
                WaitInteractions.untilBeEnable(BTN_GUARDAR_SISTEMA),
                Click.on(BTN_GUARDAR_SISTEMA)
        );

        actor.attemptsTo(
                WaitInteractions.untilBeEnable(BTN_ELIMINAR_SISTEMA),
                Click.on(BTN_ELIMINAR_SISTEMA),
                WaitInteractions.untilBeEnable(BTN_CONFIRMAR_ELIMINAR),
                Click.on(BTN_CONFIRMAR_ELIMINAR)
        );
    }
    public static Sistemas externos(){
        return Tasks.instrumented(Sistemas.class);
    }
}
