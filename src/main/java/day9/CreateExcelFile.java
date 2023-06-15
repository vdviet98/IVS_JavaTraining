package day9;

//Import the Apache POI library
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateExcelFile {

    public static void main(String[] args) throws IOException {
        Workbook workbook = new HSSFWorkbook();

        Sheet sheet = workbook.createSheet("Student");

        Row header = sheet.createRow(0);

        Cell cell1 = header.createCell(0);
        cell1.setCellValue("ID");

        Cell cell2 = header.createCell(1);
        cell2.setCellValue("FULL NAME");

        Cell cell3 = header.createCell(2);
        cell3.setCellValue("GPA");

        Object[][] data = {
                {1, "Nguyen Van A", 3.5},
                {2, "Tran Thi B", 2.7},
                {3, "Le Van C", 1.9},
                {4, "Pham Thi D", 2.8},
                {5, "Hoang Van E", 3.2}
        };

        int rowNum = 1;
        for (Object[] rowData : data) {
            Row row = sheet.createRow(rowNum++);
            int colNum = 0;
            for (Object field : rowData) {
                Cell cell = row.createCell(colNum++);
                if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                } else if (field instanceof String) {
                    cell.setCellValue((String) field);
                } else if (field instanceof Double) {
                    cell.setCellValue((Double) field);
                }
            }
        }

        File file = new File("Student.xls");
        FileOutputStream out = new FileOutputStream(file);
        workbook.write(out);

        out.close();
        workbook.close();

        System.out.println("Excel file created.");

        System.out.println("The students with GPA >= 2.5 are:");
        for (int i = 0; i < data.length; i++) {
            double gpa = (double) data[i][2];
            if (gpa >= 2.5) {
                System.out.println(data[i][0] + "\t" + data[i][1] + "\t" + data[i][2]);
            }
        }
    }
}
