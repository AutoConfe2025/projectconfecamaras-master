package com.co.confecamaras.userinterfaces.registros_publicos;

import net.serenitybdd.screenplay.targets.Target;

public class ResumenImagenesExpedientesPage {

    public static final Target BOTON_RELACION_MATRICULA = Target.the("relacion por matricula")
            .locatedBy("(//a[contains(text(),'Relación por Matrícula')])[1]");

    public static final Target BOTON_RELACION_MATRICULA_SISTEMA = Target.the("relacion por matricula/sistema")
            .locatedBy("//a[contains(text(),'Relación por Matrícula/Sistema')]");

    public static final Target BOTON_RELACION_PROPONENTE = Target.the("relacion por proponente")
            .locatedBy("//a[contains(text(),'Relación por Proponente')]");
}
