package com.practice2.webstudy0327.web.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PracticeRespDto {
	private int boardId;
	private String boardTitle;
	private String boardContent;
	private int userId;
	private String userUsername;
	private LocalDateTime createDate;
	private LocalDateTime updateDate;
}
