package com.co.confecamaras.tasks.actualizacion_datos;

import com.co.confecamaras.interactions.*;
import com.co.confecamaras.interactions.SwitchToNewWindow;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static com.co.confecamaras.userinterfaces.actualizacion_datos.ActualizacionMutacionCajaPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class FlujoReingresoDevolucionPlanoSinReingreso implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        String codigo = actor.recall("codigoBarras");

        actor.attemptsTo(
                Click.on(BOTON_MENU_CAMARA_DE_COMERCIO),
                WaitUntil.the(BOTON_BANDEJAS, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_BANDEJAS),
                WaitUntil.the(OPCION_REGISTROS_PUBLICOS, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(OPCION_REGISTROS_PUBLICOS),
                WaitUntil.the(OPCION_REPATO_Y_ESCANEO, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(OPCION_REPATO_Y_ESCANEO),
                WaitInterrupted3Segundos.esperaConstante3(),
                SwitchToNewWindow.switchToNewTab(),

                //flujo reingreso escaneo
                Click.on(CAMPO_INGRESO_COD_BARRAS_INICIAL),
                Enter.theValue(codigo).into(CAMPO_INGRESO_COD_BARRAS_INICIAL),
                Hit.the(Keys.TAB).into(CAMPO_INGRESO_COD_BARRAS_INICIAL),
                WaitInterrupted3Segundos.esperaConstante3(),
                Click.on(BOTON_ESCANEO_Y_DIGITALIZACION),
                WaitInterrupted3Segundos.esperaConstante3(),
                SwitchToNewWindow.switchToNewTab(),
                Click.on(BOTON_CONTINUAR_ESCANEO_DIGITALIZACION),
                WaitUntil.the(LISTA_USUARIO_SELECCION, isPresent()).forNoMoreThan(10).seconds(),
                SelectFromOptions.byValue("CAJAQA").from(LISTA_USUARIO_SELECCION),
                Click.on(BOTON_ASIGNAR_ESCANEO_DIGITALIZACION),
                SwitchToNewWindow.switchToNewTab(),
                CloseSecondTab.now(),

                //FLUJO ESTUIO  REGMTIL
                WaitUntil.the(OPCION_ESTUDIO_REGMTIL, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(OPCION_ESTUDIO_REGMTIL),
                WaitInterrupted3Segundos.esperaConstante3(),
                SwitchToNewWindow.switchToNewTab(),
                WaitUntil.the(CAMPO_BUSCAR_REGMTIL, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_BUSCAR_REGMTIL),
                Enter.theValue(codigo).into(CAMPO_BUSCAR_REGMTIL),
                Hit.the(Keys.TAB).into(CAMPO_INGRESO_COD_BARRAS_INICIAL),
                WaitInterrupted3Segundos.esperaConstante3(),
                WaitUntil.the(BOTON_DEVOLVER_REQUERIMIENTO, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_DEVOLVER_REQUERIMIENTO),
                WaitInterrupted3Segundos.esperaConstante3(),
                SwitchToNewWindow.switchToNewTab(),
                Scroll.to(LISTA_TIPO_TRAMITE_DEVOLUCION).andAlignToTop(),
                SelectFromOptions.byValue("mutacionactualizacion").from(LISTA_TIPO_TRAMITE_DEVOLUCION),
                SelectFromOptions.byValue("D").from(LISTA_TIPO_PROCEDE_REINGRESO),
                SelectFromOptions.byValue("T").from(LISTA_TIPO_DEVOLUCION),
                Scroll.to(SELECCIONAR_ACLARAR_AUMENTO_CAPITAL).andAlignToTop(),
                Click.on(SELECCIONAR_ACLARAR_AUMENTO_CAPITAL),
                Scroll.to(CAMPO_INGRESO_OBSERVACIONES).andAlignToTop(),
                Enter.theValue("prueba de automatizacion").into(CAMPO_INGRESO_OBSERVACIONES),
                Scroll.to(BOTON_GRABAR_FORMULARIO_).andAlignToTop(),
                Click.on(BOTON_GRABAR_FORMULARIO_),
                WaitUntil.the(BOTON_APLICAR_FORMULARIO_, isPresent()).forNoMoreThan(10).seconds(),
                Scroll.to(BOTON_APLICAR_FORMULARIO_).andAlignToTop(),
                Click.on(BOTON_APLICAR_FORMULARIO_),
                WaitUntil.the(BOTON_CONTINUAR_ESCANEO_DIGITALIZACION, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_CONTINUAR_ESCANEO_DIGITALIZACION),
                SwitchToNewWindow.switchToNewTab(),
                CloseSecondTab.now(),
                WaitInterrupted2Segundos.esperaConstante2(),
                SwitchToNewWindow.switchToNewTab(),
                CloseSecondTab.now(),
                WaitInterrupted2Segundos.esperaConstante2(),
                WaitUntil.the(BOTON_BUSCAR_CRTL_K, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_BUSCAR_CRTL_K),
                WaitUntil.the(CAMPO_BUSCAR_CRTL_K, isPresent()).forNoMoreThan(10).seconds(),
                Enter.theValue("Ruta de documentos").into(CAMPO_BUSCAR_CRTL_K),
                Click.on(OPCION_RUTA_DOCUMENTOS),
                WaitUntil.the(CAMPO_INGRESO_VALOR_BUSQUEDA, isPresent()).forNoMoreThan(10).seconds(),
                Enter.theValue(codigo).into(CAMPO_INGRESO_VALOR_BUSQUEDA),
                Click.on(BOTON_CONSULTAR_),
                WaitUntil.the(BOTON_ENTREGAR_AL_USUARIO, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_ENTREGAR_AL_USUARIO),
                WaitUntil.the(BOTON_SI_INFORMATIVO, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_SI_INFORMATIVO),
                WaitUntil.the(BOTON_OK_SI_INFORMATIVO, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_OK_SI_INFORMATIVO),
                WaitUntil.the(BOTON_BUSCAR_CRTL_K, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_BUSCAR_CRTL_K),
                WaitUntil.the(CAMPO_BUSCAR_CRTL_K, isPresent()).forNoMoreThan(10).seconds(),
                Enter.theValue("Reingreso de trámites").into(CAMPO_BUSCAR_CRTL_K),
                Click.on(OPCION_REINGRESO_TRAMITES),
                WaitUntil.the(CAMPO_CODIGO_DE_BARRAS_INGRESO, isPresent()).forNoMoreThan(120).seconds(),
                Enter.theValue(codigo).into(CAMPO_CODIGO_DE_BARRAS_INGRESO),
                Click.on(BOTON_CONTINUAR_REINGRESAR)
        );
    }

    public static FlujoReingresoDevolucionPlanoSinReingreso flujoDevolucionSinReingreso(){
        return instrumented(FlujoReingresoDevolucionPlanoSinReingreso.class);
    }
}
