package com.co.confecamaras.tasks;

import com.co.confecamaras.questions.ContenidoDelPDFEnNuevaPestana;
import com.co.confecamaras.utils.LectorPDFLocal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.ensure.Ensure;

/**
 * Task que compara el contenido de un PDF abierto en una nueva pestaña (via URL)
 * contra un PDF de referencia local, aplicando reglas de limpieza para datos dinámicos.
 */
public class CompararElContenidoDelPDF implements Task {

    private final String originalHandle;
    private final String rutaPDFReferencia;

    public CompararElContenidoDelPDF(String originalHandle, String rutaPDFReferencia) {
        this.originalHandle = originalHandle;
        this.rutaPDFReferencia = rutaPDFReferencia;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        String contenidoPDFNavegador = actor.asksFor(ContenidoDelPDFEnNuevaPestana.es(originalHandle));

        String contenidoPDFLocal = LectorPDFLocal.leerContenido(rutaPDFReferencia);


        limpiarYCompararPDF(actor, contenidoPDFNavegador, contenidoPDFLocal);
    }


    public static CompararElContenidoDelPDF abiertoEnPestanaConReferenciaLocal(String originalHandle, String rutaPDFReferencia) {
        return Tasks.instrumented(CompararElContenidoDelPDF.class, originalHandle, rutaPDFReferencia);
    }

    /**
     * Implementa la lógica de limpieza de strings dinámicos (hashes, fechas/horas).
     */
    private <T extends Actor> void limpiarYCompararPDF(T actor, String contenidoActual, String contenidoEsperado) {


        String actualLimpio = contenidoActual.replaceAll("\\s+", "");
        String esperadoLimpio = contenidoEsperado.replaceAll("\\s+", "");




        // Captura todo antes de MatrículaNo.246619 y lo elimina, manteniendo MatrículaNo.246619 ($1).
        String patronHashTemporal = "^.*(MatrículaNo\\.246619)";


        String patronFechaRadicacionInicial = "(20-)\\d{8}";


        String patronFechaSeccionFinanciera = "(475220-)\\d{8}";


        String patronFechaHoraFinal = "Nro\\.Liq\\.0Fecha:\\d{4}/\\d{2}/\\d{2}\\d{2}:\\d{2}:\\d{2}";


        actualLimpio = actualLimpio.replaceAll(patronHashTemporal, "$1");
        esperadoLimpio = esperadoLimpio.replaceAll(patronHashTemporal, "$1");


        actualLimpio = actualLimpio.replaceAll(patronFechaRadicacionInicial, "$1");
        esperadoLimpio = esperadoLimpio.replaceAll(patronFechaRadicacionInicial, "$1");

        actualLimpio = actualLimpio.replaceAll(patronFechaSeccionFinanciera, "$1");
        esperadoLimpio = esperadoLimpio.replaceAll(patronFechaSeccionFinanciera, "$1");

        actualLimpio = actualLimpio.replaceAll(patronFechaHoraFinal, "");
        esperadoLimpio = esperadoLimpio.replaceAll(patronFechaHoraFinal, "");


        actor.attemptsTo(
                Ensure.that(actualLimpio)
                        .asAString()
                        .isEqualTo(esperadoLimpio)
        );
    }
}