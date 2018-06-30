package cn.gov.pbc.java.designpattern.adapter;

public class CsvFormatter implements CsvFormattable{
    @Override
    public String formatCsvText(String text){
        String formattedText=text.replace(".",",");
        return formattedText;
    }
}