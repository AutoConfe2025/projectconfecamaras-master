package com.co.confecamaras.tasks.Bandeja.registros_publicos.DigitacionAcciones;

import com.co.confecamaras.interactions.News.ManagePageAlert;
import com.co.confecamaras.interactions.News.SelectRandomOption;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.DigitacionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.DigitacionPage.LINK_IMPOR_VUE_CTCE;

public class ImportacionVueCtCeTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        if(actor.asksFor(ElementoElegible.para(LINK_IMPOR_VUE_CTCE))){
            actor.attemptsTo(
                    // IMPORTAAR VUE/CTCE
                    Click.on(LINK_IMPOR_VUE_CTCE)
            );
            if (!actor.asksFor(ElementoElegible.para(DigitacionPage.MODAL)))
                actor.attemptsTo(SelectRandomOption.select(DigitacionPage.SLC_VERSION_IMP),Click.on(DigitacionPage.BTN_VOLVER));
            else
                actor.attemptsTo(ManagePageAlert.accept(DigitacionPage.MODAL, DigitacionPage.BTN_CERRAR));
        }
    }

    public static ImportacionVueCtCeTask importacion() {
        return new ImportacionVueCtCeTask();
    }
}
