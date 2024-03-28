package com.practice2.webstudy0327.web.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice2.webstudy0327.web.dto.CMRespDto;
import com.practice2.webstudy0327.web.dto.PracticeReqDto;
import com.practice2.webstudy0327.web.dto.PracticeRespDto;
import com.practice2.webstudy0327.web.service.PracticeService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class DataController {

	private final PracticeService practiceService;
	
	@PostMapping("/test/{num}")
	public ResponseEntity<?> readmethod(@PathVariable int num) {
		System.out.println(num);
		PracticeRespDto practiceRespDto = null;
		try {
			 practiceRespDto = practiceService.readdto(num);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.ok().body(new CMRespDto<>(-1, "실패", practiceRespDto));

		}
		return ResponseEntity.ok().body(new CMRespDto<>(1, "성공", practiceRespDto));
	}
	
	@PostMapping("/test2")
	public ResponseEntity<?> addmethod(@RequestBody PracticeReqDto practiceReqDto) {
		System.out.println(practiceReqDto);
		try {
			practiceService.createdto(practiceReqDto);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.ok().body(new CMRespDto<>(-1,"실패", practiceReqDto));

		}
		return ResponseEntity.ok().body(new CMRespDto<>(1,"성공", practiceReqDto));
	}
	
}
