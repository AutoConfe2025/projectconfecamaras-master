package com.co.confecamaras.questions.mantenimientoeinformes;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.mantenimientoeinformes.IngresoPorCuentaPage.GENERAR_EXCEL;


public class BotonGenerarInfoCuentasEs implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean boton =  GENERAR_EXCEL.resolveFor(actor).isVisible();
        return boton;
    }

    public static BotonGenerarInfoCuentasEs visble(){
        return new BotonGenerarInfoCuentasEs();
    }
}
