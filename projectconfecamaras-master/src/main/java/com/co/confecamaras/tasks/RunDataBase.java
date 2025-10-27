package com.co.confecamaras.tasks;

import com.co.confecamaras.database.ConnectSQL;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import static com.co.confecamaras.utils.Constantes.INFO_DB_CONFECAMARAS;
import static net.serenitybdd.screenplay.Tasks.*;

public class RunDataBase implements Task {

    Logger logger = Logger.getLogger(RunDataBase.class.getName());
    ConnectSQL connectOracleSQL = new ConnectSQL();

    private String userDB;
    private String passwordDB;

    public RunDataBase(String userDB, String passwordDB) {
        this.userDB = userDB;
        this.passwordDB = passwordDB;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Map<String, Object> valueMapDataQueryDB = new HashMap<>();

        try {
            connectOracleSQL.connectDB(INFO_DB_CONFECAMARAS, userDB, passwordDB);
        } catch (SQLException e) {
            logger.log(Level.INFO, e.getMessage());
        }
    }

    public static RunDataBase dataBase(String userDB, String passwordDB){
        return instrumented(RunDataBase.class, userDB, passwordDB);
    }
}