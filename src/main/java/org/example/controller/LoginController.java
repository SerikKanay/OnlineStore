package org.example.controller;

import org.example.entity.User;
import org.example.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    private final UserService userService;

    public LoginController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/Login",method = RequestMethod.GET)
    public String ShowLogin(Model model){
        model.addAttribute("Login",new User());
        return "Login";
}
@RequestMapping(value = "/Login",method = RequestMethod.POST)
    public String Login(@RequestParam("userEmail") String userEmail, @RequestParam("userPassword") String userPassword, Model model) {
        String result = userService.Login(userEmail, userPassword,model);
        if ("index".equals(result)) {
            return "redirect:/index";
        } else {
            model.addAttribute("error", "Login Falled");
            return "Login";
        }
    }
}
