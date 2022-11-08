package actitime.dataprovider;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	public Object[][] getData(String fileName) throws IOException {
		FileInputStream fis = new FileInputStream(getClass().getClassLoader().getResource(fileName).getFile());
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);

		int rows = sheet.getPhysicalNumberOfRows();

		XSSFRow row = sheet.getRow(0);
		int lastCell = row.getLastCellNum();

		Object data[][] = new Object[rows - 1][lastCell];

		for (int i = 0; i < rows - 1; i++) {
			XSSFRow r = sheet.getRow(i + 1);
			for (int j = 0; j < lastCell; j++) {
				data[i][j] = r.getCell(j).getStringCellValue();
			}
		}
		wb.close();
		return data;

	}

}
