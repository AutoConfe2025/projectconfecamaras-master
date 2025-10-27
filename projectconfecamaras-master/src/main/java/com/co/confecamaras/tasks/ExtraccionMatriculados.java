package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.WaitInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.ExtraccionMatriculadosUI.*;
import static net.serenitybdd.screenplay.Tasks.*;

public class ExtraccionMatriculados implements Task {

    private String idFechaMatriculaInicial;
    private String idFechaMatriculaFinal;
    private String idUltimoAnoRenovadoInicial;
    private String idUltimoAnoRenovadoFinal;

    public ExtraccionMatriculados(String idFechaMatriculaInicial, String idFechaMatriculaFinal,
                                  String idUltimoAnoRenovadoInicial, String idUltimoAnoRenovadoFinal) {
        this.idFechaMatriculaInicial = idFechaMatriculaInicial;
        this.idFechaMatriculaFinal = idFechaMatriculaFinal;
        this.idUltimoAnoRenovadoInicial = idUltimoAnoRenovadoInicial;
        this.idUltimoAnoRenovadoFinal = idUltimoAnoRenovadoFinal;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilDisappears(ESPERA),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                WaitInteractions.untilAppears(BTN_MODULO_REGISTRO_2),
                Scroll.to(BTN_MODULO_REGISTRO_2).andAlignToBottom(),
                JavaScriptClick.on(BTN_MODULO_REGISTRO_2),
                WaitInteractions.untilAppears(BTN_REGISTROS_PUBLICOS_ESTADISTICAS_EXTRACCIONES),
                Scroll.to(BTN_REGISTROS_PUBLICOS_ESTADISTICAS_EXTRACCIONES).andAlignToBottom(),
                JavaScriptClick.on(BTN_REGISTROS_PUBLICOS_ESTADISTICAS_EXTRACCIONES),
                WaitInteractions.untilAppears(BTN_EXTRACCION_MATRICULADOS),
                Scroll.to(BTN_EXTRACCION_MATRICULADOS).andAlignToBottom(),
                JavaScriptClick.on(BTN_EXTRACCION_MATRICULADOS),
                Switch.toNewWindow(),
                Enter.theValue(idFechaMatriculaInicial).into(TXT_FECHA_MATRICULA_INICIAL_EXTRACCION_MATRICULADOS),
                Enter.theValue(idFechaMatriculaFinal).into(TXT_FECHA_MATRICULA_FINAL_EXTRACCION_MATRICULADOS),
                Enter.theValue(idUltimoAnoRenovadoInicial).into(TXT_ULTIMO_ANO_RENOVADO_INICIAL_EXTRACCION_MATRICULADOS),
                Enter.theValue(idUltimoAnoRenovadoFinal).into(TXT_ULTIMO_ANO_RENOVADO_FINAL_EXTRACCION_MATRICULADOS),
                Click.on(BTN_GENERAR_EXTRACCION_MATRICULADOS),
                WaitInteractions.untilAppears(BTN_GENERAR_DOS_EXTRACCION_MATRICULADOS),
                Click.on(BTN_GENERAR_DOS_EXTRACCION_MATRICULADOS)
        );
    }

    public static ExtraccionMatriculados enConfecamaraSII(String idFechaMatriculaInicial, String idFechaMatriculaFinal,
                                                          String idUltimoAnoRenovadoInicial, String idUltimoAnoRenovadoFinal){
        return instrumented(ExtraccionMatriculados.class, idFechaMatriculaInicial, idFechaMatriculaFinal, idUltimoAnoRenovadoInicial,
                idUltimoAnoRenovadoFinal);
    }
}