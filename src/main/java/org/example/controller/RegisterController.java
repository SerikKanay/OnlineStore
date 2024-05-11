package org.example.controller;

import org.example.dto.UserDTO;
import org.example.service.UserService;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//控制器是应用程序的组件，负责接收用户请求、处理请求逻辑，并最终返回适当的响应。
@Controller
public class RegisterController {

    private final UserService userService;

    public RegisterController(UserService userService) {
        this.userService = userService;
    }
    //这是一个处理HTTP GET请求的方法，当访问"/register"路径时，会调用showRegister方法。
    @GetMapping("/register")
    public String showRegister(Model model){
        model.addAttribute("user",new UserDTO());
        return "Register";
    }
    //这是一个处理HTTP POST请求的方法，当提交注册表单时，会调用Register方法。
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String Register( UserDTO userDTO,Model model) {
        String result=userService.register(userDTO, model);

        if ("success".equals(result)) {
            return "redirect:/login";
        } else {
            model.addAttribute("error", "Register Falled");
            return "Register";
        }
    }

}

