package com.co.confecamaras.userinterfaces.Bandejas.Jsp7;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class GeneralPage {

    public static final Target TEXTO_BODY = Target.the("Todo el texto directo del body")
            .located(By.xpath("/html/body[contains(., 'Error, no se encontraron los parametros de conexion')]"));

    public static final Target CARGA_ACTIVOS = Target.the("Enlace de acción Ver Detalle")
            .located(By.xpath("//*[@id='frameSecundarioCentral']//a[text()='Cargar activos']"));

    public static final Target TEXTO_MIGRACION = Target.the("Todo el texto directo del body")
            .located(By.xpath("/html/body[contains(., 'Error en activo : (25) (000001) - : QA : Centro de costos del activo no es de detalle en JSP7.')]"));
    public static final Target CAMPO_FECHA_INICIO = Target.the("Campo de entrada Fecha Inicio")
            .located(By.xpath("//*[@id='_fecini']"));
    public static final Target CAMPO_FECHA_FIN = Target.the("Campo de entrada Fecha Fin")
            .located(By.xpath("//*[@id='_fecfin']"));
    public static final Target CAMPO_TIPO_INFORME = Target.the("Campo de tipo de informe")
            .located(By.xpath("//*[@id='_tipoinforme']"));
    public static final Target CAMPO_ANO_REVISAR = Target.the("Campo de Ano")
            .located(By.xpath("//*[@id='ano']"));
    public static final Target ENLACE_GENERAR = Target.the("Enlace Generar ")
            .located(By.xpath("//*[@id='frameSecundarioCentral']//a[contains(@onmouseover, 'Generar')]"));
    public static final Target BOTON_EJECUTAR = Target.the("Botón Ejecutar")
            .located(By.xpath("//button[contains(text(), 'Ejecutar')]"));
    public static final Target BOTON_CONSTRUIR = Target.the("Botón Construir")
            .located(By.xpath("//button[contains(text(), 'Construir')]"));
    public static final Target BOTON_DESCARGAR_EXCEL = Target.the("Botón Descargar excel")
            .located(By.xpath("//div[@id='frameSecundarioCentral']//a[contains(text(), 'Descargar excel')]"));
    public static final Target BOTON_DESCARGAR= Target.the("Botón Descargar excel")
            .located(By.xpath("//div[@id='frameSecundarioCentral']//a[contains(text(), 'Descargar')]"));
    public static final Target LINK_DESCARGAR_EXTRACCION = Target.the("Enlace Descargar extracción")
            .located(By.xpath("//form[@id='formMensajes']//a[contains(text(), 'Descargar extracción')]"));
    public static final Target ENLACE_EXTRAER = Target.the("Enlace Extraer")
            .located(By.xpath("//*[@id='frameSecundarioCentral']//a[contains(@onmouseover, 'Extraer')]"));
    public static final Target ENLACE_RELACION_MOVIMIENTOS = Target.the("Enlace Relacion de movimientos RUES")
            .located(By.xpath("//*[@id='frameSecundarioCentral']//a[text()='Relación de movimientos RUES (Cuenta - Nit) - Receptora']"));
    public static final Target SEGUNDO_ENLACE_CENTRAL = Target.the("Segundo Enlace en la sección principal")
            .located(By.xpath("(//*[@id='frameSecundarioCentral']//a)[2]"));
    public static final Target ENLACE_GRABAR = Target.the("Enlace Grabar en el frame Secundario Central")
            .located(By.xpath("//*[@id='frameSecundarioCentral']//a[text()='Grabar']"));
    public static final Target ENLACE_RELACION_MOVIMIENTOS_CUENTA = Target.the("Enlace Relacion de movimientos por cuenta")
            .located(By.xpath("//*[@id='frameSecundarioCentral']//a[text()='Relación de movimientos por cuenta']"));
    public static final Target CAMPO_SALIDA_RUES = Target.the("Campo de entrada de salida Rues")
            .located(By.xpath("//*[@id='_salida']"));
    public static final Target BOTON_CARGAR_ARCHIVO = Target.the("Botón cargar archivo")
            .located(By.xpath("//form[@id='formMregRevisarSincronizacionRues']//input[contains(@onmouseover, 'cargar archivo')]"));
}