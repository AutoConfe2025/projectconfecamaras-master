package com.co.confecamaras.userinterfaces.Bandejas.Administracion;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class AdminPage {

    public static final Target CAMPO_RECIBO = Target.the("Campo de entrada Recibo")
            .located(By.xpath("//*[@id='_recibo']"));
    public static final Target DROPDOWN_ID_MOTIVO = Target.the("Dropdown ID de Motivo")
            .located(By.id("_idmotivo"));

    public static final Target CAMPO_MOTIVO = Target.the("Campo de entrada Motivo / Descripcion")
            .located(By.xpath("//*[@id='_motivo']"));

    public static final Target ENLACE_RECUPERAR_RECIBO = Target.the("Enlace Recuperar Recibo por Onmouseover")
            .located(By.xpath("//*[@id='frameSecundarioCentral']//a[text()='Recuperar' and contains(@onmouseover, 'Recuperar recibo')]"));

    public static final Target CAMPO_OPERACION = Target.the("Campo de entrada Operación")
            .located(By.xpath("//*[@id='_operacion']"));
    public static final Target ENLACE_RECUPERACION_CENTRAL = Target.the("Enlace de Recuperacion dentro de frameSecundarioCentral")
            .located(By.xpath("//*[@id='frameSecundarioCentral']//a"));
//zonasy comunas
    public static final Target IMAGEN_ACCION_FILA_2 = Target.the("Imagen/Icono de Accion en Fila 2 de Gridbox")
            .located(By.xpath("//*[@id='gridbox']//tr[2]//img"));
    public static final Target BOTON_CERRAR_VENTANA = Target.the("Boton de cierre de ventana o modal")
            .located(By.xpath("//div[contains(@class, 'dhxwin_button_close')]"));
    public static final Target IMAGEN_ACCION_FILA_4 = Target.the("Imagen/Icono de Accion en Fila 4 de Gridbox")
            .located(By.xpath("//*[@id='gridbox']//tr[4]//img"));

    //TYC
    public static final Target ENLACE_EDITAR_TRANSACCION = Target.the("Enlace Editar Transaccion por data-original-title")
            .located(By.xpath("(//*[@id='tabletransacciones']//a[@data-original-title='Editar'])[1]"));
    public static final Target CAMPO_ENLACE = Target.the("Campo de entrada Enlace")
            .located(By.xpath("//*[@id='enlace']"));
    public static final Target BOTON_CONTINUAR_TRANSACCION = Target.the("Boton Continuar Transaccion")
            .located(By.xpath("//*[@id='formTransaccion']//button[text()='Continuar']"));
    public static final Target BOTON_OK_MODAL_PRINCIPAL = Target.the("Boton principal en modal OK")
            .located(By.xpath("//button[text()='OK' and contains(@class, 'btn-primary')]"));
    public static final Target PRIMER_ENLACE_BORRAR = Target.the("Primer Enlace Borrar Transaccion por data-original-title")
            .located(By.xpath("(//*[@id='tabletransacciones']//a[@data-original-title='Borrar'])[1]"));
    public static final Target BOTON_CANCELAR_MODAL = Target.the("Boton Cancelar en Modal o Seccion")
            .located(By.xpath("//*[@id='page-top']//button[text()='Cancelar']"));

}
