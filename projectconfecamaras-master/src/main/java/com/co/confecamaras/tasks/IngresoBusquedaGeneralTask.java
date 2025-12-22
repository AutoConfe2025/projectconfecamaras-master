package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

import static com.co.confecamaras.userinterfaces.BusquedaInicial.*;

public class IngresoBusquedaGeneralTask implements Task {
    private final String elemento_busqueda;
    private final int posicionClick; // 1 (por defecto) o 2 (cuando hay duplicados)

    // Constructor para seleccionar el primer resultado (posición 1 por defecto)
    public IngresoBusquedaGeneralTask(String elemento_busqueda) {
        this(elemento_busqueda, 1);
    }

    // Constructor principal que acepta la posición
    public IngresoBusquedaGeneralTask(String elemento_busqueda, int posicion) {
        this.elemento_busqueda = elemento_busqueda;
        // Si la posición es 1, usamos el valor 0 en el XPath para evitar el [1] explícito
        // o si es > 1, usamos ese valor.
        this.posicionClick = posicion;
    }

    // Método que construye el selector final basado en la posición deseada
    private Target selectorFinal(String texto, int posicion) {
        String xpathBase = "//span[contains(text(), '%s')]";
        String selectorTexto = String.format(xpathBase, texto);

        if (posicion > 1) {
            // Si la posición es 2 o más, la forzamos con [posicion]
            String xpathFinal = String.format("(%s)[%d]", selectorTexto, posicion);
            return Target.the("Resultado de búsqueda: " + texto + " (Posición " + posicion + ")")
                    .locatedBy(xpathFinal);
        } else {
            // Si la posición es 1, usamos el selector base para que Serenity
            // tome el primer elemento que cumpla (el comportamiento por defecto)
            return Target.the("Resultado de búsqueda: " + texto + " (Posición 1)")
                    .locatedBy(selectorTexto);
        }
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        System.out.println("Ingreso a página principal a buscar: " + elemento_busqueda);

        actor.attemptsTo(
                WaitInteractions.untilAppears(BOTON_BUSQUEDA_HEADER),
                Click.on(BOTON_BUSQUEDA_HEADER),
                WaitInteractions.untilAppears(INPUT_BUSCAR),
                Enter.theValue(elemento_busqueda).into(INPUT_BUSCAR),
                WaitSeconds.seconds(2),
                // CRÍTICO: Usamos el selector dinámico que aplica la posición si es necesario.
                Click.on(selectorFinal(elemento_busqueda, posicionClick))
        );
    }

    // Fábrica 1: Usada cuando queremos el primer resultado (por defecto)
    public static IngresoBusquedaGeneralTask digitar(String elemento_busqueda) {
        return new IngresoBusquedaGeneralTask(elemento_busqueda, 1);
    }

    // Fábrica 2: Usada cuando queremos una posición específica
    public static IngresoBusquedaGeneralTask digitarEnPosicion(String elemento_busqueda, int posicion) {
        return new IngresoBusquedaGeneralTask(elemento_busqueda, posicion);
    }
}