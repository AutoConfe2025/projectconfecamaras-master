package com.co.confecamaras.utils.bandejas.estudio_genera;

import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.nio.file.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

@Slf4j
public class FileDownloadValidator {

    private final Path downloadPath;

    public FileDownloadValidator(String downloadDirectory) {
        this.downloadPath = Paths.get(downloadDirectory);
        if (!Files.exists(this.downloadPath)) {
            try {
                Files.createDirectories(this.downloadPath);
                log.warn("📁 La carpeta de descargas no existía. Se creó en: {}", downloadPath);
            } catch (Exception e) {
                throw new RuntimeException("❌ No fue posible crear la carpeta de descargas: " + downloadDirectory, e);
            }
        }
    }

    public Optional<File> getLastDownloadedFile(String extension) {
        File folder = downloadPath.toFile();

        File[] archivos = folder.listFiles((dir, name) -> name.toLowerCase().endsWith(extension.toLowerCase()));
        if (archivos == null || archivos.length == 0) {
            return Optional.empty();
        }

        return Arrays.stream(archivos)
                .max(Comparator.comparingLong(File::lastModified));
    }

    public boolean waitForNewFile(String extension, long timeoutMillis) {
        long endTime = System.currentTimeMillis() + timeoutMillis;

        log.info("⏳ Esperando la descarga de un nuevo archivo {} en: {}", extension, downloadPath);

        while (System.currentTimeMillis() < endTime) {
            Optional<File> lastFile = getLastDownloadedFile(extension);

            if (lastFile.isPresent()) {
                File archivo = lastFile.get();
                long diff = System.currentTimeMillis() - archivo.lastModified();

                if (diff < 3000) { // archivo modificado hace menos de 3s
                    log.info("✅ Nuevo archivo detectado: {} (hace {} ms)", archivo.getName(), diff);
                    return true;
                }
            }

            try {
                Thread.sleep(500); // espera corta entre cada intento
            } catch (InterruptedException ignored) {}
        }

        log.error("❌ No se detectó ningún archivo nuevo con extensión {} dentro del tiempo de espera.", extension);
        return false;
    }

    public void limpiarCarpetaDescargas() {
        try {
            Files.list(downloadPath)
                    .filter(Files::isRegularFile)
                    .forEach(f -> {
                        try {
                            Files.delete(f);
                            log.info("🧹 Archivo eliminado: {}", f.getFileName());
                        } catch (Exception e) {
                            log.warn("⚠️ No se pudo eliminar el archivo: {}", f.getFileName());
                        }
                    });
        } catch (Exception e) {
            log.error("⚠️ Error al limpiar la carpeta de descargas: {}", e.getMessage());
        }
    }
}
