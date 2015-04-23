package com.stinted.util;

import org.junit.Test;

import com.stinted.util.StringUtil;

import static org.junit.Assert.assertTrue;

public class StringUtilTest {
	
	@Test
	public void capitalize() {
		assertTrue(StringUtil.capitalize("teste").equals("Teste"));
	}
}
