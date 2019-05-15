package com.yiguan.escan.controller.sys;

import com.yiguan.escan.domin.sys.User;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping(value = "/index")
public class IndexController {

    @GetMapping("/list")
    @ResponseBody
    public User index(
            final JSONObject json
    ){
        Principal principal;
        User user = new User();
        user.setName("123");

        return user;
    }
}
