package com.co.confecamaras.userinterfaces.consultasytransacciones;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static com.co.confecamaras.utils.consultasytransacciones.ConsultarExpedienteConstants.*;

public class Expediente {


    public static Target BTN_MATRICULA = Target.the("boton para ingresar por Matricula")
            .located(By.xpath("//span[contains(@class, 'p-button-label') and text()='Matrícula']"));

    public static Target BTN_NOMBRE = Target.the("boton para ingresar por nombre")
            .located(By.xpath("//span[contains(@class, 'p-button-label') and text()='Nombre']"));
    public static Target BTN_PROPONENTE = Target.the("boton para ingresar por Proponente")
            .located(By.xpath("//span[contains(@class, 'p-button-label') and text()='Proponente']"));
    public static Target BTN_PALABRAS = Target.the("boton para ingresar por Palabras")
            .located(By.xpath("//span[contains(@class, 'p-button-label') and text()='Palabras']"));

    public static Target INPUT_DATO_BUSQUEDA= Target.the("input para ingresar nombre")
            .located(By.id("criterio"));


    public static Target BTN_CONSULTAR_EXPEDIENTE= Target.the("input para consultar")
            .located(By.xpath("//button[contains(@class, 'newConsultar') and contains(., 'Consultar')]"));

    public static final Target BTN_NUMERO_MATRICULA = Target.the("botón de matrícula")
            .located(By.id("btn-matricula-" + MATRICULA_EXP1));
    public static final Target BTN_NUMERO_MATRICULA_NOMBRE = Target.the("botón de matrícula")
            .located(By.id("btn-matricula-" + MATRICULA_EXP2));
    public static final Target BTN_NUMERO_MATRICULA_PALABRA = Target.the("botón de matrícula")
            .located(By.id("btn-matricula-" + MATRICULA_EXP_PALABRA));
    public static final Target BTN_NUMERO_MATRICULA_PROPONENTE = Target.the("botón de matrícula")
            .located(By.id("btn-matricula-" + MATRICULA_EXP_PROPONENTE));
    public static final Target BTN_NUMERO_MATRICULA_IDENTIFICACION = Target.the("botón de matrícula")
            .located(By.id("btn-matricula-" + MATRICULA_EXP_IDENTIFICACION));
    public static final Target VALOR_MATRICULA_MERCANTIL = Target.the("Valor de Matricula Mercantil")
            .located(By.xpath("//*[contains(@id, '_content_0')]/div/div/div/div/table/tbody/tr[1]/td[2]/div/span"));
    public static final Target VALOR_NOMBRE_RAZON_SOCIAL = Target.the("Valor de razon social")
            .located(By.xpath("//*[contains(@id, '_content_0')]/div/div/div/div/table/tbody/tr[2]/td[2]/div/span"));

    public static final Target ESTADO_EXPEDIENTE= Target.the("Estado del expediente")
            .located(By.xpath("//h6[.//span[text()='Estado del expediente']]"));
    public static final Target VALOR_ESTADO_MATRICULA = Target.the("Valor de estado matricula")
            .located(By.xpath("//*[contains(@id, '_content_1')]/div/div/div/div/table/tbody/tr[1]/td[2]/div/span"));
    public static final Target VALOR_ESTADO_DATOS = Target.the("Valor de estado de datos")
            .located(By.xpath("//*[contains(@id, '_content_1')]/div/div/div/div/table/tbody/tr[2]/td[2]/div/span"));
    public static final Target VALOR_FECHA_MATRICULA = Target.the("Valor de fecha de matricula")
            .located(By.xpath("//*[contains(@id, '_content_1')]/div/div/div/div/table/tbody/tr[3]/td[2]/div/span"));
    public static final Target VALOR_FECHA_ULTIMA_RENOVACION = Target.the("Valor de fecha de ultima renovacion")
            .located(By.xpath("//*[contains(@id, '_content_1')]/div/div/div/div/table/tbody/tr[4]/td[2]/div/span"));

    public static final Target VALOR_ULTIMO_ANIO_RENOVADO = Target.the("Valor de de año renovado")
            .located(By.xpath("//*[contains(@id, '_content_1')]/div/div/div/div/table/tbody/tr[5]/td[2]/div/span"));


