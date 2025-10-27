package com.co.confecamaras.tasks.utils;

import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class LeerContenidoExcel implements Task {
    // RUTA DONDE SE ENCUENTRAN LOS ARCHIVOS DE EVIDENCIAS
    private final String ruta_archivos;

    // VARIABLES PARA ABRIR EL DOCUMENTO EXCEL
    private FileInputStream fileInputStream;
    private XSSFWorkbook xssfWorkbook;
    private XSSFSheet xssfSheet;
    private int CANTIDAD_FILAS = 0;

    public LeerContenidoExcel(String ruta_archivos) {
        this.ruta_archivos = ruta_archivos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        File dir = new File(ruta_archivos);
        try {
            File[] archivos = dir.listFiles();
            for (File file : archivos) {
                Thread.sleep(1000);
                try {
                    if (file.getName().endsWith(".xlsx")) {
                        // SE CREA EL ARCHIVO QUE VA A LEER
                        fileInputStream = new FileInputStream(file);

                        // SE CREA UN NUEVO LIBRO REFERENCIANDO EL QUE ESTAMOS OBTENIENDO
                        xssfWorkbook = new XSSFWorkbook(fileInputStream);

                        // SE OBTIENE LA PRIMERA HOJA DEL LIBRO
                        xssfSheet = xssfWorkbook.getSheetAt(0);

                        // INTERACTUARA POR CADA FILA, UNA POR UNA
                        for (Row row : xssfSheet) {
                            boolean hasData = false;
                            for (Cell cell : row) {
                                if (cell.getCellType() != CellType.BLANK) {
                                    hasData = true;
                                    break;
                                }
                            }
                            if (hasData) {
                                CANTIDAD_FILAS++;
                            }
                        }
                        if (CANTIDAD_FILAS > 0)
                            Reportes.reportEvent(Reportes.INFO, "El archivo " + file.getName() + " se encuentra con información. Total de filas con datos: " + CANTIDAD_FILAS);
                        else
                            Reportes.reportEvent(Reportes.WARNING, "El archivo " + file.getName() + " no contiene información.");
                    }
                } catch (Exception e) {
                    actor.attemptsTo(LogEvent.recordevent(Reportes.WARNING, "No fue posible leer el archivo: " + file.getName()));

                }
            }
        } catch (Exception e) {
            actor.attemptsTo(LogEvent.recordevent(Reportes.WARNING, "No se encontro libros excel."));
        }
    }

    public static LeerContenidoExcel leerLibros(String ruta_archivos) {
        return new LeerContenidoExcel(ruta_archivos);
    }
}
