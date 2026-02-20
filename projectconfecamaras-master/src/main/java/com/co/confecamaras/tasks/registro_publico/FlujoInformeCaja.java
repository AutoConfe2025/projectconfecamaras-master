package com.co.confecamaras.tasks.registro_publico;

import com.co.confecamaras.interactions.SalirDelSitioWeb;
import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.tasks.utils.ControlDescargas;
import com.co.confecamaras.utils.News.evidencias.BaseEvidencias;
import com.co.confecamaras.utils.sikulli.SafeActions;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.Bandejas.General.OPCION_BANDEJA;
import static com.co.confecamaras.userinterfaces.Bandejas.estudio_general.PaginaPrincial.BOTON_CONTROL;
import static com.co.confecamaras.userinterfaces.Bandejas.estudio_general.PaginaPrincial.CAMPO_INGRESO_BUSQUEDA_CONTROL;
import static com.co.confecamaras.userinterfaces.registros_publicos.InformDiarioCajaPage.*;
import static com.co.confecamaras.userinterfaces.sikuli.bandejas.EstadoGeneral.BOTON_BUSQUEDA;
import static com.co.confecamaras.userinterfaces.sikuli.bandejas.EstadoGeneral.ICONO_BUSQUEDA_NOMBRE;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

@AllArgsConstructor
public class FlujoInformeCaja implements Task {

    private final String bandeja;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LISTA_USUARIO_CAJERO, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(LISTA_USUARIO_CAJERO),
                Click.on(OPCION_CAJAQA),
                Click.on(BOTON_CONSULTAR_CAJA),
                WaitUntil.the(BOTON_SI_GENERA_INFORME, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_SI_GENERA_INFORME),
                WaitUntil.the(BOTON_CERRAR, isClickable()).forNoMoreThan(360).seconds(),
                Click.on(BOTON_CERRAR),
                WaitUntil.the(LISTA_TIPO_INFORME, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(LISTA_TIPO_INFORME),
                Click.on(OPCION_LISTA_TIPO_INFORME),
                Click.on(BOTON_CONSULTAR_CAJA),
                WaitUntil.the(BOTON_SI_GENERA_INFORME, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_SI_GENERA_INFORME),
                WaitUntil.the(BOTON_CERRAR, isClickable()).forNoMoreThan(360).seconds(),
                Click.on(BOTON_CERRAR),
                Click.on(LISTA_TIPO_SALIDA),
                Click.on(CSV_LISTA_TIPO_SALIDA),
                Click.on(BOTON_CONSULTAR_CAJA),
                WaitUntil.the(BOTON_SI_GENERA_INFORME, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_SI_GENERA_INFORME),
                SalirDelSitioWeb.salir(),
                ControlDescargas.hastaTerminar(BaseEvidencias.RUTA_DESCARGA_SISTEMA),

                //salir
                SafeActions.click(BOTON_CONTROL, BOTON_BUSQUEDA),
                SafeActions.click(CAMPO_INGRESO_BUSQUEDA_CONTROL, ICONO_BUSQUEDA_NOMBRE),
                Enter.theValue(bandeja).into(CAMPO_INGRESO_BUSQUEDA_CONTROL),
                Click.on(OPCION_BANDEJA),
                SwitchToNewWindow.switchToNewTab(),

                WaitUntil.the(LISTA_USUARIO_CAJERO, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(LISTA_USUARIO_CAJERO),
                Click.on(OPCION_CAJAQA),
                Click.on(LISTA_TIPO_INFORME),
                Click.on(OPCION_LISTA_TIPO_INFORME),
                Click.on(LISTA_INCLUIR_CONSULTAS),
                Click.on(OPCION_NO_INCLUIR_CONSULTAS),
                Click.on(LISTA_TIPO_SALIDA),
                Click.on(OPCION_PDF_TIPO_SALIDA),
                Click.on(CAMPO_FECHA_INICIAL),
                Enter.theValue("10/02/2026").into(CAMPO_FECHA_INICIAL),
                Click.on(BOTON_CONSULTAR_CAJA),
                WaitUntil.the(BOTON_SI_GENERA_INFORME, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_SI_GENERA_INFORME),
                WaitUntil.the(BOTON_CERRAR, isPresent()).forNoMoreThan(360).seconds(),
                Click.on(BOTON_CERRAR)


        );
    }

    public static FlujoInformeCaja flujoCajaDiario(String bandeja) {
        return new FlujoInformeCaja(bandeja);
    }
}
