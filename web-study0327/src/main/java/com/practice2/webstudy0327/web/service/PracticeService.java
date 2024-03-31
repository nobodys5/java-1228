package com.practice2.webstudy0327.web.service;

import java.util.List;

import com.practice2.webstudy0327.web.dto.PracticeReqDto;
import com.practice2.webstudy0327.web.dto.PracticeRespDto;

public interface PracticeService {

	public PracticeRespDto readdto(int num) throws Exception;
	
	public boolean adddto(PracticeReqDto practiceReqDto) throws Exception;
	
	public List<PracticeRespDto> manydto(int page) throws Exception;
}
