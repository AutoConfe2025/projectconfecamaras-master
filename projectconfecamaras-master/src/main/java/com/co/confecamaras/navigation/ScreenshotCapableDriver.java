package com.co.confecamaras.navigation;

import org.openqa.selenium.*;
import java.util.Set;

public class ScreenshotCapableDriver implements WebDriver, TakesScreenshot {

    private final WebDriver driver;

    public ScreenshotCapableDriver(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public <X> X getScreenshotAs(OutputType<X> target) throws WebDriverException {
        return ((TakesScreenshot) driver).getScreenshotAs(target);
    }

    // Delegación de métodos
    public void get(String url) { driver.get(url); }
    public String getCurrentUrl() { return driver.getCurrentUrl(); }
    public String getTitle() { return driver.getTitle(); }
    public java.util.List<WebElement> findElements(By by) { return driver.findElements(by); }
    public WebElement findElement(By by) { return driver.findElement(by); }
    public String getPageSource() { return driver.getPageSource(); }
    public void close() { driver.close(); }
    public void quit() { driver.quit(); }
    public Set<String> getWindowHandles() { return driver.getWindowHandles(); }
    public String getWindowHandle() { return driver.getWindowHandle(); }
    public TargetLocator switchTo() { return driver.switchTo(); }
    public Navigation navigate() { return driver.navigate(); }
    public Options manage() { return driver.manage(); }
}