package com.practice.practiceweb.domain.practice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Practice {
	private int practicecode;
	private String title;
	private String content;
	private int usercode;
	
}
