package com.co.confecamaras.interactions.Consulta;

import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.waitinteractions.ModalLoader;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class ConsultaInteraction implements Interaction {
    private final Target target;
    private final Target target2;

    public ConsultaInteraction(Target target, Target target2) {
        this.target = target;
        this.target2 = target2;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        boolean encontrado = false;
        while (!encontrado) {
            encontrado = actor.asksFor(ElementoElegible.para(target));
            if (!encontrado) {
                BrowseTheWeb.as(actor).getDriver().navigate().refresh();
                actor.attemptsTo(
                        WaitInteractions.untilAppears(target2),
                        WaitSeconds.seconds(1),
                        Click.on(target2),
                        ModalLoader.modalLoader()
                );
            }
        }
    }

    public static ConsultaInteraction validar(Target target_opt, Target btn_lateral) {
        return Tasks.instrumented(ConsultaInteraction.class, target_opt, btn_lateral);
    }
}