    public static final Target VALOR_ORGANIZACION_JURIDICA= Target.the("Valor de Organizacion Juridica")
            .located(By.xpath("//*[contains(@id, '_content_1')]/div/div/div/div/table/tbody/tr[6]/td[2]/div/span"));
    public static final Target VALOR_CATEGORIA= Target.the("Valor de Categoria")
            .located(By.xpath("//*[contains(@id, '_content_1')]/div/div/div/div/table/tbody/tr[7]/td[2]/div/span"));

    public static final Target VALOR_TIPO_LOCAL= Target.the("Valor tipo de local")
            .located(By.xpath("//*[contains(@id, '_content_1')]/div/div/div/div/table/tbody/tr[8]/td[2]/div/span"));
    public static final Target VALOR_TIPO_LOCAL_PROPONENTE= Target.the("Valor tipo de local")
            .located(By.xpath("//*[contains(@id, '_content_1')]/div/div/div/div/table/tbody/tr[8]/td[2]/div/span"));
    public static final Target VALOR_ADAPTACION_NUEVO_FORMATO= Target.the("Valor de adaptacion nuevo formao")
            .located(By.xpath("//*[contains(@id, '_content_1')]/div/div/div/div/table/tbody/tr[9]/td[2]/div/span"));

    public static final Target DATOS_PROPONENTE= Target.the("Datos como proponente")
            .located(By.xpath("//h6[.//span[text()='Datos como proponente']]"));

    public static final Target DATOS_CONSTRUCCION= Target.the("Datos de Constitución")
            .located(By.xpath("//h6[.//span[text()='Datos de Constitución']]"));
    public static final Target VALOR_INSCRIPCION_PROPONENTE= Target.the("Valor de inscripcion del proponente")
            .located(By.xpath("//*[contains(@id, '_content_4')]/div/div/div/div/table/tbody/tr[1]/td[2]/div/span"));
    public static final Target VALOR_ESTADO= Target.the("Valor de estado")
            .located(By.xpath("//*[contains(@id, '_content_4')]/div/div/div/div/table/tbody/tr[2]/td[2]/div/span"));

    public static final Target BENEFICIOS= Target.the("Beneficios")
            .located(By.xpath("//h6[.//span[text()='Beneficios']]"));

    public static final Target SEGURIDAD_SOCIAL= Target.the("Seguridad social")
            .located(By.xpath("//h6[.//span[text()='Seguridad social']]"));
    public static final Target AUTORIZACION_ENVIO_EMAILS= Target.the("Autorización envío de Emails")
            .located(By.xpath("//h6[.//span[text()='Autorización envío de Emails']]"));
    public static final Target VALOR_AUTORIZO_ENVIO_EMAILS= Target.the("Valor de autorizo Envio de Emails")
            .located(By.xpath("//*[contains(@id, '_content_8')]/div/div/div/div/table/tbody/tr/td[2]/div/span"));
    public static final Target TAMANIO_EMPRESARIAL= Target.the("Tamaño empresarial")
            .located(By.xpath("//h6[.//span[text()='Tamaño empresarial']]"));
    public static final Target VALOR_TAMANIO_EMPRESARIAL= Target.the("Valor de autorizo Envio de Emails")
            .located(By.xpath("//*[contains(@id, '_content_9')]/div/div/div/div/table/tbody/tr[4]/td[2]/div/span"));

    public static final Target UBICACION_COMERCIAL = Target.the("Ubicación comercial")
            .located(By.xpath("//h6[.//span[text()='Ubicación comercial']]"));
//ARREGLAR DESDE ACA 
    public static final Target VALOR_DIRECCION_COMERCIAL= Target.the("Valor de autorizo Envio de Emails")
            .located(By.xpath("//*[contains(@id, '_content_10')]/div/div/div/div/table/tbody/tr[1]/td[2]/div/span"));
    //*[@id="pr_id_2110_content_10"]/div/div/div/div/table/tbody/tr[1]/td[2]/div/span

