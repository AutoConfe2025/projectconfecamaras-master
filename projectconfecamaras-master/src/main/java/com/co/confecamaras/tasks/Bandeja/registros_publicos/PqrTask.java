package com.co.confecamaras.tasks.Bandeja.registros_publicos;

import com.co.confecamaras.database.Bandeja.QueryGeneralBaseDatos;
import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones.AdicionarComentariosTask;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones.VerRutaTask;
import com.co.confecamaras.tasks.Consulta.ConsultaGrillaTask;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.Bandejas.estudio_general.PaginaPrincial.*;
import static com.co.confecamaras.utils.estudio_general.constant.EXITO_ARCHIVAR;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.TextContent.of;
import static org.hamcrest.Matchers.containsString;
@AllArgsConstructor
public class PqrTask implements Task {
    private final String estado;
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                SwitchToNewWindow.switchToNewTab(),
                WaitUntil.the(COD_BARRAS_CAPTURAR,isPresent()).forNoMoreThan(10).seconds()
        );


        String CodigoBarrasCapturado = Text.of(COD_BARRAS_CAPTURAR).answeredBy(actor)
                .replaceAll("[^0-9]", "")
                .trim();

        actor.remember("codigoBarraCapturado",CodigoBarrasCapturado);

        System.out.println("codigo capturado" + CodigoBarrasCapturado);

        actor.attemptsTo(
                QueryGeneralBaseDatos.cambiarEstado(CodigoBarrasCapturado,estado),
                ConsultaGrillaTask.consultar(CodigoBarrasCapturado),
                VerRutaTask.verRuta("Ver ruta", CodigoBarrasCapturado),
                AdicionarComentariosTask.adicionar("Ver comentarios", "Adicionar comentarios", CodigoBarrasCapturado, "TEST COMENTARIO AUTOMATIZACION"),
                Click.on(BOTON_ARCHIVAR_TRAMITE)


        );

        String mensajeArchivar = Text.of(MENSAJE_ADVERTENCIA_ARCHIVAR_PROCESO).answeredBy(actor)
                .replaceAll("[^0-9]", "")
                .trim();

        System.out.println("mensaje archivado" + mensajeArchivar);


        actor.attemptsTo(
                Click.on(BOTON_CONFIRMAR_),
                WaitUntil.the(MENSAJE_ARCHIVAR_PROCESO_FINALIZADO, isVisible()).forNoMoreThan(10).seconds()
        );

        actor.should(
                seeThat("Mensaje archivado correctamente",
                        of(MENSAJE_ARCHIVAR_PROCESO_FINALIZADO), containsString(EXITO_ARCHIVAR))
        );
    }

    public static PqrTask digitar(String estado) {
        return new PqrTask(estado);
    }
}