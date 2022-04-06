package com.edu.HMS.service;

import java.util.Collection;

public interface UserDetails<GrantedAuthority> {

	String getPassword();

	String getUsername();

	boolean isAccountNonExpired();

	boolean isAccountNonLocked();

	boolean isCredentialsNonExpired();

	boolean isEnabled();

	Collection<? extends GrantedAuthority> getAuthorities();

}
