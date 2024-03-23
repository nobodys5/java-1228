package com.practice2.web0319.web.service;

import org.springframework.stereotype.Service;


import com.practice2.web0319.domain.practice.Practice;
import com.practice2.web0319.domain.practice.PracticeRepository;
import com.practice2.web0319.web.dto.PracticeReqDto;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PracticeServiceImpl implements PracticeService {

	private PracticeRepository practiceRepository;
	
	
	
	
	@Override
	public boolean readdto(int num) throws Exception {
	Practice practice = practiceRepository.findBoard(num);
	System.out.println("num:" +num);
		return false;
	}




	@Override
	public boolean createdto(PracticeReqDto practiceReqDto) throws Exception {
		 practiceRepository.save(practiceReqDto.toEntity());
		System.out.println(practiceReqDto);
		return false;
	}

}
