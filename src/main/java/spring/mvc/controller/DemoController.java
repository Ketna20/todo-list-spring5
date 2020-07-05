package spring.mvc.controller;
/*
 * ketnakhalasi created on 7/4/20
 * */

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class DemoController {

    @ResponseBody
    @GetMapping("/hello")
    public String hello() {
        return "Hello";  // returns view name
    }

    //returns prefix + name + suffix
    @GetMapping("welcome")
    public String welcome(Model model) {
        model.addAttribute("user", "kk");
        log.info("Model= {} ", model);
        // /WEB_INF/view/welcome.jsp
        return "welcome";  // returns view name
    }

    @ModelAttribute("welcomeMessage")
    public String welcomeMessage() {
        log.info("welcomeMessage called.");
        return " Welcome to this Demo Application";
    }
}
