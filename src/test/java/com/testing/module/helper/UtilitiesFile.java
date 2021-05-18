package com.testing.module.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.testing.module.utilities.ExtentListeners;

public class UtilitiesFile {
	
	
	public void click() {
		System.out.println("The Element is Clicked");
		//ExtentListeners.testReport.get().info("Clicking on : " + "clicking");
	}
	
	public void type() {
		System.out.println("The Element is typed");
		//ExtentListeners.testReport.get().info("Typing  on : " + "typing");
	}
	
	public static Properties loadProperty(String path) {
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream(path));

		} catch (Exception e) {
			System.err.println("Properties file cannot be handled");
		}
		return properties;
	}
	
	public static String valueOne;
	public static String ExcelRead(String path, String Sheetname, String key1) throws IOException {
		Map<String, String> map = new HashMap<String, String>();
		File file = new File(path);
		FileInputStream FileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(FileInputStream);
		Sheet Sheet = workbook.getSheet(Sheetname);
		for (int i = 0; i < Sheet.getPhysicalNumberOfRows(); i++) {
			Row row = Sheet.getRow(i);
			Cell cell = row.getCell(0);
			Cell cellone = row.getCell(1);
			String Key = cell.getStringCellValue();
			CellType type = cellone.getCellType();
			if (type == CellType.NUMERIC) {
				int data = (int) cellone.getNumericCellValue();
				String Value = String.valueOf(data);
				map.put(Key, Value);
				valueOne = map.get(key1);
			} else {
				String Value = cellone.getStringCellValue();
				map.put(Key, Value);
				valueOne = map.get(key1);
			}
		}

		return valueOne;

	}


}
