package com.co.confecamaras.interactions;

import com.co.confecamaras.utils.bandejas.estudio_general.FileDownloadValidator;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

import java.io.File;
import java.nio.file.Paths;
import java.util.Optional;

@Slf4j
@AllArgsConstructor
public class ValidarDescargaDeArchivo implements Interaction {

    private final String tipoValidacion;
    private final String textoEsperado;

    @Override
    public <T extends Actor> void performAs(T actor) {

        String rutaDescarga = Paths.get(System.getProperty("user.home"), "Downloads").toString();
        log.info("📁 Ruta de descarga detectada: {}", rutaDescarga);

        FileDownloadValidator validador = new FileDownloadValidator(rutaDescarga);

        boolean descargado = validador.waitForNewFile(".pdf", 10000);
        if (!descargado) {
            throw new AssertionError("❌ No se detectó ningún nuevo archivo PDF descargado en: " + rutaDescarga);
        }

        Optional<File> ultimoPDF = validador.getLastDownloadedFile(".pdf");
        if (ultimoPDF.isEmpty()) {
            throw new AssertionError("❌ No se encontró ningún archivo PDF en la carpeta: " + rutaDescarga);
        }

        File pdf = ultimoPDF.get();
        Serenity.setSessionVariable("nombre_pdf_descargado").to(pdf.getName());
        log.info("✅ Archivo PDF descargado correctamente: {}", pdf.getName());

        // En este caso no se valida contenido, pero se puede dejar el hook para el futuro
        if ("contenido".equalsIgnoreCase(tipoValidacion) && textoEsperado != null && !textoEsperado.isEmpty()) {
            log.info("ℹ️ Validación de contenido omitida (por ahora). Texto esperado: {}", textoEsperado);
        }
    }

    public static ValidarDescargaDeArchivo conParametros(String tipoValidacion, String textoEsperado) {
        return Tasks.instrumented(ValidarDescargaDeArchivo.class, tipoValidacion, textoEsperado);
    }
}
