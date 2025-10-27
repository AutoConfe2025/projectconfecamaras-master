package com.co.confecamaras.tasks.mantenimientoeinformes;

import com.co.confecamaras.interactions.News.CloseCurrentWindowAndSwitchBackHome;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import com.co.confecamaras.tasks.utils.LeerContenidoCvs;
import com.co.confecamaras.userinterfaces.mantenimientoeinformes.DetalladoPage;
import com.co.confecamaras.utils.News.evidencias.BaseEvidencias;
import com.co.confecamaras.utils.News.gestion_archivos.GuardarArchivo;
import com.co.confecamaras.utils.constantes.mantenimientoeinformes.DetalladoRecibosAnuladosConstantes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class DetalladoRecibosAnuladosTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilAppears(DetalladoPage.INP_FECHA_INICIO),
                Enter.theValue(DetalladoRecibosAnuladosConstantes.FECHA_INICIAL).into(DetalladoPage.INP_FECHA_INICIO),
                Enter.theValue(DetalladoRecibosAnuladosConstantes.FECHA_FINAL).into(DetalladoPage.INP_FECHA_FIN),
                SelectFromOptions.byVisibleText(DetalladoRecibosAnuladosConstantes.OPERADOR).from(DetalladoPage.SLC_OPERADOR),
                SelectFromOptions.byVisibleText(DetalladoRecibosAnuladosConstantes.FORMATO).from(DetalladoPage.SLC_FORMATO),
                Click.on(DetalladoPage.BTN_GENERAR)
        );

        if (actor.asksFor(ElementoElegible.para(DetalladoPage.LINK_DESCARGAR))) {
            actor.attemptsTo(
                    Click.on(DetalladoPage.LINK_DESCARGAR),
                    GuardarArchivo.guardar(),
                    WaitSeconds.seconds(1),
                    CloseCurrentWindowAndSwitchBackHome.closeAndSwitchBackHome()
            );
        }
        if (DetalladoRecibosAnuladosConstantes.FORMATO.contains("Csv")){
            actor.attemptsTo(LeerContenidoCvs.leerContenido(BaseEvidencias.RUTA_EVIDENCIAS,4));
        }
    }

    public static DetalladoRecibosAnuladosTask detallado(){
        return new DetalladoRecibosAnuladosTask();
    }
}
