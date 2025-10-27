package com.co.confecamaras.questions.cargaspresupuestos;

import com.co.confecamaras.userinterfaces.cargapresupuesto.CargaPresupuestoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class ConfirmacionCarga implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return TextContent.of(CargaPresupuestoPage.TITULO_DATOS_GRABADOS).answeredBy(actor);
    }
    public static ConfirmacionCarga compararCon(){
        return  new ConfirmacionCarga();
    }
}
