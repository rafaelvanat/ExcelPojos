package com.stinted.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

@Log4j
public class ExcelWorkbook {
	@Getter @Setter(AccessLevel.PRIVATE) private Workbook workbook = null;
	@Getter private final String workbookName;
	
	public ExcelWorkbook(String workbookName) {
		this.workbookName = workbookName;
		this.setWorkbook(new HSSFWorkbook());
	}
	
	/**
	 * Prepara arquivo Excel para leitura.
	 * @throws InvalidFormatException
	 * @throws IOException
	 */
	public Workbook initializeForRead() throws InvalidFormatException, IOException {
		log.debug("Open file");
		InputStream inp = new FileInputStream(getWorkbookName());
		log.debug("create wb");
		return workbook = WorkbookFactory.create(inp);
	}
	
	/**
	 * Retorna planilha do arquivo Excel pelo nome
	 * @param name String
	 */
	public Sheet getSheetByName(String name) {
		Sheet sheet = null;
		log.info("Number of sheets - " + workbook.getNumberOfSheets());
		for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
			log.debug("Sheet name - " + workbook.getSheetName(i));
			if (name.compareTo(workbook.getSheetName(i)) == 0) {
				sheet = workbook.getSheetAt(i);
				break;
			}
		}
		return sheet;
	}
	
	/**
	 * Libera memória dos streams para não ocorrer leak (estouro).
	 */
	public void closeWorksheet() {
		FileOutputStream fileOut;
		try {
			fileOut = new FileOutputStream(getWorkbookName());
			this.getWorkbook().write(fileOut);
			fileOut.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
