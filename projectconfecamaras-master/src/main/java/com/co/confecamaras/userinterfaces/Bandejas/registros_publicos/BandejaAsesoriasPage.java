package com.co.confecamaras.userinterfaces.Bandejas.registros_publicos;

import net.serenitybdd.screenplay.targets.Target;

public class BandejaAsesoriasPage {
    public static Target LINK_VER = Target.the("accion ver").locatedBy("//td[text()={0}]/following-sibling::td[9]//a");
    public static Target SECTIONS_VER = Target.the("secciones de accion ver").locatedBy("//div[@id='frameSecundarioCentral']//center");
    public static Target LINK_COMPLETAR_RESPUESTAS = Target.the("accion completar respuestas").locatedBy("//td[text()={0}]/following-sibling::td[10]//a");
    public static Target INP_RESPUESTA = Target.the("respuesta al cliente").locatedBy("#tinymce");
    public static Target LINK_RESPONDER = Target.the("responder pidiendo informacion").locatedBy("//td[text()={0}]/following-sibling::td[11]//a");
    public static Target LINK_RESPONDER_OK = Target.the("responder ok al tramite").locatedBy("//td[text()={0}]/following-sibling::td[12]//a");
    public static Target LINK_RESPONDER_NO = Target.the("responder no al tramite").locatedBy("//td[text()={0}]/following-sibling::td[13]//a");
    public static Target LINK_GRABAR = Target.the("guardar informacion").locatedBy("//a[text()='Grabar']");
    public static Target LINK_REGRESAR = Target.the("regresar").locatedBy("//a[text()='Regresar']");

}
