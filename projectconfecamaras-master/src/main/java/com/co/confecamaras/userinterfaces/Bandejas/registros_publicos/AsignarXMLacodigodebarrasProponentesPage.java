package com.co.confecamaras.userinterfaces.Bandejas.registros_publicos;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class AsignarXMLacodigodebarrasProponentesPage {

    public static final Target CAMPO_NUMERO_RECUPERACION = Target.the("Campo Número de Recuperación")
            .located(By.id("_numerorecuperacion"));
    public static final Target CAMPO_CODIGO_BARRAS = Target.the("Campo Código de Barras")
            .located(By.id("_codigobarras"));
    public static final Target BOTON_CONTINUAR_ASIGNAR = Target.the("Botón Continuar (Asignar XML)")
            .located(By.xpath("//*[@id='formMregAsignarXmlRadicacion']/table[3]/tbody/tr/td/input"));
    public static final Target SEGUNDO_BOTON_CONTINUAR = Target.the("Segundo botón Continuar (Imagen)")
            .located(By.xpath("//*[@id='frameSecundarioCentral']/div/center[4]/table/tbody/tr/td[1]/a/img"));
}
