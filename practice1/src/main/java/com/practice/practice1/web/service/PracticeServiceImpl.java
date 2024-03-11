package com.practice.practice1.web.service;

import org.springframework.stereotype.Service;

import com.practice.practice1.domain.practice.Practice;
import com.practice.practice1.domain.practice.PracticeRepository;
import com.practice.practice1.web.dto.Info;
import com.practice.practice1.web.dto.PracticeBoardReqDto;
import com.practice.practice1.web.dto.PracticeRespDto;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PracticeServiceImpl implements PracticeService {

	private final PracticeRepository practiceRepository;
	
	@Override
	public PracticeRespDto testService(int num) throws Exception{
		System.out.println("serviceNum:" + num);
		
		Practice practice = practiceRepository.findBoard(num);
		System.out.println(practice);
		PracticeRespDto practiceRespDto = practice.toDto();
		return practiceRespDto;
	}


	@Override
	public boolean checkName(Info info) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean dataInputService(PracticeBoardReqDto practiceBoardReqDto) throws Exception {
		
		Practice practice = practiceBoardReqDto.toEntity();
		
		 int num = practiceRepository.boardInput(practice);
		 System.out.println(num);
		return false;
	}

	/*
	 * 여기서 계산을 할거임.
	 * 반복을 돌리든,변수를 바꾸든,
	 * 아무튼 여기서 다할 거임.
	 */
	


}
