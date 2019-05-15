package com.yiguan.escan.controller.sys;

import com.yiguan.escan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping()
public class LoginController {

    @Autowired
    private UserService userService;

    public LoginController(
       final UserService userService
    ){
        this.userService = userService;
    }

//    @GetMapping(value = "login")
//    public Map<String,String> loginGet(){
//        Map<String, String> result = new HashMap<>();
//        result.put("123","123");
//        return result;
//    }

    @PostMapping(value = "login")
    public Map loginPost(
            @RequestBody final Map<String, Object> params
    ){
//        TODO 登录逻辑处理
        String userName = (String) params.get("userName");
        String password = (String) params.get("password");
        Map<String,Object> result = new HashMap<>();
        result.put("SUCCESS",true);
        return result;
    }

    @PostMapping(value = "register")
    public void registerPost(
          @RequestBody final Map<String, Object> params
    ){
        String userName = (String) params.get("userName");
    }
}
