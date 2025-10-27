package com.co.confecamaras.tasks.mantenimientoeinformes;

import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.cambiarpestana.CambiarALaSiguientePestana;
import com.co.confecamaras.interactions.waitinteractions.ModalLoader;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static com.co.confecamaras.userinterfaces.Matricula.MatriculaConEmbargoPage.TEXTO_ESTADO_MATRICULA;
import static com.co.confecamaras.userinterfaces.MenuSistema.TXT_BUSQUEDA_INPUT;
import static com.co.confecamaras.userinterfaces.mantenimientoeinformes.IngresoPorCCostoPage.BTN_INGRESO_C_COSTOS;
import static com.co.confecamaras.userinterfaces.mantenimientoeinformes.MantenimientoServiciosPage.*;
import static com.co.confecamaras.utils.mantenimientoeinformes.IngresoPorCCostoConstants.BUSQUEDA_INGRES_C_COSTOS;
import static com.co.confecamaras.utils.mantenimientoeinformes.MantenimientoServiciosConstants.*;
import static com.co.confecamaras.utils.matriculas.MatriculaEmbargoConstants.ESTADO_MATRICULA_EMBARGADA;

public class MantenimientoServicio implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(TXT_BUSQUEDA_INPUT),
                Enter.theValue(BUSQUEDA_MANTENIMIENTO_SERVICIO).into(TXT_BUSQUEDA_INPUT),
                WaitInteractions.untilBeEnable(BTN_MANTENIMIENTO_SERVICIOS),
                Click.on(BTN_MANTENIMIENTO_SERVICIOS)
        );

        actor.attemptsTo(
                CambiarALaSiguientePestana.siguiente(),
                WaitInteractions.untilBeEnable(BUSCADOR_SERVICIOS),
                Enter.theValue(NUMERO_SERVICIO).into(BUSCADOR_SERVICIOS),
                WaitInteractions.untilBeEnable(BTN_EDITAR_SERVICIO),
                Click.on(BTN_EDITAR_SERVICIO),
                WaitInteractions.untilBeEnable(NOMBRE_SERVICIO),
                Enter.theValue(NOMBRE_SERVICIO_EDITADO).into(NOMBRE_SERVICIO),
                WaitInteractions.untilBeEnable(TXT_NOMBRE_CORTO),
                Enter.theValue("QA").into(TXT_NOMBRE_CORTO),
                WaitInteractions.untilBeEnable(MENU_DES_TARJETA),
                SelectFromOptions.byVisibleText("Si").from(MENU_DES_TARJETA),
                WaitInteractions.untilBeEnable(BTN_GUARDAR_SERVICIO),
                Scroll.to(BTN_GUARDAR_SERVICIO),
                Click.on(BTN_GUARDAR_SERVICIO)
        );

        actor.attemptsTo(
                WaitInteractions.untilBeEnable(BUSCADOR_SERVICIOS),
                Enter.theValue(NUMERO_SERVICIO).into(BUSCADOR_SERVICIOS),
                WaitInteractions.untilBeEnable(BTN_EDITAR_SERVICIO),
                Click.on(BTN_EDITAR_SERVICIO),
                WaitInteractions.untilBeEnable(NOMBRE_SERVICIO),
                Enter.theValue(NOMBRE_SERVICIO_ORIGINAL).into(NOMBRE_SERVICIO),
                WaitInteractions.untilBeEnable(BTN_GUARDAR_SERVICIO),
                Scroll.to(BTN_GUARDAR_SERVICIO),
                Click.on(BTN_GUARDAR_SERVICIO)
        );

        actor.attemptsTo(
                WaitInteractions.untilBeEnable(BUSCADOR_SERVICIOS),
                Enter.theValue(NUMERO_SERVICIO).into(BUSCADOR_SERVICIOS),
                WaitInteractions.untilBeEnable(BTN_NIF),
                Click.on(BTN_NIF),
                WaitInteractions.untilBeEnable(BUSCADOR_PARAMETRO),
                Enter.theValue(ID_USUARIO).into(BUSCADOR_PARAMETRO),
                WaitInteractions.untilBeEnable(BTN_EDITAR_CONTADO),
                Click.on(BTN_EDITAR_CONTADO),
                WaitInteractions.untilBeEnable(SELECT_DEBITO),
                SelectFromOptions.byValue(VALOR__DEBITO).from(SELECT_DEBITO),
                WaitInteractions.untilBeEnable(SELECT_CREDITO),
                SelectFromOptions.byValue(VALOR_CREDITO).from(SELECT_CREDITO),
                WaitInteractions.untilBeEnable(BTN_GUARDAR_CONTADO),
                Click.on(BTN_GUARDAR_CONTADO),
                Ensure.that(TEXTO_CONTADO).text().isEqualTo(TEXTO_CONTADO_VISIBLE)
        );

        actor.attemptsTo(
                WaitInteractions.untilBeEnable(BUSCADOR_PARAMETRO),
                Enter.theValue(ID_USUARIO).into(BUSCADOR_PARAMETRO),
                WaitInteractions.untilBeEnable(EDITAR_OTROS),
                Click.on(EDITAR_OTROS),
                WaitInteractions.untilBeEnable(SELECT_COSTOS),
                SelectFromOptions.byValue(VALOR_COSTO).from(SELECT_COSTOS),
                WaitInteractions.untilBeEnable(SELECT_ANEXO),
                SelectFromOptions.byValue(VALOR_ANEXO).from(SELECT_ANEXO),
                WaitInteractions.untilBeEnable(BTN_GUARDAR_CONTADO),
                WaitInteractions.untilBeEnable(INPUT_PROYECTO),
                Enter.theValue(VALOR_PROYECTO).into(INPUT_PROYECTO),
                Click.on(BTN_GUARDAR_CONTADO)
        );

        actor.attemptsTo(
                WaitInteractions.untilBeEnable(BUSCADOR_PARAMETRO),
                Enter.theValue(ID_USUARIO).into(BUSCADOR_PARAMETRO),
                WaitInteractions.untilBeEnable(BTN_EDITAR_CONTADO),
                Click.on(BTN_EDITAR_CONTADO),
                WaitInteractions.untilBeEnable(SELECT_DEBITO),
                SelectFromOptions.byVisibleText(SELECCIONE).from(SELECT_DEBITO),
                WaitInteractions.untilBeEnable(SELECT_CREDITO),
                SelectFromOptions.byVisibleText(SELECCIONE).from(SELECT_CREDITO),
                WaitInteractions.untilBeEnable(BTN_GUARDAR_CONTADO),
                Click.on(BTN_GUARDAR_CONTADO)
        );

        actor.attemptsTo(
                WaitInteractions.untilBeEnable(BUSCADOR_PARAMETRO),
                Enter.theValue(ID_USUARIO).into(BUSCADOR_PARAMETRO),
                WaitInteractions.untilBeEnable(EDITAR_OTROS),
                Click.on(EDITAR_OTROS),
                WaitInteractions.untilBeEnable(SELECT_COSTOS),
                SelectFromOptions.byVisibleText(SELECCIONE).from(SELECT_COSTOS),
                WaitInteractions.untilBeEnable(SELECT_ANEXO),
                SelectFromOptions.byVisibleText(SELECCIONE).from(SELECT_ANEXO),
                WaitInteractions.untilBeEnable(BTN_GUARDAR_CONTADO),
                WaitInteractions.untilBeEnable(INPUT_PROYECTO),
                Clear.field(INPUT_PROYECTO),
                Click.on(BTN_GUARDAR_CONTADO)
        );
    }
    public static MantenimientoServicio consultar(){
        return Tasks.instrumented(MantenimientoServicio.class);
    }
}
