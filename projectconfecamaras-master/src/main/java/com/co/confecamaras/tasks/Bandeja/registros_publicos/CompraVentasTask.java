package com.co.confecamaras.tasks.Bandeja.registros_publicos;

import com.co.confecamaras.database.Bandeja.QueryGeneralBaseDatos;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.tasks.Bandeja.compraventa.ValidarEstudioCompraventa;
import com.co.confecamaras.tasks.Bandeja.estudio_general.ValidarModuloEstudio;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.DigitacionAcciones.*;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.LibrosComercio.DevolverRequerirTask;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones.AdicionarComentariosTask;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones.VerRutaTask;
import com.co.confecamaras.tasks.Consulta.ConsultaGrillaTask;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.AccionesPage.AccionesPage;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.DigitacionPage;
import com.co.confecamaras.userinterfaces.RepartoDocumentosUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;


import com.co.confecamaras.questions.Consulta.ResultadoConsultaNoEncontrado;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static com.co.confecamaras.userinterfaces.Bandejas.estudio_general.PaginaPrincial.*;
import static com.co.confecamaras.userinterfaces.Bandejas.estudio_general.PaginaPrincial.MENSAJE_ARCHIVAR_PROCESO_FINALIZADO;
import static com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.AccionesPage.AccionesPage.*;
import static com.co.confecamaras.userinterfaces.DataInscripcionDocumentosMercantilUI.*;
import static com.co.confecamaras.userinterfaces.InscripcionDocumentos.BTN_REFRESCAR;
import static com.co.confecamaras.utils.estudio_general.constant.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.TextContent.of;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;


public class CompraVentasTask implements Task {
    private final String codigo_barras;
    private final String estado;
    private static final String TIPO_USUARIO = "CAJAQA(CAJAQA)";

    public CompraVentasTask(String codigo_barras, String estado) {
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
                ValidarEstudioCompraventa.ValidoEstudio(),
                JavaScriptClick.on(AccionesPage.LINK_ACCION.of("Devolver/Requerir")),
                WaitInteractions.untilBeEnable(BTN_OK),
                Click.on(AccionesPage.BTN_OK),
                WaitInteractions.untilBeEnable(BTN_FINALIZAR_ESTUDIO),
                Click.on(BTN_FINALIZAR_ESTUDIO),
                WaitInteractions.untilBeEnable(BTN_CANCELAR_F),
                Click.on(BTN_CANCELAR_F),
                WaitInteractions.untilBeEnable(BTN_FINALIZAR_ESTUDIO),
                Click.on(BTN_FINALIZAR_ESTUDIO),
                WaitInteractions.untilBeEnable(BTN_CONTINUAR_F),
                Click.on(BTN_CONTINUAR_F),
                SelectFromOptions.byVisibleText(TIPO_USUARIO).from(RepartoDocumentosUI.SELECT_USUARIO_REPARTO_DOCUMENTOS),
                Click.on(BTN_ASIGNAR_DIDM),
                Click.on(DigitacionPage.BTN_VOLVER)
        );


//        actor.should(
//                GivenWhenThen.seeThat(
//
//                        ResultadoConsultaNoEncontrado.elDato(codigo_barras),
//                        is(true)
//                )
//        );

        actor.attemptsTo(
                QueryGeneralBaseDatos.cambiarEstado(codigo_barras,estado),
                SwitchToNewWindow.switchToNewTab(),
                WaitSeconds.seconds(10),
                Click.on(BTN_REFRESCAR),

                ConsultaGrillaTask.consultar(codigo_barras),
                JavaScriptClick.on(AccionesPage.LINK_ACCION.of("Desistimiento voluntario")),

                WaitInteractions.untilBeEnable(BTN_CANCELAR_F),
                Click.on(BTN_CANCELAR_F),
                 Click.on(BOTON_ARCHIVAR_TRAMITE)
        );

        actor.should(
                seeThat("Mensaje advertencia archivar",
                        of(MENSAJE_ADVERTENCIA_ARCHIVAR_PROCESO), containsString(ADVERTENCIA_ARCHIVAR2))
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

    public static CompraVentasTask digitar(String codigo_barras, String estado) {
        return new CompraVentasTask(codigo_barras , estado);
    }
}