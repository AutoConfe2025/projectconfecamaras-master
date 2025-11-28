package com.co.confecamaras.tasks.utils;

import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.annotations.Step;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;


import static com.co.confecamaras.userinterfaces.Bandejas.CalendarioPage.*;
public class SeleccionarFechaCalendario implements Task {

    private final int dia;
    private final int mes;
    private final int anio;

    public SeleccionarFechaCalendario(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    // Función auxiliar para convertir el nombre del mes en español a número (1-12)
    private int getMonthNumber(String monthName) {
        // Usamos un switch para mapear de forma segura el nombre del mes a su número
        return switch (monthName.toLowerCase(Locale.forLanguageTag("es"))) {
            case "enero" -> 1;
            case "febrero" -> 2;
            case "marzo" -> 3;
            case "abril" -> 4;
            case "mayo" -> 5;
            case "junio" -> 6;
            case "julio" -> 7;
            case "agosto" -> 8;
            case "septiembre" -> 9;
            case "octubre" -> 10;
            case "noviembre" -> 11;
            case "diciembre" -> 12;
            default -> -1; // Indica que el nombre del mes es desconocido
        };
    }

    @Override
    @Step("{0} selecciona la fecha {dia}/{mes}/{anio} en el calendario")
    public <T extends Actor> void performAs(T actor) {

        // 1. Clic para abrir el panel
        actor.attemptsTo(
                Click.on(INP_FECHA_INICIAL),
                WaitInteractions.untilAppears(TXT_MES_ANIO_ACTUAL)
        );

        // Mes que buscamos (Ej: "noviembre")
        String mesDeseado = Month.of(mes).getDisplayName(TextStyle.FULL, new Locale("es")).toLowerCase(Locale.ROOT);
        int anioDeseado = anio;


        // 2. Navegación al Mes/Año Correcto
        while (true) {
            actor.attemptsTo(WaitSeconds.seconds(3));

            String mesAnioActualTexto = TXT_MES_ANIO_ACTUAL.resolveFor(actor).getText().toLowerCase(Locale.ROOT);
            String[] partes = mesAnioActualTexto.split(" ");

            // Asumiendo que el formato del texto es "Mes Año" (Ej: "noviembre 2025")
            if (partes.length < 2) {
                Reportes.reportEvent(Reportes.FAILED, "Error: El formato del mes/año actual es incorrecto: " + mesAnioActualTexto);
                break;
            }

            // Intentamos obtener el mes actual numérico usando el método auxiliar
            int mesActualNum = getMonthNumber(partes[0]);
            int anioActualNum = Integer.parseInt(partes[1]);

            // Verificación exitosa
            if (anioActualNum == anioDeseado && mesActualNum == mes) {
                Reportes.reportEvent(Reportes.PASSED, "Mes y Año encontrados: " + mesAnioActualTexto);
                break;
            }

            // Si el mes o año no pudieron ser determinados (mesActualNum == -1), fallamos o salimos
            if (mesActualNum == -1) {
                Reportes.reportEvent(Reportes.FAILED, "No se pudo reconocer el nombre del mes: " + partes[0]);
                break;
            }

            // Lógica de navegación: decidir si avanzar o retroceder
            if (anioActualNum < anioDeseado || (anioActualNum == anioDeseado && mesActualNum < mes)) {
                // Ir a mes siguiente (el mes actual está antes del deseado)
                actor.attemptsTo(Click.on(BTN_MES_SIGUIENTE));
            } else {
                // Ir a mes anterior (el mes actual está después del deseado)
                actor.attemptsTo(Click.on(BTN_MES_ANTERIOR));
            }
        }

        // 3. Clic en el Día Específico
        actor.attemptsTo(
                WaitInteractions.untilAppears(DIA_CALENDARIO.of(String.valueOf(dia))),
                Click.on(DIA_CALENDARIO.of(String.valueOf(dia))),
                WaitSeconds.seconds(1)
        );
    }

    public static SeleccionarFechaCalendario conFecha(int dia, int mes, int anio) {
        return new SeleccionarFechaCalendario(dia, mes, anio);
    }
}