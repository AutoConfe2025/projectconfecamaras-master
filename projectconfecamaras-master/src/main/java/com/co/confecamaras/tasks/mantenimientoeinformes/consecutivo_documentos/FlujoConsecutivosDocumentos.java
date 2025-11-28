package com.co.confecamaras.tasks.mantenimientoeinformes.consecutivo_documentos;

import com.co.confecamaras.interactions.ExecuteJS;
import com.co.confecamaras.interactions.SetGridEditorValue;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static com.co.confecamaras.userinterfaces.mantenimientoeinformes.ConsecutivosDocumentos.*;


@AllArgsConstructor
public class FlujoConsecutivosDocumentos implements Task {

    private final String numero;
    private final String numero2;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                ExecuteJS.with("var gb=document.getElementById('gridbox'); gb.scrollTop=gb.scrollTop+350;"),

                Scroll.to(CAMPO_CAMBIO_EMAIL),
                DoubleClick.on(CAMPO_CAMBIO_EMAIL),
                SetGridEditorValue.to(numero),
                DoubleClick.on(BOTON_GRABAR),

                Scroll.to(CAMPO_CAMBIO_EMAIL),
                DoubleClick.on(CAMPO_CAMBIO_EMAIL),
                SetGridEditorValue.to(numero2),
                DoubleClick.on(BOTON_GRABAR),

                Scroll.to(CAMPO_CAMBIO_EMAIL)
        );
    }

    public static FlujoConsecutivosDocumentos DocumentosFlujo(String numero, String numero2){
        return new FlujoConsecutivosDocumentos(numero,numero2);
    }
}
