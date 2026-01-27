package com.co.confecamaras.tasks.registro_publico;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.registros_publicos.CambioMasivoVinculadosPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class CambioMasivoVinculados implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LISTA_CLASE_IDENTIFICACION_REEMPLAZAR,isPresent()).forNoMoreThan(10).seconds(),
                SelectFromOptions.byValue("1").from(LISTA_CLASE_IDENTIFICACION_REEMPLAZAR),
                Click.on(CAMPO_IDENTIFICACION),
                Enter.theValue("11314260").into(CAMPO_IDENTIFICACION),
                SelectFromOptions.byValue("1").from(LISTA_CLASE_IDENTIFICACION_NUEVA),
                Click.on(CAMPO_IDENTIFICACION_NUEVA),
                Enter.theValue("11314260").into(CAMPO_IDENTIFICACION_NUEVA),
                Click.on(CAMPO_RAZON_SOCIAL_NOMBRE),
                Enter.theValue("ROJAS HERNANDEZ FRANCISCO").into(CAMPO_RAZON_SOCIAL_NOMBRE),
                Click.on(CAMPO_PRIMER_APELLIDO),
                Enter.theValue("ROJAS").into(CAMPO_PRIMER_APELLIDO),
                Click.on(CAMPO_SEGUNDO_APELLIDO),
                Enter.theValue("HERNANDEZ").into(CAMPO_SEGUNDO_APELLIDO),
                Click.on(CAMPO_PRIMER_NOMBRE),
                Enter.theValue("FRANCISCO").into(CAMPO_PRIMER_NOMBRE),
                Click.on(CAMPO_SEGUNDO_NOMBRE),
                Enter.theValue("JOSE").into(CAMPO_SEGUNDO_NOMBRE),
                Scroll.to(BOTON_BUSCAR_VINCULOS),
                Click.on(BOTON_BUSCAR_VINCULOS)

        );
    }

    public static CambioMasivoVinculados cambioMasivo(){
        return new CambioMasivoVinculados();
    }
}