    public static final Target VALOR_BARRIO= Target.the("Valor de autorizo Envio de Emails")
            .located(By.xpath("//*[contains(@id, '_content_10')]/div/div/div/div/table/tbody/tr[2]/td[2]/div/span"));
    //*[@id="pr_id_2110_content_10"]/div/div/div/div/table/tbody/tr[2]/td[2]/div/span
    public static final Target VALOR_MUNICIPIO= Target.the("Valor de autorizo Envio de Emails")
            .located(By.xpath("//*[contains(@id, '_content_10')]/div/div/div/div/table/tbody/tr[3]/td[2]/div/span"));
    public static final Target VALOR_PAIS= Target.the("Valor de autorizo Envio de Emails")
            .located(By.xpath("//*[contains(@id, '_content_10')]/div/div/div/div/table/tbody/tr[4]/td[2]/div/span"));
    public static final Target VALOR_TELEFONO_01= Target.the("Valor de autorizo Envio de Emails")
            .located(By.xpath("//*[contains(@id, '_content_10')]/div/div/div/div/table/tbody/tr[5]/td[2]/div/span"));
    public static final Target VALOR_TELEFONO_02= Target.the("Valor de autorizo Envio de Emails")
            .located(By.xpath("//*[contains(@id, '_content_10')]/div/div/div/div/table/tbody/tr[6]/td[2]/div/span"));
    public static final Target VALOR_TELEFONO_03= Target.the("Valor de autorizo Envio de Emails")
            .located(By.xpath("//*[contains(@id, '_content_10')]/div/div/div/div/table/tbody/tr[7]/td[2]/div/span"));
    public static final Target VALOR_CORREO_ELECTRONICO= Target.the("Valor de autorizo Envio de Emails")
            .located(By.xpath("//*[contains(@id, '_content_10')]/div/div/div/div/table/tbody/tr[8]/td[2]/div/span"));
    public static final Target VALOR_ZONA= Target.the("Valor de autorizo Envio de Emails")
            .located(By.xpath("//*[contains(@id, '_content_10')]/div/div/div/div/table/tbody/tr[9]/td[2]/div/span"));

//HAST ACA

    public static final Target NOTIFICACION_JUDICIAL = Target.the("Notificación judicial")
            .located(By.xpath("//h6[.//span[text()='Notificación judicial']]"));

    public static final Target VALOR_DIRECCION_NOTIFICACION= Target.the("Valor de autorizo Envio de Emails")
            .located(By.xpath("//*[contains(@id, '_content_11')]/div/div/div/div/table/tbody/tr[1]/td[2]/div/span"));
    //*[@id="pr_id_2063_content_11"]/div/div/div/div/table/tbody/tr[1]/td[2]/div/span

    public static final Target VALOR_MUNICIPIO_NOTIFICACION= Target.the("Valor de autorizo Envio de Emails")
            .located(By.xpath("//*[contains(@id, '_content_11')]/div/div/div/div/table/tbody/tr[2]/td[2]/div/span"));
    public static final Target VALOR_PAIS_NOTIFICACION= Target.the("Valor de autorizo Envio de Emails")
            .located(By.xpath("//*[contains(@id, '_content_11')]/div/div/div/div/table/tbody/tr[3]/td[2]/div/span"));

    public static final Target VALOR_TELEFONO_01_NOTIFICACION= Target.the("Valor de autorizo Envio de Emails")
            .located(By.xpath("//*[contains(@id, '_content_11')]/div/div/div/div/table/tbody/tr[4]/td[2]/div/span"));

    public static final Target VALOR_TELEFONO_02_NOTIFICACION= Target.the("Valor de autorizo Envio de Emails")
            .located(By.xpath("//*[contains(@id, '_content_11')]/div/div/div/div/table/tbody/tr[5]/td[2]/div/span"));
    public static final Target VALOR_TELEFONO_03_NOTIFICACION= Target.the("Valor de autorizo Envio de Emails")
            .located(By.xpath("//*[contains(@id, '_content_11')]/div/div/div/div/table/tbody/tr[6]/td[2]/div/span"));
    public static final Target VALOR_CORREO_ELECTRONICO_NOTIFICACION= Target.the("Valor de autorizo Envio de Emails")
            .located(By.xpath("//*[contains(@id, '_content_11')]/div/div/div/div/table/tbody/tr[7]/td[2]/div/span"));

