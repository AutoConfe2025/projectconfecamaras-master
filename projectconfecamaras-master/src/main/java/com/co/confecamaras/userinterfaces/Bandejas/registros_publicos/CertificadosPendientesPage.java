package com.co.confecamaras.userinterfaces.Bandejas.registros_publicos;

import net.serenitybdd.screenplay.targets.Target;

public class CertificadosPendientesPage {
    public static Target INP_RECIBO = Target.the("ingresar numero de recibo").locatedBy("#reciboinicial");
    public static Target TXT_INFORMACION = Target.the("informacion de recibo archivado").locatedBy("//form/p");
    public static Target LINK_REGRESAR = Target.the("regresar").locatedBy("//a[text()='Regresar']");
}
