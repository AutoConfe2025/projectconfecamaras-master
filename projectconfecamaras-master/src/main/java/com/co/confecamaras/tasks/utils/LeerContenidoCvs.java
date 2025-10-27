package com.co.confecamaras.tasks.utils;

import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

public class LeerContenidoCvs implements Task {
    // RUTA DONDE SE ENCUENTRAN LOS ARCHIVOS DE EVIDENCIAS
    private final String ruta_archivos;
    private final int numero_linea;

    // VARIABLES PARA ABRIR EL DOCUMENTO EXCEL
    private FileReader fileReader;
    private BufferedReader bufferedReader;

    public LeerContenidoCvs(String ruta_archivos, int numero_linea) {
        this.ruta_archivos = ruta_archivos;
        this.numero_linea = numero_linea;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        File dir = new File(ruta_archivos);
        try {
            File[] archivos = dir.listFiles();
            for (File file : archivos) {
                Thread.sleep(1000);
                try {
                    if (file.getName().endsWith(".csv")) {
                        Reportes.reportEvent(Reportes.PASSED, "Leyendo archivo: " + file.getName());
                        // SE CREA EL ARCHIVO QUE VA A LEER
                        fileReader = new FileReader(file);
                        bufferedReader = new BufferedReader(fileReader);
                        String linea = null;
                        int contador = 1;
                        while ((linea = bufferedReader.readLine()) != null) {
                            if (contador == numero_linea) {
                                Reportes.reportEvent(Reportes.PASSED,"Linea: " + numero_linea + " informacion: " + linea);
                                break;
                            }
                            contador++;
                        }

                        if (linea == null){
                            Reportes.reportEvent(Reportes.FAILED,"No existe la linea: " + numero_linea);
                        }
                    }
                } catch (Exception e) {
                    actor.attemptsTo(LogEvent.recordevent(Reportes.WARNING, "No fue posible leer el archivo: " + file.getName()));
                }
            }
        } catch (Exception e) {
            actor.attemptsTo(LogEvent.recordevent(Reportes.WARNING, "No se encontraron archivos csv."));
        }
    }

    public static LeerContenidoCvs leerContenido(String ruta_archivo, int numero_linea) {
        return new LeerContenidoCvs(ruta_archivo, numero_linea);
    }
}
