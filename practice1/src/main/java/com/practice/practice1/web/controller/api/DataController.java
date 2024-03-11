package com.practice.practice1.web.controller.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.practice.practice1.web.dto.CMRespDto;
import com.practice.practice1.web.dto.Info;
import com.practice.practice1.web.dto.Info2;
import com.practice.practice1.web.dto.PracticeBoardReqDto;
import com.practice.practice1.web.dto.PracticeRespDto;
import com.practice.practice1.web.service.PracticeService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class DataController {
	
	private final PracticeService practiceService;
	
	@GetMapping("/dataController")
	public String dataController() {
		return "hihihi";
	}
	
	// 파람으로 값 받기
	@PostMapping("/dataInsert")
	public String dataInsert(@RequestParam("name") String name) {
		return name;
	}
	@PostMapping("/dataInsertMany")
	public ResponseEntity<?> dataInsertMany(Info info) {
		
		return ResponseEntity.ok().body(new CMRespDto<>(1,"성공",info));
	}
	
	
	//JSON으로 값 받기
	@PostMapping("/dataJson")
	public String dataJson(@RequestBody String name) {
		return name;
	}
	
//	@PostMapping("/dataInsertMany")
//	public String dataInsertMany(@RequestBody Info2 info2) {
//		System.out.println(info2);
//		//get으로 값만 받아와도됨
//		return info2.getUserName() + info2.getUserGender() + info2.getUserAge() + info2.getUserHeight();
//	}
	@PostMapping("/dataJsonMany")
	public ResponseEntity<?> dataJson(@RequestBody Info2 info2) {
		
		
		return ResponseEntity.ok().body(info2.getUserName()+ info2.getUserGender() + info2.getUserAge() + info2.getUserHeight()); 
	}
	@PostMapping("/dataUrl/{num}")
	public ResponseEntity<?> dataUrl(@PathVariable int num) {
		System.out.println(num);
		PracticeRespDto practiceRespDto = null;
		try {
			practiceRespDto = practiceService.testService(num);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResponseEntity.ok().body(new CMRespDto<>(-1,"실패", practiceRespDto));
		}
//		PracticeService practiceService = new PracticeServiceImpl();
//		practiceService.testService(num);
		
		return ResponseEntity.ok().body(new CMRespDto<>(1,"성공", practiceRespDto));
	}
	
	
	@PostMapping("/dataInput")
	public ResponseEntity<?> dataInput(@RequestBody PracticeBoardReqDto practiceBoardReqDto) {
		practiceBoardReqDto.showinfo();
		 try {
			practiceService.dataInputService(practiceBoardReqDto);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// title, content, userid
		// json으로 위의 내용 받기
		// json으로 받은거 리턴 하기
		// 포스트맨으로 테스팅
		return ResponseEntity.ok().body(new CMRespDto<>(1,"성공",practiceBoardReqDto));
	}
	
}
