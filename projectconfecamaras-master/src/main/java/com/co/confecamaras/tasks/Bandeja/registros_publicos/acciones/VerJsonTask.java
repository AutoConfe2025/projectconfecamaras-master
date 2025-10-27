package com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones;

import com.co.confecamaras.interactions.News.*;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.tasks.utils.LeerJson;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.AccionesPage.AccionesPage;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;

public class VerJsonTask implements Task {
    private final String nombre_key;

    public VerJsonTask(String nombre_key) {
        this.nombre_key = nombre_key;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilAppears(AccionesPage.LINK_ACCION.of("Ver Json")),
                Click.on(AccionesPage.LINK_ACCION.of("Ver Json")),
                WaitSeconds.seconds(1),
                ChangeToLastWindow.changeToLastWindow(),
                LogEvent.recordevent(Reportes.INFO, "Se ingreso a la accion: Ver Json")
        );
        String current_url = BrowseTheWeb.as(actor).getDriver().getCurrentUrl().toString();
        System.out.println("NOTA: CUANDO EL XML ESTE CORREGIDO ACTIVAR LA LECTURA, EL XML YUNCIONA PPERO NO SE PUEDE LEER" + current_url);
        actor.attemptsTo(
//                LeerJson.leer(current_url, nombre_key),
                CloseCurrentWindowAndSwitchBack.closeAndSwitchBack()
        );
    }

    public static VerJsonTask ver(String nombre_key) {
        return new VerJsonTask(nombre_key);
    }
}
