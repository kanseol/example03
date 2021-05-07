package com.icia.example03.vo;

import java.time.*;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product2 {
	private int pno;
	private String name;
	private int price;
	private LocalDate productday;
}
