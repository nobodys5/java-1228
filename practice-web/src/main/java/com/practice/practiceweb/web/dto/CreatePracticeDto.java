package com.practice.practiceweb.web.dto;

import com.practice.practiceweb.domain.practice.Practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreatePracticeDto {

	private String title;
	private String content;
	private int usercode;
	
	public Practice toEntity() {
	return	Practice.builder()
				.title(title)
				.content(content)
				.usercode(usercode)
				.build();
	}
}
