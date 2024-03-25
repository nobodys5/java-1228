package com.practice2.web0319.web.controller.api;


import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice2.web0319.web.dto.CMRespDto;
import com.practice2.web0319.web.dto.PracticeReqDto;
import com.practice2.web0319.web.dto.PracticeRespDto;
import com.practice2.web0319.web.service.PracticeService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class DataController {

	private final PracticeService practiceService;
	
	@PostMapping("/data/{num}")
	public ResponseEntity<?> data(@PathVariable int num) {
		System.out.println(num);
		PracticeRespDto practiceRespDto = null;
		try {
			practiceRespDto = practiceService.readdto(num);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.ok().body(new CMRespDto<>(-1,"실패",practiceRespDto));

		}
		return ResponseEntity.ok().body(new CMRespDto<>(1,"성공",practiceRespDto));
	}
	
	@PostMapping("/datain")
	public ResponseEntity<?> datain(@RequestBody PracticeReqDto practiceReqDto) {
		System.out.println(practiceReqDto);
		try {
			practiceService.createdto(practiceReqDto);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.ok().body(new CMRespDto<>(-1,"실패",practiceReqDto));

		}
		return ResponseEntity.ok().body(new CMRespDto<>(1,"성공",practiceReqDto));
	}
	
	@GetMapping("/manydata")
	public ResponseEntity<?> manydata(int page) {
		List<PracticeRespDto> practiceRespDtos = new ArrayList<PracticeRespDto>();
		System.out.println(practiceRespDtos);
		try {
			practiceRespDtos = practiceService.listdto(page);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.ok().body(new CMRespDto<>(-1,"실패",practiceRespDtos));
		}
		return ResponseEntity.ok().body(new CMRespDto<>(1,"성공",practiceRespDtos));
	}
}
