package com.co.confecamaras.userinterfaces.Bandejas.control_calidad;

import net.serenitybdd.screenplay.targets.Target;

public class Page {

    public static final Target BOTON_REGRESAR = Target.the ("boton regresar de modulo").locatedBy("//button[contains(text(), 'Regresar')]");
    public static final Target PDF_1 = Target.the ("PDF 1").locatedBy("(//p[@class='text-dark text-left']//a[text()='Ver'])[2]");
    public static final Target PDF_2 = Target.the ("PDF 2").locatedBy("(//p[@class='text-dark text-left']//a[text()='Ver'])[3]");
    public static final Target BOTON_VER_CERTIFICADO = Target.the ("Boton ver certificado").locatedBy("//a[@data-original-title='Ver certificado']");
    public static final Target BOTON_VER_DIGITACION = Target.the ("Boton ver digitacion").locatedBy("//a[@data-original-title='Digitar informacion']");
    public static final Target DIGITAR_FORMULARIO = Target.the ("Boton digitar formulario").locatedBy("//a[contains(text(), 'Digitar formulario')]");
    public static final Target OPCION_DIGTAR_FORMULARIO = Target.the ("Boton digitar formulario").locatedBy("//a[contains(text(),'Digitar formulario')]");
    public static final Target TITULO_DIGITACION_FORMULARIO = Target.the ("Boton digitar formulario").locatedBy("//p[contains(text(),'Digitación de formularios')]");
    public static final Target BOTON_VOLVER_DIGITACION = Target.the ("Boton digitar formulario").locatedBy("//a[contains(text(),'Volver a digitación')]");
    public static final Target BOTON_REVISAR_CERTIFICADO = Target.the ("Boton digitar formulario").locatedBy("//a[contains(text(),'Revisar certificado')]");
    public static final Target BOTON_ACTUALIZAR_RUES = Target.the ("Boton actualiza rues").locatedBy("//a[contains(text(),'Actualización RUES')]");
    public static final Target BOTON_ACTUALIZAR_RUES_2 = Target.the ("Boton actualiza rues v2").locatedBy("(//button[@class='btn btn-primary btn-md'])[2]");
    public static final Target TITULO_MENSAJE_INFORMATIVO = Target.the ("titulo mensaje informativo actualizacion RUES").locatedBy("//p[contains(text(), 'Mensaje informativo')]");
    public static final Target EXPEDIENTE_NO = Target.the ("inicio texto de validacion rues").locatedBy("//p[contains(text(), 'Expediente No')]");
    public static final Target BOTON_VOLVER_A_DIGITACION = Target.the ("boton volver a digitacion").locatedBy("//a[contains(text(), 'Volver a Digitación')]");
    public static final Target BOTON_FINALIZAR_DIGITACION = Target.the ("boton finalizar digitacion").locatedBy("//a[contains(text(), 'Finalizar digitación')]");
    public static final Target BOTON_CONFIRMAR = Target.the ("boton confirmar").locatedBy("//a[@data-original-title='Confirmar']");
    public static final Target BOTON_CONTINUAR = Target.the ("boton continuar").locatedBy("//button[@class='btn btn-success']");
    public static final Target BOTON_REGRESAR_ESTUDIO = Target.the ("boton regresar a estudio").locatedBy("//a[@data-original-title='Regresar a Estudio']");
    public static final Target BOTON_REGRESAR_A_DIGITACION = Target.the ("boton regresar a estudio").locatedBy("//a[@data-original-title='Regresar a Digitacion']");
}
