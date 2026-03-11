package com.co.confecamaras.userinterfaces.renovaciones;

import net.serenitybdd.screenplay.targets.Target;

public class FujoPnEstPublicoPage {

    public static final Target BOTON_CONSULTA_MATRICULA_INSCRIPCION = Target.the("boton consulta matricula inicial")
            .locatedBy("//a[.//span[contains(text(),'Consulta matrícula o inscripción')]]");

    public static final Target BOTON_FIRMA_ELECTRONICA = Target.the("boton de firma electronica")
            .locatedBy("//button[@id='botones_ren0']");

    public static final Target VALIDA_PRIMER_PDF_FIRMA = Target.the("boton de ver primer pdf")
            .locatedBy("(//i[@class='fas fa-eye fa-stack-1x fa-inverse bg-info rounded'])[1]");

    public static final Target VALIDA_SEGUNDO_PDF_FIRMA = Target.the("boton de ver segundo pdf")
            .locatedBy("(//i[@class='fas fa-eye fa-stack-1x fa-inverse bg-info rounded'])[2]");

    public static final Target BOTON_FIRMAR = Target.the("boton firmar")
            .locatedBy("//button[contains(.,'Firmar')]");

    public static final Target BOTON_ACEPTAR_FIRMADO_ELECTRONICO = Target.the("boton aceptar firma electronica")
            .locatedBy("//button[contains(text(),'Si')]");

    public static final Target BOTON_CONTINUAR_FIRMADO_ELECTRONICO_EXITOSO = Target.the("boton continuar firma electronica")
            .locatedBy("//button[contains(.,'Continuar')]");
}
