package com.co.confecamaras.tasks.Bandeja.registros_publicos;

import com.co.confecamaras.database.Bandeja.QueryGeneralBaseDatos;
import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.DigitacionAcciones.DigitarInformacionCorreccionTask;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.DigitacionAcciones.FinalizarProcesoDigitacionTask;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones.AdicionarComentariosTask;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones.VerRutaTask;
import com.co.confecamaras.tasks.Consulta.ConsultaGrillaTask;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.AccionesPage.AccionesPage;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.questions.Text;

import static com.co.confecamaras.userinterfaces.Bandejas.estudio_general.PaginaPrincial.COD_BARRAS_CAPTURAR;

@AllArgsConstructor
public class CorreccionesTask implements Task {
    private final String estado;

    @Override
    public <T extends Actor> void performAs(T actor) {

        String CodigoBarrasCapturado = Text.of(COD_BARRAS_CAPTURAR).answeredBy(actor)
                .replaceAll("[^0-9]", "")
                .trim();

        actor.attemptsTo(
                QueryGeneralBaseDatos.cambiarEstado(CodigoBarrasCapturado,estado),
                SwitchToNewWindow.switchToNewTab(),
                ConsultaGrillaTask.consultar(CodigoBarrasCapturado),
                VerRutaTask.verRuta("Ver ruta", CodigoBarrasCapturado),
                AdicionarComentariosTask.adicionar("Ver comentarios", "Adicionar comentarios", CodigoBarrasCapturado, "TEST COMENTARIO AUTOMATIZACION"),
                ConsultaGrillaTask.consultar(CodigoBarrasCapturado),
                JavaScriptClick.on(AccionesPage.LINK_ACCION.of("Digitar informacion")),
                DigitarInformacionCorreccionTask.digitarInformacion(),
                FinalizarProcesoDigitacionTask.finalizar()
        );
    }

    public static CorreccionesTask digitar(String estado) {
        return new CorreccionesTask(estado);
    }
}