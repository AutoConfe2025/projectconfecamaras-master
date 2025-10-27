package com.co.confecamaras.tasks.mercantil;

import com.co.confecamaras.database.QueryComfecamarasLiquidacionRenovacion;
import com.co.confecamaras.models.DataBase;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RunDataBaseQueryLiquidacionRenovacion implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        QueryComfecamarasLiquidacionRenovacion queryDatabase  = new QueryComfecamarasLiquidacionRenovacion();

        Map<String, Object> valueMapDataQueryDB = new HashMap<>();
        try {
            valueMapDataQueryDB = queryDatabase.buscarData();
        } catch (SQLException e) {

        }
        String matricula = "";

        for (String key : valueMapDataQueryDB.keySet()) {
            List<Map<String, Object>> listMatriculas;
            listMatriculas= (List<Map<String, Object>>) valueMapDataQueryDB.get(key);
            matricula = listMatriculas.get(0).get("matricula").toString();
        }

        DataBase.setLiquidacionLey(matricula);

    }
    public static RunDataBaseQueryLiquidacionRenovacion query(){
        return Tasks.instrumented(RunDataBaseQueryLiquidacionRenovacion.class);
    }
}
