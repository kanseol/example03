package com.icia.example03.editor;

import java.beans.*;

import org.springframework.stereotype.*;

import com.icia.example03.vo.*;

@Component
public class CustomCategoryEditor extends PropertyEditorSupport {
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		Category category;
		if(text.equals("FAQ") || text.equals("1"))
			category = Category.FAQ;
		else if(text.equals("QNA") || text.equals("2"))
			category = Category.QNA;
		else if(text.equals("FREE") || text.equals("3"))
			category = Category.FREE;
		else
			throw new IllegalArgumentException("잘못된 카테고리를 선택하셨습니다");
		setValue(category);
	}
}
