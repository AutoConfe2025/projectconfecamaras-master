package com.co.confecamaras.tasks.ConsultasTransacciones;

import com.co.confecamaras.interactions.*;

import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.tasks.CompararElContenidoDelPDF;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import com.co.confecamaras.utils.consultasytransacciones.Expedientes.ExpedientesNombre;
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

import static com.co.confecamaras.userinterfaces.consultasytransacciones.Expediente.VALOR_MUNICIPIO_NOTIFICACION_PROPONENTE;
import static com.co.confecamaras.utils.consultasytransacciones.ConsultarExpedienteConstants.NOMBRE;

public class ConsultaExpedientesNombre implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {


        // --- Bloque 1: Ingreso de datos de búsqueda por Nombre ---
        actor.attemptsTo(LogEvent.recordevent(Reportes.INFO, " ingrese por nombree AQUI!!!"));
        actor.attemptsTo(Click.on(BTN_NOMBRE));
        actor.attemptsTo(WaitInteractions.untilBeEnable(INPUT_DATO_BUSQUEDA));
        actor.attemptsTo(Enter.theValue(NOMBRE).into(INPUT_DATO_BUSQUEDA));
        actor.attemptsTo(Click.on(BTN_CONSULTAR_EXPEDIENTE));


        // --- Bloque 2: Verificación y navegación de detalles del expediente ---
        actor.attemptsTo(WaitInteractions.untilBeEnable(BTN_NUMERO_MATRICULA_NOMBRE));
        actor.attemptsTo(Click.on(BTN_NUMERO_MATRICULA_NOMBRE));

        // Asersiones de Matrícula y Razón Social
        actor.attemptsTo(Ensure.that(VALOR_MATRICULA_MERCANTIL).textContentValues().contains(ExpedientesNombre.MATRICULA_MERCANTIL));
        actor.attemptsTo(Ensure.that(VALOR_NOMBRE_RAZON_SOCIAL).textContentValues().contains(ExpedientesNombre.NOMBRE_RAZON_SOCIAL));

        // Estado del Expediente
        actor.attemptsTo(Scroll.to(ESTADO_EXPEDIENTE).andAlignToTop());
        actor.attemptsTo(Click.on(ESTADO_EXPEDIENTE));
        actor.attemptsTo(Ensure.that(VALOR_ESTADO_MATRICULA).textContentValues().contains(ExpedientesNombre.ESTADO_MATRICULA));
        actor.attemptsTo(Ensure.that(VALOR_ESTADO_DATOS).textContentValues().contains(ExpedientesNombre.ESTADO_DATOS));
        actor.attemptsTo(Ensure.that(VALOR_FECHA_MATRICULA).textContentValues().contains(ExpedientesNombre.FECHA_MATRICULA));
        actor.attemptsTo(Ensure.that(VALOR_FECHA_ULTIMA_RENOVACION).textContentValues().contains(ExpedientesNombre.FECHA_ULTIMA_RENOVACION));
        actor.attemptsTo(Ensure.that(VALOR_ULTIMO_ANIO_RENOVADO).textContentValues().contains(ExpedientesNombre.ULTIMO_ANIO_RENOVADO));

        // Organización Jurídica y Categoría
        actor.attemptsTo(Scroll.to(VALOR_ORGANIZACION_JURIDICA).andAlignToTop());
        actor.attemptsTo(Ensure.that(VALOR_ORGANIZACION_JURIDICA).textContentValues().contains(ExpedientesNombre.ORGANIZACION_JURIDICA));
        actor.attemptsTo(Ensure.that(VALOR_CATEGORIA).textContentValues().contains(ExpedientesNombre.CATEGORIA));
        actor.attemptsTo(Ensure.that(VALOR_TIPO_LOCAL).textContentValues().contains(ExpedientesNombre.TIPO_LOCAL));
        actor.attemptsTo(Ensure.that(VALOR_ADAPTACION_NUEVO_FORMATO).textContentValues().contains(ExpedientesNombre.ADAPTACION_NUEVO_FORMATO));
        actor.attemptsTo(Click.on(ESTADO_EXPEDIENTE)); // Cierra Estado Expediente

        // Datos Proponente
        actor.attemptsTo(Scroll.to(DATOS_PROPONENTE).andAlignToTop());
        actor.attemptsTo(Click.on(DATOS_PROPONENTE));
        actor.attemptsTo(WaitConstantTwo.esperaConstante());
        actor.attemptsTo(Ensure.that(VALOR_INSCRIPCION_PROPONENTE).textContentValues().contains(ExpedientesNombre.INSCRIPCION_PROPONENTE));
        actor.attemptsTo(Ensure.that(VALOR_ESTADO).textContentValues().contains(ExpedientesNombre.ESTADO));
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
        actor.attemptsTo(Ensure.that(VALOR_AUTORIZO_ENVIO_EMAILS).textContentValues().contains(ExpedientesNombre.AUTORIZO_ENVIO_EMAILS));
        actor.attemptsTo(WaitConstantTwo.esperaConstante());
        actor.attemptsTo(Click.on(AUTORIZACION_ENVIO_EMAILS)); // Cierra Autorización Envío Emails

