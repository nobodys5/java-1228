package com.practice.practice1.web.service;

import com.practice.practice1.web.dto.Info;
import com.practice.practice1.web.dto.PracticeBoardReqDto;
import com.practice.practice1.web.dto.PracticeRespDto;

public interface PracticeService {

	public boolean dataInputService(PracticeBoardReqDto practiceBoardReqDto) throws Exception;
	public PracticeRespDto testService(int num) throws Exception;
	public boolean checkName(Info info);
}
