package com.co.confecamaras.database;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.co.confecamaras.models.DataBase.getCon;

public class QueryConfecamarasReingresoTramitesBloque {

    public Map<String, Object> buscarData() throws SQLException {
        Connection con = getCon();
        Statement smtDoc= con.createStatement();
        String queryDoc = "SELECT codigobarras \n" +
                "FROM sii_ibague.mreg_est_codigosbarras\n" +
                "WHERE estadofinal='06'\n" +
                "AND tipdoc='06'\n" +
                "LIMIT 2";
        ResultSet rsDoc = smtDoc.executeQuery(queryDoc);
        ResultSetMetaData md = rsDoc.getMetaData();
        int columnCount = md.getColumnCount();
        Map<String, Object> valueMapDoc = new HashMap<>();
        while (rsDoc.next()) {
            String key = rsDoc.getString("codigobarras");
            //System.out.println("NUMERO DOCUMENTO: " + numDocumentoConsulta);

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