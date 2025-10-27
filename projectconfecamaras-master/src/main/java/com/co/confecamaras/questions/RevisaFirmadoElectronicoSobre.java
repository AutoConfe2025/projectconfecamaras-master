package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.FirmadoUI.*;

public class RevisaFirmadoElectronicoSobre implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean sobreDigital = LBL_SOBRE_DIGITAL_FIRMADO.resolveFor(actor).isVisible();
        return sobreDigital;
    }

    public static RevisaFirmadoElectronicoSobre enConfecamaraSII(){
        return new RevisaFirmadoElectronicoSobre();
    }
}