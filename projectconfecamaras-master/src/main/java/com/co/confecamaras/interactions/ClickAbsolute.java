package com.co.confecamaras.interactions;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static net.serenitybdd.core.Serenity.getDriver;

public class ClickAbsolute implements Interaction {

    private final int x;
    private final int y;

    public ClickAbsolute(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        WebDriver driver = getDriver();

        WebElement body = driver.findElement(By.tagName("body"));
        new Actions(driver)
                .moveToElement(body, 0, 0)
                .perform();

        new Actions(driver)
                .moveByOffset(x, y)
                .click()
                .perform();
    }

    public static ClickAbsolute at(int x, int y) {
        return new ClickAbsolute(x, y);
    }
}