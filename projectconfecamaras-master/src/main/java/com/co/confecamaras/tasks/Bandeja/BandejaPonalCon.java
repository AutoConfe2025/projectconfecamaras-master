package com.co.confecamaras.tasks.Bandeja;

import com.co.confecamaras.interactions.AlertInteractionSteps;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.cerrarpestana.CerrarPestana;
import com.co.confecamaras.interactions.waitinteractions.ModalLoader;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.utils.bandejaponal.BandejaPonalConstans;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static com.co.confecamaras.models.VariableEstudioInscripcionDocumentosProponentes.setBarcode;
import static com.co.confecamaras.userinterfaces.Bandejas.BandejaRLeyPONALPage.*;
import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static com.co.confecamaras.userinterfaces.InscripcionDocumentos.LBL_CODIGO_BARRAS_ID_DOS;

public class BandejaPonalCon implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        String barcode = LBL_CODIGO_BARRAS_ID_DOS.resolveFor(actor).getText();
        System.out.println("¡ESTE ES EL CODIGO DE BARRAS!" + barcode);
        setBarcode(barcode);

        //Bloque ingreso a la bandeja
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(BTN_BANDEJAS),
                Click.on(BTN_BANDEJAS),
                WaitInteractions.untilBeEnable(BTN_REGISTROS_PUBLICOS),
                Click.on(BTN_REGISTROS_PUBLICOS),
                WaitInteractions.untilBeEnable(BTN_LEY_1780_PONAL_NO_AUTM),
                Click.on(BTN_LEY_1780_PONAL_NO_AUTM),
                CerrarPestana.cerrar()
        );

        actor.attemptsTo(
                WaitInteractions.untilBeEnable(MENU_DES_FILTRAR),
                SelectFromOptions.byVisibleText("Mutaciones").from(MENU_DES_FILTRAR),
                WaitInteractions.untilBeEnable(BUSCADOR),
                Enter.keyValues(barcode).into(BUSCADOR),
                WaitInteractions.untilBeEnable(ASENTAMIENTO_COMPLETO),
                Click.on(ASENTAMIENTO_COMPLETO),
                WaitSeconds.seconds(5),
                AlertInteractionSteps.conElNumero("2")
                //WaitInterrupted5Segundos.esperaConstante5()
                //AlertaSentamiento.digitarOpcion()
        );
    }

    public static BandejaPonalCon asentamiento(){
        return Tasks.instrumented(BandejaPonalCon.class);
    }
}
