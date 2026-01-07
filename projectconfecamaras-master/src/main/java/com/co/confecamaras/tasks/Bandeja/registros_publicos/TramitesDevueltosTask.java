package com.co.confecamaras.tasks.Bandeja.registros_publicos;

import com.co.confecamaras.database.Bandeja.QueryGeneralBaseDatos;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones.AdicionarComentariosTask;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones.VerRutaTask;
import com.co.confecamaras.tasks.Consulta.ConsultaGrillaTask;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.AccionesPage.AccionesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.co.confecamaras.userinterfaces.Bandejas.estudio_general.PaginaPrincial.BOTON_CONFIRMAR_;

public class TramitesDevueltosTask implements Task {
    private final String codigo_barras;
    private final String estado;


    public TramitesDevueltosTask(String codigo_barras, String estado) {
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
                ConsultaGrillaTask.consultar(codigo_barras)
        );
                  actor.attemptsTo(
                    Click.on(AccionesPage.LINK_ACCION.of("Entregar al usuario")),
                    Click.on(BOTON_CONFIRMAR_),
                    WaitSeconds.seconds(3)
            );

    }

    public static TramitesDevueltosTask devueltos(String codigo_barras, String estado) {
        return new TramitesDevueltosTask(codigo_barras,estado);
    }
}
