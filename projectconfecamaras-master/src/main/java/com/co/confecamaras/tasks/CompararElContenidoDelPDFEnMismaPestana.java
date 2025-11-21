package com.co.confecamaras.tasks; // Asegúrate de usar el paquete correcto

import com.co.confecamaras.questions.ContenidoDelPDFEnMismaPestana; // <-- Necesitas crear esta nueva Question
import com.co.confecamaras.utils.LectorPDFLocal; // Asumiendo que esta clase existe
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.ensure.Ensure;

/**
 * Task que compara el contenido de un PDF abierto en la pestaña actual
 * contra un PDF de referencia local.
 */
public class CompararElContenidoDelPDFEnMismaPestana implements Task {

    private final String rutaPDFReferencia;

    public CompararElContenidoDelPDFEnMismaPestana(String rutaPDFReferencia) {
        this.rutaPDFReferencia = rutaPDFReferencia;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        // 1. Obtener el contenido del PDF de la PESTAÑA ACTUAL (Nueva Question)
        String contenidoPDFNavegador = actor.asksFor(ContenidoDelPDFEnMismaPestana.es());

        // 2. Leer el contenido del PDF de referencia local
        String contenidoPDFLocal = LectorPDFLocal.leerContenido(rutaPDFReferencia);

        // 3. Limpiar y comparar (reutilizando la lógica)
        limpiarYCompararPDF(actor, contenidoPDFNavegador, contenidoPDFLocal);
    }

    public static CompararElContenidoDelPDFEnMismaPestana conReferenciaLocal(String rutaPDFReferencia) {
        return Tasks.instrumented(CompararElContenidoDelPDFEnMismaPestana.class, rutaPDFReferencia);
    }

    // REUTILIZAR EL MÉTODO limpiarYCompararPDF de tu clase original
    private <T extends Actor> void limpiarYCompararPDF(T actor, String contenidoActual, String contenidoEsperado) {
        // ... (Copia y pega el código completo de limpiarYCompararPDF aquí)

        String actualLimpio = contenidoActual.replaceAll("\\s+", "");
        String esperadoLimpio = contenidoEsperado.replaceAll("\\s+", "");

        // --- PATRONES EXISTENTES (para Fechas/Hashes dinámicos) ---
        String patronHashTemporal = "^.*(MatrículaNo\\.246619)";
        String patronFechaRadicacionInicial = "(20-)\\d{8}";
        String patronFechaSeccionFinanciera = "(475220-)\\d{8}";
        String patronFechaHoraFinal = "Nro\\.Liq\\.0Fecha:\\d{4}/\\d{2}/\\d{2}\\d{2}:\\d{2}:\\d{2}";

        // --- NUEVOS PATRONES (para Datos de Registro Dinámicos) ---

        // 1. LIMPIAR LIBRO Y NUMERO DE REGISTRO
        // Ejemplo: Captura "DELREGISTROMERCANTIL" y elimina todo lo que viene después (Libro:XVNumeroRegistro:402529)
        String patronDatosRegistro = "(DELREGISTROMERCANTIL)Libro:.*?(Expediente)";

        // 2. LIMPIAR EXPEDIENTE, ID, NOMBRE, ACTO, NOTICIA
        // Acto, Identificación y Nombre son únicos para el registro, deben eliminarse si el PDF base no cambia.
        // Captura hasta el ID y elimina el resto del texto del registro dinámico
        String patronDatosVariables = "(Identificación:\\d+Nombre:.*?Acto:\\d+.*Elsecretario)";


        // --- APLICAR REEMPLAZOS ---

        // 1. Limpieza de Hashes/Fechas existentes
        actualLimpio = actualLimpio.replaceAll(patronHashTemporal, "$1");
        esperadoLimpio = esperadoLimpio.replaceAll(patronHashTemporal, "$1");

        actualLimpio = actualLimpio.replaceAll(patronFechaRadicacionInicial, "$1");
        esperadoLimpio = esperadoLimpio.replaceAll(patronFechaRadicacionInicial, "$1");

        actualLimpio = actualLimpio.replaceAll(patronFechaSeccionFinanciera, "$1");
        esperadoLimpio = esperadoLimpio.replaceAll(patronFechaSeccionFinanciera, "$1");

        actualLimpio = actualLimpio.replaceAll(patronFechaHoraFinal, "");
        esperadoLimpio = esperadoLimpio.replaceAll(patronFechaHoraFinal, "");

        // 2. Limpieza de LIBRO/REGISTRO (conservando solo el ancla "DELREGISTROMERCANTIL")
        // Como los datos son demasiado diferentes, la forma más fácil es limpiar el bloque completo.

        String patronDatosDinamicos = "Libro:.*?Elsecretario\\(osudelegado\\)";

        actualLimpio = actualLimpio.replaceAll(patronDatosDinamicos, "XXX_DATOS_DINAMICOS_XXX");
        esperadoLimpio = esperadoLimpio.replaceAll(patronDatosDinamicos, "XXX_DATOS_DINAMICOS_XXX");

        // **********************************************
        // Nota: Si el PDF de referencia SIEMPRE es el mismo registro (LIQUIDACION),
        // pero la prueba está probando OTRO registro (CANCELACION MATRICULA),
        // ¡DEBES USAR UN PDF DE REFERENCIA DISTINTO para ese caso de prueba!
        // **********************************************

        // ... (Fin de los patrones de limpieza) ...

        actor.attemptsTo(
                Ensure.that(actualLimpio)
                        .asAString()
                        .isEqualTo(esperadoLimpio)
        );
    }
}