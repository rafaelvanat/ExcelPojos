package com.stinted.excel.test;

import static org.junit.Assert.fail;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Before;
import org.junit.Test;

import com.stinted.excel.Excel;

@Log4j
public class ExcelTest {
	Case testWorkbook = new Case();
	@Getter @Setter List<?> testClasses = null;
	
	@Before
	public void setUp() throws Exception {
		BasicConfigurator.configure();
		if (testWorkbook == null){
			testWorkbook = new Case();
		}
		setTestClasses(testWorkbook.getTestData());
	}

	@Test
	public void testReadData() throws InvalidFormatException, IOException {
		Excel excel = new Excel("TestCaseData.xls");
		try {
			log.info("testReadData - Class name should be = " + Case.class.getName());
			List<Case> results = excel
					.read(Case.class.getName());
			for (Case testClass : results) {
				log.info("testReadData - " + testClass);
			}
		} catch (Exception e) {
			log.info(e.getMessage() + e.toString());
			e.printStackTrace();
		}
	}
	
	@Test
	public void testReadData2() throws InvalidFormatException, IOException {
		Excel excelReport = new Excel("TestCase.xls");
		try {
			log.info("### testReadData2 - Class name should be = " + Case.class.getName());
			List<Case> results = excelReport
					.read(Case.class.getName());
			for (Case testClass : results) {
				log.info("### testReadData2 - " + testClass);
			}
		} catch (Exception e) {
			log.info(e.getMessage() + e.toString());
			e.printStackTrace();
		}
	}

	@Test
	public void testReadData3() throws InvalidFormatException, IOException {
		Excel excelReport = new Excel("TestCase2.xls");
		try {
			log.info("testReadData3 - Class name should be = " + Case2.class.getName());
			List<Case2> results = excelReport
					.read(Case2.class.getName());
			for (Case2 testClass : results) {
				log.info("testReadData3 - " + testClass);
			}
		} catch (Exception e) {
			log.info(e.getMessage() + e.toString());
			e.printStackTrace();
		}
	}
	
	@Test(expected=IOException.class)
	public void testFileNotFound() throws Exception {
		Excel excelReport = new Excel("UmArquivoInexistente.xls");
		log.info("testReadData3 - Class name should be = " + Case2.class.getName());
		List<Case2> results = excelReport
				.read(Case2.class.getName());
		for (Case2 testClass : results) {
			log.info("testReadData3 - " + testClass);
		}
	}
	
	@Test
	public void testWriteReportToExcel() throws InvalidFormatException, IOException {
		Case2 case2 = new Case2();
		setTestClasses(case2.getTestData());
		log.info("TESTE - 1");
		Excel excelReport = new Excel("TestCaseData.xls");
		log.info("TESTE - 2");
		try {
			log.info("The number of data elements is: "+getTestClasses().size());
			excelReport.write(getTestClasses());
			excelReport.close();
		} catch (Exception e) {
			log.error("Error: "+e.toString());
			fail();
		}
	}
	
	@Test
	public void testWriteReportToExcel2() throws InvalidFormatException, IOException {
		Execution exec = new Execution();
		setTestClasses(exec.getTestData());
		log.info("TESTE - 1");
		Excel excelReport = new Excel("TestExecutionData.xls");
		log.info("TESTE - 2");
		try {
			log.info("The number of data elements is: "+getTestClasses().size());
			excelReport.write(getTestClasses());
			excelReport.close();
		} catch (Exception e) {
			log.error("Error: "+e.toString());
			fail();
		}
	}
	
	@Test
	public void testWriteReportToExcelClassWithBoolean() throws InvalidFormatException, IOException {
		Entry entry1 = new Entry();
		entry1.setHas_pending_interactions(true);
		Entry entry2 = new Entry();
		entry2.setHas_pending_interactions(false);
		
		List<Entry> entries = new ArrayList<Entry>();
		entries.add(entry1);
		entries.add(entry2);
		
		setTestClasses(entries);
		log.info("TESTE - 1");
		Excel excelReport = new Excel("TestEntryData.xls");
		log.info("TESTE - 2");
		try {
			log.info("The number of data elements is: "+getTestClasses().size());
			excelReport.write(getTestClasses());
			excelReport.close();
		} catch (Exception e) {
			log.error("Error: "+e.toString());
			fail();
		}
	}
}