package com.co.confecamaras.userinterfaces.general;

import net.serenitybdd.screenplay.targets.Target;

public class GeneralPage {

    //CAMPOS DE ACCION
    public static final Target CAMPO_FECHA_INICIAL_CAMPO = Target.the("Fecha inicial de data campo")
            .locatedBy("//input[@id='_fechainicial']");
    public static final Target CAMPO_FECHA_FINAL_CAMPO = Target.the("Fecha final de data campo")
            .locatedBy("//input[@id='_fechafinal']");

    public static final Target CAMPO_FECHA_INICIAL_DATA_PICKER = Target.the("Fecha inicial de data picker")
            .locatedBy("//input[@id='_fecini']");

    public static final Target CAMPO_FECHA_INICIAL_DD_MM_AAAA = Target.the("Fecha inicial de de ingreso manual")
            .locatedBy("//input[@id='_fechaini']");

    public static final Target CAMPO_FECHA_FINAL_DATA_PICKER = Target.the("Fecha final de data picker")
            .locatedBy("//input[@id='_fecfin']");

    public static final Target CAMPO_FECHA_FINAL_DD_MM_AAAA = Target.the("Fecha final de de ingreso manual")
            .locatedBy("//input[@id='_fechafin']");

    public static final Target CAMPO_CORREO_ELECTRONICO = Target.the("campo correo electronico")
            .locatedBy("//input[@id='emailusuariosistema']");

    public static final Target CAMPO_CORREO_ELECTRONICO_CONTROL = Target.the("campo correo electronico control")
            .locatedBy("//input[@id='_emailusuariosistema']");

    public static final Target CAMPO_CODIGO_RECUPERACION = Target.the("campo codigo de recuperacion")
            .locatedBy("//input[@id='numerorecuperacion']");

    //BOTONES DE INTERACCION
    public static final Target BTN_GENERAR_DATA_PICKER = Target.the("generar general data picker")
            .locatedBy("//a[contains(text(),'Generar')]");
    public static final Target BOTON_GENERAR_BOTON = Target.the("boton generar cuando es boton")
            .locatedBy("//button[contains(text(),'Generar')]");

    public static final Target BOTON_GENERAR_BOTON_ALERTA = Target.the("boton generar cuando es boton y alerta")
            .locatedBy("(//button[contains(text(),'Generar')])[2]");

    public static final Target BOTON_EXTRAER_AREF = Target.the("boton extraer con link")
            .locatedBy("//a[contains(text(),'Extraer')]");

    public static final Target BOTON_EXTRAER_BOTON = Target.the("boton extraer con boton")
            .locatedBy("//button[contains(text(),'Extraer')]");

    public static final Target BOTON_DESCARGAR_ARCHIVO_AREF = Target.the("boton descargar archivo con link")
            .locatedBy("//a[contains(text(),'Descargar archivo')]");

    public static final Target BOTON_CONSULTAR_AREF = Target.the("boton consultar cuando es a ref")
            .locatedBy("//a[contains(text(),'Consultar')]");

    public static final Target BOTON_CONSULTAR_MY_BOTON = Target.the("boton consultar cuando es a mybutton")
            .locatedBy("//input[@class='myButton']");

    public static final Target BOTON_CONTINUAR_IMAGEN = Target.the("boton de continuar cuando es tipo imagen")
            .locatedBy("//input[@type='124152']");

    public static final Target BOTON_CONSULTAR_BOTON = Target.the("boton de consultar en localizador boton")
            .locatedBy("//button[@class='btn btn-primary']");

    public static final Target BOTON_FIRMAR = Target.the("boton de consultar en localizador boton")
            .locatedBy("//button[contains(text(),'Firmar')]");

    public static final Target BOTON_GRABAR_AREF = Target.the("boton crear con a ref de link")
            .locatedBy("//a[contains(text(),'Grabar')]");

    public static final Target BOTON_REGRESAR_AREF = Target.the("boton crear con a ref de link")
            .locatedBy("//a[contains(text(),'Regresar')]");

    public static final Target BOTON_REGRESAR_AREF_MIN = Target.the("boton crear con a ref de link con regresar en minuscula")
            .locatedBy("//a[contains(text(),'regresar')]");
}
