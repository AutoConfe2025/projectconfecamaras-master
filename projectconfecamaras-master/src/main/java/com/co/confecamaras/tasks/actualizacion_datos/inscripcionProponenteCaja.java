package com.co.confecamaras.tasks.actualizacion_datos;

import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.actualizacion_datos.ActualizacionMutacionCajaPage.*;
import static com.co.confecamaras.userinterfaces.renovaciones.FujoPnEstPublicoPage.BOTON_CONSULTA_MATRICULA_INSCRIPCION;
import static com.co.confecamaras.userinterfaces.renovaciones.GeneralPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

@AllArgsConstructor
public class inscripcionProponenteCaja implements Task {

    private final String matricula;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BOTON_CONSULTA_MATRICULA_INSCRIPCION, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_CONSULTA_MATRICULA_INSCRIPCION),
                WaitUntil.the(BOTON_MATRICULA, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_MATRICULA),
                Click.on(CAMPO_INGRESO_DATO_BUSQUEDA),
                Enter.theValue(matricula).into(CAMPO_INGRESO_DATO_BUSQUEDA),
                Click.on(BOTON_CONSULTAR_DATO_BUSQUEDA),
                WaitUntil.the(BOTON_MATRICULA_SELECCION, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_MATRICULA_SELECCION),
                WaitUntil.the(BOTON_TRAMITES_REGISTRO_PROPONENTE, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_TRAMITES_REGISTRO_PROPONENTE),
                Click.on(OPCION_INSCRIPCION_PROPONENTE),
                Click.on(BOTON_CONSULTAR_PROPONENTE),
                WaitUntil.the(BOTON_INICIAR_TRAMITE_PROPONENTE, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_INICIAR_TRAMITE_PROPONENTE),

                //FORMULARIO DE DATOS BASICOS
                WaitUntil.the(BOTON_FORMULARIO_PROPONENTE, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_FORMULARIO_PROPONENTE),
                WaitUntil.the(LISTA_TAMAÑO_EMPRESA, isPresent()).forNoMoreThan(10).seconds(),
                SelectFromOptions.byValue("1").from(LISTA_TAMAÑO_EMPRESA),
                Click.on(BOTON_GRABAR_LISTA_TAMAÑO_EMPRESA),
                Scroll.to(OPCION_RUTA_PROPONENTE),
                Click.on(OPCION_RUTA_PROPONENTE),
                WaitUntil.the(CAMPO_DOCUMENTO_PROPONENTE, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_DOCUMENTO_PROPONENTE),
                Enter.theValue("1").into(CAMPO_DOCUMENTO_PROPONENTE),
                Click.on(CAMPO_FECHA_PROPONENTE),
                Enter.theValue("26052026").into(CAMPO_FECHA_PROPONENTE),
                Click.on(CAMPO_ORIGEN_DOCUMENTO_PROPONENTE),
                Enter.theValue("QA").into(CAMPO_ORIGEN_DOCUMENTO_PROPONENTE)
        );

        String rutaArchivo1 = System.getProperty("user.dir")
                + "/src/test/resources/pdfs/20-Formulario-Establecimiento--15025.pdf";

        actor.attemptsTo(
                WaitInterrupted2Segundos.esperaConstante2(),
                Enter.theValue(rutaArchivo1).into(CAMPO_ANEXO_CARGAR_PROPONENTE),
                Scroll.to(BOTON_GRABAR_FORMULARIO_ANEXO_PROPONENTE).andAlignToTop(),
                Click.on(BOTON_GRABAR_FORMULARIO_ANEXO_PROPONENTE),

                //FORMULARIO DOCUMENTO IDENTIDAD DEL PROPONENTE
                Scroll.to(OPCION_DOCUMENTO_IDENTIDAD_PROPONENTE).andAlignToTop(),
                Click.on(OPCION_DOCUMENTO_IDENTIDAD_PROPONENTE),
                WaitUntil.the(CAMPO_DOCUMENTO_PROPONENTE, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_DOCUMENTO_PROPONENTE),
                Enter.theValue("QA").into(CAMPO_DOCUMENTO_PROPONENTE),
                Click.on(CAMPO_FECHA_PROPONENTE),
                Enter.theValue("26052026").into(CAMPO_FECHA_PROPONENTE),
                Click.on(CAMPO_ORIGEN_DOCUMENTO_PROPONENTE),
                Enter.theValue("QA").into(CAMPO_ORIGEN_DOCUMENTO_PROPONENTE),
                WaitInterrupted2Segundos.esperaConstante2(),
                Enter.theValue(rutaArchivo1).into(CAMPO_ANEXO_CARGAR_PROPONENTE),
                Scroll.to(BOTON_GRABAR_FORMULARIO_ANEXO_PROPONENTE).andAlignToTop(),
                Click.on(BOTON_GRABAR_FORMULARIO_ANEXO_PROPONENTE),

                //FORMULARIO CERTIFICACION DE PEQUEÑA EMPRESA
                Scroll.to(OPCION_CERTIFICADO_DE_PEQUENA_EMPRESA),
                Click.on(OPCION_CERTIFICADO_DE_PEQUENA_EMPRESA),
                WaitUntil.the(CAMPO_DOCUMENTO_PROPONENTE, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_DOCUMENTO_PROPONENTE),
                Enter.theValue("QA").into(CAMPO_DOCUMENTO_PROPONENTE),
                Click.on(CAMPO_FECHA_PROPONENTE),
                Enter.theValue("26052026").into(CAMPO_FECHA_PROPONENTE),
                Click.on(CAMPO_ORIGEN_DOCUMENTO_PROPONENTE),
                Enter.theValue("QA").into(CAMPO_ORIGEN_DOCUMENTO_PROPONENTE),
                WaitInterrupted2Segundos.esperaConstante2(),
                Enter.theValue(rutaArchivo1).into(CAMPO_ANEXO_CARGAR_PROPONENTE),
                Scroll.to(BOTON_GRABAR_FORMULARIO_ANEXO_PROPONENTE).andAlignToTop(),
                Click.on(BOTON_GRABAR_FORMULARIO_ANEXO_PROPONENTE),

                //FORMULARIO TARJETA PROFESIONAL CONTADOR PUBLICO
                Scroll.to(OPCION_TARJETA_PROFESIONAL_DEL_CONTADOR),
                Click.on(OPCION_TARJETA_PROFESIONAL_DEL_CONTADOR),
                WaitUntil.the(CAMPO_DOCUMENTO_PROPONENTE, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_DOCUMENTO_PROPONENTE),
                Enter.theValue("QA").into(CAMPO_DOCUMENTO_PROPONENTE),
                Click.on(CAMPO_FECHA_PROPONENTE),
                Enter.theValue("26052026").into(CAMPO_FECHA_PROPONENTE),
                Click.on(CAMPO_ORIGEN_DOCUMENTO_PROPONENTE),
                Enter.theValue("QA").into(CAMPO_ORIGEN_DOCUMENTO_PROPONENTE),
                WaitInterrupted2Segundos.esperaConstante2(),
                Enter.theValue(rutaArchivo1).into(CAMPO_ANEXO_CARGAR_PROPONENTE),
                Scroll.to(BOTON_GRABAR_FORMULARIO_ANEXO_PROPONENTE).andAlignToTop(),
                Click.on(BOTON_GRABAR_FORMULARIO_ANEXO_PROPONENTE),

                //FORMULARIO CERTIFICACION DE LA JUNTA CENTRAL
                Scroll.to(CERTIFICACION_JUNTA_CENTRAL_CONTADORES),
                Click.on(CERTIFICACION_JUNTA_CENTRAL_CONTADORES),
                WaitUntil.the(CAMPO_DOCUMENTO_PROPONENTE, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_DOCUMENTO_PROPONENTE),
                Enter.theValue("QA").into(CAMPO_DOCUMENTO_PROPONENTE),
                Click.on(CAMPO_FECHA_PROPONENTE),
                Enter.theValue("26052026").into(CAMPO_FECHA_PROPONENTE),
                Click.on(CAMPO_ORIGEN_DOCUMENTO_PROPONENTE),
                Enter.theValue("QA").into(CAMPO_ORIGEN_DOCUMENTO_PROPONENTE),
                WaitInterrupted2Segundos.esperaConstante2(),
                Enter.theValue(rutaArchivo1).into(CAMPO_ANEXO_CARGAR_PROPONENTE),
                Scroll.to(BOTON_GRABAR_FORMULARIO_ANEXO_PROPONENTE).andAlignToTop(),
                Click.on(BOTON_GRABAR_FORMULARIO_ANEXO_PROPONENTE),

                //CERTIFICACION DE APORTE AL SISTEMA DE SEGURIDAD SOCIAL
                Scroll.to(CERTIFICACION_APORTES_SISTEMA_SEGURIDAD_SOCIAL),
                Click.on(CERTIFICACION_APORTES_SISTEMA_SEGURIDAD_SOCIAL),
                WaitUntil.the(CAMPO_DOCUMENTO_PROPONENTE, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_DOCUMENTO_PROPONENTE),
                Enter.theValue("QA").into(CAMPO_DOCUMENTO_PROPONENTE),
                Click.on(CAMPO_FECHA_PROPONENTE),
                Enter.theValue("26052026").into(CAMPO_FECHA_PROPONENTE),
                Click.on(CAMPO_ORIGEN_DOCUMENTO_PROPONENTE),
                Enter.theValue("QA").into(CAMPO_ORIGEN_DOCUMENTO_PROPONENTE),
                WaitInterrupted2Segundos.esperaConstante2(),
                Enter.theValue(rutaArchivo1).into(CAMPO_ANEXO_CARGAR_PROPONENTE),
                Scroll.to(BOTON_GRABAR_FORMULARIO_ANEXO_PROPONENTE).andAlignToTop(),
                Click.on(BOTON_GRABAR_FORMULARIO_ANEXO_PROPONENTE),

                //FORMULARIO UBICACION COMERCIAL Y DE NOTIFICACIONES
                WaitUntil.the(BOTON_UBICACION_COMERCIAL_NOTIFICACIONES, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_UBICACION_COMERCIAL_NOTIFICACIONES),
                Scroll.to(BOTON_GRABAR_FORMULARIO).andAlignToTop(),
                Click.on(BOTON_GRABAR_FORMULARIO),

                //FORMULARIO CAPACIDAD FINANCIERA ORGANIZACION
                WaitUntil.the(BOTON_CAPACIDAD_FINANCIERA_ORGANIZACION, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_CAPACIDAD_FINANCIERA_ORGANIZACION),
                Enter.theValue("31122025").into(CAMPO_INGRESO_FECHA_CORTE),
                Scroll.to(LISTA_GRUPO_NIIF),
                SelectFromOptions.byValue("3").from(LISTA_GRUPO_NIIF),
                Scroll.to(BOTON_GRABAR_CAPACIDAD_FINANCIERA),
                Click.on(BOTON_GRABAR_CAPACIDAD_FINANCIERA),
                WaitUntil.the(OPCION_RUTA_PROPONENTE, isPresent()).forNoMoreThan(10).seconds(),
                Scroll.to(OPCION_RUTA_PROPONENTE),
                Click.on(OPCION_RUTA_PROPONENTE),
                WaitUntil.the(CAMPO_DOCUMENTO_PROPONENTE, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_DOCUMENTO_PROPONENTE),
                Enter.theValue("1").into(CAMPO_DOCUMENTO_PROPONENTE),
                Click.on(CAMPO_FECHA_PROPONENTE),
                Enter.theValue("26052026").into(CAMPO_FECHA_PROPONENTE),
                Click.on(CAMPO_ORIGEN_DOCUMENTO_PROPONENTE),
                Enter.theValue("QA").into(CAMPO_ORIGEN_DOCUMENTO_PROPONENTE),

                WaitInterrupted2Segundos.esperaConstante2(),
                Enter.theValue(rutaArchivo1).into(CAMPO_ANEXO_CARGAR_PROPONENTE),
                Scroll.to(BOTON_GRABAR_FORMULARIO_ANEXO_PROPONENTE_2).andAlignToTop(),
                Click.on(BOTON_GRABAR_FORMULARIO_ANEXO_PROPONENTE_2),

                //FORMULARIO DOCUMENTO IDENTIDAD DEL PROPONENTE
                Scroll.to(OPCION_DOCUMENTO_IDENTIDAD_PROPONENTE).andAlignToTop(),
                Click.on(OPCION_DOCUMENTO_IDENTIDAD_PROPONENTE),
                WaitUntil.the(CAMPO_DOCUMENTO_PROPONENTE, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_DOCUMENTO_PROPONENTE),
                Enter.theValue("QA").into(CAMPO_DOCUMENTO_PROPONENTE),
                Click.on(CAMPO_FECHA_PROPONENTE),
                Enter.theValue("26052026").into(CAMPO_FECHA_PROPONENTE),
                Click.on(CAMPO_ORIGEN_DOCUMENTO_PROPONENTE),
                Enter.theValue("QA").into(CAMPO_ORIGEN_DOCUMENTO_PROPONENTE),
                WaitInterrupted2Segundos.esperaConstante2(),
                Enter.theValue(rutaArchivo1).into(CAMPO_ANEXO_CARGAR_PROPONENTE),
                Scroll.to(BOTON_GRABAR_FORMULARIO_ANEXO_PROPONENTE_2).andAlignToTop(),
                Click.on(BOTON_GRABAR_FORMULARIO_ANEXO_PROPONENTE_2),

                //FORMULARIO CERTIFICACION DE PEQUEÑA EMPRESA
                Scroll.to(OPCION_CERTIFICADO_DE_PEQUENA_EMPRESA),
                Click.on(OPCION_CERTIFICADO_DE_PEQUENA_EMPRESA),
                WaitUntil.the(CAMPO_DOCUMENTO_PROPONENTE, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_DOCUMENTO_PROPONENTE),
                Enter.theValue("QA").into(CAMPO_DOCUMENTO_PROPONENTE),
                Click.on(CAMPO_FECHA_PROPONENTE),
                Enter.theValue("26052026").into(CAMPO_FECHA_PROPONENTE),
                Click.on(CAMPO_ORIGEN_DOCUMENTO_PROPONENTE),
                Enter.theValue("QA").into(CAMPO_ORIGEN_DOCUMENTO_PROPONENTE),
                WaitInterrupted2Segundos.esperaConstante2(),
                Enter.theValue(rutaArchivo1).into(CAMPO_ANEXO_CARGAR_PROPONENTE),
                Scroll.to(BOTON_GRABAR_FORMULARIO_ANEXO_PROPONENTE_2).andAlignToTop(),
                Click.on(BOTON_GRABAR_FORMULARIO_ANEXO_PROPONENTE_2),

                //FORMULARIO TARJETA PROFESIONAL CONTADOR PUBLICO
                Scroll.to(OPCION_TARJETA_PROFESIONAL_DEL_CONTADOR),
                Click.on(OPCION_TARJETA_PROFESIONAL_DEL_CONTADOR),
                WaitUntil.the(CAMPO_DOCUMENTO_PROPONENTE, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_DOCUMENTO_PROPONENTE),
                Enter.theValue("QA").into(CAMPO_DOCUMENTO_PROPONENTE),
                Click.on(CAMPO_FECHA_PROPONENTE),
                Enter.theValue("26052026").into(CAMPO_FECHA_PROPONENTE),
                Click.on(CAMPO_ORIGEN_DOCUMENTO_PROPONENTE),
                Enter.theValue("QA").into(CAMPO_ORIGEN_DOCUMENTO_PROPONENTE),
                WaitInterrupted2Segundos.esperaConstante2(),
                Enter.theValue(rutaArchivo1).into(CAMPO_ANEXO_CARGAR_PROPONENTE),
                Scroll.to(BOTON_GRABAR_FORMULARIO_ANEXO_PROPONENTE_2).andAlignToTop(),
                Click.on(BOTON_GRABAR_FORMULARIO_ANEXO_PROPONENTE_2),

                //FORMULARIO EXPERIENCIA
                Click.on(BOTON_EXPERIENCIA),
                WaitUntil.the(BOTON_ADICIONAR_CONTRATO, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_ADICIONAR_CONTRATO),
                WaitUntil.the(LISTA_CELEBRADO_POR, isPresent()).forNoMoreThan(10).seconds(),
                SelectFromOptions.byValue("1").from(LISTA_CELEBRADO_POR),
                Click.on(CAMPO_NOMBRE_DEL_CONTRATANTE),
                Enter.theValue("qa").into(CAMPO_NOMBRE_DEL_CONTRATANTE),
                Click.on(CAMPO_FECHA_DEL_CONTRATANTE),
                Enter.theValue("05062026").into(CAMPO_FECHA_DEL_CONTRATANTE),
                Click.on(CAMPO_VALOR_EN_PESOS),
                Enter.theValue("3000000").into(CAMPO_VALOR_EN_PESOS),
                Click.on(CAMPO_CLASIFICAIONES_DATOS),
                Enter.theValue("101015").into(CAMPO_CLASIFICAIONES_DATOS),
                Scroll.to(BOTON_GRABAR_DATOS_BASICOS_CONTRATO),
                Click.on(BOTON_GRABAR_DATOS_BASICOS_CONTRATO),
                WaitUntil.the(VALIDAR_PDF_EXPERIENCIA, isPresent()).forNoMoreThan(10).seconds(),
                Scroll.to(VALIDAR_PDF_EXPERIENCIA),
                Click.on(VALIDAR_PDF_EXPERIENCIA),
                WaitInterrupted2Segundos.esperaConstante2(),
                Scroll.to(BOTON_CARGAR_DECLARACION),
                Click.on(BOTON_CARGAR_DECLARACION),
                WaitUntil.the(CAMPO_DOCUMENTO_PROPONENTE, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_DOCUMENTO_PROPONENTE),
                Enter.theValue("QA").into(CAMPO_DOCUMENTO_PROPONENTE),
                Click.on(CAMPO_FECHA_PROPONENTE),
                Enter.theValue("26052026").into(CAMPO_FECHA_PROPONENTE),
                Click.on(CAMPO_ORIGEN_DOCUMENTO_PROPONENTE),
                Enter.theValue("QA").into(CAMPO_ORIGEN_DOCUMENTO_PROPONENTE),
                WaitInterrupted2Segundos.esperaConstante2(),
                Enter.theValue(rutaArchivo1).into(CAMPO_ANEXO_CARGAR_PROPONENTE),
                Scroll.to(BOTON_GRABAR_FORMULARIO_ANEXO_PROPONENTE).andAlignToTop(),
                Click.on(BOTON_GRABAR_FORMULARIO_ANEXO_PROPONENTE),
                WaitInterrupted2Segundos.esperaConstante2(),
                WaitUntil.the(BOTON_CARGAR_SOPORTE, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_CARGAR_SOPORTE),
                WaitUntil.the(CAMPO_DOCUMENTO_PROPONENTE, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_DOCUMENTO_PROPONENTE),
                Enter.theValue("QA").into(CAMPO_DOCUMENTO_PROPONENTE),
                Click.on(CAMPO_FECHA_PROPONENTE),
                Enter.theValue("26052026").into(CAMPO_FECHA_PROPONENTE),
                Click.on(CAMPO_ORIGEN_DOCUMENTO_PROPONENTE),
                Enter.theValue("QA").into(CAMPO_ORIGEN_DOCUMENTO_PROPONENTE),
                WaitInterrupted2Segundos.esperaConstante2(),
                Enter.theValue(rutaArchivo1).into(CAMPO_ANEXO_CARGAR_PROPONENTE),
                Scroll.to(BOTON_GRABAR_FORMULARIO_ANEXO_PROPONENTE).andAlignToTop(),
                Click.on(BOTON_GRABAR_FORMULARIO_ANEXO_PROPONENTE),

                //FORMULARIO CLASIFICACIONES
                WaitInterrupted2Segundos.esperaConstante2(),
                WaitUntil.the(BOTON_CLASIFICACIONES, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_CLASIFICACIONES),
                Click.on(CAMPO_INGRESO_CLASIFICACION),
                Enter.theValue("101015").into(CAMPO_INGRESO_CLASIFICACION),
                Click.on(BOTON_GRABAR_CLASIFICACION),
                WaitInterrupted2Segundos.esperaConstante2(),
                Click.on(BOTON_REVISION),
                WaitUntil.the(BOTON_OPCION_FORMULARIO, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_OPCION_FORMULARIO),
                WaitInterrupted2Segundos.esperaConstante2(),
                Click.on(BOTON_CERRAR_OPCION_FORMULARIO),
                WaitInterrupted2Segundos.esperaConstante2(),
                Click.on(BOTON_REVISION),
                WaitUntil.the(BOTON_OPCION_SOPORTES, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_OPCION_SOPORTES),
                WaitInterrupted2Segundos.esperaConstante2(),
                Click.on(BOTON_CERRAR_OPCION_FORMULARIO),
                WaitInterrupted2Segundos.esperaConstante2(),
                WaitUntil.the(BOTON_VER_PDF, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_VER_PDF),
                WaitUntil.the(BOTON_OPCION_FORMULARIO_BORRADOR, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_OPCION_FORMULARIO_BORRADOR),
                WaitUntil.the(BOTON_CERRAR_FORMULARIO_BORRADOR, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_CERRAR_FORMULARIO_BORRADOR),
                WaitInterrupted2Segundos.esperaConstante2(),
                WaitUntil.the(BOTON_VER_PDF, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_VER_PDF),
                WaitUntil.the(BOTON_OPCION_FORMULARIO_FINAL, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_OPCION_FORMULARIO_FINAL),
                WaitUntil.the(BOTON_SI_FORMULARIO_FINAL, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_SI_FORMULARIO_FINAL),
                WaitUntil.the(BOTON_CERRAR_FORMULARIO_BORRADOR, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_CERRAR_FORMULARIO_BORRADOR),
                WaitInterrupted2Segundos.esperaConstante2(),
                Click.on(BOTON_RECIBIR_PAGO),
                WaitInterrupted2Segundos.esperaConstante2(),
                SwitchToNewWindow.switchToNewTab()

        );
    }

    public static inscripcionProponenteCaja incripcionProponenteCaja(String matricula){
        return instrumented(inscripcionProponenteCaja.class,matricula);
    }
}
