package com.practice2.web0319.domain.practice;

import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface PracticeRepository {

	public Practice findBoard(int num) throws Exception;
	
	public int save(Practice practice) throws Exception;
	
}
