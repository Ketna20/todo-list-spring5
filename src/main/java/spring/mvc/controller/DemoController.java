package spring.mvc.controller;
/*
 * ketnakhalasi created on 7/4/20
 * */

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import spring.mvc.service.DemoService;

@Slf4j
@Controller
public class DemoController {

    private final DemoService demoService;

    @Autowired
    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }

    // Request Methods
    @ResponseBody
    @GetMapping("/hello")
    public String hello() {
        return "Hello";  // returns view name
    }

    //returns prefix + name + suffix
    // http://localhost:8080/todo-list/welcome?user=kk
    @GetMapping("welcome")
    public String welcome(@RequestParam String user, @RequestParam int age, Model model) {
        model.addAttribute("helloMessage", demoService.getHelloMessage(user));
        model.addAttribute("age", age);
        // /WEB_INF/view/welcome.jsp
        return "welcome";  // returns view name
    }

    // Model Attributes
    @ModelAttribute("welcomeMessage")
    public String welcomeMessage() {
        log.info("welcomeMessage called.");
        return demoService.getWelcomeMessage();
    }
}
