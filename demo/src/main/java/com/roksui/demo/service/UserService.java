package com.roksui.demo.service;


import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.roksui.demo.domain.UserInfo;
import com.roksui.demo.dto.UserInfoDto;
import com.roksui.demo.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserService implements UserDetailsService {

  private final UserRepository userRepository;

  public Long save(UserInfoDto infoDto) {
    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
    infoDto.setPassword(encoder.encode(infoDto.getPassword()));

    return userRepository.save(UserInfo.builder()
        .email(infoDto.getEmail())
        .auth(infoDto.getAuth())
        .password(infoDto.getPassword()).build()).getCode();
  }


  @Override 
  public UserInfo loadUserByUsername(String email) throws UsernameNotFoundException {
    return userRepository.findByEmail(email)
        .orElseThrow(() -> new UsernameNotFoundException((email)));
  }
}