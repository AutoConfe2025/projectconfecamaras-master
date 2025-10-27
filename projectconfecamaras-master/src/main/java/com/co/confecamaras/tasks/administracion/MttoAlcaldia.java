package com.co.confecamaras.tasks.administracion;

import com.co.confecamaras.interactions.cambiarpestana.CambiarALaSiguientePestana;
import com.co.confecamaras.interactions.cerrarpestana.CerrarPestana;
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
import static com.co.confecamaras.userinterfaces.administracion.CuposAfiliacionPage.CUPOS_AFILIACION;
import static com.co.confecamaras.userinterfaces.administracion.MttoMatriculaAlcaldiaPage.*;
import static com.co.confecamaras.utils.administracion.CuposAfiliadosConstants.CUPOS_AFILIADOS_TEXTO;
import static com.co.confecamaras.utils.administracion.MmtoAlcaldiasConstants.*;

public class MttoAlcaldia implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(TXT_BUSQUEDA_INPUT),
                Enter.theValue(BUSQUEDA_MTOO_ALCALDIA).into(TXT_BUSQUEDA_INPUT),
                WaitInteractions.untilBeEnable(BUSQUEDA_MTTO_MATRICULA_ALCALDIA),
                Click.on(BUSQUEDA_MTTO_MATRICULA_ALCALDIA)
        );

        actor.attemptsTo(
                CambiarALaSiguientePestana.siguiente(),
                WaitInteractions.untilBeEnable(INPUT_MATRICULA),
                Enter.theValue(VALOR_MATRIUCLA_ALCALDIA).into(INPUT_MATRICULA),
                WaitInteractions.untilBeEnable(BTN_EDITAR_MATRICULA),
                Click.on(BTN_EDITAR_MATRICULA),
                WaitInteractions.untilBeEnable(SELECT_ESTADO_ENVIO),
                SelectFromOptions.byValue(VALOR_ESTADO).from(SELECT_ESTADO_ENVIO),
                WaitInteractions.untilBeEnable(INPUT_NOMBRE_RAZON_SOCIAL),
                Enter.theValue(VALOR_NOMBRE).into(INPUT_NOMBRE_RAZON_SOCIAL),
                WaitInteractions.untilBeEnable(INPUT_FECHA),
                Enter.theValue(VALOR_FECHA_MATRICULA).into(INPUT_FECHA),
                WaitInteractions.untilBeEnable(BTN_GUARDAR_INFO_MATRICULA),
                Scroll.to(BTN_GUARDAR_INFO_MATRICULA),
                Click.on(BTN_GUARDAR_INFO_MATRICULA)
        );

        actor.attemptsTo(
                WaitInteractions.untilBeEnable(INPUT_MATRICULA),
                Enter.theValue(VALOR_MATRIUCLA_ALCALDIA).into(INPUT_MATRICULA),
                WaitInteractions.untilBeEnable(BTN_EDITAR_MATRICULA),
                Click.on(BTN_EDITAR_MATRICULA),
                WaitInteractions.untilBeEnable(INPUT_NOMBRE_RAZON_SOCIAL),
                Ensure.that(INPUT_NOMBRE_RAZON_SOCIAL).text().isEqualTo(VALOR_NOMBRE),
                Scroll.to(BTN_BORRAR_MATRICULA),
                Click.on(BTN_BORRAR_MATRICULA),
                WaitInteractions.untilBeEnable(BTN_ACEPTAR_BORRAR),
                Click.on(BTN_ACEPTAR_BORRAR)
        );

        actor.attemptsTo(
                CerrarPestana.cerrar(),
                WaitInteractions.untilBeEnable(TXT_BUSQUEDA_INPUT),
                Enter.theValue(BUSQUEDA_MTOO_ALCALDIA).into(TXT_BUSQUEDA_INPUT),
                WaitInteractions.untilBeEnable(BUSQUEDA_MTTO_MATRICULA_ALCALDIA),
                Click.on(BUSQUEDA_MTTO_MATRICULA_ALCALDIA)
        );

        actor.attemptsTo(
                CambiarALaSiguientePestana.siguiente(),
                WaitInteractions.untilBeEnable(INPUT_MATRICULA),
                Enter.theValue(VALOR_MATRIUCLA_ALCALDIA).into(INPUT_MATRICULA),
                WaitInteractions.untilBeEnable(BTN_EDITAR_MATRICULA),
                Click.on(BTN_EDITAR_MATRICULA),
                WaitInteractions.untilBeEnable(INPUT_NOMBRE_RAZON_SOCIAL)
        );
    }

    public static MttoAlcaldia matricula(){
        return Tasks.instrumented(MttoAlcaldia.class);
    }
}
