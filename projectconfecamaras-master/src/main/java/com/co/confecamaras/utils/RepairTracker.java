package com.co.confecamaras.utils;

public class RepairTracker {

    private static boolean repairedWithHealenium = false;
    private static boolean repairedWithSikuli = false;
    private static String repairReason = "";

    public static void markHealenium() {
        repairedWithHealenium = true;
        repairReason = "Elemento reparado automáticamente durante la interacción con Healenium.";
    }

    public static void markSikuli() {
        repairedWithSikuli = true;
        repairReason = "Elemento localizado y reparado mediante SikuliX (interacción por imagen).";
    }

    public static boolean isRepaired() {
        return repairedWithHealenium || repairedWithSikuli;
    }

    public static String getRepairTool() {
        if (repairedWithSikuli) return "Sikuli";
        if (repairedWithHealenium) return "Healenium";
        return "N/A";
    }

    public static String getRepairReason() {
        return repairReason;
    }

    public static void reset() {
        repairedWithHealenium = false;
        repairedWithSikuli = false;
        repairReason = "";
    }
}
