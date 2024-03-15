package com.study.security20240312youngpil.service.auth;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.study.security20240312youngpil.domain.user.User;

import lombok.Data;

@Data
public class PrincipalDetails implements UserDetails {

	
	
	
	private static final long serialVersionUID = -8490096719701750537L;
	private User user;

	public PrincipalDetails(User user) {
		this.user = user;
	}
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		Collection<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>();
//		List<String> roleList = user.getUserRoles();
//		
//		for(String role : roleList) {
//			GrantedAuthority authority = new GrantedAuthority() {
//				
//				@Override
//				public String getAuthority() {
//					return role;
//				}
//			};
//			grantedAuthorities.add(authority);
//		}
		
		user.getUserRoles().forEach(role -> {
			grantedAuthorities.add(() -> role);
		});
		return grantedAuthorities;
	}
	
	@Override
	public String getPassword() {
		return user.getUser_password();
	}

	@Override
	public String getUsername() {
		return user.getUser_id();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
		// 계정 만료 여부
		// true: 만료안됨, false: 만료됨
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
		// 계정 잠김 여부
		// true: 잠기지 않음, false: 잠김
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
		// 비밀번호 만료 여부
		// true: 만료 안됨, false: 만료됨
	}

	@Override
	public boolean isEnabled() {
		return true;
		// 사용자 활성화 여부
		// true: 활성화, false: 비활성화
	}

	
}
