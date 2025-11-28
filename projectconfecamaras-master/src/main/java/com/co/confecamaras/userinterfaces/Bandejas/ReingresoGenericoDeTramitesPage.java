package com.co.confecamaras.userinterfaces.Bandejas;

import net.serenitybdd.screenplay.targets.Target;

public class ReingresoGenericoDeTramitesPage {

    public static final Target TITULO_REINGRESO_GENERICO =
            Target.the("Título 'Reingreso Genérico Trámites'")
                    .locatedBy("//h4[text()='Reingreso Genérico Trámites']");
    public static final Target INP_NUMERO_RADICADO =
            Target.the("Campo de entrada para Número de Radicado")
                    .locatedBy("//*[@id='_numrad']");
    public static final Target INP_NUMERO_RECUPERACION =
            Target.the("Campo de entrada para Número de Recuperación")
                    .locatedBy("//*[@id='_numrec']");
    public static final Target BTN_CONTINUAR =
            Target.the("Botón Continuar")
                    .locatedBy("#submit");
    public static final Target INP_CARGA_ARCHIVO =
            Target.the("Input para Carga de Archivos")
                    .locatedBy("//*[@id='my-awesome-dropzone']/div/span");
    public static final Target INP_CARGA_ARCHIVO_REAL =
            Target.the("Input para Carga de Archivos (Real)")
                    .locatedBy("//*[@id='my-awesome-dropzone']//input[@type='file']");
    public static final Target BTN_CONTINUAR_PROCESO =
            Target.the("Botón Continuar del proceso final")
                    .locatedBy("//button[text()='Continuar' and contains(@class, 'btn-primary')]");

}
