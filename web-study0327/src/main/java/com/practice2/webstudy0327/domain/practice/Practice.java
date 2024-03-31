package com.practice2.webstudy0327.domain.practice;

import java.time.LocalDateTime;

import com.practice2.webstudy0327.web.dto.PracticeRespDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Practice {

	private int board_id;
	private String board_title;
	private String board_content;
	private int user_id;
	private String user_username;
	private LocalDateTime create_date;
	private LocalDateTime update_date;
	
	public PracticeRespDto toDto() {
		return PracticeRespDto.builder()
					.boardId(board_id)
					.boardTitle(board_title)
					.boardContent(board_content)
					.userId(user_id)
					.userUsername(user_username)
					.createDate(create_date)
					.updateDate(update_date)
					.build();
	}
}
