package com.co.confecamaras.userinterfaces.consultasytransacciones;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static com.co.confecamaras.utils.consultasytransacciones.ConsultarExpedienteConstants.MATRICULA_EXP;

public class Expediente {


    public static Target BTN_MATRICULA = Target.the("boton para ingresar por Matricula")
            .located(By.xpath("//span[contains(@class, 'p-button-label') and text()='Matrícula']"));

    public static Target INPUT_DATO_BUSQUEDA= Target.the("input para ingresar nombre")
            .located(By.id("criterio"));


    public static Target BTN_CONSULTAR_EXPEDIENTE= Target.the("input para consultar")
            .located(By.xpath("//button[contains(@class, 'newConsultar') and contains(., 'Consultar')]"));

    public static final Target BTN_NUMERO_MATRICULA = Target.the("botón de matrícula")
            .located(By.id("btn-matricula-" + MATRICULA_EXP));
    public static final Target ESTADO_EXPEDIENTE= Target.the("Estado del expediente")
            .located(By.xpath("//h6[.//span[text()='Estado del expediente']]"));
    public static final Target SEGURIDAD_SOCIAL= Target.the("Seguridad social")
            .located(By.xpath("//h6[.//span[text()='Estado del expediente']]"));
    public static final Target AUTORIZACION_ENVIO_EMAILS= Target.the("Autorización envío de Emails")
            .located(By.xpath("//h6[.//span[text()='Autorización envío de Emails']]"));

    public static final Target UBICACION_COMERCIAL = Target.the("Ubicación comercial")
            .located(By.xpath("//h6[.//span[text()='Ubicación comercial']]"));

    public static final Target NOTIFICACION_JUDICIAL = Target.the("Notificación judicial")
            .located(By.xpath("//h6[.//span[text()='Notificación judicial']]"));

    public static final Target SITIO_DE_OPERACION = Target.the("Sitio de operación")
            .located(By.xpath("//h6[.//span[text()='Sitio de operación']]"));

    public static final Target ACTIVIDAD_ECONOMICA_Y_CIIUS = Target.the("Actividad económica y CIIUS")
            .located(By.xpath("//h6[.//span[text()='Actividad económica y CIIUS']]"));

    public static final Target PARTICIPACION = Target.the("Participación")
            .located(By.xpath("//h6[.//span[text()='Participación']]"));

    public static final Target INFORMACION_FINANCIERA = Target.the("Información financiera")
            .located(By.xpath("//h6[.//span[text()='Información financiera']]"));

    public static final Target REPRESENTACION_LEGAL_Y_OTROS_VINCULOS = Target.the("Representación legal y otros vínculos")
            .located(By.xpath("//h6[.//span[text()='Representación legal y otros vínculos']]"));

    public static final Target INSCRIPCION_DE_DOCUMENTOS = Target.the("Inscripción de documentos")
            .located(By.xpath("//h6[.//span[text()='Inscripción de documentos']]"));

    public static final Target RESENA_CASA_PRINCIPAL = Target.the("Reseña Casa Principal")
            .located(By.xpath("//h6[.//span[text()='Reseña Casa Principal']]"));

    public static final Target FORMULARIOS_Y_EXPEDIENTE_GRAFICO = Target.the("Formularios y expediente gráfico")
            .located(By.xpath("//h6[.//span[text()='Formularios y expediente gráfico']]"));

    public static final Target OPERACIONES_DEL_REGISTRO_MERCANTIL_ESADL = Target.the("Operaciones del registro mercantil / ESADL")
            .located(By.xpath("//h6[.//span[text()='Operaciones del registro mercantil / ESADL']]"));


}
