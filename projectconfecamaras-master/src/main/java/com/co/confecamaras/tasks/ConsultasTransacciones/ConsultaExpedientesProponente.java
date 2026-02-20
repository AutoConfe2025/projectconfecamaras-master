package com.co.confecamaras.tasks.ConsultasTransacciones;

import com.co.confecamaras.interactions.JSScrollDown;
import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.interactions.WaitConstant;
import com.co.confecamaras.interactions.WaitConstantTwo;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.tasks.CompararElContenidoDelPDF;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import com.co.confecamaras.utils.consultasytransacciones.ConsultarExpedienteConstants;
import com.co.confecamaras.utils.consultasytransacciones.Expedientes.ExpedientesProponente;
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
import static com.co.confecamaras.utils.consultasytransacciones.ConsultarExpedienteConstants.PROPONENTE;

public class ConsultaExpedientesProponente implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {


        // --- Bloque 1: Ingreso de datos de búsqueda por Proponente ---
        actor.attemptsTo(LogEvent.recordevent(Reportes.INFO, " ingrese por Proponente AQUI!!!"));
        actor.attemptsTo(Click.on(BTN_PROPONENTE));
        actor.attemptsTo(WaitInteractions.untilBeEnable(INPUT_DATO_BUSQUEDA));
        actor.attemptsTo(Enter.theValue(PROPONENTE).into(INPUT_DATO_BUSQUEDA));
        actor.attemptsTo(Click.on(BTN_CONSULTAR_EXPEDIENTE));


        // --- Bloque 2: Verificación y navegación de detalles del expediente ---
        actor.attemptsTo(WaitInteractions.untilBeEnable(BTN_NUMERO_MATRICULA_PROPONENTE));
        actor.attemptsTo(Click.on(BTN_NUMERO_MATRICULA_PROPONENTE));

        // Asersiones de Matrícula y Razón Social
        actor.attemptsTo(Ensure.that(VALOR_MATRICULA_MERCANTIL).textContentValues().contains(ConsultarExpedienteConstants.MATRICULA_EXP_PROPONENTE));
        actor.attemptsTo(Ensure.that(VALOR_NOMBRE_RAZON_SOCIAL).textContentValues().contains(ExpedientesProponente.NOMBRE_RAZON_SOCIAL_PROPONENTE));

        // Estado del Expediente
        actor.attemptsTo(Scroll.to(ESTADO_EXPEDIENTE).andAlignToTop());
        actor.attemptsTo(Click.on(ESTADO_EXPEDIENTE));
        actor.attemptsTo(Ensure.that(VALOR_ESTADO_MATRICULA).textContentValues().contains(ExpedientesProponente.ESTADO_MATRICULA));
        actor.attemptsTo(Ensure.that(VALOR_ESTADO_DATOS).textContentValues().contains(ExpedientesProponente.ESTADO_DATOS));
        actor.attemptsTo(Ensure.that(VALOR_FECHA_MATRICULA).textContentValues().contains(ExpedientesProponente.FECHA_MATRICULA));
        actor.attemptsTo(Ensure.that(VALOR_FECHA_ULTIMA_RENOVACION).textContentValues().contains(ExpedientesProponente.FECHA_ULTIMA_RENOVACION));
        actor.attemptsTo(Ensure.that(VALOR_ULTIMO_ANIO_RENOVADO).textContentValues().contains(ExpedientesProponente.ULTIMO_ANIO_RENOVADO));

        // Organización Jurídica
        actor.attemptsTo(Scroll.to(VALOR_ORGANIZACION_JURIDICA).andAlignToTop());
        actor.attemptsTo(Ensure.that(VALOR_ORGANIZACION_JURIDICA).textContentValues().contains(ExpedientesProponente.ORGANIZACION_JURIDICA));
        actor.attemptsTo(Ensure.that(VALOR_CATEGORIA).textContentValues().contains(ExpedientesProponente.CATEGORIA));
        actor.attemptsTo(Ensure.that(VALOR_TIPO_LOCAL_PROPONENTE).textContentValues().contains(ExpedientesProponente.FECHA_MATRICULA));
        actor.attemptsTo(Click.on(ESTADO_EXPEDIENTE)); // Cierra Estado Expediente

