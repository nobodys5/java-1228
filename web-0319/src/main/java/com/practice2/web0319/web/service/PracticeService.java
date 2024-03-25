package com.practice2.web0319.web.service;

import java.util.List;

import com.practice2.web0319.web.dto.PracticeReqDto;
import com.practice2.web0319.web.dto.PracticeRespDto;

public interface PracticeService {

	public PracticeRespDto readdto(int num) throws Exception;
	
	public boolean createdto(PracticeReqDto practiceReqDto) throws Exception;
	
	public List<PracticeRespDto> listdto(int page) throws Exception;

}
