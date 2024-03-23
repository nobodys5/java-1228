package com.practice2.web0319.web.controller.api;


import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice2.web0319.web.dto.CMRespDto;
import com.practice2.web0319.web.dto.PracticeReqDto;
import com.practice2.web0319.web.service.PracticeService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class DataController {

	private final PracticeService practiceService;
	
	@PostMapping("/data/{num}")
	public String data(@PathVariable int num) {
		System.out.println(num);
		try {
			practiceService.readdto(num);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "hi";
	}
	
	@PostMapping("/datain")
	public ResponseEntity<?> datain(@RequestBody PracticeReqDto practiceReqDto) {
		System.out.println(practiceReqDto);
		boolean result = false;
		try {
			result = practiceService.createdto(practiceReqDto);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.ok().body(new CMRespDto<>(-1,"실패",result));

		}
		return ResponseEntity.ok().body(new CMRespDto<>(1,"성공",result));
	}
}
