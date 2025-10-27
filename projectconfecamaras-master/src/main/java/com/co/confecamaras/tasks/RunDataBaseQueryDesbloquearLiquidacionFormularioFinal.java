package com.co.confecamaras.tasks;

import com.co.confecamaras.database.QueryConfecamarasDesbloquearLiquidacionFirmadoElectronico;
import com.co.confecamaras.database.QueryConfecamarasDesbloquearLiquidacionFormularioFinal;
import com.co.confecamaras.models.DataBase;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RunDataBaseQueryDesbloquearLiquidacionFormularioFinal implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        QueryConfecamarasDesbloquearLiquidacionFormularioFinal queryDatabase = new QueryConfecamarasDesbloquearLiquidacionFormularioFinal();

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

        DataBase.setNumRecuperacionFormularioFinal(numRecuperacion);
    }

    public static RunDataBaseQueryDesbloquearLiquidacionFormularioFinal query() {
        return instrumented(RunDataBaseQueryDesbloquearLiquidacionFormularioFinal.class);
    }
}