    public static final Target VALOR_ZONA_NOTIFICACION= Target.the("Valor de autorizo Envio de Emails")
            .located(By.xpath("//*[contains(@id, '_content_11')]/div/div/div/div/table/tbody/tr[8]/td[2]/div/span"));


    public static final Target VALOR_DIRECCION_NOTIFICACION_PROPONENTE= Target.the("Valor de autorizo Envio de Emails")
            .located(By.xpath("//*[contains(@id, '_content_11')]/div/div/div/div/table/tbody/tr[1]/td[2]/div/span"));
    //*[@id="pr_id_2063_content_11"]/div/div/div/div/table/tbody/tr[1]/td[2]/div/span
    public static final Target VALOR_MUNICIPIO_NOTIFICACION_PROPONENTE= Target.the("Valor de autorizo Envio de Emails")
            .located(By.xpath("//*[contains(@id, '_content_11')]/div/div/div/div/table/tbody/tr[3]/td[2]/div/span"));
    public static final Target VALOR_BARRIO_NOTIFICACION_PROPONENTE= Target.the("Valor de autorizo Envio de Emails")
            .located(By.xpath("//*[contains(@id, '_content_11')]/div/div/div/div/table/tbody/tr[2]/td[2]/div/span"));
    public static final Target VALOR_PAIS_NOTIFICACION_PROPONENTE= Target.the("Valor de autorizo Envio de Emails")
            .located(By.xpath("//*[contains(@id, '_content_11')]/div/div/div/div/table/tbody/tr[4]/td[2]/div/span"));

    public static final Target VALOR_TELEFONO_01_NOTIFICACION_PROPONENTE= Target.the("Valor de autorizo Envio de Emails")
            .located(By.xpath("//*[contains(@id, '_content_11')]/div/div/div/div/table/tbody/tr[5]/td[2]/div/span"));

    public static final Target VALOR_TELEFONO_02_NOTIFICACION_PROPONENTE= Target.the("Valor de autorizo Envio de Emails")
            .located(By.xpath("//*[contains(@id, '_content_11')]/div/div/div/div/table/tbody/tr[6]/td[2]/div/span"));
    public static final Target VALOR_TELEFONO_03_NOTIFICACION_PROPONENTE= Target.the("Valor de autorizo Envio de Emails")
            .located(By.xpath("//*[contains(@id, '_content_11')]/div/div/div/div/table/tbody/tr[7]/td[2]/div/span"));
    public static final Target VALOR_CORREO_ELECTRONICO_NOTIFICACION_PROPONENTE= Target.the("Valor de autorizo Envio de Emails")
            .located(By.xpath("//*[contains(@id, '_content_11')]/div/div/div/div/table/tbody/tr[8]/td[2]/div/span"));

    public static final Target VALOR_TIPO_SEDE_PROPONENTE= Target.the("Valor de autorizo Envio de Emails")
            .located(By.xpath("//*[contains(@id, '_content_11')]/div/div/div/div/table/tbody/tr[8]/td[2]/div/span"));


    public static final Target SITIO_DE_OPERACION = Target.the("Sitio de operación")
            .located(By.xpath("//h6[.//span[text()='Sitio de operación']]"));

    public static final Target VALOR_EMPRESA_UBICACION= Target.the("Valor de autorizo Envio de Emails")
            .located(By.xpath("//*[contains(@id, '_content_12')]/div/div/div/div/table/tbody/tr/td[2]/div/span"));


    public static final Target ACTIVIDAD_ECONOMICA_Y_CIIUS = Target.the("Actividad económica y CIIUS")
            .located(By.xpath("//h6[.//span[text()='Actividad económica y CIIUS']]"));
    public static final Target DISTRIBUCION_CAPITAL = Target.the("Distribución del capital")
            .located(By.xpath("//h6[.//span[text()='Distribución del capital']]"));

    public static final Target VALOR_NOMBRE_ACTIVIDAD= Target.the("Valor de autorizo Envio de Emails")
            .located(By.xpath("//*[contains(@id, '_content_13')]/div/div/div/div/table/tbody/tr[1]/td[1]/div/span"));

