package com.dubbo.consumer.web;

import com.dubbo.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author K_D_Lee
 *
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/hello.html")
    @ResponseBody
    public String sayHello(String name) {
        String welcome = userService.sayHi(name);
        return welcome;
    }
}
