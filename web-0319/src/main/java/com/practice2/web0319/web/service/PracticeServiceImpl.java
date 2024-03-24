package com.practice2.web0319.web.service;

import org.springframework.stereotype.Service;



import com.practice2.web0319.domain.practice.Practice;
import com.practice2.web0319.domain.practice.PracticeRepository;
import com.practice2.web0319.web.dto.PracticeReqDto;
import com.practice2.web0319.web.dto.PracticeRespDto;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PracticeServiceImpl implements PracticeService {

	private final PracticeRepository practiceRepository;
	
	
	
	
	@Override
	public PracticeRespDto readdto(int num) throws Exception {
		System.out.println("num:"+num);
		Practice practice = practiceRepository.findBoard(num);
		System.out.println(practice);
		PracticeRespDto practiceRespDto = practice.toDto();
		return practiceRespDto;
	}




	@Override
	public boolean createdto(PracticeReqDto practiceReqDto) throws Exception {
		 Practice practice = practiceReqDto.toEntity();
		int num = practiceRepository.save(practice);
		System.out.println(practice);
		return false;
	}

}