    public static final Target VALOR_CAPITAL_AUTORIZADO= Target.the("Valor de autorizo Envio de Emails")
            .located(By.xpath("//*[contains(@id, '_content_15')]/div/div/div/div/table/tbody/tr[7]/td[2]/div/span"));


    public static final Target PARTICIPACION = Target.the("Participación")
            .located(By.xpath("//h6[.//span[text()='Participación']]"));

    public static final Target INFORMACION_FINANCIERA = Target.the("Información financiera")
            .located(By.xpath("//h6[.//span[text()='Información financiera']]"));

    public static final Target VALOR_ANIO_DATOS= Target.the("Valor de autorizo Envio de Emails")
            .located(By.xpath("//*[contains(@id, '_content_17')]/div/div/div/div/table/tbody/tr[1]/td[2]/div/span"));

    public static final Target VALOR_FECHA_DATOS= Target.the("Valor de autorizo Envio de Emails")
            .located(By.xpath("//*[contains(@id, '_content_17')]/div/div/div/div/table/tbody/tr[2]/td[2]/div/span"));

    public static final Target VALOR_PERSONAL_OCUPADO= Target.the("Valor de autorizo Envio de Emails")
            .located(By.xpath("//*[contains(@id, '_content_17')]/div/div/div/div/table/tbody/tr[3]/td[2]/div/span"));
    public static final Target VALOR_COMERCIAL= Target.the("Valor de autorizo Envio de Emails")
            .located(By.xpath("//*[contains(@id, '_content_17')]/div/div/div/div/table/tbody/tr[4]/td[2]/div/span"));
    public static final Target VALOR_ACTIVOS_CORRINETES= Target.the("Valor de autorizo Envio de Emails")
            .located(By.xpath("//*[contains(@id, '_content_17')]/div/div/div/div/table/tbody/tr[6]/td[2]/div/span"));
    public static final Target PAGOS_DE_AFILIACION = Target.the("Pagos de afiliación")
            .located(By.xpath("//h6[.//span[text()='Pagos de afiliación']]"));
    public static final Target EMBARGOS = Target.the("Embargos")
            .located(By.xpath("//h6[.//span[text()='Embargos']]"));

    public static final Target PAGOS_DE_MATRICULA = Target.the("Pagos de matrícula y renovación")
            .located(By.xpath("//h6[.//span[text()='Pagos de matrícula y renovación']]"));
    public static final Target PROPIETARIOS = Target.the("Propietarios")
            .located(By.xpath("//h6[.//span[text()='Propietarios']]"));
    public static final Target CUPO_DEL_AFILIADO = Target.the("Cupo del afiliado")
            .located(By.xpath("//h6[.//span[text()='Cupo del afiliado']]"));

    public static final Target LIBROS_COMERCIO_INSCRITOS = Target.the("Libros de comercio inscritos")
            .located(By.xpath("//h6[.//span[text()='Libros de comercio inscritos']]"));
    public static final Target INFORMACION_ESADL= Target.the("Información de ESADL")
            .located(By.xpath("//h6[.//span[text()='Información de ESADL']]"));

    public static final Target REPRESENTACION_LEGAL_Y_OTROS_VINCULOS = Target.the("Representación legal y otros vínculos")
            .located(By.xpath("//h6[.//span[text()='Representación legal y otros vínculos']]"));

    public static final Target VALOR_R_IDENTIFICACION= Target.the("Valor de autorizo Envio de Emails")
            .located(By.xpath("//*[contains(@id, '_content_19')]/div/div/div/div/table/tbody/tr/td[1]/div/span"));
    //*[@id="pr_id_242_content_19"]/div/div/div/div/table/tbody/tr/td[1]/div/span

    public static final Target VALOR_R_NOMBRE= Target.the("Valor de autorizo Envio de Emails")
            .located(By.xpath("//*[contains(@id, '_content_19')]/div/div/div/div/table/tbody/tr/td[2]/div/span"));

