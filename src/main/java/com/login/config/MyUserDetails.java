package com.login.config;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.login.model.User;

public class MyUserDetails implements UserDetails {

	private User user;

	MyUserDetails(User user) {
		this.user = user;
	}

	/**
	 * method to get authorities
	 */
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return Arrays.stream(user.getRoles().split(",")).map(SimpleGrantedAuthority::new).collect(Collectors.toList());
	}

	/**
	 * method to get password and username
	 */
	@Override
	public String getPassword() {
		return user.getPassword();
	}

	/**
	 * method to get username
	 */
	@Override
	public String getUsername() {
		return user.getEmail();
	}

	/**
	 * method to check if account is expired, locked, credentials expired or enabled
	 */
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	/**
	 * method to check if account is locked
	 */
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	/**
	 * method to check if credentials are expired
	 */
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	/**
	 * method to check if account is enabled
	 */
	@Override
	public boolean isEnabled() {
		return true;
	}

}
