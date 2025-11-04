package com.co.confecamaras.questions.liquidacion_renovacion;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TablaDataQuestion<T extends ModeloTabla> implements Question<List<T>> {

    private final Target tablaFilas;
    private final Class<T> tipoModelo;

    public TablaDataQuestion(Target tablaFilas, Class<T> tipoModelo) {
        this.tablaFilas = tablaFilas;
        this.tipoModelo = tipoModelo;
    }

    @Override
    public List<T> answeredBy(Actor actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();

        By locator = obtenerByDesdeTarget(tablaFilas);

        List<WebElement> filas = driver.findElements(locator);

        List<T> modelos = new ArrayList<>();

        for (WebElement fila : filas) {
            List<String> columnas = fila.findElements(By.xpath(".//td | .//th"))
                    .stream()
                    .map(WebElement::getText)
                    .map(String::trim)
                    .collect(Collectors.toList());

            try {
                Constructor<T> constructor = tipoModelo.getDeclaredConstructor();
                constructor.setAccessible(true);
                T modelo = constructor.newInstance();

                var campos = tipoModelo.getDeclaredFields();
                for (int i = 0; i < Math.min(columnas.size(), campos.length); i++) {
                    campos[i].setAccessible(true);
                    campos[i].set(modelo, columnas.get(i));
                }

                modelos.add(modelo);

            } catch (Exception e) {
                throw new RuntimeException("❌ Error al mapear fila a modelo: " + e.getMessage(), e);
            }
        }

        Serenity.recordReportData()
                .withTitle("📋 Tabla capturada: " + tipoModelo.getSimpleName())
                .andContents(formatearTabla(modelos));

        return modelos;
    }

    private By obtenerByDesdeTarget(Target target) {
        try {
            Method m = Target.class.getMethod("getLocator");
            Object byObj = m.invoke(target);
            if (byObj instanceof By) {
                return (By) byObj;
            }
        } catch (NoSuchMethodException ignored) {
        } catch (Exception e) {
        }

        try {
            Method m2 = Target.class.getMethod("getCssOrXPathSelector");
            Object selectorObj = m2.invoke(target);
            if (selectorObj instanceof String) {
                String selector = ((String) selectorObj).trim();
                if (selector.startsWith("//") || selector.startsWith("(") || selector.startsWith("./") ) {
                    return By.xpath(selector);
                } else {
                    return By.cssSelector(selector);
                }
            }
        } catch (NoSuchMethodException ignored) {
        } catch (Exception e) {
        }

        try {

            for (Method method : Target.class.getMethods()) {
                if ((method.getReturnType() == By.class) && method.getParameterCount() == 0) {
                    Object byObj = method.invoke(target);
                    if (byObj instanceof By) {
                        return (By) byObj;
                    }
                }
            }
        } catch (Exception e) {
            // ignore
        }

        throw new RuntimeException("No fue posible obtener un By desde Target. " +
                "Verifica la versión de Serenity o proporciona el By directamente. Target: " + target);
    }

    private String formatearTabla(List<T> modelos) {
        if (modelos.isEmpty()) return "⚠️ Sin datos encontrados.";

        StringBuilder sb = new StringBuilder("| ");
        String[] columnas = modelos.get(0).obtenerColumnas();
        for (String col : columnas) sb.append(col).append(" | ");
        sb.append("\n");

        for (T m : modelos) {
            sb.append("| ");
            for (String valor : m.obtenerColumnas()) {
                sb.append(valor != null ? valor : "").append(" | ");
            }
            sb.append("\n");
        }

        return sb.toString();
    }

    public static <T extends ModeloTabla> TablaDataQuestion<T> from(Target tabla, Class<T> tipoModelo) {
        return new TablaDataQuestion<>(tabla, tipoModelo);
    }
}
