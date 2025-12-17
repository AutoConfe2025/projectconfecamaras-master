package com.co.confecamaras.interactions;

import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import com.co.confecamaras.userinterfaces.utils.FechasDinamicasPage;


public class HacerClicEnFechaDinamica implements Interaction {

    private final String fechaID;
    private final Target targetDinamico;

    /**
     * Constructor para la interacción.
     * @param targetDinamico El Target genérico que contiene el marcador de posición {0}.
     * @param fechaID El valor que se usará para reemplazar el marcador de posición (ej: "20250205").
     */
    public HacerClicEnFechaDinamica(Target targetDinamico, String fechaID) {
        this.targetDinamico = targetDinamico;
        this.fechaID = fechaID;
    }

    @Override
    @Step("{0} hace clic en el elemento cuya ID de fecha es: #fechaID")
    public <T extends Actor> void performAs(T actor) {
        Target elementoEspecifico = targetDinamico.of(fechaID);


        actor.attemptsTo(
                WaitInteractions.untilAppears(elementoEspecifico),
                Click.on(elementoEspecifico)
        );
    }

    /**
     * Método estático para iniciar la interacción.
     * @param targetDinamico El Target genérico a modificar (ej: FechasDinamicasPage.ELEMENTO_FECHA_DINAMICA).
     * @param fechaID La fecha que será el ID del elemento (ej: "20250205").
     */
    public static HacerClicEnFechaDinamica conID(Target targetDinamico, String fechaID) {
        return instrumented(HacerClicEnFechaDinamica.class, targetDinamico, fechaID);
    }
}