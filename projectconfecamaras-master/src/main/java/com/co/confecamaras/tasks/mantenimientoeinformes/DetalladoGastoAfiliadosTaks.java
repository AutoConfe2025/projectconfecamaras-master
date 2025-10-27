package com.co.confecamaras.tasks.mantenimientoeinformes;

import com.co.confecamaras.interactions.News.CloseCurrentWindowAndSwitchBackHome;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import com.co.confecamaras.tasks.utils.LeerContenidoCvs;
import com.co.confecamaras.userinterfaces.mantenimientoeinformes.DetalladoPage;
import com.co.confecamaras.utils.News.evidencias.BaseEvidencias;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import com.co.confecamaras.utils.News.gestion_archivos.GuardarArchivo;
import com.co.confecamaras.utils.constantes.mantenimientoeinformes.DetalladoGastosAfiliadosConstantes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.junit.Assert;
import org.openqa.selenium.Alert;

public class DetalladoGastoAfiliadosTaks implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilAppears(DetalladoPage.INP_FECHA_INICIO),
                Enter.theValue(DetalladoGastosAfiliadosConstantes.FECHA_INICIAL).into(DetalladoPage.INP_FECHA_INICIO),
                Enter.theValue(DetalladoGastosAfiliadosConstantes.FECHA_FINAL).into(DetalladoPage.INP_FECHA_FIN),
                SelectFromOptions.byVisibleText(DetalladoGastosAfiliadosConstantes.OPERADOR).from(DetalladoPage.SLC_OPERADOR),
                SelectFromOptions.byVisibleText(DetalladoGastosAfiliadosConstantes.FORMATO).from(DetalladoPage.SLC_FORMATO),
                Click.on(DetalladoPage.BTN_GENERAR)
        );

        Alert alert = BrowseTheWeb.as(actor).getAlert();
        try {
            actor.attemptsTo(WaitSeconds.seconds(1));
            Reportes.reportEvent(Reportes.INFO, "Mensaje Confirmacion: " + alert.getText());
            alert.accept();
        } catch (Exception e) {
            Reportes.reportEvent(Reportes.FAILED, "No fue posible generar el documento");
            Assert.fail("No fue posible generar el documento");
        }
        if (actor.asksFor(ElementoElegible.para(DetalladoPage.LINK_DESCARGAR))) {
            actor.attemptsTo(
                    Click.on(DetalladoPage.LINK_DESCARGAR),
                    GuardarArchivo.guardar(),
                    WaitSeconds.seconds(1),
                    CloseCurrentWindowAndSwitchBackHome.closeAndSwitchBackHome()
            );
        } else {
            Reportes.reportEvent(Reportes.FAILED, alert.getText());
            Assert.fail(alert.getText());
        }
        if (DetalladoGastosAfiliadosConstantes.FORMATO.contains("Csv")){
            actor.attemptsTo(LeerContenidoCvs.leerContenido(BaseEvidencias.RUTA_EVIDENCIAS,4));
        }

    }

    public static DetalladoGastoAfiliadosTaks detallado() {
        return new DetalladoGastoAfiliadosTaks();
    }
}
