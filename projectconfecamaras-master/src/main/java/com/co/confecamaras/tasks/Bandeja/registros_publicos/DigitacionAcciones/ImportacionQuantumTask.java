package com.co.confecamaras.tasks.Bandeja.registros_publicos.DigitacionAcciones;

import com.co.confecamaras.questions.Elementos.ElementoElegible;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones.ConfirmarAlertaAccionTask;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.DigitacionPage;
import com.co.confecamaras.utils.News.gestion_archivos.CargarArchivo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class ImportacionQuantumTask implements Task {
    private final String ruta_archivo;

    public ImportacionQuantumTask(String ruta_archivo) {
        this.ruta_archivo = ruta_archivo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        //INFORMACION QUANTUM
        if(actor.asksFor(ElementoElegible.para(DigitacionPage.LINK_INT_QUANTUM))){
            actor.attemptsTo(Click.on(DigitacionPage.LINK_INT_QUANTUM));
            if (!actor.asksFor(ElementoElegible.para(DigitacionPage.FORM_CARGAR_ARCHIVO))) {
                actor.attemptsTo(
                        Click.on(DigitacionPage.BTN_REINICIAR_PROCESO),
                        ConfirmarAlertaAccionTask.confirmar(DigitacionPage.TXT_INFORMATIVO, DigitacionPage.BTN_REINICIAR)
                );
            }
            actor.attemptsTo(
                    CargarArchivo.cargar(DigitacionPage.FORM_CARGAR_ARCHIVO, ruta_archivo),
                    Click.on(DigitacionPage.BTN_RECARGAR),
                    Click.on(DigitacionPage.BTN_APLICAR),
                    ConfirmarAlertaAccionTask.confirmar(DigitacionPage.TXT_INFORMATIVO, DigitacionPage.BTN_CONTINUAR),
                    Click.on(DigitacionPage.BTN_REINICIAR_PROCESO),
                    ConfirmarAlertaAccionTask.confirmar(DigitacionPage.TXT_INFORMATIVO, DigitacionPage.BTN_REINICIAR),
                    Click.on(DigitacionPage.LINK_PARAMETRIZACION),
                    Click.on(DigitacionPage.BTN_REGRESAR),
                    CargarArchivo.cargar(DigitacionPage.FORM_CARGAR_ARCHIVO, ruta_archivo),
                    Click.on(DigitacionPage.BTN_RECARGAR),
                    Click.on(DigitacionPage.BTN_REG_DIGITACION)
            );
        }
    }

    public static ImportacionQuantumTask importacion(String ruta_archivo) {
        return new ImportacionQuantumTask(ruta_archivo);
    }
}
