package com.co.confecamaras.tasks.ConsultasTransacciones;

import com.co.confecamaras.interactions.*;
import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.tasks.CompararElContenidoDelPDF;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import com.co.confecamaras.utils.consultasytransacciones.Expedientes.ExpedientesMatricula;
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
import static com.co.confecamaras.utils.consultasytransacciones.ConsultarExpedienteConstants.*;

public class ConsultaExpedientesMatricula implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {


        // --- Bloque 1: Ingreso de datos de búsqueda y consulta ---
        actor.attemptsTo(LogEvent.recordevent(Reportes.INFO, " ingrese a por mATRICULAA AQUI!!!"));
        actor.attemptsTo(Click.on(BTN_MATRICULA));
        actor.attemptsTo(WaitInteractions.untilBeEnable(INPUT_DATO_BUSQUEDA));
        actor.attemptsTo(Enter.theValue(MATRICULA_EXP1).into(INPUT_DATO_BUSQUEDA));
        actor.attemptsTo(Click.on(BTN_CONSULTAR_EXPEDIENTE));


        // --- Bloque 2: Verificación y navegación de detalles del expediente ---
        actor.attemptsTo(WaitInteractions.untilBeEnable(BTN_NUMERO_MATRICULA));
        actor.attemptsTo(Click.on(BTN_NUMERO_MATRICULA));

        // Asersiones de Matrícula y Razón Social
        actor.attemptsTo(Ensure.that(VALOR_MATRICULA_MERCANTIL).textContentValues().contains(ExpedientesMatricula.MATRICULA_MERCANTIL));
        actor.attemptsTo(Ensure.that(VALOR_NOMBRE_RAZON_SOCIAL).textContentValues().contains(ExpedientesMatricula.NOMBRE_RAZON_SOCIAL));

        // Estado del Expediente
        actor.attemptsTo(Scroll.to(ESTADO_EXPEDIENTE).andAlignToTop());
        actor.attemptsTo(Click.on(ESTADO_EXPEDIENTE));
        actor.attemptsTo(Ensure.that(VALOR_ESTADO_MATRICULA).textContentValues().contains(ExpedientesMatricula.ESTADO_MATRICULA));
        actor.attemptsTo(Ensure.that(VALOR_ESTADO_DATOS).textContentValues().contains(ExpedientesMatricula.ESTADO_DATOS));
        actor.attemptsTo(Ensure.that(VALOR_FECHA_MATRICULA).textContentValues().contains(ExpedientesMatricula.FECHA_MATRICULA));
        actor.attemptsTo(Ensure.that(VALOR_FECHA_ULTIMA_RENOVACION).textContentValues().contains(ExpedientesMatricula.FECHA_ULTIMA_RENOVACION));
        actor.attemptsTo(Ensure.that(VALOR_ULTIMO_ANIO_RENOVADO).textContentValues().contains(ExpedientesMatricula.ULTIMO_ANIO_RENOVADO));

        // Organización Jurídica y Categoría
        actor.attemptsTo(Scroll.to(VALOR_ORGANIZACION_JURIDICA).andAlignToTop());
        actor.attemptsTo(Ensure.that(VALOR_ORGANIZACION_JURIDICA).textContentValues().contains(ExpedientesMatricula.ORGANIZACION_JURIDICA));
        actor.attemptsTo(Ensure.that(VALOR_CATEGORIA).textContentValues().contains(ExpedientesMatricula.CATEGORIA));
        actor.attemptsTo(Ensure.that(VALOR_TIPO_LOCAL).textContentValues().contains(ExpedientesMatricula.TIPO_LOCAL));
        actor.attemptsTo(Ensure.that(VALOR_ADAPTACION_NUEVO_FORMATO).textContentValues().contains(ExpedientesMatricula.ADAPTACION_NUEVO_FORMATO));
        actor.attemptsTo(Click.on(ESTADO_EXPEDIENTE)); // Cierra Estado Expediente

        // Seguridad Social
        actor.attemptsTo(Scroll.to(SEGURIDAD_SOCIAL).andAlignToTop());
        actor.attemptsTo(Click.on(SEGURIDAD_SOCIAL));
        actor.attemptsTo(WaitConstantTwo.esperaConstante());
        actor.attemptsTo(Click.on(SEGURIDAD_SOCIAL)); // Cierra Seguridad Social

