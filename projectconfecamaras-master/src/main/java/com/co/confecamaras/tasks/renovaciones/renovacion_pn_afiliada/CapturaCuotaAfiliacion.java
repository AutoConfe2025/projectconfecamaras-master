package com.co.confecamaras.tasks.renovaciones.renovacion_pn_afiliada;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.questions.Text;

import static com.co.confecamaras.userinterfaces.renovaciones.FlujoRenovacionPnAfiliadoPage.CAMPO_COSTOS_AFILIACION;
import static com.co.confecamaras.userinterfaces.renovaciones.FlujoRenovacionPnAfiliadoPage.CAMPO_VALOR_AFILIACION;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class CapturaCuotaAfiliacion implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        String validacionCuota = Text.of(CAMPO_COSTOS_AFILIACION).answeredBy(actor);
        System.out.println("Texto de la tabla de valor de la cuota de afiliacion" + validacionCuota);

        String validacionValorCuota = Text.of(CAMPO_VALOR_AFILIACION).answeredBy(actor);
        System.out.println("valor de la cuota de afiliacion renovacion" + validacionValorCuota);
    }

    public static CapturaCuotaAfiliacion validaCuotaAfilicacion(){
        return instrumented(CapturaCuotaAfiliacion.class);
    }
}
