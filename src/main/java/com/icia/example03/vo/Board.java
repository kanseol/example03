package com.icia.example03.vo;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Board {
	private int bno;
	private Category category;
	private String title;
	private String erum;
}
