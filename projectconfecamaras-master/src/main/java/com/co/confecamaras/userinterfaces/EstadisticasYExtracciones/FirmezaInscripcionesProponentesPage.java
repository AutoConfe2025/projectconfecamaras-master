package com.co.confecamaras.userinterfaces.EstadisticasYExtracciones;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FirmezaInscripcionesProponentesPage {
    public static final Target LINK_VERIFICAR_INSCRIPCIONES = Target.the("Enlace Verificar inscripciones a pasar a en firme")
            .located(By.xpath("//div[@id='frameSecundarioCentral']//a[contains(@onmouseover, 'Verifica inscripciones')]"));
    public static final Target ICONO_VER_XML = Target.the("Icono Ver XML")
            .located(By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[2]/td[10]/a"));

    public static final Target BOTON_CERRAR_MODAL = Target.the("Botón Cerrar ventana modal")
            .located(By.xpath("//div[@id='GB_window']//span[contains(text(), 'Cerrar')]"));

    public static final Target ICONO_PONER_EN_FIRME = Target.the("Icono Poner en firme")
            .located(By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[2]/td[11]/a/img"));
    public static final Target INPUT_ANO_INICIAL = Target.the("Campo Año Inicial")
            .located(By.id("_fecini"));
    public static final Target INPUT_ANO_FINAL = Target.the("Campo Año Final")
                .located(By.id("_fecfin"));
    public static final Target INPUT_NUMERO_ENVIO = Target.the("Campo Numero de envio")
            .located(By.id("_numenvio"));
    public static final Target SELECT_AMBIENTE = Target.the("Selector de Ambiente")
            .located(By.id("_ambiente"));
    public static final Target INPUT_TIPO = Target.the("Campo de Tipo")
            .located(By.id("_tipo"));

    public static final Target INPUT_CORREO = Target.the("Campo de Correo")
            .located(By.id("_emailusuariosistema"));

    public static Target BTN_GENERAR = Target.the("Boton pára generar datos")
            .located(By.xpath("//button[text()='Generar']"));
    public static final Target BOTON_GENERAR_SEGUNDO = Target.the("Segundo botón Generar")
            .located(By.xpath("(//button[text()='Generar'])[2]"));
    public static final Target BOTON_EXTRAER = Target.the("Botón Extraer")
            .located(By.xpath("//button[contains(text(), 'Extraer')]"));
    public static final Target BOTON_EXPORTAR = Target.the("Botón Extraer")
            .located(By.xpath("//button[contains(text(), 'Exportar')]"));
    public static final Target BOTON_EJECUTAR = Target.the("Botón Ejecutar")
            .located(By.xpath("//button[contains(text(), 'Ejecutar')]"));

    public static Target BTN_ACEPTAR_GENERAR = Target.the("Boton pára aceptar generar")
            .located(By.xpath("(//button[text()='Generar'])"));



}
