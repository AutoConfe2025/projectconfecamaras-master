package com.co.confecamaras.interactions.sikulli;

import com.co.confecamaras.models.Element;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickConSikuli implements Interaction {

    private final Element element;

    public ClickConSikuli(Element element) {
        this.element = element;
    }

    public static ClickConSikuli en(Element element) {
        return instrumented(ClickConSikuli.class, element);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Screen pantalla = new Screen();
        // Obtenemos la ruta completa desde tu Enum
        String rutaCompleta = element.getImagePath();

        // Pattern con un margen de similitud del 70% para evitar fallos por brillo
        Pattern imagenABuscar = new Pattern(rutaCompleta).similar(0.7f);

        try {
            // Espera visual de hasta 5 segundos y clic
            pantalla.wait(imagenABuscar, 5);
            pantalla.click(imagenABuscar);
        } catch (FindFailed e) {
            throw new RuntimeException("Sikuli no encontró la imagen en la pantalla: " + rutaCompleta, e);
        }
    }
}