package com.co.confecamaras.tasks.Bandeja.registros_publicos.DigitacionAcciones;

import com.co.confecamaras.interactions.News.SelectRandomOption;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.DigitacionPage;
import com.co.confecamaras.utils.constantes.bandeja.DigitarFormularioConstantes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.ControlCalidadPage.LINK_VOLVER_BANDEJA;
import static com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.DigitacionPage.*;

public class DigitarInformacionCorreccionTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        if(actor.asksFor(ElementoElegible.para(LINK_DIG_FORMULARIO))){
            actor.attemptsTo(
                    Click.on(LINK_DIG_FORMULARIO),

                    Scroll.to(INP_MATRICULA),
                    SelectFromOptions.byIndex(2).from(SLC_CATEGORIA),
                    SelectFromOptions.byIndex(6).from(SLC_ESTADO_DATOS_MATRICULA),

                    Click.on(BTN_VOLVER_DIGITACION),
                    WaitInteractions.untilAppears(LINK_VOLVER_BANDEJA),

                    Click.on(LINK_VOLVER_BANDEJA),
                    WaitSeconds.seconds(4)
                    );
        }
    }

    public static DigitarInformacionCorreccionTask digitarInformacion() {
        return new DigitarInformacionCorreccionTask();
    }
}