        // Tamaño Empresarial
        actor.attemptsTo(Scroll.to(TAMANIO_EMPRESARIAL).andAlignToTop());
        actor.attemptsTo(Click.on(TAMANIO_EMPRESARIAL));
        actor.attemptsTo(Ensure.that(VALOR_TAMANIO_EMPRESARIAL).textContentValues().contains(ExpedientesNombre.TAMANIO_EMPRESARIAL));
        actor.attemptsTo(WaitConstantTwo.esperaConstante());
        actor.attemptsTo(Click.on(TAMANIO_EMPRESARIAL)); // Cierra Tamaño Empresarial

        // Ubicación Comercial
        actor.attemptsTo(Scroll.to(UBICACION_COMERCIAL).andAlignToTop());
        actor.attemptsTo(Click.on(UBICACION_COMERCIAL));
        actor.attemptsTo(Ensure.that(VALOR_DIRECCION_COMERCIAL).textContentValues().contains(ExpedientesNombre.DIRECCION));
        actor.attemptsTo(Ensure.that(VALOR_BARRIO).textContentValues().contains(ExpedientesNombre.BARRIO));
        actor.attemptsTo(Ensure.that(VALOR_MUNICIPIO).textContentValues().contains(ExpedientesNombre.MUNICIPIO));
        actor.attemptsTo(Ensure.that(VALOR_PAIS).textContentValues().contains(ExpedientesNombre.PAIS));
        actor.attemptsTo(Ensure.that(VALOR_TELEFONO_01).textContentValues().contains(ExpedientesNombre.TELEFONO_01));
        actor.attemptsTo(Scroll.to(VALOR_DIRECCION_COMERCIAL).andAlignToTop());
        actor.attemptsTo(Ensure.that(VALOR_TELEFONO_02).textContentValues().contains(ExpedientesNombre.TELEFONO_02));
        actor.attemptsTo(Ensure.that(VALOR_TELEFONO_03).textContentValues().contains(ExpedientesNombre.TELEFONO_03));
        actor.attemptsTo(Ensure.that(VALOR_CORREO_ELECTRONICO).textContentValues().contains(ExpedientesNombre.CORREO_ELECTRONICO));
        actor.attemptsTo(Click.on(UBICACION_COMERCIAL)); // Cierra Ubicación Comercial

        // Notificación Judicial
        actor.attemptsTo(Click.on(NOTIFICACION_JUDICIAL));
        actor.attemptsTo(Ensure.that(VALOR_DIRECCION_NOTIFICACION_PROPONENTE).textContentValues().contains(ExpedientesNombre.DIRECCION));
        actor.attemptsTo(Ensure.that(VALOR_BARRIO_NOTIFICACION_PROPONENTE).textContentValues().contains(ExpedientesNombre.BARRIO));
        actor.attemptsTo(Ensure.that(VALOR_MUNICIPIO_NOTIFICACION_PROPONENTE).textContentValues().contains(ExpedientesNombre.MUNICIPIO));
        actor.attemptsTo(Ensure.that(VALOR_PAIS_NOTIFICACION_PROPONENTE).textContentValues().contains(ExpedientesNombre.PAIS));
        actor.attemptsTo(Ensure.that(VALOR_TELEFONO_01_NOTIFICACION_PROPONENTE).textContentValues().contains(ExpedientesNombre.TELEFONO_01));
        actor.attemptsTo(Scroll.to(NOTIFICACION_JUDICIAL).andAlignToTop());
        actor.attemptsTo(Ensure.that(VALOR_TELEFONO_02_NOTIFICACION_PROPONENTE).textContentValues().contains(ExpedientesNombre.TELEFONO_02));
        actor.attemptsTo(Ensure.that(VALOR_TELEFONO_03_NOTIFICACION_PROPONENTE).textContentValues().contains(ExpedientesNombre.TELEFONO_03));
        actor.attemptsTo(Ensure.that(VALOR_CORREO_ELECTRONICO_NOTIFICACION_PROPONENTE).textContentValues().contains(ExpedientesNombre.CORREO_ELECTRONICO));
        actor.attemptsTo(Click.on(NOTIFICACION_JUDICIAL)); // Cierra Notificación Judicial