        // Datos de Construcción
        actor.attemptsTo(Scroll.to(DATOS_CONSTRUCCION).andAlignToTop());
        actor.attemptsTo(Click.on(DATOS_CONSTRUCCION));
        actor.attemptsTo(WaitConstantTwo.esperaConstante());
        actor.attemptsTo(Click.on(DATOS_CONSTRUCCION)); // Cierra Datos de Construcción

        // Datos Proponente
        actor.attemptsTo(Scroll.to(DATOS_PROPONENTE).andAlignToTop());
        actor.attemptsTo(Click.on(DATOS_PROPONENTE));
        actor.attemptsTo(WaitConstantTwo.esperaConstante());
        actor.attemptsTo(Ensure.that(VALOR_INSCRIPCION_PROPONENTE).textContentValues().contains(ExpedientesProponente.INSCRIPCION_PROPONENTE));
        actor.attemptsTo(Ensure.that(VALOR_ESTADO).textContentValues().contains(ExpedientesProponente.ESTADO));
        actor.attemptsTo(Click.on(DATOS_PROPONENTE)); // Cierra Datos Proponente

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
        actor.attemptsTo(Ensure.that(VALOR_AUTORIZO_ENVIO_EMAILS).textContentValues().contains(ExpedientesProponente.AUTORIZO_ENVIO_EMAILS));
        actor.attemptsTo(WaitConstantTwo.esperaConstante());
        actor.attemptsTo(Click.on(AUTORIZACION_ENVIO_EMAILS)); // Cierra Autorización Envío Emails

        // Tamaño Empresarial
        actor.attemptsTo(Scroll.to(TAMANIO_EMPRESARIAL).andAlignToTop());
        actor.attemptsTo(Click.on(TAMANIO_EMPRESARIAL));
        actor.attemptsTo(Scroll.to(VALOR_TAMANIO_EMPRESARIAL).andAlignToTop());
        actor.attemptsTo(Ensure.that(VALOR_TAMANIO_EMPRESARIAL).textContentValues().contains(ExpedientesProponente.TAMANIO_EMPRESARIAL));
        actor.attemptsTo(WaitConstantTwo.esperaConstante());
        actor.attemptsTo(Click.on(TAMANIO_EMPRESARIAL)); // Cierra Tamaño Empresarial

        // Ubicación Comercial
        actor.attemptsTo(Scroll.to(UBICACION_COMERCIAL).andAlignToTop());
        actor.attemptsTo(Click.on(UBICACION_COMERCIAL));
        actor.attemptsTo(Ensure.that(VALOR_DIRECCION_COMERCIAL).textContentValues().contains(ExpedientesProponente.DIRECCION));
        actor.attemptsTo(Ensure.that(VALOR_BARRIO).textContentValues().contains(ExpedientesProponente.BARRIO));
        actor.attemptsTo(Ensure.that(VALOR_MUNICIPIO).textContentValues().contains(ExpedientesProponente.MUNICIPIO2));
        actor.attemptsTo(Ensure.that(VALOR_PAIS).textContentValues().contains(ExpedientesProponente.PAIS));
        actor.attemptsTo(Ensure.that(VALOR_TELEFONO_01).textContentValues().contains(ExpedientesProponente.TELEFONO_01));
        actor.attemptsTo(Scroll.to(VALOR_DIRECCION_COMERCIAL).andAlignToTop());
        actor.attemptsTo(Ensure.that(VALOR_TELEFONO_02).textContentValues().contains(ExpedientesProponente.TELEFONO_02));
        actor.attemptsTo(Ensure.that(VALOR_TELEFONO_03).textContentValues().contains(ExpedientesProponente.TELEFONO_03));
        actor.attemptsTo(Ensure.that(VALOR_CORREO_ELECTRONICO).textContentValues().contains(ExpedientesProponente.CORREO_ELECTRONICO));
        actor.attemptsTo(Click.on(UBICACION_COMERCIAL)); // Cierra Ubicación Comercial

