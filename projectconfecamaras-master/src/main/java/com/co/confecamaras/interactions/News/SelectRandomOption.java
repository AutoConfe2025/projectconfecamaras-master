package com.co.confecamaras.interactions.News;

import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SelectRandomOption implements Interaction {
    private final Target SELECT;

    public SelectRandomOption(Target SELECT) {
        this.SELECT = SELECT;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebElement element = SELECT.resolveFor(actor);
        Select select = new Select(element);
        List<WebElement> options = select.getOptions();
        if (options.size() > 1) {
            Random random = new Random();
            int random_index = 1 + random.nextInt(options.size() - 1);
            select.selectByIndex(random_index);
        } else {
            Reportes.reportEvent(Reportes.FAILED, "El elemento no tiene opciones disponible.");
            throw new IllegalArgumentException("El elemento no tiene opciones disponible.");
        }
    }

    /**
     * Con el [element] se espera que sea de tag select al cual,<br>
     * tomara una opción de manera random
     *
     * @param element
     * @return
     * @author: Isaac Gomez
     */
    public static SelectRandomOption select(Target element) {
        return Tasks.instrumented(SelectRandomOption.class, element);
    }
}
