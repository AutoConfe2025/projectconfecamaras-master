package com.co.confecamaras.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.actions.Enter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class IngresarFechaActual implements Interaction {

    private final Target campo;

    public IngresarFechaActual(Target campo) {
        this.campo = campo;
    }

    public static IngresarFechaActual enElCampo(Target campo) {
        return Tasks.instrumented(IngresarFechaActual.class, campo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        // Obtener fecha actual
        LocalDate fechaActual = LocalDate.now();

        // Formato dd/MM/yyyy
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String fechaFormateada = fechaActual.format(formatter);

        // Escribir en el input
        actor.attemptsTo(
                Enter.theValue(fechaFormateada).into(campo)
        );
    }
}