package com.keydok.presentation.util;

public class StringUtil {

	public boolean isLengthEven(String phrase) {
		return phrase != null && phrase.length() % 2 == 0;
	}
}
