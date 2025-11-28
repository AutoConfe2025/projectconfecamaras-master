package com.co.confecamaras.tasks.gestion_archivos;

import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.annotations.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import java.io.File;

public class CargarArchivoSoloJSTask implements Task { // Nuevo nombre para evitar conflictos

    private final String rutaArchivo;
    private final Target inputCarga;

    public CargarArchivoSoloJSTask(Target inputCarga, String rutaArchivo) {
        this.inputCarga = inputCarga;
        this.rutaArchivo = rutaArchivo;
    }

    @Override
    @Step("{0} carga el archivo ubicado en: #rutaArchivo (Usando inyección JavaScript)")
    public <T extends Actor> void performAs(T actor) {

        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // 1. Convertir la ruta relativa a la ruta absoluta del sistema (CRÍTICO para SendKeys)
        String rutaAbsoluta = new File(rutaArchivo).getAbsolutePath();

        // 2. Ejecutar un solo script para forzar la visibilidad y enviar el valor del archivo
        String script =
                "arguments[0].style.display='block'; " + // Forzar visibilidad
                        "arguments[0].style.visibility='visible'; " +
                        "arguments[0].removeAttribute('hidden'); " +
                        "arguments[0].value = arguments[1];"; // Inyectar la ruta absoluta

        try {
            // Buscamos el WebElement usando el Target y ejecutamos el script
            js.executeScript(script,
                    inputCarga.resolveFor(actor).getWrappedElement(),
                    rutaAbsoluta);

            LogEvent.recordevent(Reportes.PASSED, "Archivo inyectado vía JavaScript: " + rutaAbsoluta);

            // Opcional: Ocultar de nuevo (si es necesario)
            js.executeScript("arguments[0].style.display='none';",
                    inputCarga.resolveFor(actor).getWrappedElement());

        } catch (Exception e) {
            Reportes.reportEvent(Reportes.FAILED, "FALLO la carga del archivo por JavaScript. Causa: " + e.getMessage());
            throw new RuntimeException("Error en la carga JS del archivo", e);
        }
    }

    public static CargarArchivoSoloJSTask enElInput(Target inputCarga, String rutaArchivo) {
        return new CargarArchivoSoloJSTask(inputCarga, rutaArchivo);
    }
}