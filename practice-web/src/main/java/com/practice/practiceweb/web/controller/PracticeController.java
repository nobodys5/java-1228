package com.practice.practiceweb.web.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.practiceweb.service.practice.PracticeService;
import com.practice.practiceweb.web.dto.CMRespDto;
import com.practice.practiceweb.web.dto.CreatePracticeDto;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class PracticeController {

	private final PracticeService practiceService;
	
	@GetMapping("/test")
	public String addmethod() {
		return "hi";
	}
	
	
	@PostMapping("/test2")
	public ResponseEntity<?> method(@RequestBody CreatePracticeDto createPracticeDto) {
		System.out.println(createPracticeDto);
		boolean data = false;
		try {
			data = practiceService.createdto(createPracticeDto);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.ok().body(new CMRespDto<>(-1,"실패",null));
		}
		return ResponseEntity.ok().body(new CMRespDto<>(1,"성공",null));
	}
}
