package com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones;

import com.co.confecamaras.interactions.News.*;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.questions.bandeja.registros_publicos.TextoEsperadoQuestion;
import com.co.confecamaras.tasks.Consulta.ConsultaGrillaTask;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.AccionesPage.AccionesPage;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import org.junit.Assert;

public class AdicionarComentariosTask implements Task {
    private String adicionar_comentario;
    private String ver_comentarios;
    private String codigo_barras;
    private String comentario;

    public AdicionarComentariosTask(String ver_comentarios, String adicionar_comentarios, String codigo_barras, String comentario) {
        this.ver_comentarios = ver_comentarios;
        this.adicionar_comentario = adicionar_comentarios;
        this.codigo_barras = codigo_barras;
        this.comentario = comentario;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                VerComentariosTask.verComentarios(ver_comentarios),
                WaitInteractions.untilAppears(AccionesPage.LINK_ACCION.of(adicionar_comentario)),
                JavaScriptClick.on(AccionesPage.LINK_ACCION.of(adicionar_comentario)),
                WaitSeconds.seconds(1),
                ChangeToLastWindow.changeToLastWindow(),
                LogEvent.recordevent(Reportes.INFO, "Se ingreso a la accion: " + adicionar_comentario),
                WaitInteractions.untilAppears(AccionesPage.SLC_TIPO_COMENTARIO),
                SelectRandomOption.select(AccionesPage.SLC_TIPO_COMENTARIO),
                Enter.theValue(comentario).into(AccionesPage.TEXTAREA_COMENTARIO),
                WaitSeconds.seconds(1),
                Click.on(AccionesPage.BTN_GRABAR_COMENTARIO),
                WaitInteractions.untilAppears(AccionesPage.MSG_MENSAJEALMACENADO),
                GetTextOfElement.de(AccionesPage.MSG_MENSAJEALMACENADO)
        );
        if (!actor.asksFor(TextoEsperadoQuestion.verificar(AccionesPage.MSG_MENSAJEALMACENADO, "Comentario almacenado"))) {
            Reportes.reportEvent(Reportes.FAILED, "No coincide el mensaje esperado");
            Assert.fail("No coincide el mensaje esperado");
        }
        actor.attemptsTo(
                CloseCurrentWindowAndSwitchBack.closeAndSwitchBack(),
                RefreshPage.refresh(),
                WaitSeconds.seconds(1),
                ConsultaGrillaTask.consultar(codigo_barras),
                VerComentariosTask.verComentarios(ver_comentarios)
        );
    }

    public static AdicionarComentariosTask adicionar(String ver_comentarios, String adicionar_comentarios, String codigo_barras, String comentario) {
        return Tasks.instrumented(AdicionarComentariosTask.class, ver_comentarios, adicionar_comentarios, codigo_barras, comentario);
    }

}
