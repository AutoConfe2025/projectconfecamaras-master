package com.co.confecamaras.tasks.Bandeja.registros_publicos;

import com.co.confecamaras.database.Bandeja.QueryGeneralBaseDatos;
import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.DigitacionAcciones.*;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones.AdicionarComentariosTask;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones.VerRutaTask;
import com.co.confecamaras.tasks.Consulta.ConsultaGrillaTask;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.AccionesPage.AccionesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.JavaScriptClick;


import com.co.confecamaras.questions.Consulta.ResultadoConsultaNoEncontrado;
import static org.hamcrest.Matchers.is;


public class DigitacionGeneralTask implements Task {
    private final String codigo_barras;
    private final String estado;


    public DigitacionGeneralTask(String codigo_barras, String estado) {
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
                ConsultaGrillaTask.consultar(codigo_barras),
                JavaScriptClick.on(AccionesPage.LINK_ACCION.of("Digitar informacion")),
                AdicionarVinculosTask.adicionar(),
                FinalizarDigitacionTask.finalizar()


        );


        actor.should(
                GivenWhenThen.seeThat(

                        ResultadoConsultaNoEncontrado.elDato(codigo_barras),
                        is(true)
                )
        );
    }

    public static DigitacionGeneralTask digitar(String codigo_barras, String estado) {
        return new DigitacionGeneralTask(codigo_barras , estado);
    }
}