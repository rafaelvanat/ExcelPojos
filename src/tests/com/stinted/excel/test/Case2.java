package com.stinted.excel.test;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

import org.junit.Test;

@Data
public class Case2 {
	private String name;
	private String sexo;
	private Integer idade;
	
	public Case2(){
	}
	
	public Case2(String name, String sexo, Integer idade) {
		this.name = name;
		this.sexo = sexo;
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "TestClass [name=" + name + ", sexo=" + sexo + ", idade=" + idade + "]";
	}

	public List<Case2> getTestData() {
		List<Case2> testClasses = new ArrayList<Case2>();

		testClasses.add(new Case2("John","M",25));
		testClasses.add(new Case2("Paul","M",24));
		testClasses.add(new Case2("Ringo","M",23));

		return testClasses;
	}

	@Test
	public void myWorkbook(){
		for(Case2 case2: getTestData()){
			System.out.println(case2.toString());
		}
	}
}
