package com.co.confecamaras.userinterfaces.renovaciones;

import net.serenitybdd.screenplay.targets.Target;

public class FlujoVariosAnio2013Page {

    public static final Target BOTON_DESMARCAR_TODAS = Target.the("boton para desmarcar todos")
            .locatedBy("//button[@data-pr-tooltip='Desmarcar todas'][@class='btn btn-outline-primary btn-tooltip-marcar']");

    public static final Target BOTON_DUPLICAR_ARCHIVOS = Target.the("boton para duplicar archivos")
            .locatedBy("//button[@data-pr-tooltip='Duplicar activos'][@class='btn btn-outline-primary mr-3 btn-tooltip-duplicar']");
    public static final Target PRIMER_CHECK_RENOVAR = Target.the("primer checkbox de matricula a renovar")
            .locatedBy("(//input[@type='checkbox'])[1]");

    public static final Target SEGUNDO_CHECK_RENOVAR = Target.the("segundo checkbox de matricula a renovar")
            .locatedBy("(//input[@type='checkbox'])[2]");

    public static final Target TERCER_CHECK_RENOVAR = Target.the("tercer checkbox de matricula a renovar")
            .locatedBy("(//input[@type='checkbox'])[3]");

    public static final Target CUARTO_CHECK_RENOVAR = Target.the("cuarto checkbox de matricula a renovar")
            .locatedBy("(//input[@type='checkbox'])[4]");

    public static final Target QUINTO_CHECK_RENOVAR = Target.the("quinto checkbox de matricula a renovar")
            .locatedBy("(//input[@type='checkbox'])[5]");

    public static final Target SERVICIO_1 = Target.the("servicio 1")
            .locatedBy("//*[@id=\"seccionCentral\"]/div[2]/div[2]/div[2]/table/tbody/tr[1]/th");

    public static final Target SERVICIO_2 = Target.the("servicio 2")
            .locatedBy("//*[@id=\"seccionCentral\"]/div[2]/div[2]/div[2]/table/tbody/tr[2]/th");

    public static final Target SERVICIO_3 = Target.the("servicio 3")
            .locatedBy("//*[@id=\"seccionCentral\"]/div[2]/div[2]/div[2]/table/tbody/tr[3]/th");

    public static final Target SERVICIO_4 = Target.the("servicio 4")
            .locatedBy("//*[@id=\"seccionCentral\"]/div[2]/div[2]/div[2]/table/tbody/tr[4]/th");

    public static final Target SERVICIO_5 = Target.the("servicio 5")
            .locatedBy("//*[@id=\"seccionCentral\"]/div[2]/div[2]/div[2]/table/tbody/tr[5]/th");
}
