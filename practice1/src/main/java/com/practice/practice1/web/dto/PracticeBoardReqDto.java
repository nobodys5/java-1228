package com.practice.practice1.web.dto;

import com.practice.practice1.domain.practice.Practice;

import lombok.Data;
@Data
public class PracticeBoardReqDto {

	private String boardtitle;
	private String boardcontent;
	private int userid;
	
	public void showinfo() {
		System.out.println(boardtitle);
		System.out.println(boardcontent);
		System.out.println(userid);
		System.out.println("end");
	}
	
	public Practice toEntity() {
		return Practice.builder()
				.board_title(boardtitle)
				.board_content(boardcontent)
				.user_id(userid)
				.build();
	}
}
