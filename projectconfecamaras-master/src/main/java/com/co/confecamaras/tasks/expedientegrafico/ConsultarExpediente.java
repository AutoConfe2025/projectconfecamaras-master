package com.co.confecamaras.tasks.expedientegrafico;

import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.tasks.Consulta.ConsultaModuloTask;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;

import static com.co.confecamaras.userinterfaces.expedientegrafico.ExpedienteGraficoPage.*;

public class ConsultarExpediente implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ConsultaModuloTask.consultarModulo("Expediente gráfico"),
                Click.on(BTN_CERRAR_MENU),
                WaitInteractions.untilBeEnable(SELECT_BANDEJA),
                SelectFromOptions.byValue("15.-oficios").from(SELECT_BANDEJA),
                WaitInteractions.untilBeEnable(BTN_CONTINUAR_CONSUL),
                Scroll.to(BTN_CONTINUAR_CONSUL).then(Click.on(BTN_CONTINUAR_CONSUL)),
                WaitInteractions.untilBeEnable(BTN_VER_DOCUMENT),
                JavaScriptClick.on(BTN_VER_DOCUMENT),
                WaitInteractions.untilBeEnable(BTN_CERRAR_DOCU),
                Click.on(BTN_CERRAR_DOCU),
                WaitInteractions.untilBeEnable(BTN_REGRESAR),
                Click.on(BTN_REGRESAR),
                WaitInteractions.untilBeEnable(BTN_LIMPIAR),
                Click.on(BTN_LIMPIAR)
        );

        actor.attemptsTo(
                WaitInteractions.untilBeEnable(INTPUT_ID_ANEXO),
                Enter.theValue("8489315").into(INTPUT_ID_ANEXO),
                WaitInteractions.untilBeEnable(BTN_CONTINUAR_CONSUL),
                Scroll.to(BTN_CONTINUAR_CONSUL).then(Click.on(BTN_CONTINUAR_CONSUL)),
                WaitInteractions.untilBeEnable(BTN_VER_DOCUMENT),
                JavaScriptClick.on(BTN_VER_DOCUMENT),
                WaitInteractions.untilBeEnable(BTN_CERRAR_DOCU),
                Click.on(BTN_CERRAR_DOCU),
                WaitInteractions.untilBeEnable(BTN_REGRESAR),
                Click.on(BTN_REGRESAR),
                WaitInteractions.untilBeEnable(BTN_LIMPIAR),
                Click.on(BTN_LIMPIAR)
        );

        actor.attemptsTo(
                WaitInteractions.untilBeEnable(INTPUT_COD_BARRAS),
                Enter.theValue("640218").into(INTPUT_COD_BARRAS),
                WaitInteractions.untilBeEnable(BTN_CONTINUAR_CONSUL),
                Scroll.to(BTN_CONTINUAR_CONSUL).then(Click.on(BTN_CONTINUAR_CONSUL)),
                WaitInteractions.untilBeEnable(BTN_VER_DOCUMENT),
                JavaScriptClick.on(BTN_VER_DOCUMENT),
                WaitInteractions.untilBeEnable(BTN_CERRAR_DOCU),
                Click.on(BTN_CERRAR_DOCU),
                WaitInteractions.untilBeEnable(BTN_REGRESAR),
                Click.on(BTN_REGRESAR),
                WaitInteractions.untilBeEnable(BTN_LIMPIAR),
                Click.on(BTN_LIMPIAR)
        );

        actor.attemptsTo(
                WaitInteractions.untilBeEnable(INTPUT_RECIBO),
                Enter.theValue("S000846379").into(INTPUT_RECIBO),
                WaitInteractions.untilBeEnable(BTN_CONTINUAR_CONSUL),
                Scroll.to(BTN_CONTINUAR_CONSUL).then(Click.on(BTN_CONTINUAR_CONSUL)),
                WaitInteractions.untilBeEnable(BTN_VER_DOCUMENT),
                JavaScriptClick.on(BTN_VER_DOCUMENT),
                WaitInteractions.untilBeEnable(BTN_CERRAR_DOCU),
                Click.on(BTN_CERRAR_DOCU),
                WaitInteractions.untilBeEnable(BTN_REGRESAR),
                Click.on(BTN_REGRESAR),
                WaitInteractions.untilBeEnable(BTN_LIMPIAR),
                Click.on(BTN_LIMPIAR)
        );

        actor.attemptsTo(
                WaitInteractions.untilBeEnable(INTPUT_NO_OPERACION),
                Enter.theValue("1").into(INTPUT_NO_OPERACION),
                WaitInteractions.untilBeEnable(BTN_CONTINUAR_CONSUL),
                Scroll.to(BTN_CONTINUAR_CONSUL).then(Click.on(BTN_CONTINUAR_CONSUL)),
                WaitInteractions.untilBeEnable(BTN_VER_DOCUMENT),
                JavaScriptClick.on(BTN_VER_DOCUMENT),
                WaitInteractions.untilBeEnable(BTN_CERRAR_DOCU),
                Click.on(BTN_CERRAR_DOCU),
                WaitInteractions.untilBeEnable(BTN_REGRESAR),
                Click.on(BTN_REGRESAR),
                WaitInteractions.untilBeEnable(BTN_LIMPIAR),
                Click.on(BTN_LIMPIAR)
        );

        actor.attemptsTo(
                WaitInteractions.untilBeEnable(INTPUT_ID_IDENTIFICACION),
                Enter.theValue("9012783419").into(INTPUT_ID_IDENTIFICACION),
                WaitInteractions.untilBeEnable(BTN_CONTINUAR_CONSUL),
                Scroll.to(BTN_CONTINUAR_CONSUL).then(Click.on(BTN_CONTINUAR_CONSUL)),
                WaitInteractions.untilBeEnable(BTN_VER_DOCUMENT),
                JavaScriptClick.on(BTN_VER_DOCUMENT),
                WaitInteractions.untilBeEnable(BTN_CERRAR_DOCU),
                Click.on(BTN_CERRAR_DOCU),
                WaitInteractions.untilBeEnable(BTN_REGRESAR),
                Click.on(BTN_REGRESAR),
                WaitInteractions.untilBeEnable(BTN_LIMPIAR),
                Click.on(BTN_LIMPIAR)
        );

        actor.attemptsTo(
                WaitInteractions.untilBeEnable(INPUT_NOMBRE),
                Enter.theValue("INGESOLUCIONES- INGENIERIA Y SOLUCIONES S.A.S").into(INPUT_NOMBRE),
                WaitInteractions.untilBeEnable(BTN_CONTINUAR_CONSUL),
                Scroll.to(BTN_CONTINUAR_CONSUL).then(Click.on(BTN_CONTINUAR_CONSUL)),
                WaitInteractions.untilBeEnable(BTN_VER_DOCUMENT),
                JavaScriptClick.on(BTN_VER_DOCUMENT),
                WaitInteractions.untilBeEnable(BTN_CERRAR_DOCU),
                Click.on(BTN_CERRAR_DOCU),
                WaitInteractions.untilBeEnable(BTN_REGRESAR),
                Click.on(BTN_REGRESAR),
                WaitInteractions.untilBeEnable(BTN_LIMPIAR),
                Click.on(BTN_LIMPIAR)
        );

        actor.attemptsTo(
                WaitInteractions.untilBeEnable(INPUT_MATRICULA),
                Enter.theValue("200196").into(INPUT_MATRICULA),
                WaitInteractions.untilBeEnable(BTN_CONTINUAR_CONSUL),
                Scroll.to(BTN_CONTINUAR_CONSUL).then(Click.on(BTN_CONTINUAR_CONSUL)),
                WaitInteractions.untilBeEnable(BTN_VER_DOCUMENT),
                JavaScriptClick.on(BTN_VER_DOCUMENT),
                WaitInteractions.untilBeEnable(BTN_CERRAR_DOCU),
                Click.on(BTN_CERRAR_DOCU),
                WaitInteractions.untilBeEnable(BTN_REGRESAR),
                Click.on(BTN_REGRESAR),
                WaitInteractions.untilBeEnable(BTN_LIMPIAR),
                Click.on(BTN_LIMPIAR)
        );

        actor.attemptsTo(
                WaitInteractions.untilBeEnable(INPUT_PROPONENTE),
                Enter.theValue("3658").into(INPUT_PROPONENTE),
                WaitInteractions.untilBeEnable(BTN_CONTINUAR_CONSUL),
                Scroll.to(BTN_CONTINUAR_CONSUL).then(Click.on(BTN_CONTINUAR_CONSUL)),
                WaitInteractions.untilBeEnable(BTN_VER_DOCUMENT),
                JavaScriptClick.on(BTN_VER_DOCUMENT),
                WaitInteractions.untilBeEnable(BTN_CERRAR_DOCU),
                Click.on(BTN_CERRAR_DOCU),
                WaitInteractions.untilBeEnable(BTN_REGRESAR),
                Click.on(BTN_REGRESAR),
                WaitInteractions.untilBeEnable(BTN_LIMPIAR),
                Click.on(BTN_LIMPIAR)
        );

        actor.attemptsTo(
                WaitInteractions.untilBeEnable(SELECT_TIPO_DOCUMENTO),
                SelectFromOptions.byValue("45.05.001").from(SELECT_TIPO_DOCUMENTO),
                WaitInteractions.untilBeEnable(BTN_CONTINUAR_CONSUL),
                Scroll.to(BTN_CONTINUAR_CONSUL).then(Click.on(BTN_CONTINUAR_CONSUL)),
                WaitInteractions.untilBeEnable(BTN_VER_DOCUMENT),
                JavaScriptClick.on(BTN_VER_DOCUMENT),
                WaitInteractions.untilBeEnable(BTN_CERRAR_DOCU),
                Click.on(BTN_CERRAR_DOCU),
                WaitInteractions.untilBeEnable(BTN_REGRESAR),
                Click.on(BTN_REGRESAR),
                WaitInteractions.untilBeEnable(BTN_LIMPIAR),
                Click.on(BTN_LIMPIAR)
        );

        actor.attemptsTo(
                WaitInteractions.untilBeEnable(INPUT_NO_DOCUMENTO),
                Enter.theValue("9012783419").into(INPUT_NO_DOCUMENTO),
                WaitInteractions.untilBeEnable(BTN_CONTINUAR_CONSUL),
                Scroll.to(BTN_CONTINUAR_CONSUL).then(Click.on(BTN_CONTINUAR_CONSUL)),
                WaitInteractions.untilBeEnable(BTN_VER_DOCUMENT),
                JavaScriptClick.on(BTN_VER_DOCUMENT),
                WaitInteractions.untilBeEnable(BTN_CERRAR_DOCU),
                Click.on(BTN_CERRAR_DOCU),
                WaitInteractions.untilBeEnable(BTN_REGRESAR),
                Click.on(BTN_REGRESAR),
                WaitInteractions.untilBeEnable(BTN_LIMPIAR),
                Click.on(BTN_LIMPIAR)
        );

        actor.attemptsTo(
                WaitInteractions.untilBeEnable(INPUT_FECHA_INICIAL),
                Enter.theValue("2024-01-01").into(INPUT_FECHA_INICIAL),
                WaitInteractions.untilBeEnable(INPUT_FECHA_FINAL),
                Enter.theValue("2024-01-31").into(INPUT_FECHA_FINAL),
                WaitInteractions.untilBeEnable(BTN_CONTINUAR_CONSUL),
                Scroll.to(BTN_CONTINUAR_CONSUL).then(Click.on(BTN_CONTINUAR_CONSUL)),
                WaitInteractions.untilBeEnable(BTN_VER_DOCUMENT),
                JavaScriptClick.on(BTN_VER_DOCUMENT),
                WaitInteractions.untilBeEnable(BTN_CERRAR_DOCU),
                Click.on(BTN_CERRAR_DOCU),
                WaitInteractions.untilBeEnable(BTN_REGRESAR),
                Click.on(BTN_REGRESAR),
                WaitInteractions.untilBeEnable(BTN_LIMPIAR),
                Click.on(BTN_LIMPIAR)
        );

        actor.attemptsTo(
                WaitInteractions.untilBeEnable(INPUT_LIBRO_REGISTRO),
                Enter.theValue("RM15").into(INPUT_LIBRO_REGISTRO),
                WaitInteractions.untilBeEnable(BTN_CONTINUAR_CONSUL),
                Scroll.to(BTN_CONTINUAR_CONSUL).then(Click.on(BTN_CONTINUAR_CONSUL)),
                WaitInteractions.untilBeEnable(BTN_VER_DOCUMENT),
                JavaScriptClick.on(BTN_VER_DOCUMENT),
                WaitInteractions.untilBeEnable(BTN_CERRAR_DOCU),
                Click.on(BTN_CERRAR_DOCU),
                WaitInteractions.untilBeEnable(BTN_REGRESAR),
                Click.on(BTN_REGRESAR),
                WaitInteractions.untilBeEnable(BTN_LIMPIAR),
                Click.on(BTN_LIMPIAR)
        );

        actor.attemptsTo(
                WaitInteractions.untilBeEnable(INPUT_NUM_REGISTRO),
                Enter.theValue("374945").into(INPUT_NUM_REGISTRO),
                WaitInteractions.untilBeEnable(BTN_CONTINUAR_CONSUL),
                Scroll.to(BTN_CONTINUAR_CONSUL).then(Click.on(BTN_CONTINUAR_CONSUL)),
                WaitInteractions.untilBeEnable(BTN_VER_DOCUMENT),
                JavaScriptClick.on(BTN_VER_DOCUMENT),
                WaitInteractions.untilBeEnable(BTN_CERRAR_DOCU),
                Click.on(BTN_CERRAR_DOCU),
                WaitInteractions.untilBeEnable(BTN_REGRESAR),
                Click.on(BTN_REGRESAR),
                WaitInteractions.untilBeEnable(BTN_LIMPIAR),
                Click.on(BTN_LIMPIAR)
        );

        actor.attemptsTo(
                WaitInteractions.untilBeEnable(INPUT_IDENTIFICADOR),
                Enter.theValue("1").into(INPUT_IDENTIFICADOR),
                WaitInteractions.untilBeEnable(BTN_CONTINUAR_CONSUL),
                Scroll.to(BTN_CONTINUAR_CONSUL).then(Click.on(BTN_CONTINUAR_CONSUL)),
                WaitInteractions.untilBeEnable(BTN_VER_DOCUMENT),
                JavaScriptClick.on(BTN_VER_DOCUMENT),
                WaitInteractions.untilBeEnable(BTN_CERRAR_DOCU),
                Click.on(BTN_CERRAR_DOCU),
                WaitInteractions.untilBeEnable(BTN_REGRESAR),
                Click.on(BTN_REGRESAR),
                WaitInteractions.untilBeEnable(BTN_LIMPIAR),
                Click.on(BTN_LIMPIAR)
        );

        /*actor.attemptsTo(
                WaitInteractions.untilBeEnable(INPUT_ORIGEN_EXTERNO),
                Enter.theValue("1").into(INPUT_ORIGEN_EXTERNO),
                WaitInteractions.untilBeEnable(BTN_CONTINUAR_CONSUL),
                Scroll.to(BTN_CONTINUAR_CONSUL).then(Click.on(BTN_CONTINUAR_CONSUL)),
                WaitInteractions.untilBeEnable(BTN_VER_DOCUMENT),
                JavaScriptClick.on(BTN_VER_DOCUMENT),
                WaitInteractions.untilBeEnable(BTN_CERRAR_DOCU),
                Click.on(BTN_CERRAR_DOCU),
                WaitInteractions.untilBeEnable(BTN_REGRESAR),
                Click.on(BTN_REGRESAR),
                WaitInteractions.untilBeEnable(BTN_LIMPIAR),
                Click.on(BTN_LIMPIAR)
        );
*/
       /* actor.attemptsTo(
                WaitInteractions.untilBeEnable(INPUT_SISTEMA_ORIGEN),
                Enter.theValue("1").into(INPUT_SISTEMA_ORIGEN),
                WaitInteractions.untilBeEnable(BTN_CONTINUAR_CONSUL),
                Scroll.to(BTN_CONTINUAR_CONSUL).then(Click.on(BTN_CONTINUAR_CONSUL)),
                WaitInteractions.untilBeEnable(BTN_VER_DOCUMENT),
                JavaScriptClick.on(BTN_VER_DOCUMENT),
                WaitInteractions.untilBeEnable(BTN_CERRAR_DOCU),
                Click.on(BTN_CERRAR_DOCU),
                WaitInteractions.untilBeEnable(BTN_REGRESAR),
                Click.on(BTN_REGRESAR),
                WaitInteractions.untilBeEnable(BTN_LIMPIAR),
                Click.on(BTN_LIMPIAR)
        );*/

        actor.attemptsTo(
                WaitInteractions.untilBeEnable(INPUT_SISTEMA_EXCLUIR),
                Enter.theValue("1").into(INPUT_SISTEMA_EXCLUIR),
                WaitInteractions.untilBeEnable(BTN_CONTINUAR_CONSUL),
                Scroll.to(BTN_CONTINUAR_CONSUL).then(Click.on(BTN_CONTINUAR_CONSUL)),
                WaitInteractions.untilBeEnable(BTN_VER_DOCUMENT),
                JavaScriptClick.on(BTN_VER_DOCUMENT),
                WaitInteractions.untilBeEnable(BTN_CERRAR_DOCU),
                Click.on(BTN_CERRAR_DOCU),
                WaitInteractions.untilBeEnable(BTN_REGRESAR),
                Click.on(BTN_REGRESAR),
                WaitInteractions.untilBeEnable(BTN_LIMPIAR),
                Click.on(BTN_LIMPIAR)
        );

        actor.attemptsTo(
                WaitInteractions.untilBeEnable(INPUT_CAJA_ARCHIVO),
                Enter.theValue("1").into(INPUT_CAJA_ARCHIVO),
                WaitInteractions.untilBeEnable(BTN_CONTINUAR_CONSUL),
                Scroll.to(BTN_CONTINUAR_CONSUL).then(Click.on(BTN_CONTINUAR_CONSUL)),
                WaitInteractions.untilBeEnable(BTN_VER_DOCUMENT),
                JavaScriptClick.on(BTN_VER_DOCUMENT),
                WaitInteractions.untilBeEnable(BTN_CERRAR_DOCU),
                Click.on(BTN_CERRAR_DOCU),
                WaitInteractions.untilBeEnable(BTN_REGRESAR),
                Click.on(BTN_REGRESAR),
                WaitInteractions.untilBeEnable(BTN_LIMPIAR),
                Click.on(BTN_LIMPIAR)
        );

        actor.attemptsTo(
                WaitInteractions.untilBeEnable(INPUT_LIBRO_ARCHIVO),
                Enter.theValue("1").into(INPUT_LIBRO_ARCHIVO),
                WaitInteractions.untilBeEnable(BTN_CONTINUAR_CONSUL),
                Scroll.to(BTN_CONTINUAR_CONSUL).then(Click.on(BTN_CONTINUAR_CONSUL)),
                WaitInteractions.untilBeEnable(BTN_VER_DOCUMENT),
                JavaScriptClick.on(BTN_VER_DOCUMENT),
                WaitInteractions.untilBeEnable(BTN_CERRAR_DOCU),
                Click.on(BTN_CERRAR_DOCU),
                WaitInteractions.untilBeEnable(BTN_REGRESAR),
                Click.on(BTN_REGRESAR),
                WaitInteractions.untilBeEnable(BTN_LIMPIAR),
                Click.on(BTN_LIMPIAR)
        );

        actor.attemptsTo(
                WaitInteractions.untilBeEnable(INPUT_OBSERVACIONES),
                Enter.theValue("REINGRESO JUNIO 09").into(INPUT_OBSERVACIONES),
                WaitInteractions.untilBeEnable(BTN_CONTINUAR_CONSUL),
                Scroll.to(BTN_CONTINUAR_CONSUL).then(Click.on(BTN_CONTINUAR_CONSUL)),
                WaitInteractions.untilBeEnable(BTN_VER_DOCUMENT),
                JavaScriptClick.on(BTN_VER_DOCUMENT)
                /*WaitInteractions.untilBeEnable(BTN_CERRAR_DOCU),
                Click.on(BTN_CERRAR_DOCU),
                WaitInteractions.untilBeEnable(BTN_REGRESAR),
                Click.on(BTN_REGRESAR),
                WaitInteractions.untilBeEnable(BTN_LIMPIAR),
                Click.on(BTN_LIMPIAR)*/
        );
    }

    public static ConsultarExpediente grafico() {
        return Tasks.instrumented(ConsultarExpediente.class);
    }
}
