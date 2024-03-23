package com.practice2.web0319.domain.practice;

import java.time.LocalDateTime;

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
}
