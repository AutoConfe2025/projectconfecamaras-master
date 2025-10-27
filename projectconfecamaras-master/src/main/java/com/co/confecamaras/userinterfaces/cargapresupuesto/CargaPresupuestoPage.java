package com.co.confecamaras.userinterfaces.cargapresupuesto;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CargaPresupuestoPage {
   public static final Target IMPUT_ANIO = Target.the("Target para digitar el año el cual se desea consultar metas")
           .located(By.id("anio"));

   public static final Target BOTON_CONTINUAR = Target.the("Boton para abrir el formulario para ingrear la data necesaria")
           .locatedBy("//button[contains(text(),'Continuar')]");

   public static final Target BOTON_REGISTRAR = Target.the("Boton para guardar la información")
           .located(By.id("btnGuardar"));

   public static final Target BOTON_ACEPTAR = Target.the("Boton para continuar con la carga")
           .locatedBy("//button[@class='btn btn-success bootbox-accept' and text()='Si']");

   public static final Target TITULO_DATOS_GRABADOS = Target.the("Titulo de confirmacion de datos grabados exitosamente")
           .locatedBy("//h2[@class='swal2-title' and text()='Datos grabados correctamente!']");
}
