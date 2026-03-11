package com.co.confecamaras.tasks.ConsultasTransacciones;

import com.co.confecamaras.interactions.JSScrollDown;
import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.interactions.WaitConstant;
import com.co.confecamaras.interactions.WaitConstantTwo;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.tasks.CompararElContenidoDelPDF;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import com.co.confecamaras.utils.consultasytransacciones.ConsultarExpedienteConstants;
import com.co.confecamaras.utils.consultasytransacciones.Expedientes.ExpedientesPalabras;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.openqa.selenium.WebDriver;

import static com.co.confecamaras.userinterfaces.consultasytransacciones.Expediente.*;
import static com.co.confecamaras.utils.consultasytransacciones.ConsultarExpedienteConstants.PALABRA;

public class  ConsultaExpedientesPalabras implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {


        // --- Bloque 1: Ingreso de datos de búsqueda por Palabras ---
        actor.attemptsTo(LogEvent.recordevent(Reportes.INFO, " ingrese  por Palabras!!!"));
        actor.attemptsTo(Click.on(BTN_PALABRAS));
        actor.attemptsTo(WaitInteractions.untilBeEnable(INPUT_DATO_BUSQUEDA));
        actor.attemptsTo(Enter.theValue(PALABRA).into(INPUT_DATO_BUSQUEDA));
        actor.attemptsTo(Click.on(BTN_CONSULTAR_EXPEDIENTE));


        // --- Bloque 2: Verificación y navegación de detalles del expediente ---
        actor.attemptsTo(WaitInteractions.untilBeEnable(BTN_NUMERO_MATRICULA_PALABRA));
        actor.attemptsTo(Click.on(BTN_NUMERO_MATRICULA_PALABRA));

        // Asersiones iniciales
        actor.attemptsTo(Ensure.that(VALOR_MATRICULA_MERCANTIL).textContentValues().contains(ConsultarExpedienteConstants.MATRICULA_EXP_PALABRA));
        actor.attemptsTo(Ensure.that(VALOR_NOMBRE_RAZON_SOCIAL).textContentValues().contains(ExpedientesPalabras.NOMBRE_RAZON_SOCIAL_PALABRA));

        // Estado del Expediente (solo abre y verifica campos específicos de Organización)
        actor.attemptsTo(Scroll.to(ESTADO_EXPEDIENTE).andAlignToTop());
        actor.attemptsTo(Click.on(ESTADO_EXPEDIENTE));
        actor.attemptsTo(WaitConstantTwo.esperaConstante());
        actor.attemptsTo(WaitConstantTwo.esperaConstante());
        actor.attemptsTo(Scroll.to(VALOR_ORGANIZACION_JURIDICA).andAlignToTop());
        actor.attemptsTo(Ensure.that(VALOR_ORGANIZACION_JURIDICA).textContentValues().contains(ExpedientesPalabras.ORGANIZACION_JURIDICA2));
        actor.attemptsTo(Ensure.that(VALOR_CATEGORIA).textContentValues().contains(ExpedientesPalabras.CATEGORIA));
        actor.attemptsTo(Ensure.that(VALOR_ADAPTACION_NUEVO_FORMATO).textContentValues().contains(ExpedientesPalabras.ADAPTACION_NUEVO_FORMATO2));
        actor.attemptsTo(Click.on(ESTADO_EXPEDIENTE)); // Cierra Estado Expediente

        // Seguridad Social
        actor.attemptsTo(Scroll.to(SEGURIDAD_SOCIAL).andAlignToTop());
        actor.attemptsTo(Click.on(SEGURIDAD_SOCIAL));
        actor.attemptsTo(WaitConstantTwo.esperaConstante());
        actor.attemptsTo(Click.on(SEGURIDAD_SOCIAL)); // Cierra Seguridad Social

        // Autorización Envío Emails
        actor.attemptsTo(Scroll.to(AUTORIZACION_ENVIO_EMAILS).andAlignToTop());
        actor.attemptsTo(Click.on(AUTORIZACION_ENVIO_EMAILS));
        actor.attemptsTo(WaitConstantTwo.esperaConstante());
        actor.attemptsTo(Click.on(AUTORIZACION_ENVIO_EMAILS)); // Cierra Autorización Envío Emails

