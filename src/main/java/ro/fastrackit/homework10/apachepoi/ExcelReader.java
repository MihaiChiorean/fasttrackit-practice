package ro.fastrackit.homework10.apachepoi;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import ro.fastrackit.homework10.CustomerPurchase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExcelReader {

    public static void main(String[] args) throws IOException  {

        try {

            File excel = new File("/Users/chioreanmihai/Mihai/fasttrackit-practice/src/main/java/ro/fastrackit/homework10/customerTable.xls");
            FileInputStream fis = new FileInputStream(excel);
            HSSFWorkbook workbook = new HSSFWorkbook(fis);

            Sheet firstSheet = workbook.getSheetAt(0);

            Iterator<Row> rowIt = firstSheet.rowIterator();
            List<CustomerPurchase> theList = new ArrayList<>();
            while (rowIt.hasNext()) {
                Row currentRow = rowIt.next();

                CustomerPurchase customer = new CustomerPurchase((int) currentRow.getCell(0).getNumericCellValue(),currentRow.getCell(1).getStringCellValue(),currentRow.getCell(2).getStringCellValue(),currentRow.getCell(8).getStringCellValue());
                theList.add(customer);
            }
            workbook.close();
            fis.close();
            System.out.println("the list: " + theList);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}