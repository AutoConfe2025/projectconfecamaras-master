package com.co.confecamaras.utils;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;

public class LectorPDFLocal {

    private static final Logger logger = LoggerFactory.getLogger(LectorPDFLocal.class);

    /**
     * Lee y extrae todo el texto de un archivo PDF local usando Apache PDFBox.
     * @param rutaArchivoPDF La ruta completa del archivo PDF local.
     * @return El contenido de texto completo del PDF.
     */
    public static String leerContenido(String rutaArchivoPDF) {
        File file = new File(rutaArchivoPDF);
        if (!file.exists()) {
            throw new RuntimeException("El archivo PDF no fue encontrado en la ruta: " + rutaArchivoPDF);
        }

        try (PDDocument document = PDDocument.load(file)) {
            PDFTextStripper pdfStripper = new PDFTextStripper();
            return pdfStripper.getText(document);
        } catch (IOException e) {
            logger.error("Error al leer el contenido del PDF local: {}", rutaArchivoPDF, e);
            throw new RuntimeException("Fallo al procesar el PDF local: " + e.getMessage());
        }
    }
}