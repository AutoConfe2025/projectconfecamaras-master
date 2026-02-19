package com.co.confecamaras.tasks.mantenimientoeinformes.ingresos_por_municipio;

import com.co.confecamaras.interactions.AceptAlert;
import com.co.confecamaras.tasks.utils.ControlDescargas;
import com.co.confecamaras.utils.News.evidencias.BaseEvidencias;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.mantenimientoeinformes.IngresosPorMunicipio.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

@AllArgsConstructor
public class FlujoIngresosPorMunicipio implements Task {

    private final String inicio;
    private final String fin;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CAMPO_FECHA_INICIO, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_FECHA_INICIO),
                Clear.field(CAMPO_FECHA_INICIO),
                Enter.theValue(inicio).into(CAMPO_FECHA_INICIO),
                Click.on(CAMPO_FECHA_INICIO),
                Click.on(CAMPO_FECHA_FIN),
                Clear.field(CAMPO_FECHA_FIN),
                Enter.theValue(fin).into(CAMPO_FECHA_FIN),
                Click.on(CAMPO_FECHA_FIN),
                Click.on(BOTON_GENERAR),
                AceptAlert.aceptar(),
                Click.on(BOTON_RELACION_MOVIMIENTOS_MUNICIPIO),
                ControlDescargas.hastaTerminar(BaseEvidencias.RUTA_DESCARGA_SISTEMA)
        );
    }
    public static FlujoIngresosPorMunicipio FlujoIngresoMunicipio(String inicio, String fin){
        return new FlujoIngresosPorMunicipio(inicio, fin);
    }
}
