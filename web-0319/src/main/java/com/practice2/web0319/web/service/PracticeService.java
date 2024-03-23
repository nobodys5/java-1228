package com.practice2.web0319.web.service;

import com.practice2.web0319.web.dto.PracticeReqDto;

public interface PracticeService {

	public boolean readdto(int num) throws Exception;
	
	public boolean createdto(PracticeReqDto practiceReqDto) throws Exception;

}
