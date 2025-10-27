package com.co.confecamaras.tasks;

import com.co.confecamaras.database.QueryConfecamarasReingresoTramites;
import com.co.confecamaras.database.QueryConfecamarasReingresoTramitesBloque;
import com.co.confecamaras.models.DataBase;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RunDataBaseQueryReingresoTramitesBloque implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        QueryConfecamarasReingresoTramitesBloque queryDatabase = new QueryConfecamarasReingresoTramitesBloque();

        Map<String, Object> valueMapDataQueryDB = new HashMap<>();

        try {
            valueMapDataQueryDB = queryDatabase.buscarData();
        } catch (SQLException e) {

        }

        String codBarrasBloque = "";
        String codBarrasNumeros = "";

        for (String key: valueMapDataQueryDB.keySet()) {
            List<Map<String,Object>> listCodigoBarras;
            listCodigoBarras = (List<Map<String, Object>>) valueMapDataQueryDB.get(key);
            codBarrasBloque= listCodigoBarras.get(0).get("codigobarras").toString();
            if (codBarrasNumeros == "") {
                codBarrasNumeros = codBarrasBloque;
            } else {
                codBarrasNumeros = codBarrasNumeros + "," + codBarrasBloque;
            }
        }

        DataBase.setCodigoBarrasReingresoBloque(codBarrasNumeros);
    }

    public static RunDataBaseQueryReingresoTramitesBloque query() {
        return instrumented(RunDataBaseQueryReingresoTramitesBloque.class);
    }
}