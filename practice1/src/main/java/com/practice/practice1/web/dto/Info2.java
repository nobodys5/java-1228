package com.practice.practice1.web.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Info2 {

	private String userName;
	private String userGender;
	private String userAge;
	private String userHeight;
}
