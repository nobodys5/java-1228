package com.practice2.web0319.web.service;

import com.practice2.web0319.web.dto.PracticeReqDto;
import com.practice2.web0319.web.dto.PracticeRespDto;

public interface PracticeService {

	public PracticeRespDto readdto(int num) throws Exception;
	
	public boolean createdto(PracticeReqDto practiceReqDto) throws Exception;

}
