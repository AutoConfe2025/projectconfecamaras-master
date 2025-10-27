package com.co.confecamaras.helper;


import com.co.confecamaras.models.TableCargaContratosRup;
import net.thucydides.core.annotations.findby.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ReadHTMLTable {
    private static List<TableCargaContratosRup> tableCargaContratosRups;

    public static void readTable(WebElement table){
        tableCargaContratosRups = new ArrayList<>();

        List<WebElement> colums = table.findElements(By.tagName("th"));

        List<WebElement> rows = table.findElements(By.tagName("tr"));

        int rowIndex = 0;

        for (WebElement row: rows){
            int colIndex = 0;
            List<WebElement> colData = row.findElements(By.tagName("td"));
            if (colData.size() !=0){
                for (WebElement colValue: colData){
                    tableCargaContratosRups.add(new TableCargaContratosRup(
                            rowIndex,
                            !colums.get(colIndex).getText().equals("")?colums.get(colIndex).getText()
                                    :String.valueOf(colIndex),
                            colValue.getText()
                    ));
                    colIndex++;
                }
                rowIndex++;
            }
        }
    }
//    public static void compareTableText(String... strCompare){
//        for (String text:strCompare){
//            tableCargaContratosRups.forEach(tblc ->{
//                if (tblc.getColVal().equals(text)){
//
//                }
//            });
//
//        }
//    }
}
