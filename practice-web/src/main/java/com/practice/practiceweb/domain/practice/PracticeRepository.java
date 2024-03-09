package com.practice.practiceweb.domain.practice;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PracticeRepository {

	public int save(Practice practice) throws Exception;
}
