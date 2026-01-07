package com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.AccionesPage;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class MaestroClavesPage {

    public static final Target BOTON_NUEVA_OPCION = Target.the("Boton Nueva Opción por Tooltip")
            .located(By.xpath("//*[@id='formGenerico']//button[@data-pr-tooltip='Nueva opción']"));

    public static final Target CAMPO_ID_OPCION = Target.the("Campo de entrada ID Opcion")
            .located(By.id("idopcion"));
    public static final Target CAMPO_NOMBRE_ = Target.the("Campo de entrada Nombre (XPath)")
            .located(By.xpath("//*[@id='nombre']"));
    public static final Target CAMPO_PATH_SCRIPT = Target.the("Elemento Path Script")
            .located(By.id("pathscript"));

    public static final Target CAMPO_SCRIPT = Target.the("Elemento Script")
            .located(By.id("script"));

    public static final Target SELECT_TIPO_OPCION =
            Target.the("Lista desplegable Tipo Opción")
                    .locatedBy("//*[@id='idtipoopcion']");

    public static final Target SWITCH_ESTADO = Target.the("Input dentro del Switch de Estado")
            .located(By.xpath("//*[@id='estado']/input"));
    public static final Target LABEL_CONSULTA = Target.the("Label de Consulta en Mayor Importancia")
            .located(By.xpath("//*[@id='mayorimportancia']//span[text()='Consulta']"));
    public static final Target SWITCH_MOSTRAR_ICONOS = Target.the("Input dentro del Switch Mostrar Menu Iconos")
            .located(By.xpath("//*[@id='mostrarmenuiconos']/input"));
    public static final Target SWITCH_TIPO_USUARIO = Target.the("Input dentro del Switch Tipo Usuario Registrado")
            .located(By.xpath("//*[@id='tipousuarioregistrado']/input"));
    public static final Target SWITCH_TIPO_ADMINISTRADOR = Target.the("Input dentro del Switch Tipo Usuario Administrador")
            .located(By.xpath("//*[@id='tipousuarioadministrador']/input"));
    public static final Target SWITCH_TIPO_VENTAS = Target.the("Input dentro del Switch Tipo Usuario Ventas")
            .located(By.xpath("//*[@id='tipousuarioventas']/input"));

    public static final Target SWITCH_TIPO_REGISTRO = Target.the("Input dentro del Switch Tipo Usuario Registro")
            .located(By.xpath("//*[@id='tipousuarioregistro']/input"));
    public static final Target CAMPO_TOOLTIP = Target.the("Campo de entrada Tooltip")
            .located(By.id("tooltip"));
    public static final Target CAMPO_ENLACE_GENERAL = Target.the("Elemento Enlace General")
            .located(By.id("enlace"));

    public static final Target CAMPO_PARAMETROS_PHP = Target.the("Campo de entrada Parametros PHP")
            .located(By.xpath("//*[@id='parametrosphp']"));


    public static final Target LABEL_NUEVA_PANTALLA = Target.the("Label de Nueva Pantalla")
            .located(By.xpath("//*[@id='destino']//span[text()='Nueva pantalla']"));
    public static final Target DROPDOWN_TIPO_EMPRESA = Target.the("Dropdown Tipo de Empresa")
            .located(By.id("Tipoempresa1"));

    public static final Target DROPDOWN_TIPO_EMPRESA_2 = Target.the("Dropdown Tipo de Empresa 2")
            .located(By.id("Tipoempresa2"));
    public static final Target DROPDOWN_TIPO_EMPRESA_3 = Target.the("Dropdown Tipo de Empresa 3")
            .located(By.id("Tipoempresa3"));

    public static final Target SWITCH_MOSTRAR_MENU_MOVIL = Target.the("Input dentro del Switch Mostrar Menu Movil")
            .located(By.xpath("//*[@id='mostrarmenumovil']/input"));
    public static final Target SWITCH_MOSTRAR_ICONOS_2 = Target.the("Input dentro del Switch Mostrar Menu Iconos 2")
            .located(By.xpath("//*[@id='mostrarmenuiconos2']/input"));

    public static final Target CAMPO_CLASE_PHP = Target.the("Campo de entrada Clase PHP")
            .located(By.xpath("//*[@id='clasephp']"));
    public static final Target SWITCH_SII2_MOSTRAR = Target.the("Input dentro del Switch SII2 Mostrar")
            .located(By.xpath("//*[@id='sii2_mostrar']/input"));
    public static final Target BOTON_GRABAR_OPCION = Target.the("Boton Grabar Opción")
            .located(By.xpath("//*[@id='formmanropciones']//button[text()='Grabar']"));

    public static final Target CELDA_RESULTADO_PRIMERA_FILA_COLUMNA_QA =
            Target.the("Celda de la primera fila y columna 2 (QA)")
                    // Empezamos desde la tabla, vamos al cuerpo, fila 1, columna 2
                    .locatedBy("//table[contains(@class, 'p-datatable-table')]/tbody/tr[1]/td[2]");
    public static final Target BOTON_ELIMINAR_OPCION = Target.the("Boton Eliminar Opcion por Tooltip")
            .located(By.xpath("//*[@id='formGenerico']//button[@data-pr-tooltip='Eliminar opción']"));

     public static final Target BOTON_SI_SWAL = Target.the("Boton SI en Modal de Confirmación")
            .located(By.xpath("//button[contains(@class, 'swal2-confirm') and text()='Sí']"));
    public static final Target BOTON_ACEPTAR_SWAL = Target.the("Boton Aceptar en Modal de Confirmación")
            .located(By.xpath("//button[contains(@class, 'swal2-confirm') and text()='Aceptar']"));
    public static final Target BOTON_INACTIVAR_OPCION = Target.the("Boton Inactivar Opcion por Tooltip (Primero)")
            .located(By.xpath("(//*[@id='formGenerico']//button[@data-pr-tooltip='Inactivar opción '])[1]"));
}
