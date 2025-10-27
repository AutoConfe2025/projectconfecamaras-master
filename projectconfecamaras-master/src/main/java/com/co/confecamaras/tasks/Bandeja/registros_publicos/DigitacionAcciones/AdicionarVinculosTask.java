package com.co.confecamaras.tasks.Bandeja.registros_publicos.DigitacionAcciones;

import com.co.confecamaras.interactions.News.*;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.DigitacionPage;
import com.co.confecamaras.utils.News.Acciones.TypeKey;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class AdicionarVinculosTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        if(actor.asksFor(ElementoElegible.para(DigitacionPage.LINK_DIG_VINCULOS))){
            actor.attemptsTo(
                    Click.on(DigitacionPage.LINK_DIG_VINCULOS),
                    Click.on(DigitacionPage.LINK_ADD_VINCULO),
                    LogEvent.recordevent(Reportes.PASSED,"Adicionar vinculos"),
                    WaitSeconds.seconds(2),
                    SelectFromOptions.byIndex(1).from(DigitacionPage.SLC_INSCRP_NOMBRAMIENTO),
                    SelectFromOptions.byIndex(1).from(DigitacionPage.SLC_TIPO_IDENTIFICACION),
                    Enter.theValue("11111111").into(DigitacionPage.INP_NUM_IDENTIFICACION),
                    PressKey.press(TypeKey.TAB),
                    WaitDialog.waitDialog(),
                    Enter.theValue("Gutierrez").into(DigitacionPage.INP_PRIM_APELLIDO),
                    Enter.theValue("Diaz").into(DigitacionPage.INP_SEG_APELLIDO),
                    Enter.theValue("Maria").into(DigitacionPage.INP_PRIM_NOMBRE),
                    Enter.theValue("Alejandra").into(DigitacionPage.INP_SEG_NOMBRE),
                    SelectFromOptions.byIndex(1).from(DigitacionPage.SLC_GENERO),
                    SelectFromOptions.byIndex(1).from(DigitacionPage.SLC_TIPO_VINCULO),
                    SelectFromOptions.byIndex(1).from(DigitacionPage.SLC_CARGO),
                    Click.on(DigitacionPage.BTN_GRABAR),
                    Click.on(DigitacionPage.BTN_VOLVER)
            );
        }
    }
    public static AdicionarVinculosTask adicionar(){
        return new AdicionarVinculosTask();
    }
}
