package com.practice2.webstudy0327.domain.practice;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.practice2.webstudy0327.web.dto.PracticeRespDto;

@Mapper
public interface PracticeRepository {

	public Practice userreaddto(int num) throws Exception;
	
	public int insertdto(Practice practice) throws Exception;
	
	public List<Practice> readdto(int index) throws Exception;
}
