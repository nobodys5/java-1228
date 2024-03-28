package com.practice2.webstudy0327.web.dto;

import java.time.LocalDateTime;

import com.practice2.webstudy0327.domain.practice.Practice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PracticeReqDto {
	
	private String boardTitle;
	private String boardContent;
	private String userUsername;
	
	public Practice toEntity() {
		return Practice.builder()
				.board_title(boardTitle)
				.board_content(boardContent)
				.user_username(userUsername)
				.build();
	}
}
