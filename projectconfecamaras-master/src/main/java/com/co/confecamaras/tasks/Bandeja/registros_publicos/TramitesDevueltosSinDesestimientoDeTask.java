package com.co.confecamaras.tasks.Bandeja.registros_publicos;

import com.co.confecamaras.database.Bandeja.QueryGeneralBaseDatos;
import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones.AdicionarComentariosTask;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones.ArchivarTask;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones.VerRutaConExpedienteAnexosask;
import com.co.confecamaras.tasks.Consulta.ConsultaGrillaTask;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.AccionesPage.AccionesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

import static com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.AccionesPage.AccionesPage.BTN_CANCELAR_F;

public class TramitesDevueltosSinDesestimientoDeTask implements Task {
    private final String codigo_barras;
    private final String estado;


    public TramitesDevueltosSinDesestimientoDeTask(String codigo_barras, String estado) {
        this.codigo_barras = codigo_barras;
        this.estado = estado;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                QueryGeneralBaseDatos.cambiarEstado(codigo_barras, estado),
                SwitchToNewWindow.switchToNewTab(),
                ConsultaGrillaTask.consultar(codigo_barras),
                VerRutaConExpedienteAnexosask.verRuta("Ver ruta", codigo_barras),
                AdicionarComentariosTask.adicionar("Ver comentarios", "Adicionar comentarios", codigo_barras, "TEST COMENTARIO AUTOMATIZACION"),
                JavaScriptClick.on(AccionesPage.LINK_ACCION.of("Desistir")),
                WaitInteractions.untilBeEnable(BTN_CANCELAR_F),
                Click.on(BTN_CANCELAR_F),
                ArchivarTask.archivar()
        );

    }

    public static TramitesDevueltosSinDesestimientoDeTask devueltos(String codigo_barras, String estado) {
        return new TramitesDevueltosSinDesestimientoDeTask(codigo_barras, estado);
    }
}
