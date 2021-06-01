package com.pasparrow.smartlockweb.service;

import com.pasparrow.smartlockweb.dto.RoomDto;
import com.pasparrow.smartlockweb.mapper.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private LoginMapper loginMapper;

    public List<RoomDto> selectUserList() {
        System.out.println("---service--");
        System.out.println(loginMapper.selectUserList());
        return loginMapper.selectUserList();
    }
}
