package com.co.confecamaras.userinterfaces.mantenimientoeinformes;

import net.serenitybdd.screenplay.targets.Target;

public class RevisionPorServicio {

    public static final Target CAMPO_FECHA_INICIAL= Target.the("campo fecha inicial")
            .locatedBy("//input[@id='_fecini']");

    public static final Target CAMPO_FECHA_FINAL= Target.the("campo fecha final")
            .locatedBy("//input[@id='_fecfin']");

    public static final Target CAMPO_TIPO_DETALLE= Target.the("campo tipo de detalle")
            .locatedBy("//input[@id='_tipo']");

    public static final Target BOTON_CONSULTAR= Target.the("boton generar")
            .locatedBy("//a[@class='myButton']");

    public static final Target RELACION_MOVIENTO_POR_SERVICIOS= Target.the("boton de descargar")
            .locatedBy("//a[normalize-space(.)='Relación de movimientos por servicio (Resumen)']");
}
