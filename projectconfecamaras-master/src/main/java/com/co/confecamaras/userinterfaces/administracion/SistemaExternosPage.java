package com.co.confecamaras.userinterfaces.administracion;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SistemaExternosPage {

    public static final Target SISTEMA_EXTERNO = Target.the("boton para ingresar a la opcion sistema externos")
            .located(By.xpath("/html/body/div[1]/main/div[1]/span/ul/li[1]/a"));

    public static final Target BTN_NUEVO_REGISTRO = Target.the("Boton para ingresar un nuevo sistema")
            .located(By.xpath("//button[text()='Nuevo registro']"));

    public static final Target TXT_SISTEMA_DESTINO = Target.the("Input para agregar un nuevo destino")
            .located(By.id("_sistemadestino"));

    public static final Target SELECT_TIPO_REPORTE = Target.the("Menu desokegable para seleccionar el tipo de reporte")
            .located(By.id("_tiporeporte")); //VALUE 1

    public static final Target TABLA_SISTEMAS= Target.the("Tabla que muestra los sistemas existentes")
            .located(By.id("tableTables"));
    public static final Target FECHA_INI = Target.the("Input para ingresar fecha")
            .located(By.id("_fechainicial"));
    public static final Target SELECT_MUNICIPIO = Target.the("Menu desplegable para seleccionar municipio")
            .located(By.id("_municipio")); //value 17001
    public static final Target TXT_EMAIL = Target.the("Input para ingresar email")
            .located(By.id("_emailcontrol"));
    public static final Target BTN_GUARDAR_SISTEMA = Target.the("Boton para guardar la informacion")
            .located(By.xpath("//button[text()='Grabar']"));
    public static final Target BTN_ELIMINAR_SISTEMA = Target.the("Boton para eliminar el sistema")
            .located(By.xpath("(//a[@data-original-title='Borrar tabla del índice'])[4]"));
    public static final Target BTN_CONFIRMAR_ELIMINAR = Target.the("Boton para eliminar el sistema")
            .located(By.xpath("//button[text()='Borrar']"));
}
