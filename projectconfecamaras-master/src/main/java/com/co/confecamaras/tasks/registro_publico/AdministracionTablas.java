package com.co.confecamaras.tasks.registro_publico;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.registros_publicos.AdministracionTablas.*;
import static com.co.confecamaras.utils.registros_publicos.Constants.CAMPO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class AdministracionTablas implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BOTON_NUEVA_TABLA, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_NUEVA_TABLA),
                Click.on(CAMPO_TABLA),
                Enter.theValue(CAMPO).into(CAMPO_TABLA),
                Click.on(CAMPO_NOMBRE),
                Enter.theValue(CAMPO).into(CAMPO_NOMBRE),
                Click.on(CAMPO_DESCRIPCION),
                Enter.theValue(CAMPO).into(CAMPO_DESCRIPCION),
                Scroll.to(BOTON_GRABAR_TABLA),
                Click.on(BOTON_GRABAR_TABLA),
                WaitUntil.the(BOTON_EDITAR, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_EDITAR),
                Click.on(CAMPO_FUENTE),
                Enter.theValue(CAMPO).into(CAMPO_FUENTE),
                Click.on(CAMPO_FFUENTE_CAMPOS),
                Enter.theValue(CAMPO).into(CAMPO_FFUENTE_CAMPOS),
                Click.on(CAMPO_ARCHIVO_GENERAR),
                Enter.theValue(CAMPO).into(CAMPO_ARCHIVO_GENERAR),
                Click.on(CAMPO_1),
                Enter.theValue(CAMPO).into(CAMPO_1),
                Scroll.to(BOTON_GRABAR_TABLA),
                Click.on(BOTON_GRABAR_TABLA),
                WaitUntil.the(BOTON_TRUNCAR_CONTENIDO, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_TRUNCAR_CONTENIDO),
                Click.on(BOTON_BORRAR_TRUNCAR_CONTENIDO),
//                Click.on(BOTON_CARGAR_TABLA),
                Click.on(BOTON_ELIMINAR)
        );
    }

    public static AdministracionTablas flujoAdminTablas(){
        return new AdministracionTablas();
    }
}
