package com.icia.example03.editor;

import java.beans.*;

import org.springframework.stereotype.*;

import com.icia.example03.vo.*;

@Component
public class CustomLevelEditor extends PropertyEditorSupport {
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		Level level;
		if(text.equals("NORMLA") || text.equals("1"))
			level = Level.NORMAL;
		else if(text.equals("SILVER") || text.equals("2"))
			level = Level.SILVER;
		else if(text.equals("GOLD") || text.equals("3"))
			level = Level.GOLD;
		else
			throw new IllegalArgumentException("잘못된 레벨 선택함");
		setValue(level);
	}
}
