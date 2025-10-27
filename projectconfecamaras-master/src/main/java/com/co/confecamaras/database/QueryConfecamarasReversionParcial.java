package com.co.confecamaras.database;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.co.confecamaras.models.DataBase.getCon;

public class QueryConfecamarasReversionParcial {

    public Map<String, Object> buscarData() throws SQLException {
        Connection con = getCon();
        Statement smtDoc= con.createStatement();
        String queryDoc = "SELECT numerorecibo\n" +
                "FROM sii_manizales.mreg_est_recibos r\n" +
                "WHERE numerorecibo LIKE '%S%'\n" +
                "AND fecoperacion>'20240101'\n" +
                "AND NOT EXISTS (SELECT numerorecibo\n" +
                "FROM sii_manizales.mreg_est_recibos\n" +
                "WHERE numfactura = r.numerorecibo\n" +
                ")\n" +
                "LIMIT 1";
        ResultSet rsDoc = smtDoc.executeQuery(queryDoc);
        ResultSetMetaData md = rsDoc.getMetaData();
        int columnCount = md.getColumnCount();
        Map<String, Object> valueMapDoc = new HashMap<>();
        while (rsDoc.next()) {
            String key = rsDoc.getString("numerorecibo");
            //System.out.println("NUMERO DOCUMENTO: " + recibo);

            Map<String,Object> rowData = new HashMap<String,Object>();
            for(int i = 1;i<=columnCount;i++){
                List<Map<String,Object>> list = new ArrayList<Map<String, Object>>();
                rowData.put(md.getColumnName(i), rsDoc.getObject(i));
                list.add (rowData);
                valueMapDoc.put(key, list);
            }
        }
        getCon().close();
        return valueMapDoc;
    }
}