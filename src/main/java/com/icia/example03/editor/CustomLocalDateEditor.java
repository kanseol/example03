package com.icia.example03.editor;

import java.beans.*;
import java.time.*;

import org.springframework.stereotype.*;

@Component
public class CustomLocalDateEditor extends PropertyEditorSupport {
	// text : 2020-11-20
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String[] str = text.split("-");
		int year = Integer.parseInt(str[0]);
		int month = Integer.parseInt(str[1]);
		int day = Integer.parseInt(str[2]);
		LocalDate date = LocalDate.of(year, month, day);
		setValue(date);
	}
}
