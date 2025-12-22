package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.tasks.IngresoBusquedaGeneralTask;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class IngresoBusquedaPrincipalBandejaDefinitions {




    private static final String DETALLADO_IMPUSTO = "Detallado de Impuesto de Registro";
    private static final String RESUMIDO_IMPUSTO = "Resumido de Impuesto de Registro";

    @Cuando("^Buscamos por el boton principal de busqueda la bandeja (.+)$")
    public void buscamosPorElBotonPrincipalDeBusquedaElElemento(String Elemento_busqueda) {

        // Limpiamos el texto de búsqueda para la comparación
        String busquedaLimpia = Elemento_busqueda.trim();

        // Verificamos si la búsqueda es para alguno de los elementos que tienen duplicados
        if (busquedaLimpia.equalsIgnoreCase(DETALLADO_IMPUSTO) ||
                busquedaLimpia.equalsIgnoreCase(RESUMIDO_IMPUSTO)) { // <-- ¡Línea clave modificada!

            // Si es alguno de los elementos problemáticos, usamos la tarea que fuerza la posición 2
            // Usamos el texto original (Elemento_busqueda) que viene del .feature
            OnStage.theActorInTheSpotlight().attemptsTo(
                    IngresoBusquedaGeneralTask.digitarEnPosicion(Elemento_busqueda, 2)
            );

        } else {
            // Para todos los demás escenarios, usamos la fábrica por defecto (posición 1)
            OnStage.theActorInTheSpotlight().attemptsTo(
                    IngresoBusquedaGeneralTask.digitar(Elemento_busqueda)
            );
        }
    }

}