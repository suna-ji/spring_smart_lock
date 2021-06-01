package com.pasparrow.smartlockweb.web.restcontroller;

import com.pasparrow.smartlockweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/user")
public class UserRestController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/select/userList")
    public ResponseEntity<?> selectUserList() {
        System.out.println("--rest--");
        return new ResponseEntity<Object>(userService.selectUserList(), HttpStatus.OK);
    }
}