        // Ubicación Comercial
        actor.attemptsTo(Scroll.to(UBICACION_COMERCIAL).andAlignToTop());
        actor.attemptsTo(Click.on(UBICACION_COMERCIAL));
        actor.attemptsTo(Ensure.that(VALOR_DIRECCION_COMERCIAL).textContentValues().contains(ExpedientesPalabras.DIRECCION));
        actor.attemptsTo(Ensure.that(VALOR_BARRIO).textContentValues().contains(ExpedientesPalabras.BARRIO2));
        actor.attemptsTo(Ensure.that(VALOR_MUNICIPIO).textContentValues().contains(ExpedientesPalabras.MUNICIPIO2));
        actor.attemptsTo(Ensure.that(VALOR_PAIS).textContentValues().contains(ExpedientesPalabras.PAIS));
        actor.attemptsTo(Ensure.that(VALOR_TELEFONO_01).textContentValues().contains(ExpedientesPalabras.TELEFONO_01));
        actor.attemptsTo(Scroll.to(VALOR_DIRECCION_COMERCIAL).andAlignToTop());
        actor.attemptsTo(Ensure.that(VALOR_TELEFONO_02).textContentValues().contains(ExpedientesPalabras.TELEFONO_02));
        actor.attemptsTo(Ensure.that(VALOR_TELEFONO_03).textContentValues().contains(ExpedientesPalabras.TELEFONO_03));
        actor.attemptsTo(Ensure.that(VALOR_CORREO_ELECTRONICO).textContentValues().contains(ExpedientesPalabras.CORREO_ELECTRONICO));
        actor.attemptsTo(Click.on(UBICACION_COMERCIAL)); // Cierra Ubicación Comercial

        // Actividad Económica y CIIUS
        actor.attemptsTo(Click.on(ACTIVIDAD_ECONOMICA_Y_CIIUS));
        actor.attemptsTo(Scroll.to(ACTIVIDAD_ECONOMICA_Y_CIIUS).andAlignToTop());
        actor.attemptsTo(Ensure.that(VALOR_NOMBRE_ACTIVIDAD).textContentValues().contains(ExpedientesPalabras.NOMBRE_ACTIVIDAD2));
        actor.attemptsTo(WaitConstantTwo.esperaConstante());
        actor.attemptsTo(Click.on(ACTIVIDAD_ECONOMICA_Y_CIIUS)); // Cierra Actividad Económica y CIIUS

        // Participación
        actor.attemptsTo(Scroll.to(PARTICIPACION).andAlignToTop());
        actor.attemptsTo(Click.on(PARTICIPACION));
        actor.attemptsTo(WaitConstantTwo.esperaConstante());
        actor.attemptsTo(Click.on(PARTICIPACION)); // Cierra Participación

        // Información Financiera
        actor.attemptsTo(Click.on(INFORMACION_FINANCIERA));
        actor.attemptsTo(Scroll.to(INFORMACION_FINANCIERA).andAlignToTop());
        actor.attemptsTo(Ensure.that(VALOR_ANIO_DATOS).textContentValues().contains(ExpedientesPalabras.ANIO_DATOS2));
        actor.attemptsTo(Ensure.that(VALOR_FECHA_DATOS).textContentValues().contains(ExpedientesPalabras.FECHA_DATOS2));
        actor.attemptsTo(Ensure.that(VALOR_PERSONAL_OCUPADO).textContentValues().contains(ExpedientesPalabras.PERSONAL_OCUPADO2));
        actor.attemptsTo(Ensure.that(VALOR_COMERCIAL).textContentValues().contains(ExpedientesPalabras.VALOR_COMERCIAL));
        actor.attemptsTo(WaitConstantTwo.esperaConstante());
        actor.attemptsTo(Click.on(INFORMACION_FINANCIERA)); // Cierra Información Financiera

        // Pagos de Matrícula
        actor.attemptsTo(Scroll.to(PAGOS_DE_MATRICULA).andAlignToTop());
        actor.attemptsTo(Click.on(PAGOS_DE_MATRICULA));
        actor.attemptsTo(JSScrollDown.on(PRIMER_CONTENIDO_MODAL));
        actor.attemptsTo(WaitConstantTwo.esperaConstante());
        actor.attemptsTo(Click.on(PAGOS_DE_MATRICULA)); // Cierra Pagos de Matrícula

//        // Embargos
//        actor.attemptsTo(Scroll.to(EMBARGOS).andAlignToTop());
//        actor.attemptsTo(Click.on(EMBARGOS));
//        actor.attemptsTo(WaitConstantTwo.esperaConstante());
//        actor.attemptsTo(Click.on(EMBARGOS)); // Cierra Embargos

