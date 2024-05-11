package org.example.controller;

import org.example.entity.User;
import org.example.service.LoggedService;
import org.example.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//@Controller就像是你网站的主持人，负责引导客人到适当的页面和活动，确保他们在网站上得到愉快的体验。
public class LoginController {
    private final UserService userService;
    private final LoggedService loggedService;

    //分别是UserService和LoggedService类型，用于处理用户服务逻辑和记录用户登录状态。
    public LoginController(UserService userService, LoggedService loggedService) {
        this.userService = userService;
        this.loggedService = loggedService;
    }
    //@RequestMapping注解在这段代码中的作用是将特定的HTTP请求映射到相应的处理方法上，并定义了处理这些请求的路径和方法。
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String ShowLogin(Model model){
        model.addAttribute("Login",new User());
        return "Login";
    }
    //@RequestMapping就是你餐厅中的服务员，负责把客人点的菜传达给你，以便你能够准备好美味的食物。
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    //@RequestParam 就像是你在派对上问朋友们喜欢吃什么，然后把这些信息收集起来，以便为大家准备合适的食物一样。
    //@RequestParam的作用是从登录表单提交的HTTP请求中提取用户输入的邮箱和密码参数的值。
    public String Login(@RequestParam("userEmail") String userEmail, @RequestParam("userPassword") String userPassword, Model model) {
        String result = userService.Login(userEmail, userPassword,model);
        if ("index".equals(result)) {
            loggedService.setUserEmail(userEmail);
            return "redirect:/index";
        } else {
            model.addAttribute("error", "Login Falled");
            return "Login";
        }
    }
}