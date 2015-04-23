package com.stinted.excel.test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.extern.java.Log;

import org.junit.Test;

@Data
public class Case {
	private String name;
	private String path;
	private String directory;
	private Integer containedFiles;
	private Double doubleField;
	
	public Case(){
	}
	
	public Case(String name, String path, String directory,
			Integer containedFiles, Double doubleField) {
		this.name = name;
		this.path = path;
		this.directory = directory;
		this.containedFiles = containedFiles;
		this.doubleField = doubleField;
	}

	@Override
	public String toString() {
		return "TestClass [containedFiles=" + containedFiles + ", directory="
				+ directory + ", doubleField=" + doubleField + ", name=" + name
				+ ", path=" + path + "]";
	}

	public List<Case> getTestData() {
		List<Case> testClasses = new ArrayList<Case>();

		String currentDirectory = System.getProperty("user.dir");
		System.out.println("currentDirectory = " + currentDirectory);
		File currentDirectoryFile = new File(currentDirectory);
		File[] files = currentDirectoryFile.listFiles();
		double dbl = 0;
		for (File file : files) {
			Case testClass = null;
			if (file.isDirectory()) {
				testClass = new Case(file.getName(), file.getPath(),
						"directory", file.list().length,dbl++);
			} else {
				testClass = new Case(file.getName(), file.getPath(),
						"file", 0,dbl++);
			}
			System.out.println("Test Class = " + testClass.getName());
			testClasses.add(testClass);
		}
		return testClasses;
	}

	@Test
	public void myWorkbook(){
		String currentDirectory = System.getProperty("user.dir");
		File currentDirectoryFile = new File(currentDirectory);
		File[] files = currentDirectoryFile.listFiles();

		System.out.println("Is there anything in the list:" + files.length);
		double dbl = 0;
		for (File file : files) {
			System.out.println(file.getName());
			System.out.println(file.getAbsoluteFile().toString());
			System.out.println(file.getPath());
			if (file.isDirectory()) {
				System.out.println("Directory");
				new Case(file.getName(), file.getPath(),
						"directory", file.list().length,dbl++);
			} else {
				new Case(file.getName(), file.getPath(),
						"file", 0,dbl++);
			}
		}
	}
}
