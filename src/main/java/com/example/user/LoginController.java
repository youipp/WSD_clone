package com.example.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/login")
public class LoginController {
    @Autowired
    UserServiceImpl userService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/loginOk", method = RequestMethod.POST)
    public String loginOk(HttpSession session, UserVO userVO) {
        String returnURL = "";
        if(session.getAttribute("login") != null) {
            session.removeAttribute("login");
        }
        UserVO loginvo = userService.getUser(userVO);
        if(loginvo != null) {
            System.out.println("Login successful");
            session.setAttribute("login", loginvo);
            returnURL = "redirect:/board/list";
        } else{
            System.out.println("Login failed");
            returnURL = "redirect:/login/login";
        }
        return returnURL;
    }

    @RequestMapping(value = "/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login/login";
    }
}
