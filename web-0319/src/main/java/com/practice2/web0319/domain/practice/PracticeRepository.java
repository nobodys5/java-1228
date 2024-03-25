package com.practice2.web0319.domain.practice;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.practice2.web0319.web.dto.PracticeRespDto;


@Mapper
public interface PracticeRepository {

	public Practice findBoard(int num) throws Exception;
	
	public int save(Practice practice) throws Exception;
	
	public List<Practice> addlist(int index) throws	Exception;
	
}