        // Notificación Judicial
        actor.attemptsTo(Click.on(NOTIFICACION_JUDICIAL));
        actor.attemptsTo(Ensure.that(VALOR_DIRECCION_NOTIFICACION_PROPONENTE).textContentValues().contains(ExpedientesProponente.DIRECCION));
        actor.attemptsTo(Ensure.that(VALOR_BARRIO_NOTIFICACION_PROPONENTE).textContentValues().contains(ExpedientesProponente.BARRIO));
        actor.attemptsTo(Ensure.that(VALOR_MUNICIPIO_NOTIFICACION_PROPONENTE).textContentValues().contains(ExpedientesProponente.MUNICIPIO2));
        actor.attemptsTo(Ensure.that(VALOR_PAIS_NOTIFICACION_PROPONENTE).textContentValues().contains(ExpedientesProponente.PAIS));
        actor.attemptsTo(Ensure.that(VALOR_TELEFONO_01_NOTIFICACION_PROPONENTE).textContentValues().contains(ExpedientesProponente.TELEFONO_01));
        actor.attemptsTo(Scroll.to(NOTIFICACION_JUDICIAL).andAlignToTop());
        actor.attemptsTo(Ensure.that(VALOR_TELEFONO_02_NOTIFICACION_PROPONENTE).textContentValues().contains(ExpedientesProponente.TELEFONO_02));
        actor.attemptsTo(Ensure.that(VALOR_TELEFONO_03_NOTIFICACION_PROPONENTE).textContentValues().contains(ExpedientesProponente.TELEFONO_03));
        actor.attemptsTo(Ensure.that(VALOR_CORREO_ELECTRONICO_NOTIFICACION_PROPONENTE).textContentValues().contains(ExpedientesProponente.CORREO_ELECTRONICO));
        actor.attemptsTo(Click.on(NOTIFICACION_JUDICIAL)); // Cierra Notificación Judicial

        // Actividad Económica y CIIUS
        actor.attemptsTo(Scroll.to(ACTIVIDAD_ECONOMICA_Y_CIIUS).andAlignToTop());
        actor.attemptsTo(Click.on(ACTIVIDAD_ECONOMICA_Y_CIIUS));
        actor.attemptsTo(Ensure.that(VALOR_NOMBRE_ACTIVIDAD).textContentValues().contains(ExpedientesProponente.NOMBRE_ACTIVIDAD));
        actor.attemptsTo(WaitConstantTwo.esperaConstante());
        actor.attemptsTo(Click.on(ACTIVIDAD_ECONOMICA_Y_CIIUS)); // Cierra Actividad Económica y CIIUS

        // Participación
        actor.attemptsTo(Click.on(PARTICIPACION));
        actor.attemptsTo(WaitConstantTwo.esperaConstante());
        actor.attemptsTo(JSScrollDown.on(PRIMER_CONTENIDO_MODAL));
        actor.attemptsTo(Scroll.to(PARTICIPACION).andAlignToTop());
        actor.attemptsTo(Click.on(PARTICIPACION)); // Cierra Participación

        // Distribución Capital
        actor.attemptsTo(Scroll.to(DISTRIBUCION_CAPITAL).andAlignToTop());
        actor.attemptsTo(Click.on(DISTRIBUCION_CAPITAL));
        actor.attemptsTo(WaitConstantTwo.esperaConstante());
        actor.attemptsTo(Scroll.to(VALOR_CAPITAL_AUTORIZADO).andAlignToTop());
        actor.attemptsTo(Ensure.that(VALOR_CAPITAL_AUTORIZADO).textContentValues().contains(ExpedientesProponente.CAPITAL_AUTORIZADO));
        actor.attemptsTo(WaitConstantTwo.esperaConstante());
        actor.attemptsTo(Click.on(DISTRIBUCION_CAPITAL)); // Cierra Distribución Capital

        // Referencias Comerciales
        actor.attemptsTo(Scroll.to(REFERENCIAS_COMERCIALES).andAlignToTop());
        actor.attemptsTo(Click.on(REFERENCIAS_COMERCIALES));
        actor.attemptsTo(WaitConstantTwo.esperaConstante());
        actor.attemptsTo(Click.on(REFERENCIAS_COMERCIALES)); // Cierra Referencias Comerciales

