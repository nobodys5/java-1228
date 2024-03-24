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

	private String boardTitle;
	private String boardContent;
	private int userId;
	
	public Practice toEntity() {
		return Practice.builder()
				.board_title(boardTitle)
				.board_content(boardContent)
				.user_id(userId)
				.build();
	}
}
