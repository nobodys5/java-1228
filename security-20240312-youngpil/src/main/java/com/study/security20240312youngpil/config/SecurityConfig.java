package com.study.security20240312youngpil.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.csrf().disable();
		//암호화,복호화
		http.authorizeHttpRequests()// 요청이 들어왔을때 인증을 거치라는 
		.antMatchers("/","index","/mypage/**") // 1) 우리가 지정한 요청(들)
		.authenticated() // 2) 인증을 거쳐라
		.anyRequest() // 3) 다른 모든 요청들은
		.permitAll() // 4) 모든 접근 권한을 부여하겠다.
		.and()
		.formLogin() // 5) 로그인 방식은 form 로그인을 사용하겠다.
		.loginPage("/auth/signin") // 6) 로그인 페이지 get요청을 통해 접근
		.loginProcessingUrl("/auth/signin") // 7) 로그인 요청(post)
		.failureHandler(new AuthFailerHandler())
		.defaultSuccessUrl("/index");
	}
}
