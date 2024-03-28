package com.practice2.webstudy0327.web.service;

import org.springframework.stereotype.Service;


import com.practice2.webstudy0327.domain.practice.Practice;
import com.practice2.webstudy0327.domain.practice.PracticeRepository;
import com.practice2.webstudy0327.web.dto.PracticeReqDto;
import com.practice2.webstudy0327.web.dto.PracticeRespDto;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PracticeServiceImpl implements PracticeService{

	private final PracticeRepository practiceRepository;

	@Override
	public PracticeRespDto readdto(int num) throws Exception {
		Practice practice = practiceRepository.save(num);
		PracticeRespDto practiceRespDto = practice.toDto();
		System.out.println(practiceRespDto);
		return practiceRespDto;
	}

	@Override
	public boolean createdto(PracticeReqDto practiceReqDto) throws Exception {
		System.out.println(practiceReqDto);
		return false;
	}

	
	

}
