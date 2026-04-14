package com.co.confecamaras.userinterfaces.Bandejas.sincronizacion_maestros_jsp7;

import net.serenitybdd.screenplay.targets.Target;

public class PageSincronizacionMaestrosSjp7 {

    public static final Target BOTON_SINCRONIZAR_TABLAS = Target.the("boton sincronizar tablas")
            .locatedBy("//a[contains(text(),'Sincronizar tablas')]");

    public static final Target SINCRONIZACION_COMPLETA_TEXTO = Target.the("textro de sincronizacion exitosa")
            .locatedBy("//h2");
}
