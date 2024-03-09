package com.practice.practiceweb.service.practice;

import org.springframework.stereotype.Service;

import com.practice.practiceweb.domain.practice.PracticeRepository;
import com.practice.practiceweb.web.dto.CreatePracticeDto;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PracticeServiceImpl implements PracticeService {

	private final PracticeRepository practiceRepository;
	@Override
	public boolean createdto(CreatePracticeDto createPracticeDto) throws Exception{
		 practiceRepository.save(createPracticeDto.toEntity());
		 return true;
	
	}

}
