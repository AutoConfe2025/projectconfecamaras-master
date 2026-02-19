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

        if ("true".equalsIgnoreCase(System.getenv("CI"))) {
            options.addArguments("--headless=new");
        }

        options.addArguments("--start-maximized");
        options.addArguments("--disable-gpu");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        WebDriver baseDriver = new ChromeDriver(options);

        boolean healeniumEnabled = Boolean.parseBoolean(
                System.getenv().getOrDefault("HEALENIUM_ENABLED", "true")
        );

        if (!healeniumEnabled) {
            return baseDriver;
        }

        Config config = ConfigFactory.load("healenium.properties");
        return SelfHealingDriver.create(baseDriver, config);
    }

    @Override
    public boolean takesScreenshots() {
        return true;
    }
}
