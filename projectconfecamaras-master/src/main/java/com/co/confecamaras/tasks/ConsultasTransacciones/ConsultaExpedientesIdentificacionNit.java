package com.co.confecamaras.tasks.ConsultasTransacciones;

import com.co.confecamaras.interactions.JSScrollDown;
import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.interactions.WaitConstant;
import com.co.confecamaras.interactions.WaitConstantTwo;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.tasks.CompararElContenidoDelPDF;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import com.co.confecamaras.utils.consultasytransacciones.ConsultarExpedienteConstants;
import com.co.confecamaras.utils.consultasytransacciones.Expedientes.ExpedientesIdentificacionNit;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebDriver;

import static com.co.confecamaras.userinterfaces.consultasytransacciones.Expediente.*;
import static com.co.confecamaras.utils.consultasytransacciones.ConsultarExpedienteConstants.IDENTIFICACION;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ConsultaExpedientesIdentificacionNit implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        // --- Bloque 1: Ingreso de datos de búsqueda y consulta ---
        actor.attemptsTo(LogEvent.recordevent(Reportes.INFO, " ingrese  por Identificacion!!!"));
        actor.attemptsTo(WaitInteractions.untilBeEnable(INPUT_DATO_BUSQUEDA));
        actor.attemptsTo(Enter.theValue(IDENTIFICACION).into(INPUT_DATO_BUSQUEDA));
        actor.attemptsTo(Click.on(BTN_CONSULTAR_EXPEDIENTE));


        // --- Bloque 2: Verificación y navegación de detalles del expediente ---
        actor.attemptsTo(WaitInteractions.untilBeEnable(BTN_NUMERO_MATRICULA_IDENTIFICACION));
        actor.attemptsTo(Click.on(BTN_NUMERO_MATRICULA_IDENTIFICACION));

        // Asersiones de Matrícula y Razón Social
        actor.attemptsTo(WaitUntil.the(VALOR_MATRICULA_MERCANTIL,isPresent()).forNoMoreThan(10).seconds());
        actor.attemptsTo(Ensure.that(VALOR_MATRICULA_MERCANTIL).textContentValues().contains(ConsultarExpedienteConstants.MATRICULA_EXP_IDENTIFICACION));
        actor.attemptsTo(Ensure.that(VALOR_NOMBRE_RAZON_SOCIAL).textContentValues().contains(ExpedientesIdentificacionNit.NOMBRE_RAZON_SOCIAL));

        // Estado del Expediente
        actor.attemptsTo(Scroll.to(ESTADO_EXPEDIENTE).andAlignToTop());
        actor.attemptsTo(Click.on(ESTADO_EXPEDIENTE));
        actor.attemptsTo(Ensure.that(VALOR_ESTADO_MATRICULA).textContentValues().contains(ExpedientesIdentificacionNit.ESTADO_MATRICULA));
        actor.attemptsTo(Ensure.that(VALOR_ESTADO_DATOS).textContentValues().contains(ExpedientesIdentificacionNit.ESTADO_DATOS));
        actor.attemptsTo(Ensure.that(VALOR_FECHA_MATRICULA).textContentValues().contains(ExpedientesIdentificacionNit.FECHA_MATRICULA));
        actor.attemptsTo(Ensure.that(VALOR_FECHA_ULTIMA_RENOVACION).textContentValues().contains(ExpedientesIdentificacionNit.FECHA_ULTIMA_RENOVACION));
        actor.attemptsTo(Ensure.that(VALOR_ULTIMO_ANIO_RENOVADO).textContentValues().contains(ExpedientesIdentificacionNit.ULTIMO_ANIO_RENOVADO));

        // Organización Jurídica y Categoría
        actor.attemptsTo(Scroll.to(VALOR_ORGANIZACION_JURIDICA).andAlignToTop());
        actor.attemptsTo(Ensure.that(VALOR_ORGANIZACION_JURIDICA).textContentValues().contains(ExpedientesIdentificacionNit.ORGANIZACION_JURIDICA));
        actor.attemptsTo(Ensure.that(VALOR_CATEGORIA).textContentValues().contains(ExpedientesIdentificacionNit.CATEGORIA));
        actor.attemptsTo(Ensure.that(VALOR_TIPO_LOCAL).textContentValues().contains(ExpedientesIdentificacionNit.FECHA_CONSTRUCCION));
        actor.attemptsTo(Ensure.that(VALOR_ADAPTACION_NUEVO_FORMATO).textContentValues().contains(ExpedientesIdentificacionNit.FECHA_VENCIMIENTO));
        actor.attemptsTo(Click.on(ESTADO_EXPEDIENTE)); // Cierra Estado Expediente

        // Beneficios
        actor.attemptsTo(Scroll.to(BENEFICIOS).andAlignToTop());
        actor.attemptsTo(Click.on(BENEFICIOS));
        actor.attemptsTo(WaitConstantTwo.esperaConstante());
        actor.attemptsTo(Click.on(BENEFICIOS)); // Cierra Beneficios

        // Seguridad Social
        actor.attemptsTo(Scroll.to(SEGURIDAD_SOCIAL).andAlignToTop());
        actor.attemptsTo(Click.on(SEGURIDAD_SOCIAL));
        actor.attemptsTo(WaitConstantTwo.esperaConstante());
        actor.attemptsTo(Click.on(SEGURIDAD_SOCIAL)); // Cierra Seguridad Social

        // Autorización Envío Emails
        actor.attemptsTo(Scroll.to(AUTORIZACION_ENVIO_EMAILS).andAlignToTop());
        actor.attemptsTo(Click.on(AUTORIZACION_ENVIO_EMAILS));
        actor.attemptsTo(Ensure.that(VALOR_AUTORIZO_ENVIO_EMAILS).textContentValues().contains(ExpedientesIdentificacionNit.AUTORIZO_ENVIO_EMAILS));
        actor.attemptsTo(WaitConstantTwo.esperaConstante());
        actor.attemptsTo(Click.on(AUTORIZACION_ENVIO_EMAILS)); // Cierra Autorización Envío Emails

        // Ubicación Comercial
        actor.attemptsTo(Scroll.to(UBICACION_COMERCIAL).andAlignToTop());
        actor.attemptsTo(Click.on(UBICACION_COMERCIAL));
        actor.attemptsTo(Ensure.that(VALOR_DIRECCION_COMERCIAL).textContentValues().contains(ExpedientesIdentificacionNit.DIRECCION));
        actor.attemptsTo(Ensure.that(VALOR_BARRIO).textContentValues().contains(ExpedientesIdentificacionNit.BARRIO));
        actor.attemptsTo(Ensure.that(VALOR_MUNICIPIO).textContentValues().contains(ExpedientesIdentificacionNit.MUNICIPIO));
        actor.attemptsTo(Ensure.that(VALOR_PAIS).textContentValues().contains(ExpedientesIdentificacionNit.PAIS));
        actor.attemptsTo(Scroll.to(VALOR_DIRECCION_COMERCIAL).andAlignToTop());
        actor.attemptsTo(Ensure.that(VALOR_CORREO_ELECTRONICO).textContentValues().contains(ExpedientesIdentificacionNit.CORREO_ELECTRONICO));
        actor.attemptsTo(Click.on(UBICACION_COMERCIAL)); // Cierra Ubicación Comercial

        // Notificación Judicial
        actor.attemptsTo(Click.on(NOTIFICACION_JUDICIAL));
        actor.attemptsTo(Ensure.that(VALOR_DIRECCION_NOTIFICACION_PROPONENTE).textContentValues().contains(ExpedientesIdentificacionNit.DIRECCION));
        actor.attemptsTo(Ensure.that(VALOR_BARRIO_NOTIFICACION_PROPONENTE).textContentValues().contains(ExpedientesIdentificacionNit.BARRIO));
        actor.attemptsTo(Ensure.that(VALOR_MUNICIPIO_NOTIFICACION_PROPONENTE).textContentValues().contains(ExpedientesIdentificacionNit.MUNICIPIO));
        actor.attemptsTo(Ensure.that(VALOR_PAIS_NOTIFICACION_PROPONENTE).textContentValues().contains(ExpedientesIdentificacionNit.PAIS));
        actor.attemptsTo(Scroll.to(NOTIFICACION_JUDICIAL).andAlignToTop());
        actor.attemptsTo(Ensure.that(VALOR_CORREO_ELECTRONICO_NOTIFICACION_PROPONENTE).textContentValues().contains(ExpedientesIdentificacionNit.CORREO_ELECTRONICO));
        actor.attemptsTo(Click.on(NOTIFICACION_JUDICIAL)); // Cierra Notificación Judicial

        // Actividad Económica y CIIUS
        actor.attemptsTo(Click.on(ACTIVIDAD_ECONOMICA_Y_CIIUS));
        actor.attemptsTo(Scroll.to(ACTIVIDAD_ECONOMICA_Y_CIIUS).andAlignToTop());
        actor.attemptsTo(Ensure.that(VALOR_NOMBRE_ACTIVIDAD).textContentValues().contains(ExpedientesIdentificacionNit.NOMBRE_ACTIVIDAD));
        actor.attemptsTo(WaitConstantTwo.esperaConstante());
        actor.attemptsTo(Click.on(ACTIVIDAD_ECONOMICA_Y_CIIUS)); // Cierra Actividad Económica y CIIUS

        // Participación
        actor.attemptsTo(Scroll.to(PARTICIPACION).andAlignToTop());
        actor.attemptsTo(Click.on(PARTICIPACION));
        actor.attemptsTo(WaitConstantTwo.esperaConstante());

        // Distribución Capital
        actor.attemptsTo(Scroll.to(DISTRIBUCION_CAPITAL).andAlignToTop());
        actor.attemptsTo(Click.on(DISTRIBUCION_CAPITAL));
        actor.attemptsTo(WaitConstantTwo.esperaConstante());
        actor.attemptsTo(Click.on(DISTRIBUCION_CAPITAL)); // Cierra Distribución Capital
        actor.attemptsTo(Click.on(PARTICIPACION)); // Cierra Participación

        // Información Financiera
        actor.attemptsTo(Click.on(INFORMACION_FINANCIERA));
        actor.attemptsTo(Scroll.to(INFORMACION_FINANCIERA).andAlignToTop());
        actor.attemptsTo(Ensure.that(VALOR_ANIO_DATOS).textContentValues().contains(ExpedientesIdentificacionNit.ANIO_DATOS));
        actor.attemptsTo(Ensure.that(VALOR_FECHA_DATOS).textContentValues().contains(ExpedientesIdentificacionNit.FECHA_DATOS));
        actor.attemptsTo(Ensure.that(VALOR_PERSONAL_OCUPADO).textContentValues().contains(ExpedientesIdentificacionNit.PERSONAL_OCUPADO));
        actor.attemptsTo(Scroll.to(VALOR_ACTIVOS_CORRINETES).andAlignToTop());
        actor.attemptsTo(Ensure.that(VALOR_ACTIVOS_CORRINETES).textContentValues().contains(ExpedientesIdentificacionNit.ACTIVOS_CORRIENTES));
        actor.attemptsTo(WaitConstantTwo.esperaConstante());
        actor.attemptsTo(Click.on(INFORMACION_FINANCIERA)); // Cierra Información Financiera

        // Representación Legal y Otros Vínculos
        actor.attemptsTo(Scroll.to(REPRESENTACION_LEGAL_Y_OTROS_VINCULOS).andAlignToTop());
        actor.attemptsTo(Click.on(REPRESENTACION_LEGAL_Y_OTROS_VINCULOS));
        actor.attemptsTo(Ensure.that(VALOR_R_IDENTIFICACION).textContentValues().contains(ExpedientesIdentificacionNit.R_IDENTIFICACION));
        actor.attemptsTo(Ensure.that(VALOR_R_NOMBRE).textContentValues().contains(ExpedientesIdentificacionNit.R_NOMBRE));
        actor.attemptsTo(Ensure.that(VALOR_R_VEHICULO).textContentValues().contains(ExpedientesIdentificacionNit.R_VEHICULO));
        actor.attemptsTo(Ensure.that(VALOR_R_INCRIPCION).textContentValues().contains(ExpedientesIdentificacionNit.R_INCRIPCION));
        actor.attemptsTo(Click.on(REPRESENTACION_LEGAL_Y_OTROS_VINCULOS)); // Cierra Representación Legal

        // Pagos de Matrícula
        actor.attemptsTo(Scroll.to(PAGOS_DE_MATRICULA).andAlignToTop());
        actor.attemptsTo(Click.on(PAGOS_DE_MATRICULA));
        actor.attemptsTo(JSScrollDown.on(PRIMER_CONTENIDO_MODAL));
        actor.attemptsTo(WaitConstantTwo.esperaConstante());
        actor.attemptsTo(Click.on(PAGOS_DE_MATRICULA)); // Cierra Pagos de Matrícula

        // Inscripción de Documentos
        actor.attemptsTo(Scroll.to(INSCRIPCION_DE_DOCUMENTOS).andAlignToTop());
        actor.attemptsTo(Click.on(INSCRIPCION_DE_DOCUMENTOS));
        actor.attemptsTo(WaitConstantTwo.esperaConstante());
        actor.attemptsTo(Click.on(INSCRIPCION_DE_DOCUMENTOS)); // Cierra Inscripción de Documentos

        // Libros Comercio Inscritos
        actor.attemptsTo(Scroll.to(LIBROS_COMERCIO_INSCRITOS).andAlignToTop());
        actor.attemptsTo(Click.on(LIBROS_COMERCIO_INSCRITOS));
        actor.attemptsTo(WaitConstantTwo.esperaConstante());
        actor.attemptsTo(Click.on(LIBROS_COMERCIO_INSCRITOS)); // Cierra Libros Comercio Inscritos

        // Información ESADL
        actor.attemptsTo(Scroll.to(INFORMACION_ESADL).andAlignToTop());
        actor.attemptsTo(Click.on(INFORMACION_ESADL));
        actor.attemptsTo(WaitConstantTwo.esperaConstante());
        actor.attemptsTo(Click.on(INFORMACION_ESADL)); // Cierra Información ESADL

        // Formularios y Expediente Gráfico
        actor.attemptsTo(Scroll.to(FORMULARIOS_Y_EXPEDIENTE_GRAFICO).andAlignToTop());
        actor.attemptsTo(Click.on(FORMULARIOS_Y_EXPEDIENTE_GRAFICO));

        // --- Bloque 3: Manejo de PDF (Formularios Prediligenciados) ---
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        String originalHandle = driver.getWindowHandle();


        actor.attemptsTo(Scroll.to(FORMULARIOS_PREDILIGENCIADO).andAlignToTop());
        actor.attemptsTo(Click.on(FORMULARIOS_PREDILIGENCIADO));
        actor.attemptsTo(WaitConstant.esperaConstante());
        actor.attemptsTo(WaitConstant.esperaConstante());


        // ----------------------------------------------------
        // FIN: LÓGICA DE PDFS CON TAREAS LIMPIAS
        // ----------------------------------------------------


        // --- Bloque 4: Cierre de secciones y navegación final ---
        actor.attemptsTo(Click.on(FORMULARIOS_Y_EXPEDIENTE_GRAFICO)); // Cierra Formularios y Expediente Gráfico

        // Evidencias SIPREF
        actor.attemptsTo(Scroll.to(EVIDENCIAS_SIPREF).andAlignToTop());
        actor.attemptsTo(JSScrollDown.on(PRIMER_CONTENIDO_MODAL));
        actor.attemptsTo(Click.on(EVIDENCIAS_SIPREF));
        actor.attemptsTo(WaitConstantTwo.esperaConstante());
        actor.attemptsTo(Click.on(EVIDENCIAS_SIPREF)); // Cierra Evidencias SIPREF

        // Notificaciones SIPREF
        actor.attemptsTo(Scroll.to(NOTIFICACIONES_SIPREF).andAlignToTop());
        actor.attemptsTo(JSScrollDown.on(PRIMER_CONTENIDO_MODAL));
        actor.attemptsTo(JSScrollDown.on(PRIMER_CONTENIDO_MODAL));
        actor.attemptsTo(Click.on(NOTIFICACIONES_SIPREF));
        actor.attemptsTo(WaitConstantTwo.esperaConstante());
        actor.attemptsTo(Click.on(NOTIFICACIONES_SIPREF)); // Cierra Notificaciones SIPREF

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

    public static ConsultaExpedientesIdentificacionNit identificacionNit(){
        return Tasks.instrumented(ConsultaExpedientesIdentificacionNit.class);
    }
}