package com.co.confecamaras.abilities;


import net.serenitybdd.screenplay.Ability;

import net.serenitybdd.screenplay.Actor;

public class ReadPdf implements Ability {

    private String pdfText;
    //PdfReader pdfReader;

    public static ReadPdf as(Actor actor){
        return actor.abilityTo(ReadPdf.class);
    }

    /*public String getText(){
        int pagesNumber = pdfReader.getNumberOfPages();
        StringBuilder pdfText = new StringBuilder();
        for (int i = 1; i <= pagesNumber; i++){
            pdfText.append(PdfTextExtractor.getTextFromPage());
        }
        return pdfText;
    }*/
}