        // Inscripción de Documentos
        actor.attemptsTo(JSScrollDown.on(PRIMER_CONTENIDO_MODAL));
        actor.attemptsTo(Click.on(INSCRIPCION_DE_DOCUMENTOS));
        actor.attemptsTo(Scroll.to(INSCRIPCION_DE_DOCUMENTOS).andAlignToTop());
        actor.attemptsTo(WaitConstantTwo.esperaConstante());
        actor.attemptsTo(Click.on(INSCRIPCION_DE_DOCUMENTOS)); // Cierra Inscripción de Documentos

        // Propietarios
        actor.attemptsTo(Scroll.to(PROPIETARIOS).andAlignToTop());
        actor.attemptsTo(Click.on(PROPIETARIOS));
        actor.attemptsTo(WaitConstantTwo.esperaConstante());
        actor.attemptsTo(Click.on(PROPIETARIOS)); // Cierra Propietarios

        actor.attemptsTo(WaitConstantTwo.esperaConstante());

        // Formularios y Expediente Gráfico (Abre)
        actor.attemptsTo(Scroll.to(FORMULARIOS_Y_EXPEDIENTE_GRAFICO).andAlignToTop());
        actor.attemptsTo(Click.on(FORMULARIOS_Y_EXPEDIENTE_GRAFICO));

        // --- Bloque 3: Manejo de PDF (Formularios Prediligenciados) ---
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        String originalHandle = driver.getWindowHandle();


        actor.attemptsTo(Scroll.to(FORMULARIOS_PREDILIGENCIADO).andAlignToTop());
        actor.attemptsTo(Click.on(FORMULARIOS_PREDILIGENCIADO));
        actor.attemptsTo(WaitConstant.esperaConstante());
        actor.attemptsTo(WaitConstant.esperaConstante());

        // Comparar PDF Formularios Prediligenciados (1)


        // PDF Última Renovación
        actor.attemptsTo(WaitConstantTwo.esperaConstante());
        actor.attemptsTo(Click.on(FORM_ULTIMA_RENOVACION));
        actor.attemptsTo(WaitConstant.esperaConstante());

        // Comparar PDF Última Renovación (2)




        // --- Bloque 4: Cierre de secciones y navegación final ---
        actor.attemptsTo(Click.on(FORMULARIOS_Y_EXPEDIENTE_GRAFICO)); // Cierra Formularios y Expediente Gráfico

        // Evidencias SIPREF
        actor.attemptsTo(Scroll.to(EVIDENCIAS_SIPREF).andAlignToTop());
        actor.attemptsTo(Click.on(EVIDENCIAS_SIPREF));
        actor.attemptsTo(WaitConstantTwo.esperaConstante());
        actor.attemptsTo(Click.on(EVIDENCIAS_SIPREF)); // Cierra Evidencias SIPREF

        // Notificaciones SIPREF
        actor.attemptsTo(Scroll.to(NOTIFICACIONES_SIPREF_1).andAlignToTop());
        actor.attemptsTo(Click.on(NOTIFICACIONES_SIPREF_1));
        actor.attemptsTo(WaitConstantTwo.esperaConstante());
        actor.attemptsTo(Click.on(NOTIFICACIONES_SIPREF_1)); // Cierra Notificaciones SIPREF

        // Operaciones del Registro Mercantil ESADL
        actor.attemptsTo(Scroll.to(OPERACIONES_DEL_REGISTRO_MERCANTIL_ESADL).andAlignToBottom());
        actor.attemptsTo(JSScrollDown.on(PRIMER_CONTENIDO_MODAL));
        actor.attemptsTo(JSScrollDown.on(PRIMER_CONTENIDO_MODAL));
        actor.attemptsTo(JSScrollDown.on(PRIMER_CONTENIDO_MODAL));

        actor.attemptsTo(Click.on(OPERACIONES_DEL_REGISTRO_MERCANTIL_ESADL));
        actor.attemptsTo(JSScrollDown.on(PRIMER_CONTENIDO_MODAL));
        actor.attemptsTo(JSScrollDown.on(PRIMER_CONTENIDO_MODAL));
        actor.attemptsTo(JSScrollDown.on(PRIMER_CONTENIDO_MODAL));

        actor.attemptsTo(WaitConstant.esperaConstante());
    }

    public static ConsultaExpedientesPalabras palabras(){
        return Tasks.instrumented(ConsultaExpedientesPalabras.class);
    }
}