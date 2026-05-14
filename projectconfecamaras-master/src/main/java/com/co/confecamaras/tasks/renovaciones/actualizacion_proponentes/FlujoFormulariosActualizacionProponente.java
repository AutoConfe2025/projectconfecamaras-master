package com.co.confecamaras.tasks.renovaciones.actualizacion_proponentes;

import com.co.confecamaras.interactions.BuscarEnTablaPaginada;
import com.co.confecamaras.interactions.ClickRobusto;
import com.co.confecamaras.interactions.IngresarFechaActual;
import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.renovaciones.FlujoActualizarProponentePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FlujoFormulariosActualizacionProponente implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BOTON_GRABAR_FORM, isVisible()).forNoMoreThan(120).seconds(),
                ClickRobusto.en(BOTON_GRABAR_FORM, BOTON_EXPERIENCIA_FORM),
                Scroll.to(BOTON_EXPERIENCIA_FORM),
                Click.on(BOTON_EXPERIENCIA_FORM),
                WaitUntil.the(BOTON_ADICIONAR_CONTRATO, isPresent()).forNoMoreThan(120).seconds(),
                Click.on(BOTON_ADICIONAR_CONTRATO),
                SelectFromOptions.byValue("1").from(LITA_CELEBRADO_POR),
                Click.on(CAMPO_NOMBRE_CONTRATANTE),
                Enter.theValue("QA").into(CAMPO_NOMBRE_CONTRATANTE),
                IngresarFechaActual.enElCampo(CAMPO_FECHA_EJECUCION_TERMINACION),
                Click.on(CAMPO_VALOR_EN_PESOS),
                Enter.theValue("20000000").into(CAMPO_VALOR_EN_PESOS),
                Scroll.to(CAMPO_CLASIFICACIONES).andAlignToTop(),
                Enter.theValue("101015").into(CAMPO_CLASIFICACIONES),
                Scroll.to(BOTON_GRABAR_DATOS_BASICOS_CONTRATO).andAlignToTop(),
                Click.on(BOTON_GRABAR_DATOS_BASICOS_CONTRATO)
        );

        //segunda parte de formulario

        actor.attemptsTo(
                BuscarEnTablaPaginada.conParametros(TABLA, QA_TEXTO, SIGUIENTE),
                Click.on(BOTON_CARGAR_DECLARACION_QA)
        );

        //formlario cargar anexo

        String rutaArchivo1 = System.getProperty("user.dir")
                + "/src/test/resources/pdfs/20-Formulario-Establecimiento--15025.pdf";

        actor.attemptsTo(
                Click.on(CAMPO_NUMERO_DEL_DOCUMENTO),
                Enter.theValue("8100057474").into(CAMPO_NUMERO_DEL_DOCUMENTO),
                IngresarFechaActual.enElCampo(CAMPO_FECHA_DEL_ANEXO),
                Click.on(CAMPO_ORIGEN_DOCUMENTO),
                Enter.theValue("QA").into(CAMPO_ORIGEN_DOCUMENTO),
                Enter.theValue(rutaArchivo1).into(SELECCION_ARCHIVO_ORIGEN_DOCUMENTO),
                Scroll.to(BOTON_GRABAR_CARGAR_ANEXO),
                Click.on(BOTON_GRABAR_CARGAR_ANEXO)
        );

        //formulario clasificaciones
        actor.attemptsTo(
                WaitUntil.the(BOTON_CLASIFICACIONES, isVisible()).forNoMoreThan(120).seconds(),
                Click.on(BOTON_CLASIFICACIONES),
                WaitUntil.the(CAMPO_CLASIFICACIONES_INGRESO_TEXTO, isVisible()).forNoMoreThan(120).seconds(),
                Click.on(CAMPO_CLASIFICACIONES_INGRESO_TEXTO),
                SendKeys.of(", 101015").into(CAMPO_CLASIFICACIONES_INGRESO_TEXTO),
                Scroll.to(BOTON_GRABAR_CLASIFICACIONES),
                Click.on(BOTON_GRABAR_CLASIFICACIONES),
                WaitUntil.the(BOTON_VER_PDF, isVisible()).forNoMoreThan(120).seconds(),
                Scroll.to(BOTON_VER_PDF).andAlignToTop(),
                Click.on(BOTON_VER_PDF),
                Click.on(BOTON_FORMULARIO_BORRADOR),
                WaitInterrupted2Segundos.esperaConstante2(),
                Click.on(BOTON_CERRAR_PDF_FORMULARIO_BORRADOR),
                Scroll.to(BOTON_VER_PDF).andAlignToTop(),
                Click.on(BOTON_VER_PDF),
                Click.on(BOTON_FORMULARIO_FINAL),
                Click.on(BOTON_SI_GENERAR_FORM_FINAL),
                WaitInterrupted2Segundos.esperaConstante2(),
                Click.on(BOTON_CERRAR_PDF_FORMULARIO_BORRADOR)
        );
    }

    public static FlujoFormulariosActualizacionProponente FormContratoBasico() {
        return instrumented(FlujoFormulariosActualizacionProponente.class);
    }
}
