package com.co.confecamaras.tasks;

import com.co.confecamaras.database.QueryConfecamarasDesbloquearLiquidacionPagoCaja;
import com.co.confecamaras.database.QueryConfecamarasDesbloquearLiquidacionPagoElectronico;
import com.co.confecamaras.models.DataBase;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RunDataBaseQueryDesbloquearLiquidacionPagoElectronico implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        QueryConfecamarasDesbloquearLiquidacionPagoElectronico queryDatabase = new QueryConfecamarasDesbloquearLiquidacionPagoElectronico();

        Map<String, Object> valueMapDataQueryDB = new HashMap<>();

        try {
            valueMapDataQueryDB = queryDatabase.buscarData();
        } catch (SQLException e) {

        }

        String numRecuperacion = "";

        for (String key: valueMapDataQueryDB.keySet()) {
            List<Map<String,Object>> listCodigoBarras;
            listCodigoBarras = (List<Map<String, Object>>) valueMapDataQueryDB.get(key);
            numRecuperacion= listCodigoBarras.get(0).get("numerorecuperacion").toString();
        }

        DataBase.setNumRecuperacionPagoElectronico(numRecuperacion);
    }

    public static RunDataBaseQueryDesbloquearLiquidacionPagoElectronico query() {
        return instrumented(RunDataBaseQueryDesbloquearLiquidacionPagoElectronico.class);
    }
}