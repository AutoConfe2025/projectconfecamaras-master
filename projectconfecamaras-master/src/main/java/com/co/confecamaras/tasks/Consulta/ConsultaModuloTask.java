package com.co.confecamaras.tasks.Consulta;

import com.co.confecamaras.interactions.Consulta.ConsultaInteraction;
import com.co.confecamaras.interactions.News.ChangeToLastWindow;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.waitinteractions.ModalLoader;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static com.co.confecamaras.userinterfaces.Bandejas.BandejaRLeyPONALPage.BTN_PRIMERA_OPCION;
import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;

public class ConsultaModuloTask implements Task {
    private String modulo;

    public ConsultaModuloTask(String modulo) {
        this.modulo = modulo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String main_window = BrowseTheWeb.as(actor).getDriver().getWindowHandle();
        actor.remember("main_window", main_window);
        actor.attemptsTo(
                LogEvent.recordevent(Reportes.INFO, "Realizando busqueda de: [" + modulo + "]"),
                ModalLoader.modalLoader(),
                WaitInteractions.untilAppears(BTN_MENU_LATERAL),
                WaitSeconds.seconds(1),
                Click.on(BTN_MENU_LATERAL),
                ModalLoader.modalLoader(),
                ConsultaInteraction.validar(NAV_OPCIONES, BTN_MENU_LATERAL),
                ModalLoader.modalLoader(),
                WaitInteractions.untilAppears(INPUT_BUSCAR),
                Enter.theValue(modulo).into(INPUT_BUSCAR).thenHit(Keys.ENTER),
                WaitSeconds.seconds(1),
                WaitInteractions.untilAppears(BTN_OPCION_BUSQUEDA.of(modulo)),
                Click.on(BTN_OPCION_BUSQUEDA.of(modulo)),
                WaitSeconds.seconds(1),
                ChangeToLastWindow.changeToLastWindow()
        );
    }

    public static ConsultaModuloTask consultarModulo(String modulo) {
        return Tasks.instrumented(ConsultaModuloTask.class, modulo);
    }
}
