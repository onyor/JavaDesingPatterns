package main.java.desingpattrens.Structural.Decorator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */

public class ReportUtil {
    public static String getLinedText(String text) {
        /**
         * Her bir alt satıra geçtiğim yerlerde  => \n
         */
        String[] rowList = text.split("\n");

        String linedText="";
        for (String eachRow:rowList
             ) {
            String linedRow = eachLineIsAddOneLine(eachRow);

            linedText = linedText + linedRow;
        }

        return linedText;
    }

    private static String eachLineIsAddOneLine(String eachRow) {
        String newRow;

        if (eachRow.trim().length() == 0) {
            newRow = "\n";
        } else {
            newRow = "\n- " + eachRow;
        }
        return newRow;
    }

    public static String fitText(String text,int width) {
        /**
         * Satır küçültme
         *
         */
        String smallRowText="";

        String[] rowList=text.split("\n");

        for (String eachRow:rowList
             ) {
            if (eachRow.length() <= width) {
                //Aynen ekle
                smallRowText = addAndNewNextRow(smallRowText, eachRow);
            } else {
                //küçült ve parçala
                List<String> smashList = smash(eachRow, width);
                for (String eachNewRow : smashList) {
                    smallRowText = addAndNewNextRow(smallRowText, eachNewRow);
                }
            }
        }
        return smallRowText;
    }

    private static String addAndNewNextRow(String mainText, String textToAdd) {
        return mainText + textToAdd + "\n";
    }

    private static List<String> smash(String eachRow, int width) {
        List<String> smashRowList=new ArrayList<>();
        /**
         * Genişlik = 30 // Width = 30
         * satir:
         * 1-> 45 {30,15}       ->  0,30 / 30 / 45
         * 2-> 25 {25}          ->  0,25
         * 3-> 65 {30,30,5}     ->  0,30 / 30,60 / 60,65
         */

        for (int i = 0; i < eachRow.length()/30; i++) {
            int firstDigit = width * i;
            int lastDigit= firstDigit+width;

            if (lastDigit > eachRow.length()) {
                lastDigit=eachRow.length();
            }

            String smashRow = eachRow.substring(firstDigit, lastDigit);

            if (smashRow.trim().length() > 0) {
                smashRowList.add(smashRow);
            }
        }
        return smashRowList;
    }

    public static String addSignedTextToTheEnd(String text) {
        String signature="\n\n + \t\t\t\t\t\t Signature: ";
        return text+signature;
    }
}
