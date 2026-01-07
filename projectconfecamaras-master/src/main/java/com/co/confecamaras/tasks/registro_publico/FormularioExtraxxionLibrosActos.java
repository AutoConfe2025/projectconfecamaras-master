package com.co.confecamaras.tasks.registro_publico;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.confecamaras.userinterfaces.registros_publicos.ExtraccionLibrosActosPage.*;

public class FormularioExtraxxionLibrosActos implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LISTA_SELECCION_ACTOS),
                Click.on(OPCION_ARRENDAMIENTOS),
                Click.on(LISTA_TIPO_INFORME),
                Click.on(OPCION_REGISTRO_MERCANTIL_0120),
                Click.on(CAMPO_FEHCA_INICIAL),
                Enter.theValue("01/12/2025").into(CAMPO_FEHCA_INICIAL),
                Click.on(CAMPO_FEHCA_FINAL),
                Enter.theValue("12/12/2025").into(CAMPO_FEHCA_FINAL),
                Click.on(CAMPO_EMAIL),
                Enter.theValue("frojas@confecamaras.org.co").into(CAMPO_EMAIL),
                Click.on(BOTON_GENERAR),
                Click.on(BOTON_GENERAR_FLOTANTE)
        );
    }

    public static FormularioExtraxxionLibrosActos formularioLLeno(){
        return new FormularioExtraxxionLibrosActos();
    }
}