    public static final Target VALOR_R_VEHICULO= Target.the("Valor de autorizo Envio de Emails")
            .located(By.xpath("//*[contains(@id, '_content_19')]/div/div/div/div/table/tbody/tr/td[3]/div/span"));
    public static final Target VALOR_R_INCRIPCION= Target.the("Valor de autorizo Envio de Emails")
            .located(By.xpath("//*[contains(@id, '_content_19')]/div/div/div/div/table/tbody/tr/td[4]/div/span"));



    public static final Target INSCRIPCION_DE_DOCUMENTOS = Target.the("Inscripción de documentos")
            .located(By.xpath("//h6[.//span[text()='Inscripción de documentos']]"));

    public static final Target RESENA_CASA_PRINCIPAL = Target.the("Reseña Casa Principal")
            .located(By.xpath("//h6[.//span[text()='Reseña Casa Principal']]"));

    public static final Target ESTABLECIMIENTOS_JURIDICCION = Target.the("Establecimientos - jurisdicción")
            .located(By.xpath("//h6[.//span[text()='Establecimientos - jurisdicción']]"));
    public static final Target VALOR_C_IDENTIFICACION= Target.the("Valor de autorizo Envio de Emails")
            .located(By.xpath("//*[contains(@id, '_content_33')]/div/div/div/div/table/tbody/tr/td[1]/div/span"));
    //*[@id="pr_id_242_content_33"]/div/div/div/div/table/tbody/tr/td[1]/div/span

    public static final Target VALOR_C_MATRICULA= Target.the("Valor de autorizo Envio de Emails")
            .located(By.xpath("//*[contains(@id, '_content_33')]/div/div/div/div/table/tbody/tr/td[2]/div/span"));

    public static final Target VALOR_C_NOMBRE= Target.the("Valor de autorizo Envio de Emails")
            .located(By.xpath("//*[contains(@id, '_content_33')]/div/div/div/div/table/tbody/tr/td[3]/div/span"));

    public static final Target FORMULARIOS_Y_EXPEDIENTE_GRAFICO = Target.the("Formularios y expediente gráfico")
            .located(By.xpath("//h6[.//span[text()='Formularios y expediente gráfico']]"));
    public static final Target FORMULARIOS_PREDILIGENCIADO = Target.the("Formularios y expediente gráfico")
            .located(By.xpath("(//*[starts-with(@id, 'pr_id_') and contains(@id, '_content_')])[1]/div/div/div/div/table/tbody/tr[2]/td[2]/div/span/span"));

    public static final Target NOTIFICACIONES_SIPREF = Target.the("Notificaciones (SIPREF) - Email")
            .located(By.xpath("//h6[.//span[text()='Notificaciones (SIPREF) - Email']]"));

    public static final Target REFERENCIAS_COMERCIALES = Target.the("Referencias comerciales y/o crediticias")
            .located(By.xpath("//h6[.//span[text()='Referencias comerciales y/o crediticias']]"));

    public static final Target EVIDENCIAS_SIPREF = Target.the("Evidencias SIPREF")
            .located(By.xpath("//h6[.//span[text()='Evidencias SIPREF']]"));

    public static final Target CONSULTA_RENOVADO = Target.the("Formularios y expediente gráfico")
            .located(By.xpath("(//*[starts-with(@id, 'pr_id_') and contains(@id, '_content_')])[1]/div/div/div/div/table/tbody/tr[4]/td[2]/div/span/span"));


    public static final Target FORM_ULTIMA_RENOVACION = Target.the("Formularios y expediente gráfico")
            .located(By.xpath("(//*[starts-with(@id, 'pr_id_') and contains(@id, '_content_')])[1]/div/div/div/div/table/tbody/tr[3]/td[2]/div/span/span"));

    public static final Target OPERACIONES_DEL_REGISTRO_MERCANTIL_ESADL = Target.the("Operaciones del registro mercantil / ESADL")
            .located(By.xpath("//h6[.//span[text()='Operaciones del registro mercantil / ESADL']]"));

    public static final Target PRIMER_CONTENIDO_MODAL = Target.the("Primer Contenido de Panel con ID Dinámico")
            .located(By.xpath("(//*[contains(@id, '_content')])[1]"));
    //*[@id="pr_id_368_content"]


}