        // Información Financiera
        actor.attemptsTo(Click.on(INFORMACION_FINANCIERA));
        actor.attemptsTo(Scroll.to(INFORMACION_FINANCIERA).andAlignToTop());
        actor.attemptsTo(Ensure.that(VALOR_ANIO_DATOS).textContentValues().contains(ExpedientesProponente.ANIO_DATOS));
        actor.attemptsTo(Ensure.that(VALOR_FECHA_DATOS).textContentValues().contains(ExpedientesProponente.FECHA_DATOS));
        actor.attemptsTo(Ensure.that(VALOR_PERSONAL_OCUPADO).textContentValues().contains(ExpedientesProponente.PERSONAL_OCUPADO));
        actor.attemptsTo(Scroll.to(VALOR_ACTIVOS_CORRINETES).andAlignToTop());
        actor.attemptsTo(Ensure.that(VALOR_ACTIVOS_CORRINETES).textContentValues().contains(ExpedientesProponente.ACTIVOS_CORRIENTES));
        actor.attemptsTo(WaitConstantTwo.esperaConstante());
        actor.attemptsTo(Click.on(INFORMACION_FINANCIERA)); // Cierra Información Financiera

        // Representación Legal y Otros Vínculos
        actor.attemptsTo(Scroll.to(REPRESENTACION_LEGAL_Y_OTROS_VINCULOS).andAlignToTop());
        actor.attemptsTo(Click.on(REPRESENTACION_LEGAL_Y_OTROS_VINCULOS));
        actor.attemptsTo(WaitConstantTwo.esperaConstante());
        // Las asersiones VALOR_R_IDENTIFICACION, etc., están comentadas en el código original, las dejo así.
        actor.attemptsTo(Click.on(REPRESENTACION_LEGAL_Y_OTROS_VINCULOS)); // Cierra Representación Legal

        // Pagos de Afiliación
        actor.attemptsTo(Scroll.to(PAGOS_DE_AFILIACION).andAlignToTop());
        actor.attemptsTo(Click.on(PAGOS_DE_AFILIACION));
        actor.attemptsTo(WaitConstantTwo.esperaConstante());
        actor.attemptsTo(Click.on(PAGOS_DE_AFILIACION)); // Cierra Pagos de Afiliación

        // Pagos de Matrícula
        actor.attemptsTo(Scroll.to(PAGOS_DE_MATRICULA).andAlignToTop());
        actor.attemptsTo(Click.on(PAGOS_DE_MATRICULA));
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

        // Establecimientos Jurisdicción
        actor.attemptsTo(Click.on(ESTABLECIMIENTOS_JURIDICCION));
        actor.attemptsTo(Scroll.to(ESTABLECIMIENTOS_JURIDICCION).andAlignToTop());
        actor.attemptsTo(WaitConstantTwo.esperaConstante());
        actor.attemptsTo(Click.on(ESTABLECIMIENTOS_JURIDICCION)); // Cierra Establecimientos Jurisdicción

        // Formularios y Expediente Gráfico (Abre)
        actor.attemptsTo(Scroll.to(FORMULARIOS_Y_EXPEDIENTE_GRAFICO).andAlignToTop());
        actor.attemptsTo(Click.on(FORMULARIOS_Y_EXPEDIENTE_GRAFICO));

        // --- Bloque 3: Manejo de PDF ---
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        String originalHandle = driver.getWindowHandle();


        actor.attemptsTo(Scroll.to(FORMULARIOS_PREDILIGENCIADO).andAlignToTop());
        actor.attemptsTo(Click.on(FORMULARIOS_PREDILIGENCIADO));
        actor.attemptsTo(WaitConstant.esperaConstante());
        actor.attemptsTo(WaitConstant.esperaConstante());



        // PDF Última Renovación
        actor.attemptsTo(WaitConstantTwo.esperaConstante());
        actor.attemptsTo(Click.on(FORM_ULTIMA_RENOVACION));
        actor.attemptsTo(WaitConstant.esperaConstante());


        // ----------------------------------------------------
        // FIN: LÓGICA DE PDFS CON TAREAS LIMPIAS
        // ----------------------------------------------------


        // --- Bloque 4: Navegación y cierre final ---
        actor.attemptsTo(Click.on(FORMULARIOS_Y_EXPEDIENTE_GRAFICO)); // Cierra Formularios y Expediente Gráfico

        // Notificaciones SIPREF
        actor.attemptsTo(Scroll.to(NOTIFICACIONES_SIPREF).andAlignToTop());
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

    public static ConsultaExpedientesProponente proponente(){
        return Tasks.instrumented(ConsultaExpedientesProponente.class);
    }
}