        // Autorización Envío Emails
        actor.attemptsTo(Scroll.to(AUTORIZACION_ENVIO_EMAILS).andAlignToTop());
        actor.attemptsTo(Click.on(AUTORIZACION_ENVIO_EMAILS));
        actor.attemptsTo(Ensure.that(VALOR_AUTORIZO_ENVIO_EMAILS).textContentValues().contains(ExpedientesMatricula.AUTORIZO_ENVIO_EMAILS));
        actor.attemptsTo(WaitConstantTwo.esperaConstante());
        actor.attemptsTo(Click.on(AUTORIZACION_ENVIO_EMAILS)); // Cierra Autorización Envío Emails

        // Ubicación Comercial
        actor.attemptsTo(Scroll.to(UBICACION_COMERCIAL).andAlignToTop());
        actor.attemptsTo(Click.on(UBICACION_COMERCIAL));
        actor.attemptsTo(Ensure.that(VALOR_DIRECCION_COMERCIAL).textContentValues().contains(ExpedientesMatricula.DIRECCION));
        actor.attemptsTo(Ensure.that(VALOR_BARRIO).textContentValues().contains(ExpedientesMatricula.BARRIO));
        actor.attemptsTo(Ensure.that(VALOR_MUNICIPIO).textContentValues().contains(ExpedientesMatricula.MUNICIPIO));
        actor.attemptsTo(Ensure.that(VALOR_PAIS).textContentValues().contains(ExpedientesMatricula.PAIS));
        actor.attemptsTo(Ensure.that(VALOR_TELEFONO_01).textContentValues().contains(ExpedientesMatricula.TELEFONO_01));
        actor.attemptsTo(Scroll.to(VALOR_DIRECCION_COMERCIAL).andAlignToTop());
        actor.attemptsTo(Ensure.that(VALOR_TELEFONO_02).textContentValues().contains(ExpedientesMatricula.TELEFONO_02));
        actor.attemptsTo(Ensure.that(VALOR_TELEFONO_03).textContentValues().contains(ExpedientesMatricula.TELEFONO_03));
        actor.attemptsTo(Ensure.that(VALOR_CORREO_ELECTRONICO).textContentValues().contains(ExpedientesMatricula.CORREO_ELECTRONICO));
        actor.attemptsTo(Ensure.that(VALOR_ZONA).textContentValues().contains(ExpedientesMatricula.ZONA));
        actor.attemptsTo(Click.on(UBICACION_COMERCIAL)); // Cierra Ubicación Comercial

        // Notificación Judicial
        actor.attemptsTo(Click.on(NOTIFICACION_JUDICIAL));
        actor.attemptsTo(Ensure.that(VALOR_DIRECCION_NOTIFICACION).textContentValues().contains(ExpedientesMatricula.DIRECCION));
        actor.attemptsTo(Ensure.that(VALOR_MUNICIPIO_NOTIFICACION).textContentValues().contains(ExpedientesMatricula.MUNICIPIO));
        actor.attemptsTo(Ensure.that(VALOR_PAIS_NOTIFICACION).textContentValues().contains(ExpedientesMatricula.PAIS));
        actor.attemptsTo(Ensure.that(VALOR_TELEFONO_01_NOTIFICACION).textContentValues().contains(ExpedientesMatricula.TELEFONO_01));
        actor.attemptsTo(Scroll.to(NOTIFICACION_JUDICIAL).andAlignToTop());
        actor.attemptsTo(Ensure.that(VALOR_TELEFONO_02_NOTIFICACION).textContentValues().contains(ExpedientesMatricula.TELEFONO_02));
        actor.attemptsTo(Ensure.that(VALOR_TELEFONO_03_NOTIFICACION).textContentValues().contains(ExpedientesMatricula.TELEFONO_03));
        actor.attemptsTo(Ensure.that(VALOR_CORREO_ELECTRONICO_NOTIFICACION).textContentValues().contains(ExpedientesMatricula.CORREO_ELECTRONICO));
        actor.attemptsTo(Ensure.that(VALOR_ZONA_NOTIFICACION).textContentValues().contains(ExpedientesMatricula.ZONA));
        actor.attemptsTo(Click.on(NOTIFICACION_JUDICIAL)); // Cierra Notificación Judicial

