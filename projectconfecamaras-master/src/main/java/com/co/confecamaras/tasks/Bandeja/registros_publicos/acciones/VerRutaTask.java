package com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones;


import com.co.confecamaras.interactions.News.ChangeToLastWindow;
import com.co.confecamaras.interactions.News.CloseCurrentWindowAndSwitchBack;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.questions.bandeja.registros_publicos.TextoEsperadoQuestion;
import com.co.confecamaras.tasks.utils.ControlDescargas;
import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.AccionesPage.AccionesPage;
import com.co.confecamaras.utils.News.evidencias.BaseEvidencias;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import com.co.confecamaras.utils.News.gestion_archivos.GuardarArchivo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import org.junit.Assert;

public class VerRutaTask implements Task {
    private String accion;
    private String codigo_barras;

    public VerRutaTask(String accion, String codigo_barras) {
        this.accion = accion;
        this.codigo_barras = codigo_barras;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilAppears(AccionesPage.LINK_ACCION.of(accion)),
                JavaScriptClick.on(AccionesPage.LINK_ACCION.of(accion)),
                WaitSeconds.seconds(1),
                ChangeToLastWindow.changeToLastWindow(),
                LogEvent.recordevent(Reportes.INFO, "Se ingreso a la accion: " + accion),
                WaitInteractions.untilAppears(AccionesPage.TITULO_VER_RUTA)
        );
        boolean validar = actor.asksFor(TextoEsperadoQuestion.verificar(AccionesPage.TITULO_VER_RUTA, codigo_barras));
        if (!validar) {
            Reportes.reportEvent(Reportes.FAILED, "No coincide el numero de barras: " + codigo_barras);
            Assert.fail("No coincide el numero de barras: " + codigo_barras);
        }
        //List<WebElementFacade> filas = AccionesPage.TABLA_ANEXOS.resolveAllFor(actor);
        //for (int i = 0; i <= filas.size(); i++) {
        actor.attemptsTo(
                Scroll.to(AccionesPage.TABLA_ANEXOS),
                Click.on(AccionesPage.TABLA_ANEXOS),
                //Click.on(AccionesPage.TABLA_ANEXOS_RESULTADOS.of(String.valueOf(i))),
                GuardarArchivo.guardar(),
                ControlDescargas.hastaTerminar(BaseEvidencias.RUTA_EVIDENCIAS)
        );
        //}
        actor.attemptsTo(WaitSeconds.seconds(1), CloseCurrentWindowAndSwitchBack.closeAndSwitchBack());

    }

    public static VerRutaTask verRuta(String accion, String codigo_barras) {
        return new VerRutaTask(accion, codigo_barras);
    }
}
