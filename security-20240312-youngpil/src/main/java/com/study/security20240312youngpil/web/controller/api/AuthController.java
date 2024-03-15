package com.study.security20240312youngpil.web.controller.api;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;
import javax.validation.ValidationException;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.security20240312youngpil.service.auth.AuthService;
import com.study.security20240312youngpil.service.auth.PrincipalDetailsService;
import com.study.security20240312youngpil.web.dto.CMRespDto;
import com.study.security20240312youngpil.web.dto.UsernameCheckReqDto;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {

	private final PrincipalDetailsService principalDetailsService;
	private final AuthService authService;
	
	@PostMapping("/signup")
	public ResponseEntity<?> signup() {
		return ResponseEntity.ok().body(principalDetailsService.addUser());
	}
	
	@GetMapping("/signup/validation/username")
	public ResponseEntity<?> checkUsername(@Valid @RequestBody UsernameCheckReqDto usernameCheckReqDto,BindingResult bindingResult) {
		Map<String, String> errorMessage = new HashMap<String, String>();
		
		if(bindingResult.hasErrors()) {
			bindingResult.getFieldErrors().forEach(error -> {
				System.err.println("오류발생 필드명:" + error.getField());
				System.err.println("오류발생 상태메세지:" + error.getDefaultMessage());
				errorMessage.put(error.getField(), error.getDefaultMessage());
			});	
			return ResponseEntity.ok().body(new CMRespDto<>(-1,"유효성 검사 실패",errorMessage));
		}
		//return ResponseEntity.ok().body(new CMRespDto<>(1,"유효성 검사 성공",true));
		boolean status = false;
		
		try {
			status = authService.checkUsername(usernameCheckReqDto);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.ok().body(new CMRespDto<>(-1,"서버 오류",status));
		}
		return ResponseEntity.ok().body(new CMRespDto<>(1,"회원 가입 여부",status));
	}
}
