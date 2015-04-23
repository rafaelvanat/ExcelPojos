package com.stinted.util;

public class StringUtil {
	public static String capitalize(String string) {
		String capital = string.substring(0, 1).toUpperCase();
		return capital + string.substring(1);
	}
}
