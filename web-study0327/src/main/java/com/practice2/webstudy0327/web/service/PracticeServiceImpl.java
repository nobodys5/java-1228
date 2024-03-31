package com.practice2.webstudy0327.web.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.practice2.webstudy0327.domain.practice.Practice;
import com.practice2.webstudy0327.domain.practice.PracticeRepository;
import com.practice2.webstudy0327.web.dto.PracticeReqDto;
import com.practice2.webstudy0327.web.dto.PracticeRespDto;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PracticeServiceImpl implements PracticeService {

	private final PracticeRepository practiceRepository;
	
	@Override
	public PracticeRespDto readdto(int num) throws Exception {
		Practice practice = practiceRepository.userreaddto(num);
		PracticeRespDto practiceRespDto = practice.toDto();
		System.out.println("servicenum:" +practiceRespDto);
		return practiceRespDto;
	}

	@Override
	public boolean adddto(PracticeReqDto practiceReqDto) throws Exception {
		
		Practice practice = practiceReqDto.toEntity();
		int num = practiceRepository.insertdto(practice);
		System.out.println(num);
		return false;
	}

	@Override
	public List<PracticeRespDto> manydto(int page) throws Exception {
		List<PracticeRespDto> dtos = new ArrayList<PracticeRespDto>();
		int index = (page - 1) * 10;
		List<Practice> practices = practiceRepository.readdto(index);
//		for(int i = 0; i < practices.size(); i++) {
//			System.out.println(practices.get(i));
//			dtos.add(practices.get(i).toDto());
//		}
		practices.forEach(practice -> {
			dtos.add(practice.toDto());
		});
		System.out.println(practices);
		return dtos;
	}

}
