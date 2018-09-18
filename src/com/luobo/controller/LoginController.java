package com.luobo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/auth")
    public String auth(String userName, String password, HttpSession httpSession) {
        //service代码
        httpSession.setAttribute("userName",userName);
        return "redirect:item/list";
    }

    @RequestMapping("/logout")
    public String logout(HttpSession httpSession) {
//        httpSession.setAttribute("userName",userName);
        httpSession.invalidate();
        return "redirect:item/list";
    }
}
