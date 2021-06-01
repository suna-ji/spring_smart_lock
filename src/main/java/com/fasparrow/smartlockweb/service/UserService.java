package com.fasparrow.smartlockweb.service;

import com.fasparrow.smartlockweb.dto.Room;
import com.fasparrow.smartlockweb.mapper.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private LoginMapper loginMapper;

    public List<Room> selectUserList() {
        System.out.println("---service--");
        System.out.println(loginMapper.selectUserList());
        return loginMapper.selectUserList();
    }
}
