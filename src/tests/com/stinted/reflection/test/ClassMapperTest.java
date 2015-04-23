package com.stinted.reflection.test;

import static org.junit.Assert.fail;

import java.io.IOException;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Before;
import org.junit.Test;

import com.stinted.excel.test.Entry;
import com.stinted.reflection.ClassMapper;

@Log4j
public class ClassMapperTest {
	@Before
	public void setUp() throws Exception {
		BasicConfigurator.configure();
	}
	
	@Test
	public void testMapperBooleanField() throws InvalidFormatException, IOException {
		ClassMapper mapper = new ClassMapper();
		try {
			mapper.getMethod(Entry.class, "has_pending_interactions");
		} catch (Exception e) {
			log.error("Error: "+e.toString());
			fail();
		}
	}
}