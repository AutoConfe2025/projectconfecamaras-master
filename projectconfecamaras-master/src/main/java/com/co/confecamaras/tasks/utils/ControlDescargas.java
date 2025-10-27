package com.co.confecamaras.tasks.utils;

import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.annotations.Subject;
import org.junit.Assert;

import java.io.File;

@Subject("Controlar que finalice la descarga de archivos")
public class ControlDescargas implements Task {

    private final String RUTA_DESCARGA;

    public ControlDescargas(String RUTA_DESCARGA) {
        this.RUTA_DESCARGA = RUTA_DESCARGA;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        File dir = new File(RUTA_DESCARGA);
        File[] descargas;

        //CONTADOR DE INTENTOS
        int intentos = 0;
        final int MAXIMOS_INTENTOS = 60;
        boolean descargado = true;

        while (descargado && intentos < MAXIMOS_INTENTOS) {
            descargas = dir.listFiles();
            descargado = false; // NO HAY DESCARGAS ACTIVAS

            // VERIFICAMOS LOS ARCHIVOS EN LA CARPETA DE DESCARGA
            if (descargas != null && descargas.length > 0) {
                // VERIFICA SI EL ARCHIVO SE ESTA DESCARGANDO (SI TERMINA EN .crdownload)
                for (File file : descargas) {
                    if (file.getName().endsWith(".crdownload")) {
                        descargado = true; // AUN HAY DESCARGAS ACTIVAS
                        break; // SALIR DEL BUCLE PARA ESPERAR ANTES DE VERIFICAR NUEVAMENTE
                    }
                }
            }

            if (descargado) {
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    actor.attemptsTo(LogEvent.recordevent(Reportes.FAILED, e.getMessage()));
                    e.printStackTrace();
                }
            }

            intentos++;
        }

        if (intentos >= MAXIMOS_INTENTOS) {
            actor.attemptsTo(LogEvent.recordevent(Reportes.FAILED, "*** TimeOut para finalizar la descarga."));
            Assert.fail();
        } else
            actor.attemptsTo((LogEvent.recordevent(Reportes.PASSED, "*** Descarga Finalizada, segun lo esperado.")));
    }

    public static ControlDescargas hastaTerminar(String ruta_descarga) {
        return new ControlDescargas(ruta_descarga);
    }
}
