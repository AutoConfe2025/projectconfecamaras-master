package com.co.confecamaras.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Presence;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BuscarEnTablaPaginada implements Task {

    private final Target tabla;
    private final Target elementoABuscar;
    private final Target botonSiguiente;

    public BuscarEnTablaPaginada(Target tabla, Target elementoABuscar, Target botonSiguiente) {
        this.tabla = tabla;
        this.elementoABuscar = elementoABuscar;
        this.botonSiguiente = botonSiguiente;
    }

    public static BuscarEnTablaPaginada conParametros(
            Target tabla,
            Target elementoABuscar,
            Target botonSiguiente
    ) {
        return Tasks.instrumented(BuscarEnTablaPaginada.class, tabla, elementoABuscar, botonSiguiente);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        boolean encontrado = false;
        int intentos = 0;
        int maxPaginas = 50;

        while (!encontrado && intentos < maxPaginas) {

            intentos++;

            // 🔍 Validar si el elemento existe en la tabla actual
            if (Presence.of(elementoABuscar).answeredBy(actor)) {

                actor.attemptsTo(
                        WaitUntil.the(elementoABuscar, isVisible()).forNoMoreThan(10).seconds(),
                        Click.on(elementoABuscar)
                );

                System.out.println("✅ Elemento encontrado");
                encontrado = true;
                break;
            }

            // 👉 Validar si el botón siguiente está habilitado
            if (!botonSiguiente.resolveFor(actor).isEnabled()) {
                System.out.println("❌ No hay más páginas");
                break;
            }

            // ⏭ Ir a la siguiente página
            actor.attemptsTo(
                    WaitUntil.the(botonSiguiente, isClickable()).forNoMoreThan(10).seconds(),
                    Click.on(botonSiguiente)
            );
        }

        if (!encontrado) {
            throw new AssertionError("El elemento no fue encontrado en la tabla paginada");
        }
    }
}