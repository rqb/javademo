package cn.gov.pbc.java.designpattern.adapter;

/**
 * In the CsvAdapterImpl class above, we implemented the TextFormattable interface, which is the Target. 
 * 
 * We then declared the Adaptee type (CsvFormattable) as a field and initialized it in the constructor. 
 * 
 * In the overridden formatText() method, we made a call to the formatCsvText() method, 
 * 
 * and returned back the CSV formatted string to the caller. Let¡¯s now write a unit test for the example.
 * @author renqingbin
 *
 */
public class CsvAdapterImpl implements TextFormattable {
    CsvFormattable csvFormatter;
    public CsvAdapterImpl(CsvFormattable csvFormatter){
        this.csvFormatter=csvFormatter;
    }
    @Override
    public String formatText(String text)
    {
        String formattedText=csvFormatter.formatCsvText(text);
        return formattedText;
    }
}
