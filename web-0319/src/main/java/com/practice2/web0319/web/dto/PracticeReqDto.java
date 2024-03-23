package com.practice2.web0319.web.dto;

import com.practice2.web0319.domain.practice.Practice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class PracticeReqDto {

	private String title;
	private String content;
	private int user_id;
	
	public Practice toEntity() {
		return Practice.builder()
				.board_title(title)
				.board_content(content)
				.user_id(0)
				.build();
	}
}
