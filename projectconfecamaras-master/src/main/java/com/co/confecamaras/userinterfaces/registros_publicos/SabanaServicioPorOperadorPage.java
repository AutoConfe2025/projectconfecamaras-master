package com.co.confecamaras.userinterfaces.registros_publicos;

import net.serenitybdd.screenplay.targets.Target;

public class SabanaServicioPorOperadorPage {

    public static final Target LISTA_TIPO = Target.the("lista de seleccion de tipo")
            .locatedBy("//select[@id='_tipo']");

    public static final Target OPCION_SERVICIOS_VENDIDOS = Target.the("Opcion servicios vendidos")
            .locatedBy("//option[contains(text(),'1.- Servicios vendidos')]");

    public static final Target BOTON_GENERAR_SABANA = Target.the("boton generar sabana")
            .locatedBy("//a[@class='myButton']");

    public static final Target BOTON_GENERAR_CSV = Target.the("boton generar csv")
            .locatedBy("//a[contains(text(), 'Descargar CSV')]");
}
