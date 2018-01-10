package com.rjxy.netdisk.controller;

import com.rjxy.netdisk.pojo.User;
import com.rjxy.netdisk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @author zhy
 * @create 2017-11-02 23:52
 **/
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/login")
    public ModelAndView loginFtl(){
        ModelAndView modelAndView = new ModelAndView("login");
        return modelAndView;
    }
    @GetMapping("/userInfo")
    public ModelAndView userInfo(){
        ModelAndView modelAndView = new ModelAndView("userInfo");
        return modelAndView;
    }

    @PostMapping("/login")
    public ModelAndView login(User user, HttpServletRequest request){
        ModelAndView modelAndView;
        User _user = userService.judgeUser(user);
        if(_user==null){
            modelAndView = new ModelAndView("login").addObject("message","账号或密码错误！");
        }else{
            request.getSession().setAttribute("user",_user);
            modelAndView = new ModelAndView("index");
        }
        return modelAndView;
    }

}
