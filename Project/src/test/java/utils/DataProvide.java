package utils;

import org.testng.annotations.DataProvider;

public class DataProvide {
     /*
     * Method Name: readExcelData
     * Author name: Kartik Bameta
     * Description: This method provides test data by reading an Excel sheet using the ExcelReader utility and returning it as a structured Object array.
     * Parameters: none
     * Return type: Object[][]
     */
    @DataProvider(name="SwarovskiData")
    public static Object[][] excelData(){
        String path="/testdata/SwarovskiExcelSheet.xlsx";
	    String sheet="Sheet1";
	    return ExcelReader.readExcelData(path,sheet);
    }
}
