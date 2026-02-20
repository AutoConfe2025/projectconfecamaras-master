package com.co.confecamaras.userinterfaces.mantenimientoeinformes;

import net.serenitybdd.screenplay.targets.Target;

public class FirmaRegistrolMercantilEsadl {

    public static final Target BOTON_FIRMAR_INSCRIPCION = Target.the("boton de firmar inscripcion")
            .locatedBy("//*[@id=\"tableinsfir\"]/tbody/tr[1]/td[10]/p/small/a[3]");

    public static final Target CLAVE_FIRMADO = Target.the("clave de firmado")
            .locatedBy("//*[@id=\"formMregFirmaInscripciones\"]/div/div[7]/div/div[5]/div/h4");

    public static final Target CAMPO_CLAVE_USUARIO = Target.the("campo para ingreso de clave de usuario")
            .locatedBy("//input[@id='_claveusuario']");

    public static final Target CAMPO_CLAVE_FIRMADO = Target.the("campo para ingreso de clave de firmado")
            .locatedBy("//input[@id='_clavefirmado']");

    public static final Target BOTON_FIRMAR = Target.the("campo para ingreso de clave de firmado")
            .locatedBy("//button[contains(text(),'Firmar')]");
}
