package com.icia.example03.vo;

import java.time.*;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
	private String username;
	private String password;
	private String email;
	private LocalDate joinday;
	private LocalDate birhday;
	private Level level;
	private int loginFailureCnt;
}
