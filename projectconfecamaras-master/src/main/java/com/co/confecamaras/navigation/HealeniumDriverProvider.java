package com.co.confecamaras.navigation;

import com.epam.healenium.SelfHealingDriver;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class HealeniumDriverProvider implements DriverSource {

    @Override
    public WebDriver newDriver() {

        ChromeOptions options = new ChromeOptions();

        // ==========================
        // PERMISOS DE NAVEGADOR
        // ==========================
        Map<String, Object> prefs = new HashMap<>();

        // Permitir cámara
        prefs.put("profile.default_content_setting_values.media_stream_camera", 1);

        // Permitir micrófono
        prefs.put("profile.default_content_setting_values.media_stream_mic", 1);

        // Permitir notificaciones
        prefs.put("profile.default_content_setting_values.notifications", 1);

        options.setExperimentalOption("prefs", prefs);

        // ==========================
        // MEDIA DEVICES
        // ==========================

        // Acepta automáticamente los permisos de cámara/micrófono
        options.addArguments("--use-fake-ui-for-media-stream");

        // Descomenta esta línea solamente si ejecutas en una máquina
        // sin cámara física o en CI/CD.
        // options.addArguments("--use-fake-device-for-media-stream");

        // ==========================
        // CONFIGURACIÓN GENERAL
        // ==========================

        options.addArguments("--start-maximized");
        options.addArguments("--disable-gpu");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-extensions");
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-notifications");

        // Mejora estabilidad
        options.addArguments("--remote-allow-origins=*");

        // ==========================
        // CREACIÓN DRIVER
        // ==========================

        WebDriver baseDriver = new ChromeDriver(options);

        Config config = ConfigFactory.load("healenium.properties");

        return SelfHealingDriver.create(baseDriver, config);
    }

    @Override
    public boolean takesScreenshots() {
        return true;
    }
}