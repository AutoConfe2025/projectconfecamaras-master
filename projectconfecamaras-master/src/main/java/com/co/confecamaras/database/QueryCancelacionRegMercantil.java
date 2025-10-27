package com.co.confecamaras.database;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static com.co.confecamaras.models.DataBase.getCon;

public class QueryCancelacionRegMercantil {

    public Map<String, Object> buscarData() throws SQLException {
        Connection con = getCon();
        Statement smtDoc= con.createStatement();
        String queryDoc = "SELECT matricula \n" +
                "FROM sii_manizales.mreg_est_inscritos \n" +
                "WHERE organizacion = '01' \n" +
                "AND ctrestmatricula = 'MA'\n" +
                "AND ultanoren = '2025' \n" +
                "LIMIT 1";
        ResultSet rsDoc = smtDoc.executeQuery(queryDoc);
        ResultSetMetaData md = rsDoc.getMetaData();
        int columnCount = md.getColumnCount();
        Map<String, Object> valueMapDoc = new HashMap<>();
        while (rsDoc.next()) {
            String key = rsDoc.getString("matricula");

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