        // Sitio de Operación
        actor.attemptsTo(Click.on(SITIO_DE_OPERACION));
        actor.attemptsTo(Ensure.that(VALOR_EMPRESA_UBICACION).textContentValues().contains(ExpedientesMatricula.EMPRESA_UBICACION));
        actor.attemptsTo(WaitConstantTwo.esperaConstante());
        actor.attemptsTo(Click.on(SITIO_DE_OPERACION)); // Cierra Sitio de Operación

        // Actividad Económica y CIIUS
        actor.attemptsTo(Click.on(ACTIVIDAD_ECONOMICA_Y_CIIUS));
        actor.attemptsTo(Scroll.to(ACTIVIDAD_ECONOMICA_Y_CIIUS).andAlignToTop());
        actor.attemptsTo(Ensure.that(VALOR_NOMBRE_ACTIVIDAD).textContentValues().contains(ExpedientesMatricula.NOMBRE_ACTIVIDAD));
        actor.attemptsTo(WaitConstantTwo.esperaConstante());
        actor.attemptsTo(Click.on(ACTIVIDAD_ECONOMICA_Y_CIIUS)); // Cierra Actividad Económica y CIIUS

        // Participación
        actor.attemptsTo(Click.on(PARTICIPACION));
        actor.attemptsTo(WaitConstantTwo.esperaConstante());
        actor.attemptsTo(JSScrollDown.on(PRIMER_CONTENIDO_MODAL));
        actor.attemptsTo(Scroll.to(PARTICIPACION).andAlignToTop());
        actor.attemptsTo(Click.on(PARTICIPACION)); // Cierra Participación

        // Información Financiera
        actor.attemptsTo(Click.on(INFORMACION_FINANCIERA));
        actor.attemptsTo(Scroll.to(INFORMACION_FINANCIERA).andAlignToTop());
        actor.attemptsTo(Ensure.that(VALOR_ANIO_DATOS).textContentValues().contains(ExpedientesMatricula.ANIO_DATOS));
        actor.attemptsTo(Ensure.that(VALOR_FECHA_DATOS).textContentValues().contains(ExpedientesMatricula.FECHA_DATOS));
        actor.attemptsTo(Ensure.that(VALOR_PERSONAL_OCUPADO).textContentValues().contains(ExpedientesMatricula.PERSONAL_OCUPADO));
        actor.attemptsTo(Ensure.that(VALOR_COMERCIAL).textContentValues().contains(ExpedientesMatricula.VALOR_COMERCIAL));
        actor.attemptsTo(WaitConstantTwo.esperaConstante());
        actor.attemptsTo(Click.on(INFORMACION_FINANCIERA)); // Cierra Información Financiera

        // Representación Legal y Otros Vínculos
        actor.attemptsTo(Scroll.to(REPRESENTACION_LEGAL_Y_OTROS_VINCULOS).andAlignToTop());
        actor.attemptsTo(Click.on(REPRESENTACION_LEGAL_Y_OTROS_VINCULOS));
        actor.attemptsTo(Ensure.that(VALOR_R_IDENTIFICACION).textContentValues().contains(ExpedientesMatricula.R_IDENTIFICACION));
        actor.attemptsTo(Ensure.that(VALOR_R_NOMBRE).textContentValues().contains(ExpedientesMatricula.R_NOMBRE));
        actor.attemptsTo(Ensure.that(VALOR_R_VEHICULO).textContentValues().contains(ExpedientesMatricula.R_VEHICULO));
        actor.attemptsTo(Ensure.that(VALOR_R_INCRIPCION).textContentValues().contains(ExpedientesMatricula.R_INCRIPCION));
        actor.attemptsTo(Click.on(REPRESENTACION_LEGAL_Y_OTROS_VINCULOS)); // Cierra Representación Legal

