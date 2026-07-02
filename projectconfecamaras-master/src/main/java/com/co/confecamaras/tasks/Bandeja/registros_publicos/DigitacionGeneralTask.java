package com.co.confecamaras.tasks.Bandeja.registros_publicos;

import com.co.confecamaras.database.Bandeja.QueryGeneralBaseDatos;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.DigitacionAcciones.*;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones.AdicionarComentariosTask;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones.VerRutaTask;
import com.co.confecamaras.tasks.Consulta.ConsultaGrillaTask;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.AccionesPage.AccionesPage;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.DigitacionPage;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.JavaScriptClick;


import com.co.confecamaras.questions.Consulta.ResultadoConsultaNoEncontrado;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static com.co.confecamaras.userinterfaces.Bandejas.estudio_general.PaginaPrincial.COD_BARRAS_CAPTURAR;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.is;

@AllArgsConstructor
public class DigitacionGeneralTask implements Task {
    private final String estado;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SwitchToNewWindow.switchToNewTab(),
                WaitUntil.the(COD_BARRAS_CAPTURAR, isVisible())
                        .forNoMoreThan(30).seconds()
        );


        WebElement elemento = COD_BARRAS_CAPTURAR.resolveFor(actor);

        String CodigoBarrasCapturado = (String) ((JavascriptExecutor) BrowseTheWeb.as(actor).getDriver())
                .executeScript(
                        "return arguments[0].childNodes[0].nodeValue.trim();",
                        elemento
                );

        System.out.println(CodigoBarrasCapturado);

        actor.attemptsTo(
                QueryGeneralBaseDatos.cambiarEstado(CodigoBarrasCapturado,estado),
                ConsultaGrillaTask.consultar(CodigoBarrasCapturado),
                VerRutaTask.verRuta("Ver ruta", CodigoBarrasCapturado),
                AdicionarComentariosTask.adicionar("Ver comentarios", "Adicionar comentarios", CodigoBarrasCapturado, "TEST COMENTARIO AUTOMATIZACION"),
                ConsultaGrillaTask.consultar(CodigoBarrasCapturado),
                JavaScriptClick.on(AccionesPage.LINK_ACCION.of("Digitar informacion")),
                AdicionarVinculosTask.adicionar(),
                WaitSeconds.seconds(2),
                Scroll.to(DigitacionPage.ENLACE_FINALIZAR_DIGITACION)

        );
    }

    public static DigitacionGeneralTask digitar(String estado) {
        return new DigitacionGeneralTask(estado);
    }
}