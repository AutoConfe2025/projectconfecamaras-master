package com.co.confecamaras.userinterfaces.mantenimientoeinformes;

import net.serenitybdd.screenplay.targets.Target;

public class FirmaRegistrolMercantilEsadl {

    public static final Target BOTON_FIRMAR_INSCRIPCION = Target.the("boton de firmar inscripcion")
            .locatedBy("(//a[@target='_self'])[2]");

    public static final Target CLAVE_FIRMADO = Target.the("clave de firmado")
            .locatedBy("//strong[contains(text(),'Clave de firmado')]/parent::div");

    public static final Target CAMPO_CLAVE_USUARIO = Target.the("campo para ingreso de clave de usuario")
            .locatedBy("//input[@id='_claveusuario']");

    public static final Target CAMPO_CLAVE_FIRMADO = Target.the("campo para ingreso de clave de firmado")
            .locatedBy("//input[@id='_clavefirmado']");

    public static final Target BOTON_FIRMAR = Target.the("campo para ingreso de clave de firmado")
            .locatedBy("//input[@class='myButton']");
}