        // Inscripción de Documentos
        actor.attemptsTo(JSScrollDown.on(PRIMER_CONTENIDO_MODAL));
        actor.attemptsTo(Click.on(INSCRIPCION_DE_DOCUMENTOS));
        actor.attemptsTo(Scroll.to(INSCRIPCION_DE_DOCUMENTOS).andAlignToTop());
        actor.attemptsTo(WaitConstantTwo.esperaConstante());
        actor.attemptsTo(WaitConstantTwo.esperaConstante());
        actor.attemptsTo(Scroll.to(RESENA_CASA_PRINCIPAL).andAlignToBottom());
        actor.attemptsTo(WaitConstantTwo.esperaConstante());
        actor.attemptsTo(Click.on(INSCRIPCION_DE_DOCUMENTOS)); // Cierra Inscripción de Documentos

        // Reseña Casa Principal
        actor.attemptsTo(Click.on(RESENA_CASA_PRINCIPAL));
        actor.attemptsTo(Scroll.to(RESENA_CASA_PRINCIPAL).andAlignToTop());
        actor.attemptsTo(Ensure.that(VALOR_C_IDENTIFICACION).textContentValues().contains(ExpedientesMatricula.C_IDENTIFICACION));
        actor.attemptsTo(Ensure.that(VALOR_C_MATRICULA).textContentValues().contains(ExpedientesMatricula.C_MATRICULA));
        actor.attemptsTo(Ensure.that(VALOR_C_NOMBRE).textContentValues().contains(ExpedientesMatricula.C_NOMBRE));
        actor.attemptsTo(WaitConstantTwo.esperaConstante());
        actor.attemptsTo(Click.on(RESENA_CASA_PRINCIPAL)); // Cierra Reseña Casa Principal

        // Formularios y Expediente Gráfico
        actor.attemptsTo(Scroll.to(FORMULARIOS_Y_EXPEDIENTE_GRAFICO).andAlignToTop());
        actor.attemptsTo(Click.on(FORMULARIOS_Y_EXPEDIENTE_GRAFICO));

        // --- Bloque 3: Manejo de PDF (Formularios Prediligenciados) ---
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        String originalHandle = driver.getWindowHandle();


        actor.attemptsTo(Scroll.to(FORMULARIOS_PREDILIGENCIADO).andAlignToTop());
        actor.attemptsTo(Click.on(FORMULARIOS_PREDILIGENCIADO));
        actor.attemptsTo(WaitConstant.esperaConstante());

        // Comparar PDF Formularios Prediligenciados
        actor.attemptsTo(
                CompararElContenidoDelPDF.abiertoEnPestanaConReferenciaLocal(
                        originalHandle,
                        ExpedientesMatricula.PDF_ESPERADO_FORMULARIOS_PREDILIGENCIADO
                )
        );

        // PDF Consulta Renovado
        actor.attemptsTo(WaitConstantTwo.esperaConstante());
        actor.attemptsTo(Click.on(CONSULTA_RENOVADO));
        actor.attemptsTo(WaitConstant.esperaConstante());

        // Comparar PDF Última Renovación
        actor.attemptsTo(
                CompararElContenidoDelPDF.abiertoEnPestanaConReferenciaLocal(
                        originalHandle,
                        ExpedientesMatricula.PDF_ESPERADO_ULTIMA_RENOVACION
                )
        );

        // --- Bloque 4: Cierre de secciones y navegación final ---
        actor.attemptsTo(Click.on(FORMULARIOS_Y_EXPEDIENTE_GRAFICO)); // Cierra Formularios y Expediente Gráfico

        // Operaciones del Registro Mercantil ESADL
        actor.attemptsTo(Scroll.to(OPERACIONES_DEL_REGISTRO_MERCANTIL_ESADL).andAlignToBottom());
        actor.attemptsTo(JSScrollDown.on(PRIMER_CONTENIDO_MODAL));
        actor.attemptsTo(JSScrollDown.on(PRIMER_CONTENIDO_MODAL));
        actor.attemptsTo(JSScrollDown.on(PRIMER_CONTENIDO_MODAL));

        actor.attemptsTo(Click.on(OPERACIONES_DEL_REGISTRO_MERCANTIL_ESADL));
        actor.attemptsTo(JSScrollDown.on(PRIMER_CONTENIDO_MODAL));
        actor.attemptsTo(JSScrollDown.on(PRIMER_CONTENIDO_MODAL));

        actor.attemptsTo(WaitConstantTwo.esperaConstante());
    }

    public static ConsultaExpedientesMatricula matricula(){
        return Tasks.instrumented(ConsultaExpedientesMatricula.class);
    }
}