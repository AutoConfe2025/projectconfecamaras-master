package com.co.confecamaras.userinterfaces.Bandejas.estudio_general;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Pagina_Princial {

    public static final Target BOTON_CONTROL = Target.the("boton control de busqueda")
            .located(By.xpath("//button[@class='btn_busqueda_header']"));
    public static final Target CAMPO_INGRESO_BUSQUEDA_CONTROL = Target.the("campo de ingreso de busqueda")
            .located(By.xpath("//input[@class='w-100 p-inputtext p-component']"));

    public static final Target OPCION_ESTUDIO_GENERAL = Target.the("opcion de estudio general bandejas")
            .located(By.xpath("//span[@class='opcion']"));

    public static final Target BOTON_REFRESCAR = Target.the("boton refrescar")
            .located(By.xpath("//a[contains(@href, 'recargarcodigosbarras')]"));

    public static final Target CAMPO_BUSQUEDA = Target.the("boton refrescar")
            .located(By.xpath("//input[@type='search']"));

    public static final Target BOTON_VER_RUTA = Target.the("Boton opcion ver ruta")
            .located(By.xpath("//a[@data-original-title='Ver ruta']"));

    public static final Target BOTON_VER_PDF = Target.the("Boton opcion ver pdf")
            .located(By.xpath("(//p[@class='text-dark text-left']//a[text()='Ver'])[1]"));

    public static final Target BOTON_COMENTARIOS = Target.the("Boton para ver los comentarios")
            .located(By.xpath("//a[@data-original-title='Ver comentarios']"));

    public static final Target TARJETA_COMENTARIOS = Target.the("Tarjeta de comentarios")
            .located(By.xpath("(//div[@class='card-body'])[2]"));

    public static final Target BOTON_AGREGAR_COMENTARIOS = Target.the("Boton agregar comentarios")
            .located(By.xpath("//a[@data-original-title='Adicionar comentarios']"));

    public static final Target LISTA_TIPO = Target.the("lista tipo")
            .located(By.xpath("//select[@id='_tipo']"));

    public static final Target SELECCION_OPCION_PRUEBAS = Target.the("opcion pruebas")
            .located(By.xpath("//option[contains(@value, '100')]"));

    public static final Target CUADRO_AGREGAR_COMENTARIO = Target.the("cuadro para agregar comentario")
            .located(By.xpath("//textarea[@id= '_comentario']"));

    public static final Target BOTON_GRABAR = Target.the("boton grabar")
            .located(By.xpath(" //button[@id= 'submit']"));

    public static final Target MENSAJE_GRABACION_COMENTARIO = Target.the("mensaje de grabacion de comentario")
            .located(By.xpath("(//p[@class='text-dark text-center'])[2]"));

    public static final Target BOTON_ESTUDIO = Target.the("boton estudio")
            .located(By.xpath("//a[@data-original-title='Estudiar']"));

    public static final Target OPCION_TERMINAR_INSCRIPCION = Target.the("terminar inscripcion")
            .located(By.xpath("//a[contains(normalize-space(.), 'Terminar inscripción')]"));

    public static final Target BOTON_CONFIRMAR_ = Target.the("Boton confirmar terminar inscripcion")
            .located(By.xpath("//button[@class='btn btn-success']"));

    public static final Target MENSAJE_INSCRIPCION_TERMINADA = Target.the("mensaje de inscripcion finalizada")
            .located(By.xpath("//div[@id='modal_body']"));

    public static final Target BOTON_CERRAR_MENSAJE = Target.the("mensaje de inscripcion finalizada")
            .located(By.xpath("(//button[@class='btn btn-danger'])[1]"));

    public static final Target OPCION_REGRESAR_BANDEJA = Target.the("terminar inscripcion")
            .located(By.xpath("//a[contains(normalize-space(.), 'Regresar a bandeja')]"));

    public static final Target BOTON_DEVOLVER_REQUERIR = Target.the("boton devolver requerir")
            .located(By.xpath("//a[@data-original-title='Devolver/Requerir']"));

    public static final Target MENSAJE_ESTADO_NO_PERMITE = Target.the("mensaje de inscripcion finalizada")
            .located(By.xpath("//div[@class='bootbox-body']"));

    public static final Target BOTON_OK_MENSAJE = Target.the("mensaje de inscripcion finalizada")
            .located(By.xpath("//button[@class='btn btn-primary']"));

    public static final Target BOTON_FINALIZAR_PROCESO = Target.the("boton devolver requerir")
            .located(By.xpath("//a[@data-original-title='Finalizar estudio']"));

    public static final Target MENSAJE_FINALIZACION_ESTUDIO = Target.the("mensaje de inscripcion finalizada")
            .located(By.xpath("(//p[@class='text-dark text-center'])[2]"));

    public static final Target BOTON_ARCHIVAR_TRAMITE = Target.the("mensaje de inscripcion finalizada")
            .located(By.xpath("//a[@data-original-title='Archivar trámite']"));

    public static final Target MENSAJE_ADVERTENCIA_ARCHIVAR_PROCESO = Target.the("mensaje advertrncia archivar")
            .located(By.xpath("//div[@class='bootbox-body']"));

    public static final Target MENSAJE_ARCHIVAR_PROCESO_FINALIZADO = Target.the("mensaje archivar exitoso")
            .located(By.xpath("(//p[@class='text-dark text-center'])[2]"));
}
