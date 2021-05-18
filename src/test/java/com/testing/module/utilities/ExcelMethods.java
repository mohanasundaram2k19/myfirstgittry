package com.testing.module.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

import org.apache.commons.logging.Log;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Reporter;


public class ExcelMethods {
//	private static HSSFRow row = null;
//	private static XSSFRow row1 = null;
//	private static HSSFCell cell = null;
//	private static XSSFCell cell1 = null;
//	private static HSSFWorkbook workbook = null;
//	private static XSSFWorkbook workbook1 = null;
//	
//	
//	private static HSSFSheet sheet = null;
//	private static XSSFSheet sheet1 = null;
//	private FileInputStream fis;
//	private static FileOutputStream fos = null;
//	private static int rowCount;
//	private static int colCount;
//	static String filePath = ("./src/test/resources/excel/" + File.separator + "testData" + ".xlsx");
//	
//	
//	/**
//	 * This method will be used get the row number in the sheet
//	 * 
//	 * @param SheetName Sheet Name in the workbook
//	 * @return int row number
//	 * @throws IOException
//	 */
//	public static int getRowCount(String sheetName) {
//	try (FileInputStream fis = new FileInputStream(filePath);) {
//			workbook = new HSSFWorkbook(fis);
//		sheet = workbook.getSheet(sheetName);
//		//int rowCount = sheet.getLastRowNum() + 1;
//		int rowCount = sheet.getPhysicalNumberOfRows() + 1;
//		return rowCount;
//	} catch (Exception e) {
//		
//		e.printStackTrace();
//		return rowCount;
//	}}
//
//	/**
//	 * This method will be used get the column number in the sheet
//	 * 
//	 * @param strSheetName Sheet Name in the workbook
//	 * @return int column number
//	 * @throws IOException
//	 */
//	public int getColumnCount(String sheetName) {
//		sheet = workbook.getSheet(sheetName);
//		row = sheet.getRow(0);
//		int colCount = row.getLastCellNum();
//		return colCount;
//	}
//
//	/**
//	 * This method will fetch the data from excel sheet based on Column name and Row
//	 * number 1st row will contain the row header
//	 * 
//	 * @param strSheetName        Sheet Name in the DataSheet workbook
//	 * @param strColumnIdentifier Column Name in the sheet
//	 * @param strRowIdentifier    Row number in the sheet
//	 * @return String cell data
//	 */
//	public static String getData(String strSheetName, String strColumnIdentifier, int intRowIdentifier) {
//		String filePath = ("./src/test/resources/excel/"+ File.separator + "testData" + ".xlsx");
//		try (FileInputStream fis = new FileInputStream(filePath);) {
//			workbook = new HSSFWorkbook(fis);
//			sheet = workbook.getSheet(strSheetName);
//			row = sheet.getRow(0);
//
//			int colNum = -1;
//
//			for (int i = 0; i < row.getLastCellNum(); i++) {
//				if (row.getCell(i).getStringCellValue().trim().equals(strColumnIdentifier.trim())) {
//					colNum = i;
//				}
//			}
//			if (colNum == -1) {
//				return "";
//			}
//			row = sheet.getRow(intRowIdentifier);
//
//			if (row == null) {
//				return "";
//			}
//			cell = row.getCell(colNum);
//
//			if (cell == null) {
//				return "";
//			}
//			if (cell.getCellType() == CellType.STRING) {
//				return cell.getStringCellValue();
//
//			} else if (cell.getCellType() == CellType.NUMERIC || cell.getCellType() == CellType.FORMULA) {
//
//				String cellValue = String.valueOf(cell.getNumericCellValue());
//
//				if (DateUtil.isCellDateFormatted(cell)) {
//					DateFormat df = new SimpleDateFormat("dd/MM/yy");
//					Date date = cell.getDateCellValue();
//					cellValue = df.format(date);
//				}
//				return cellValue;
//			} else if (cell.getCellType() == CellType.BLANK) {
//				return "";
//			}
//
//			else {
//				return String.valueOf(cell.getBooleanCellValue());
//
//			}
//		} catch (Exception e) {
//			System.out.println(e);
//			return "row " + intRowIdentifier + " or column " + strColumnIdentifier + " does not exist in Excel";
//		}
//	}
//	
//	
//	public static String getDataone(String strSheetName, String strColumnIdentifier, int intRowIdentifier) {
//		String filePath = ("./src/test/resources/excel/"+ File.separator + "testData" + ".xlsx");
//		try (FileInputStream fis = new FileInputStream(filePath);) {
//			workbook1 = new XSSFWorkbook(fis);
//			sheet1 = workbook1.getSheet(strSheetName);
//			row1 = sheet1.getRow(0);
//
//			int colNum = -1;
//
//			for (int i = 0; i < row1.getLastCellNum(); i++) {
//				if (row1.getCell(i).getStringCellValue().trim().equals(strColumnIdentifier.trim())) {
//					colNum = i;
//				}
//			}
//			if (colNum == -1) {
//				return "";
//			}
//			row1 = sheet1.getRow(intRowIdentifier);
//
//			if (row1 == null) {
//				return "";
//			}
//			cell1 = row1.getCell(colNum);
//
//			if (cell1 == null) {
//				return "";
//			}
//			if (cell1.getCellType() == CellType.STRING) {
//				return cell1.getStringCellValue();
//
//			} else if (cell1.getCellType() == CellType.NUMERIC || cell.getCellType() == CellType.FORMULA) {
//
//				String cellValue = String.valueOf(cell1.getNumericCellValue());
//
//				if (DateUtil.isCellDateFormatted(cell1)) {
//					DateFormat df = new SimpleDateFormat("dd/MM/yy");
//					Date date = cell.getDateCellValue();
//					cellValue = df.format(date);
//				}
//				return cellValue;
//			} else if (cell1.getCellType() == CellType.BLANK) {
//				return "";
//			}
//
//			else {
//				return String.valueOf(cell1.getBooleanCellValue());
//
//			}
//		} catch (Exception e) {
//			System.out.println(e);
//			return "row " + intRowIdentifier + " or column " + strColumnIdentifier + " does not exist in Excel";
//		}
//	}
//	
//	public static void copyexcel(String sourceExcel, String targetExcel) {
//		FileSystem system = FileSystems.getDefault();
//		Path original = system.getPath(sourceExcel);
//		Path target = system.getPath(targetExcel);
//
//		try {
//			// Throws an exception if the original file is not found.
//			Files.copy(original, target, StandardCopyOption.REPLACE_EXISTING);
//		} catch (IOException ex) {
//			Reporter.log("Close All open ExcelSheet");
//		}
//	}
//	
//	public static boolean putData(String sheetName, String colName, int rowNum, String value) {
//		String strAbsFilePath = ("./src/test/resources/excel/" + File.separator + "testData" + ".xlsx");
//		try (FileInputStream fis = new FileInputStream(strAbsFilePath);) {
//			workbook = new HSSFWorkbook(fis);
//			sheet = workbook.getSheet(sheetName);
//			int colNum = -1;
//			row = sheet.getRow(0);
//			for (int i = 0; i < row.getLastCellNum(); i++) {
//				if (row.getCell(i).getStringCellValue().trim().equals(colName)) {
//					colNum = i;
//				}
//				}
//			sheet.autoSizeColumn(colNum);
//			row = sheet.getRow(rowNum);
//			if (row == null) {
//				row = sheet.createRow(rowNum);
//			}
//			cell = row.getCell(colNum);
//			if (cell == null) {
//				cell = row.createCell(colNum);
//			}
//			cell.setCellValue(value);
//
//			fos = new FileOutputStream(strAbsFilePath);
//			workbook.write(fos);
//			fos.close();
//		} catch (Exception e) {
//			Reporter.log("Unable to update Data");
//			return false;
//		}
//		return true;
//	}
//	
//	
//	public static boolean putDataone(String sheetName, String colName, int rowNum, String value) {
//		String strAbsFilePath = ("./src/test/resources/excel/" + File.separator + "testData" + ".xlsx");
//		try (FileInputStream fis = new FileInputStream(strAbsFilePath);) {
//			workbook1 = new XSSFWorkbook(fis);
//			sheet1 = workbook1.getSheet(sheetName);
//			int colNum = -1;
//			row1 = sheet1.getRow(0);
//			for (int i = 0; i < row1.getLastCellNum(); i++) {
//				if (row1.getCell(i).getStringCellValue().trim().equals(colName)) {
//					colNum = i;
//				}
//				}
//			sheet1.autoSizeColumn(colNum);
//			row1 = sheet1.getRow(rowNum);
//			if (row1 == null) {
//				row1 = sheet1.createRow(rowNum);
//			}
//			cell1 = row1.getCell(colNum);
//			if (cell1 == null) {
//				cell1 = row1.createCell(colNum);
//			}
//			cell1.setCellValue(value);
//
//			fos = new FileOutputStream(strAbsFilePath);
//			workbook1.write(fos);
//			fos.close();
//		} catch (Exception e) {
//			Reporter.log("Unable to update Data");
//			return false;
//		}
//		return true;
//	}
//	/**
//	 * This method will fetch the data from excel sheet on 2nd Row based on Column
//	 * name 1st row will contain the row header
//	 * 
//	 * @param strSheetName        Sheet Name in the DataSheet workbook
//	 * @param strColumnIdentifier Column Name in the sheet
//	 * @return String cell data
//	 */
//	/*
//	 * public static String getData(String strSheetName, String strColumnIdentifier)
//	 * { Workbook objWorkBook; Sheet objCurrentSheet; String strAbsFilePath =
//	 * (testDataFolderName + File.separator + strSheetName + ".xls"); String
//	 * strContent; try { objWorkBook = Workbook.getWorkbook(new
//	 * File(strAbsFilePath)); objCurrentSheet = objWorkBook.getSheet(strSheetName);
//	 * int columnNum = getColumnNumber(objCurrentSheet, strColumnIdentifier);
//	 * strContent = objCurrentSheet.getCell(columnNum, 1).getContents();
//	 * objWorkBook.close(); return strContent; } catch (Exception e) {
//	 * Logger.getLogger(arg0) return null;
//	 * 
//	 * } }
//	 */
}
