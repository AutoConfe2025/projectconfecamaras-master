package com.co.confecamaras.tasks.mantenimientoeinformes;

import com.co.confecamaras.interactions.cambiarpestana.CambiarALaSiguientePestana;
import com.co.confecamaras.interactions.leerpdf.LeerContenidoDelPDF;
import com.co.confecamaras.interactions.waitinteractions.ModalLoader;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static com.co.confecamaras.userinterfaces.MenuSistema.TXT_BUSQUEDA_INPUT;
import static com.co.confecamaras.userinterfaces.clickopciones.ClickPrimeraOpcion.BTN_PRIMERA_OPCION;
import static com.co.confecamaras.userinterfaces.mantenimientoeinformes.DetalladoGastoAdmPage.BTN_DESCARGAR;
import static com.co.confecamaras.userinterfaces.mantenimientoeinformes.DetalladoGastoAdmPage.BTN_GENERAR_;
import static com.co.confecamaras.userinterfaces.mantenimientoeinformes.IngresoPorCuentaPage.INPUT_FECHA_FINAL;
import static com.co.confecamaras.userinterfaces.mantenimientoeinformes.IngresoPorCuentaPage.INPUT_FECHA_INICIAL;
import static com.co.confecamaras.utils.mantenimientoeinformes.DetalladoGastoAdmConstants.VALOR_FECHA_FI;
import static com.co.confecamaras.utils.mantenimientoeinformes.DetalladoGastoAdmConstants.VALOR_FECHA_INI;
import static com.co.confecamaras.utils.mantenimientoeinformes.ResumidoDeImpuestosRegistroConstans.BUSQUEDA_RESUMIDO_DE_IMPUESTO;

public class ConsultarResumidoDeImpuesto implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(TXT_BUSQUEDA_INPUT),
                Enter.theValue(BUSQUEDA_RESUMIDO_DE_IMPUESTO).into(TXT_BUSQUEDA_INPUT),
                WaitInteractions.untilBeEnable(BTN_PRIMERA_OPCION),
                Click.on(BTN_PRIMERA_OPCION)
        );

        actor.attemptsTo(
                CambiarALaSiguientePestana.siguiente(),
                WaitInteractions.untilBeEnable(INPUT_FECHA_INICIAL),
                Enter.theValue(VALOR_FECHA_INI).into(INPUT_FECHA_INICIAL),
                WaitInteractions.untilBeEnable(INPUT_FECHA_FINAL),
                Enter.theValue(VALOR_FECHA_FI).into(INPUT_FECHA_FINAL),
                WaitInteractions.untilBeEnable(BTN_GENERAR_),
                Click.on(BTN_GENERAR_)
        );

        actor.attemptsTo(
                WaitInteractions.untilBeEnable(BTN_DESCARGAR),
                Click.on(BTN_DESCARGAR)
        );

        //Lectura de PDF
        String pdfURL = BrowseTheWeb.as(actor).getDriver().getCurrentUrl();
        actor.attemptsTo(LeerContenidoDelPDF.desde(pdfURL));

    }

    public static ConsultarResumidoDeImpuesto deRegistro() {
        return Tasks.instrumented(ConsultarResumidoDeImpuesto.class);
    }
}
