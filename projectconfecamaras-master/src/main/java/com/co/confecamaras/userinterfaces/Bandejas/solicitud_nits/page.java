package com.co.confecamaras.userinterfaces.Bandejas.solicitud_nits;

import net.serenitybdd.screenplay.targets.Target;

public class page {

    public static final Target CAMPO_FECHA= Target.the("campo para ingreso de fecha modulo")
            .locatedBy("//input[@type='date']");

    public static final Target BOTON_PENDIENTES= Target.the("boton pendientes")
            .locatedBy("(//button[@class='btn btn-primary btn-md'])[1]");

    public static final Target BOTON_ASIGNADAS= Target.the("boton asignadas")
            .locatedBy("(//button[@class='btn btn-primary btn-md'])[2]");

    public static final Target BOTON_ERRONEAS= Target.the("boton erroneas")
            .locatedBy("(//button[@class='btn btn-primary btn-md'])[3]");

    public static final Target BOTON_COMERCIANTES= Target.the("boton comerciantes")
            .locatedBy("(//button[@class='btn btn-primary btn-md'])[4]");
    public static final Target BOTON_NUEVA_CONSULTA= Target.the("boton consulta")
            .locatedBy("//button[@class='btn btn-primary btn-md']");

    public static final Target VALIDAR_XML= Target.the("boton validar XML")
            .locatedBy("(//a[@target='_blank'])[3]");

    public static final Target VALIDAR_XML_NO_FIRME= Target.the("boton validar XML no firme")
            .locatedBy("(//a[@data-original-title='Ver XML'])[1]");
    public static final Target BOTON_VER_RESPUESTA_RADICACION= Target.the("boton ver respuesta radicacion")
            .locatedBy("(//a[@target='_blank'])[4]");

    public static final Target BOTON_FORMALIZAR= Target.the("boton Formalizar")
            .locatedBy("(//a[@title=(contains(text(), 'Formalizar'))])[8]");

    public static final Target BOTON_SOLICITAR_NIT= Target.the("boton solicitar nit")
            .locatedBy("(//button[@class='btn btn-primary btn-md'])[4]");

    public static final Target OPCION_REGENRAR_XML= Target.the("boton regenerar xml")
            .locatedBy("(//a[@title=(contains(text(), 'Formalizar'))])[6]");

    public static final Target OPCION_VER_XML= Target.the("boton ver XML nit")
            .locatedBy("(//a[@title=(contains(text(), 'Formalizar'))])[7]");

    public static final Target OPCION_EDITAR_XML= Target.the("boton editar xml nit")
            .locatedBy("(//a[@title=(contains(text(), 'Formalizar'))])[8]");

    public static final Target OPCION_CONSULTAR_EXPEDIENTE= Target.the("boton consultar expediente")
            .locatedBy("(//a[@title=(contains(text(), 'Formalizar'))])[9]");

    public static final Target OPCION_ACTUALIZAR_MATRICULADOS= Target.the("boton actualizar matriculados")
            .locatedBy("(//a[@title=(contains(text(), 'Formalizar'))])[10]");

    public static final Target OPCION_VER_ESPECIFICACIONES= Target.the("boton ver especificacion")
            .locatedBy("(//a[@title=(contains(text(), 'Formalizar'))])[11]");

    public static final Target OPCION_VER_VALIDACIONES_MARCASS= Target.the("boton ver validaciones marcas")
            .locatedBy("(//a[@title=(contains(text(), 'Formalizar'))])[12]");
}
