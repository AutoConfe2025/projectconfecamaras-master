package com.co.confecamaras.tasks.liquidacion_renovacion;

import com.co.confecamaras.utils.sikulli.SafeActions;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.liquidacion_renovacion.PaginaIngresoModulos.*;
import static com.co.confecamaras.userinterfaces.sikuli.liquidacion_renovacion.liquidacion_renovacion.*;
import static com.co.confecamaras.utils.liquidacion_renovacion.constants.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

@AllArgsConstructor
public class IngresoModuloLiquidacionRenovacionProponente implements Task {

    private final String proponente;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BOTON_MENU, isVisible()).forNoMoreThan(30).seconds(),
                SafeActions.click(BOTON_MENU, BOTON_INGRESO_MODULOS),
                SafeActions.click(OPCION_CONSULTA_TRANSACCIONES, OPCION_CONSULTA_TRANSACCIONES_SIKULLI),
                SafeActions.click(OPCION_CONSULTA_REGISTRO, OPCION_CONSULTA_REGISTRO_PUBLICO_SIKULLI),
                SafeActions.click(OPCION_LIQUIDACION_RENOVACION, OPCION_LIQUIDACION_RENOVACION_SIKULLI),
                Click.on(LISTA_OPCIONES_BUSQUEDA),
                SelectFromOptions.byVisibleText(proponente).from(LISTA_OPCIONES_BUSQUEDA),
                Enter.theValue(IDENTIFICACION_PARA_PROPONENTE).into(CAMPO_INGRESO_TEXTO_BUSQUEDA),
                Click.on(BOTON_BUSCAR_CRITERIO),
                Click.on(SELECCION_MATRICULA_ESPACIO_1),
                SelectFromOptions.byValue("L").from(LISTA_SOLICITUD_RENOVACION),
                Click.on(BOTON_CONTINUAR_MATRICULA),
                Click.on(BOTON_ACEPTAR_AVISO),
                Click.on(CAMPO_INGRESO_NUEVO_VALOR_PROPONENTE),
                Clear.field(CAMPO_INGRESO_NUEVO_VALOR_PROPONENTE),
                Enter.theValue(NUEVO_VALOR).into(CAMPO_INGRESO_NUEVO_VALOR_PROPONENTE),
                Click.on(CAMPO_CANTIDAD_CERTIFICADOS),
                Clear.field(CAMPO_CANTIDAD_CERTIFICADOS),
                Enter.theValue(CANTIDAD_CERTIFICADOS).into(CAMPO_CANTIDAD_CERTIFICADOS),
                Click.on(CAMPO_NUMERO_EMPLEADOS_NACIONAL),
                Clear.field(CAMPO_NUMERO_EMPLEADOS_NACIONAL),
                Enter.theValue(CANTIDAD_EMPLEADOS).into(CAMPO_NUMERO_EMPLEADOS_NACIONAL),
                Scroll.to(BOTON_CONTINUAR_CERTIFICADO),
                Click.on(BOTON_CONTINUAR_CERTIFICADO)
        );

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static IngresoModuloLiquidacionRenovacionProponente porProponente(String proponente){
        return instrumented(IngresoModuloLiquidacionRenovacionProponente.class, proponente);
    }
}
