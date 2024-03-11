package com.practice.practice1.domain.practice;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PracticeRepository {

	public Practice findBoard(int num) throws Exception;
	public int boardInput(Practice practice) throws Exception;
}