        // Actividad Económica y CIIUS
        actor.attemptsTo(Click.on(ACTIVIDAD_ECONOMICA_Y_CIIUS));
        actor.attemptsTo(Scroll.to(ACTIVIDAD_ECONOMICA_Y_CIIUS).andAlignToTop());
        actor.attemptsTo(Ensure.that(VALOR_NOMBRE_ACTIVIDAD).textContentValues().contains(ExpedientesNombre.NOMBRE_ACTIVIDAD));
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
        actor.attemptsTo(Ensure.that(VALOR_ANIO_DATOS).textContentValues().contains(ExpedientesNombre.ANIO_DATOS));
        actor.attemptsTo(Ensure.that(VALOR_FECHA_DATOS).textContentValues().contains(ExpedientesNombre.FECHA_DATOS));
        actor.attemptsTo(Ensure.that(VALOR_PERSONAL_OCUPADO).textContentValues().contains(ExpedientesNombre.PERSONAL_OCUPADO));
        actor.attemptsTo(Scroll.to(VALOR_ACTIVOS_CORRINETES).andAlignToTop());
        actor.attemptsTo(Ensure.that(VALOR_ACTIVOS_CORRINETES).textContentValues().contains(ExpedientesNombre.ACTIVOS_CORRIENTES));
        actor.attemptsTo(WaitConstantTwo.esperaConstante());
        actor.attemptsTo(Click.on(INFORMACION_FINANCIERA)); // Cierra Información Financiera

        // Pagos de Afiliación
        actor.attemptsTo(Scroll.to(PAGOS_DE_AFILIACION).andAlignToTop());
        actor.attemptsTo(Click.on(PAGOS_DE_AFILIACION));
        actor.attemptsTo(JSScrollDown.on(PRIMER_CONTENIDO_MODAL));
        actor.attemptsTo(WaitConstantTwo.esperaConstante());
        actor.attemptsTo(Click.on(PAGOS_DE_AFILIACION)); // Cierra Pagos de Afiliación

        // Pagos de Matrícula
        actor.attemptsTo(Scroll.to(PAGOS_DE_MATRICULA).andAlignToTop());
        actor.attemptsTo(Click.on(PAGOS_DE_MATRICULA));
        actor.attemptsTo(JSScrollDown.on(PRIMER_CONTENIDO_MODAL));
        actor.attemptsTo(WaitConstantTwo.esperaConstante());
        actor.attemptsTo(Click.on(PAGOS_DE_MATRICULA)); // Cierra Pagos de Matrícula

        // Cupo del Afiliado
        actor.attemptsTo(Scroll.to(CUPO_DEL_AFILIADO).andAlignToTop());
        actor.attemptsTo(Click.on(CUPO_DEL_AFILIADO));
        actor.attemptsTo(WaitConstantTwo.esperaConstante());
        actor.attemptsTo(Click.on(CUPO_DEL_AFILIADO)); // Cierra Cupo del Afiliado

        // Inscripción de Documentos
        actor.attemptsTo(JSScrollDown.on(PRIMER_CONTENIDO_MODAL));
        actor.attemptsTo(Click.on(INSCRIPCION_DE_DOCUMENTOS));
        actor.attemptsTo(Scroll.to(INSCRIPCION_DE_DOCUMENTOS).andAlignToTop());
        actor.attemptsTo(WaitConstantTwo.esperaConstante());
        actor.attemptsTo(WaitConstantTwo.esperaConstante());
        actor.attemptsTo(Scroll.to(ESTABLECIMIENTOS_JURIDICCION).andAlignToBottom());
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

        // Comparar PDF Formularios Prediligenciados (1)
        actor.attemptsTo(
                CompararElContenidoDelPDF.abiertoEnPestanaConReferenciaLocal(
                        originalHandle,
                        ExpedientesNombre.PDF_ESPERADO_FORMULARIOS_PREDILIGENCIADO_PROPO
                )
        );

        // PDF Última Renovación
        actor.attemptsTo(WaitConstantTwo.esperaConstante());
        actor.attemptsTo(Click.on(FORM_ULTIMA_RENOVACION));
        actor.attemptsTo(WaitConstant.esperaConstante());

        // Comparar PDF Última Renovación (2)
        actor.attemptsTo(
                CompararElContenidoDelPDF.abiertoEnPestanaConReferenciaLocal(
                        originalHandle,
                        ExpedientesNombre.PDF_ESPERADO_FORMULARIOS_PREDILIGENCIADO_PROPO2
                )
        );


        // --- Bloque 4: Cierre de secciones y navegación final ---
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

    public static ConsultaExpedientesNombre nombre(){
        return Tasks.instrumented(ConsultaExpedientesNombre.class);
    }
}