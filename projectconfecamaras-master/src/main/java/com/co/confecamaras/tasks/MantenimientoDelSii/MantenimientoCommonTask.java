package com.co.confecamaras.tasks.MantenimientoDelSii;

import com.co.confecamaras.interactions.News.CloseCurrentWindowAndSwitchBackHome;
import com.co.confecamaras.interactions.News.GetTextOfElement;
import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.userinterfaces.MantenimientoDelSii.MantenimientoCommonPage;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MantenimientoCommonTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilAppears(MantenimientoCommonPage.TITULO),
                GetTextOfElement.de(MantenimientoCommonPage.TITULO)
        );
        List<WebElementFacade> elements = MantenimientoCommonPage.TITULOS_SECCIONES.resolveAllFor(actor);
        for (WebElement element : elements) {
            actor.attemptsTo(
                    Scroll.to(element),
                    LogEvent.recordevent(Reportes.INFO, "Se ha encontrado el titulo: " + element.getText())
            );
        }
        actor.attemptsTo(CloseCurrentWindowAndSwitchBackHome.closeAndSwitchBackHome());
    }

    public static MantenimientoCommonTask common() {
        return new MantenimientoCommonTask();
    }
}
