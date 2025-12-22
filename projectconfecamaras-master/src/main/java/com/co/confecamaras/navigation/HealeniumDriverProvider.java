package com.co.confecamaras.navigation;

import com.epam.healenium.SelfHealingDriver;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HealeniumDriverProvider implements DriverSource {

    @Override
    public WebDriver newDriver() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-gpu");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        WebDriver delegate = new ChromeDriver(options);

        // Carga del archivo healenium.properties
        Config config = ConfigFactory.load("healenium.properties");

        // Crear Self Healing Driver
        return SelfHealingDriver.create(delegate, config);
    }

    @Override
    public boolean takesScreenshots() {
        return true; // importante para que Serenity capture
    }
}