package com.co.confecamaras.tasks.Bandeja.registros_publicos;

import com.co.confecamaras.database.Bandeja.QueryGeneralBaseDatos;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.SwitchToNewWindow;

import com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones.AdicionarComentariosTask;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones.VerRutaTask;
import com.co.confecamaras.tasks.Consulta.ConsultaGrillaTask;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.Bandejas.estudio_general.PaginaPrincial.*;
import static com.co.confecamaras.utils.estudio_general.constant.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.TextContent.of;
import static org.hamcrest.Matchers.containsString;


public class PqrTask implements Task {
    private final String codigo_barras;
    private final String estado;
    public PqrTask(String codigo_barras, String estado) {
        this.codigo_barras = codigo_barras;
        this.estado = estado;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                QueryGeneralBaseDatos.cambiarEstado(codigo_barras,estado),
                SwitchToNewWindow.switchToNewTab(),
                ConsultaGrillaTask.consultar(codigo_barras),
                VerRutaTask.verRuta("Ver ruta", codigo_barras),
                AdicionarComentariosTask.adicionar("Ver comentarios", "Adicionar comentarios", codigo_barras, "TEST COMENTARIO AUTOMATIZACION"),
                Click.on(BOTON_ARCHIVAR_TRAMITE)


        );


        actor.should(

                seeThat("Mensaje advertencia archivar",
                        of(MENSAJE_ADVERTENCIA_ARCHIVAR_PROCESO), containsString(ADVERTENCIA_ARCHIVAR3))
        );

        actor.attemptsTo(
                Click.on(BOTON_CONFIRMAR_),
                WaitUntil.the(MENSAJE_ARCHIVAR_PROCESO_FINALIZADO, isVisible()).forNoMoreThan(10).seconds()
        );

        actor.should(
                seeThat("Mensaje archivado correctamente",
                        of(MENSAJE_ARCHIVAR_PROCESO_FINALIZADO), containsString(EXITO_ARCHIVAR))
        );









    }

    public static PqrTask digitar(String codigo_barras, String estado) {
        return new PqrTask(codigo_barras , estado);
    }
}