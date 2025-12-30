package com.co.confecamaras.userinterfaces.registros_publicos;

import net.serenitybdd.screenplay.targets.Target;

public class ExtraccionLibrosActosPage {

    public static final Target LISTA_SELECCION_ACTOS = Target.the("lista de seleccion de actos")
            .locatedBy("//select[@id='_actos']");

    public static final Target OPCION_ARRENDAMIENTOS = Target.the("opcion arrendamientos")
            .locatedBy("//option[contains(text(), '037 - ARRENDAMIENTOS')]");

    public static final Target LISTA_TIPO_INFORME = Target.the("lista de seleccion de tipo de informe")
            .locatedBy("//select[@id='_tipodeinforme']");

    public static final Target OPCION_REGISTRO_MERCANTIL_0120 = Target.the("opcion regsitro mercantil del 01 al 20")
            .locatedBy("//option[contains(text(), '1 Registro Mercantil (01 al 22)')]");

    public static final Target CAMPO_FEHCA_INICIAL = Target.the("campo de fecha inicial")
            .locatedBy("//input[@id='_fechaini']");

    public static final Target CAMPO_FEHCA_FINAL = Target.the("campo de fecha final")
            .locatedBy("//input[@id='_fechafin']");

    public static final Target CAMPO_EMAIL = Target.the("campo de correo electronico")
            .locatedBy("//input[@id='_emailusuariosistema']");

    public static final Target BOTON_GENERAR = Target.the("boton generar")
            .locatedBy("//button[@class='btn btn-primary btn-md']");

    public static final Target BOTON_GENERAR_FLOTANTE = Target.the("boton generar flotante en alerta")
            .locatedBy("//button[@class='btn btn-success']");

    public static final Target MENSAJE_INFORMATIVO_EXTRACCION_ACTOS_EXITOSO = Target.the("boton generar flotante en alerta")
            .locatedBy("(//p[@class='text-dark text-center'])[2]");
}
