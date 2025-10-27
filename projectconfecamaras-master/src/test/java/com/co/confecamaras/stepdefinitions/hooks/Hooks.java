package com.co.confecamaras.stepdefinitions.hooks;

import com.co.confecamaras.utils.RepairTracker;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.steps.StepEventBus;
import net.thucydides.model.domain.TestResult;

import java.io.File;

public class Hooks {

    @Before
    public void setup() {
        // 🧹 Elimina el reporte anterior antes de ejecutar nuevas pruebas
        File serenityDir = new File("target/site/serenity");
        if (serenityDir.exists()) {
            deleteDirectory(serenityDir);
            System.out.println("🧹 Reporte Serenity anterior eliminado.");
        }

        // 🔄 Reiniciamos el estado del RepairTracker
        RepairTracker.reset();
    }

    @After
    public void tearDown() {
        if (RepairTracker.isRepaired()) {
            String tool = RepairTracker.getRepairTool();
            String reason = RepairTracker.getRepairReason();

            // Agregamos información adicional al reporte Serenity
            Serenity.recordReportData()
                    .withTitle("⚠️ Caso Comprometido - Revisión Necesaria")
                    .andContents("🔧 Herramienta: " + tool + "\n📋 Motivo: " + reason);

            Serenity.recordReportData()
                    .withTitle("📄 Enlace al Reporte Serenity")
                    .andContents("<a href='target/site/serenity/index.html' target='_blank'>Abrir Reporte</a>");

            // 🟠 Marca el escenario como COMPROMISED manualmente
            var eventBus = StepEventBus.getEventBus();
            var testOutcome = eventBus.getBaseStepListener().getCurrentTestOutcome();

            if (testOutcome != null) {
                testOutcome.setAnnotatedResult(TestResult.COMPROMISED);
                testOutcome.setTestFailureMessage("Caso comprometido — reparado con " + tool);
                System.out.println("⚠️ Caso marcado como COMPROMETIDO (" + tool + ")");
            }
        }
    }

    private void deleteDirectory(File dir) {
        File[] files = dir.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isDirectory()) deleteDirectory(f);
                else f.delete();
            }
        }
        dir.delete();
    }
}
