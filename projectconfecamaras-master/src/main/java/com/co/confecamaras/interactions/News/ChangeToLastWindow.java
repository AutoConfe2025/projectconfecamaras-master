package com.co.confecamaras.interactions.News;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import java.util.ArrayList;
import java.util.List;

public class ChangeToLastWindow implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        // 1. Obtener y guardar el handle de la ventana actual antes de cambiar.
        // Usamos la clave 'second_main_window' para que coincida con CloseCurrentWindowAndSwitchBack.
        String currentWindowHandle = BrowseTheWeb.as(actor).getDriver().getWindowHandle();
        actor.remember("second_main_window", currentWindowHandle); // <--- ¡Esta es la línea clave agregada!

        // 2. Cambiar a la última ventana abierta.
        List<String> all_windows = new ArrayList<>(BrowseTheWeb.as(actor).getDriver().getWindowHandles());
        String last_window = all_windows.get(all_windows.size() - 1);
        BrowseTheWeb.as(actor).getDriver().switchTo().window(last_window);
    }

    public static ChangeToLastWindow changeToLastWindow() {
        return Tasks.instrumented(ChangeToLastWindow.class);
    }
}