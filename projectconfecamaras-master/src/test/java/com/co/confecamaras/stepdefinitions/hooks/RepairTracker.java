package com.co.confecamaras.utils;

public class RepairTracker {

    private static boolean repaired = false;
    private static String repairTool = "";
    private static String repairReason = "";

    public static void markRepaired(String tool, String reason) {
        repaired = true;
        repairTool = tool;
        repairReason = reason;
    }

    public static boolean wasRepaired() {
        return repaired;
    }

    public static String getRepairTool() {
        return repairTool;
    }

    public static String getRepairReason() {
        return repairReason;
    }

    public static void reset() {
        repaired = false;
        repairTool = "";
        repairReason = "";
    }
}
