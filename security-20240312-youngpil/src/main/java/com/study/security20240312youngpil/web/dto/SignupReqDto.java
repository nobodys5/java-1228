package com.study.security20240312youngpil.web.dto;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class SignupReqDto {
	
	@NotBlank
	private String name;
	@NotBlank
	private String email;
	@NotBlank
	private String username;
	@NotBlank
	private String password;
}
