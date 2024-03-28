package com.practice2.webstudy0327.domain.practice;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PracticeRepository {

	public Practice save(int num) throws Exception;
	
	public int insert(Practice practice) throws Exception;
}
